package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.YearPvMapper;
import wang.doug.frame.model.YearPv;
import wang.doug.frame.model.YearPvExample;
import wang.doug.frame.service.IYearPvService;

import java.util.List;


@Service
public class YearPvServiceImpl implements IYearPvService {

    @Autowired
    private YearPvMapper yearPvMapper;

    public List<YearPv> query() {
        YearPvExample example = new YearPvExample();


        List<YearPv> yearPvList = this.yearPvMapper.selectByExample(example);

        //List<YearPv> yearPvList = this.yearPvMapper.selectByExampleWithBLOBs(example);

        return yearPvList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        YearPvExample example = new YearPvExample();

        return this.yearPvMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        YearPvExample example = new YearPvExample();

        example.createCriteria().andSysNameLike("%" + nameLike + "%");


        return this.yearPvMapper.countByExample(example);

    }

    /**
     * 查询该sysId下所有年份的总记录
     * @param sysId
     * @return
     */
    @Override
    public long countBySysId(Integer sysId) {
        YearPvExample example = new YearPvExample();

        example.createCriteria().andSysIdEqualTo(sysId);

        return this.yearPvMapper.countByExample(example);
    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<YearPv> query(long rowIndex, int pageSize) {

        YearPvExample example = new YearPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<YearPv> yearPvList = this.yearPvMapper.selectByExample(example);

        return yearPvList;
    }

    @Override
    public List<YearPv> queryBySysId(Integer sysId, long rowIndex, int pageSize) {
        YearPvExample example = new YearPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andSysIdEqualTo(sysId);
        List<YearPv> yearPvList = this.yearPvMapper.selectByExample(example);

        return yearPvList;
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
    public List<YearPv> queryByName(String nameLike, long rowIndex, int pageSize) {
        return queryByName(nameLike,rowIndex,pageSize,null);
    }

    @Override
    public List<YearPv> queryByName(String nameLike, long rowIndex, int pageSize, String orderByClause) {
        YearPvExample example = new YearPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andSysNameLike("%" + nameLike + "%");
        if (null!=orderByClause)
            example.setOrderByClause(orderByClause);

        List<YearPv> yearPvList = this.yearPvMapper.selectByExample(example);

        return yearPvList;
    }

    /**
     * 插入
     *
     * @param yearPv
     */
    @Override
    public int insert(YearPv yearPv) {

        return this.yearPvMapper.insert(yearPv);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public YearPv loadById(int id) {
        YearPvExample example = new YearPvExample();
        example.createCriteria().andIdEqualTo(id);

        List<YearPv> yearPvList = this.yearPvMapper.selectByExample(example);

        return yearPvList.isEmpty() ? null : yearPvList.get(0);

    }

    /**
     * 根据ID更新
     *
     * @param yearPv
     */
    @Override
    public int update(YearPv yearPv) {
        YearPvExample example = new YearPvExample();
        example.createCriteria().andIdEqualTo(yearPv.getId());
        return this.yearPvMapper.updateByExample(yearPv, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        YearPvExample example = new YearPvExample();
        example.createCriteria().andIdEqualTo(id);
        return this.yearPvMapper.deleteByExample(example);
    }
}