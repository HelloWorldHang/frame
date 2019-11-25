package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.MonthPvMapper;
import wang.doug.frame.model.MonthPv;
import wang.doug.frame.model.MonthPvExample;
import wang.doug.frame.model.SitePv;
import wang.doug.frame.service.IMonthPvService;

import java.util.List;


@Service
public class MonthPvServiceImpl implements IMonthPvService {

    @Autowired
    private MonthPvMapper monthPvMapper;

    public List<MonthPv> query() {
        MonthPvExample example = new MonthPvExample();


        List<MonthPv> monthPvList = this.monthPvMapper.selectByExample(example);

        //List<MonthPv> monthPvList = this.monthPvMapper.selectByExampleWithBLOBs(example);

        return monthPvList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        MonthPvExample example = new MonthPvExample();

        return this.monthPvMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        MonthPvExample example = new MonthPvExample();

        example.createCriteria().andSysNameLike("%" + nameLike + "%");


        return this.monthPvMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<MonthPv> query(long rowIndex, int pageSize) {

        MonthPvExample example = new MonthPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<MonthPv> monthPvList = this.monthPvMapper.selectByExample(example);

        return monthPvList;
    }

    @Override
    public List<MonthPv> query(int sysId, short year) {
        // List<MonthPv> monthPvList = this.monthPvMapper.selectBySysIdAndYear(sysId,year);
        MonthPvExample example = new MonthPvExample();
        example.createCriteria().andSysIdEqualTo(sysId).andTdYearEqualTo(year);
        List<MonthPv> monthPvList = monthPvMapper.selectByExample(example);
        return monthPvList;
    }


    @Override
    public int insert(SitePv sitePv) {
        return 0;
    }

    @Override
    public List<MonthPv> queryByName(String nameLike, long rowIndex, int pageSize) {
        MonthPvExample example = new MonthPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andSysNameLike("%" + nameLike + "%");

        List<MonthPv> monthPvList = this.monthPvMapper.selectByExample(example);

        return monthPvList;
    }


    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public MonthPv loadById(int id) {
        MonthPvExample example = new MonthPvExample();
        example.createCriteria().andIdEqualTo(id);

        List<MonthPv> monthPvList = this.monthPvMapper.selectByExample(example);

        return monthPvList.isEmpty() ? null : monthPvList.get(0);

    }

    @Override
    public int update(SitePv sitePv) {
        return 0;
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        MonthPvExample example = new MonthPvExample();
        example.createCriteria().andIdEqualTo(id);
        return this.monthPvMapper.deleteByExample(example);
    }
}