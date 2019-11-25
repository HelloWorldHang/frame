package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.SysPvMapper;
import wang.doug.frame.model.SysPv;
import wang.doug.frame.model.SysPvExample;
import wang.doug.frame.service.ISysPvService;

import java.util.List;


@Service
public class SysPvServiceImpl implements ISysPvService {

    @Autowired
    private SysPvMapper sysPvMapper;

    public List<SysPv> query() {
        SysPvExample example = new SysPvExample();


        List<SysPv> sysPvList = this.sysPvMapper.selectByExample(example);

        //List<SysPv> sysPvList = this.sysPvMapper.selectByExampleWithBLOBs(example);

        return sysPvList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        SysPvExample example = new SysPvExample();

        return this.sysPvMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        SysPvExample example = new SysPvExample();

        example.createCriteria().andSysNameLike("%" + nameLike + "%");


        return this.sysPvMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<SysPv> query(long rowIndex, int pageSize) {

        SysPvExample example = new SysPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<SysPv> sysPvList = this.sysPvMapper.selectByExample(example);

        return sysPvList;
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
    public List<SysPv> queryByName(String nameLike, long rowIndex, int pageSize) {
        return queryByName(nameLike,rowIndex,pageSize,null);
    }

    @Override
    public List<SysPv> queryByName(String nameLike, long rowIndex, int pageSize, String orderByClause) {
        SysPvExample example = new SysPvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andSysNameLike("%" + nameLike + "%");
        if (null!=orderByClause)
            example.setOrderByClause(orderByClause);

        List<SysPv> sysPvList = this.sysPvMapper.selectByExample(example);

        return sysPvList;
    }

    /**
     * 插入
     *
     * @param sysPv
     */
    @Override
    public int insert(SysPv sysPv) {

        return this.sysPvMapper.insert(sysPv);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public SysPv loadById(int id) {
        SysPvExample example = new SysPvExample();
        example.createCriteria().andIdEqualTo(id);

        List<SysPv> sysPvList = this.sysPvMapper.selectByExample(example);

        return sysPvList.isEmpty() ? null : sysPvList.get(0);

    }

    /**
     * 根据ID更新
     *
     * @param sysPv
     */
    @Override
    public int update(SysPv sysPv) {
        SysPvExample example = new SysPvExample();
        example.createCriteria().andIdEqualTo(sysPv.getId());
        return this.sysPvMapper.updateByExample(sysPv, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        SysPvExample example = new SysPvExample();
        example.createCriteria().andIdEqualTo(id);
        return this.sysPvMapper.deleteByExample(example);
    }
}