package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.MyColumnMapper;
import wang.doug.frame.model.MyColumn;
import wang.doug.frame.model.MyColumnExample;
import wang.doug.frame.service.IMyColumnService;
import wang.doug.frame.vo.MyColumnVo;

import java.util.List;


@Service
public class MyColumnServiceImpl implements IMyColumnService {

    @Autowired
    private MyColumnMapper myColumnMapper;

    public List<MyColumn> query() {
        MyColumnExample example = new MyColumnExample();


        List<MyColumn> myColumnList = this.myColumnMapper.selectByExample(example);

        //List<MyColumn> myColumnList = this.myColumnMapper.selectByExampleWithBLOBs(example);

        return myColumnList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        MyColumnExample example = new MyColumnExample();

        return this.myColumnMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        MyColumnExample example = new MyColumnExample();

        example.createCriteria().andNameLike("%" + nameLike + "%");


        return this.myColumnMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<MyColumn> query(long rowIndex, int pageSize) {

        MyColumnExample example = new MyColumnExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<MyColumn> myColumnList = this.myColumnMapper.selectByExample(example);

        return myColumnList;
    }


    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    @Override
    public List<MyColumn> queryByName(String nameLike, long rowIndex, int pageSize) {
        MyColumnExample example = new MyColumnExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andNameLike("%" + nameLike + "%");

        List<MyColumn> myColumnList = this.myColumnMapper.selectByExample(example);

        return myColumnList;
    }

    @Override
    public List<MyColumnVo> queryByNameContainSystemName(String nameLike, long rowIndex, int pageSize) {
        MyColumnExample example = new MyColumnExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andNameLike("%" + nameLike + "%");

        List<MyColumnVo> myColumnVoList = this.myColumnMapper.selectContainSystemName(example);

        return myColumnVoList;
    }

    /**
     * 插入
     *
     * @param myColumn
     */
    @Override
    public int insert(MyColumn myColumn) {

        return this.myColumnMapper.insert(myColumn);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public MyColumn loadById(int id) {
        MyColumnExample example = new MyColumnExample();
        example.createCriteria().andIdEqualTo(id);

        List<MyColumn> myColumnList = this.myColumnMapper.selectByExample(example);

        return myColumnList.isEmpty() ? null : myColumnList.get(0);

    }

    /**
     * 根据ID更新
     *
     * @param myColumn
     */
    @Override
    public int update(MyColumn myColumn) {
        MyColumnExample example = new MyColumnExample();
        example.createCriteria().andIdEqualTo(myColumn.getId());
        return this.myColumnMapper.updateByExample(myColumn, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        MyColumnExample example = new MyColumnExample();
        example.createCriteria().andIdEqualTo(id);
        return this.myColumnMapper.deleteByExample(example);
    }
}