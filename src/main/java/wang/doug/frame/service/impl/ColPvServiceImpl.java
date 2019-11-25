package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.ColPvMapper;
import wang.doug.frame.model.ColPv;
import wang.doug.frame.model.ColPvExample;
import wang.doug.frame.service.IColPvService;

import java.util.List;


@Service
public class ColPvServiceImpl implements IColPvService {

    @Autowired
    private ColPvMapper colPvMapper;

    public List<ColPv> query() {
        ColPvExample example = new ColPvExample();


        List<ColPv> colPvList = this.colPvMapper.selectByExample(example);

        //List<ColPv> colPvList = this.colPvMapper.selectByExampleWithBLOBs(example);

        return colPvList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        ColPvExample example = new ColPvExample();

        return this.colPvMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        ColPvExample example = new ColPvExample();

        example.createCriteria().andColNameLike("%" + nameLike + "%");


        return this.colPvMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<ColPv> query(long rowIndex, int pageSize) {

        ColPvExample example = new ColPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<ColPv> colPvList = this.colPvMapper.selectByExample(example);

        return colPvList;
    }

    @Override
    public List<ColPv> query(Integer sysId, short tdYear, short tdMonth) {
        return colPvMapper.selectBySysIdAndYearAndMonth(sysId,tdYear,tdMonth);
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
    public List<ColPv> queryByName(String nameLike, long rowIndex, int pageSize) {
        ColPvExample example = new ColPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andColNameLike("%" + nameLike + "%");

        List<ColPv> colPvList = this.colPvMapper.selectByExample(example);

        return colPvList;
    }

    /**
     * 插入
     *
     * @param colPv
     */
    @Override
    public int insert(ColPv colPv) {

        return this.colPvMapper.insert(colPv);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public ColPv loadById(int id) {
        ColPvExample example = new ColPvExample();
        example.createCriteria().andIdEqualTo(id);

        List<ColPv> colPvList = this.colPvMapper.selectByExample(example);

        return colPvList.isEmpty() ? null : colPvList.get(0);

    }


    /**
     * 根据ID更新
     *
     * @param colPv
     */
    @Override
    public int update(ColPv colPv) {
        ColPvExample example = new ColPvExample();
        example.createCriteria().andIdEqualTo(colPv.getId());
        return this.colPvMapper.updateByExample(colPv, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        ColPvExample example = new ColPvExample();
        example.createCriteria().andIdEqualTo(id);
        return this.colPvMapper.deleteByExample(example);
    }
}