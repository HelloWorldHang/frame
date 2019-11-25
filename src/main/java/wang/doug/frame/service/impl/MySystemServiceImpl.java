package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.MySystemMapper;
import wang.doug.frame.model.MySystem;
import wang.doug.frame.model.MySystemExample;
import wang.doug.frame.service.IMySystemService;

import java.util.List;


@Service
public class MySystemServiceImpl implements IMySystemService {

    @Autowired
    private MySystemMapper mySystemMapper;

    public List<MySystem> query() {
        MySystemExample example = new MySystemExample();


        List<MySystem> mySystemList = this.mySystemMapper.selectByExample(example);

        //List<MySystem> mySystemList = this.mySystemMapper.selectByExampleWithBLOBs(example);

        return mySystemList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        MySystemExample example = new MySystemExample();

        return this.mySystemMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        MySystemExample example = new MySystemExample();

        example.createCriteria().andNameLike("%" + nameLike + "%");


        return this.mySystemMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<MySystem> query(long rowIndex, int pageSize) {

        MySystemExample example = new MySystemExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<MySystem> mySystemList = this.mySystemMapper.selectByExample(example);

        return mySystemList;
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
    public List<MySystem> queryByName(String nameLike, long rowIndex, int pageSize) {
        MySystemExample example = new MySystemExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andNameLike("%" + nameLike + "%");

        List<MySystem> mySystemList = this.mySystemMapper.selectByExample(example);

        return mySystemList;
    }

    /**
     * 插入
     *
     * @param mySystem
     */
    @Override
    public int insert(MySystem mySystem) {

        return this.mySystemMapper.insert(mySystem);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public MySystem loadById(int id) {
        MySystemExample example = new MySystemExample();
        example.createCriteria().andIdEqualTo(id);

        List<MySystem> mySystemList = this.mySystemMapper.selectByExample(example);

        return mySystemList.isEmpty() ? null : mySystemList.get(0);

    }

    /**
     * 根据ID更新
     *
     * @param mySystem
     */
    @Override
    public int update(MySystem mySystem) {
        MySystemExample example = new MySystemExample();
        example.createCriteria().andIdEqualTo(mySystem.getId());
        return this.mySystemMapper.updateByExample(mySystem, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        MySystemExample example = new MySystemExample();
        example.createCriteria().andIdEqualTo(id);
        return this.mySystemMapper.deleteByExample(example);
    }
}