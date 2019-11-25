package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.SitePvMapper;
import wang.doug.frame.model.SitePv;
import wang.doug.frame.model.SitePvExample;
import wang.doug.frame.service.ISitePvService;
import wang.doug.frame.vo.SitePvVo;

import java.util.List;


@Service
public class SitePvServiceImpl implements ISitePvService {

    @Autowired
    private SitePvMapper sitePvMapper;

    public List<SitePvVo> query() {
        SitePvExample example = new SitePvExample();


        List<SitePvVo> sitePvVoList = this.sitePvMapper.selectByExampleContainRcsName(example);

        //List<SitePv> sitePvList = this.sitePvMapper.selectByExampleWithBLOBs(example);

        return sitePvVoList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        SitePvExample example = new SitePvExample();

        return this.sitePvMapper.countByExample(example);
    }

    @Override
    public long countByName(String nameLike) {
        return 0;
    }

    @Override
    public long countBySystem() {
        return sitePvMapper.countBySystem();
    }

    /**
     * 查询数量
     *
     * @param ipLike
     * @return
     */
    @Override
    public long countByIp(String ipLike) {

        SitePvExample example = new SitePvExample();

        example.createCriteria().andIpLike("%" + ipLike + "%");


        return this.sitePvMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<SitePvVo> query(long rowIndex, int pageSize) {

        SitePvExample example = new SitePvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<SitePvVo> sitePvVoList = this.sitePvMapper.selectByExampleContainRcsName(example);

        return sitePvVoList;
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
    public List<SitePvVo> queryByName(String nameLike, long rowIndex, int pageSize) {
//        SitePvExample example = new SitePvExample();
//
//        example.setRowIndex(rowIndex);
//        example.setPageSize(pageSize);
//        example.createCriteria().andRealNameLike("%" + nameLike + "%");
//
//        List<SitePv> sitePvList = this.sitePvMapper.selectByExample(example);

        return null;
    }

    @Override
    public List<SitePvVo> selectAllSystem() {
        return sitePvMapper.selectAllSystem();
    }

    @Override
    public List<SitePvVo> selectAllYear(Integer sysId) {
        return sitePvMapper.selectAllYear(sysId);
    }

    @Override
    public List<SitePvVo> queryAllSystemPv(String nameLike, long rowIndex, int pageSize) {
        SitePvExample example = new SitePvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andIpLike("%" + nameLike + "%");

        List<SitePvVo> sitePvVoList = this.sitePvMapper.selectByExampleContainRcsName(example);

        return sitePvVoList;
    }

    @Override
    public List<SitePvVo> queryByIp(String ipLike, long rowIndex, int pageSize) {
        SitePvExample example = new SitePvExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andIpLike("%" + ipLike + "%");

        List<SitePvVo> sitePvVoList = this.sitePvMapper.selectByExampleContainRcsName(example);

        return sitePvVoList;
    }

    /**
     * 插入
     *
     * @param sitePv
     */
    @Override
    public int insert(SitePv sitePv) {

        return this.sitePvMapper.insert(sitePv);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public SitePvVo loadById(int id) {
        SitePvExample example = new SitePvExample();
        example.createCriteria().andIdEqualTo(id);

        List<SitePvVo> sitePvVoList = this.sitePvMapper.selectByExampleContainRcsName(example);

        return sitePvVoList.isEmpty() ? null : sitePvVoList.get(0);

    }

    /**
     * 根据ID更新
     *
     * @param sitePv
     */
    @Override
    public int update(SitePv sitePv) {
        SitePvExample example = new SitePvExample();
        example.createCriteria().andIdEqualTo(sitePv.getId());
        return this.sitePvMapper.updateByExample(sitePv, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        SitePvExample example = new SitePvExample();
        example.createCriteria().andIdEqualTo(id);
        return this.sitePvMapper.deleteByExample(example);
    }
}