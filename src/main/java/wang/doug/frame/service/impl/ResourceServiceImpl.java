package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.ResourceMapper;
import wang.doug.frame.model.Resource;
import wang.doug.frame.model.ResourceExample;
import wang.doug.frame.service.IResourceService;
import wang.doug.frame.vo.ResourceVo;

import java.util.List;


@Service
public class ResourceServiceImpl implements IResourceService {

    @Autowired
    private ResourceMapper resourceMapper;

    public List<Resource> query() {
        ResourceExample example = new ResourceExample();


        List<Resource> resourceList = this.resourceMapper.selectByExample(example);

        //List<Resource> resourceList = this.resourceMapper.selectByExampleWithBLOBs(example);

        return resourceList;
    }

    /**
     * 总数
     *
     * @return
     */
    @Override
    public long total() {
        ResourceExample example = new ResourceExample();

        return this.resourceMapper.countByExample(example);
    }

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    @Override
    public long countByName(String nameLike) {

        ResourceExample example = new ResourceExample();

        example.createCriteria().andNameLike("%" + nameLike + "%");


        return this.resourceMapper.countByExample(example);

    }

    /**
     * 分页查询
     *
     * @param rowIndex
     * @param pageSize
     * @return
     */
    @Override
    public List<Resource> query(long rowIndex, int pageSize) {

        ResourceExample example = new ResourceExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);

        List<Resource> resourceList = this.resourceMapper.selectByExample(example);

        return resourceList;
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
    public List<Resource> queryByName(String nameLike, long rowIndex, int pageSize) {
        ResourceExample example = new ResourceExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andNameLike("%" + nameLike + "%");

        List<Resource> resourceList = this.resourceMapper.selectByExample(example);

        return resourceList;
    }

    @Override
    public List<ResourceVo> queryByNameContainSysAndCol(String nameLike, long rowIndex, int pageSize) {
        ResourceExample example = new ResourceExample();

        example.setRowIndex(rowIndex);
        example.setPageSize(pageSize);
        example.createCriteria().andNameLike("%" + nameLike + "%");

        List<ResourceVo> resourceVoList = this.resourceMapper.selectContainColAndSys(example);

        return resourceVoList;
    }

    /**
     * 插入
     *
     * @param resource
     */
    @Override
    public int insert(Resource resource) {

        return this.resourceMapper.insert(resource);

    }

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    @Override
    public Resource loadById(int id) {
        ResourceExample example = new ResourceExample();
        example.createCriteria().andIdEqualTo(id);

        List<Resource> resourceList = this.resourceMapper.selectByExample(example);

        return resourceList.isEmpty() ? null : resourceList.get(0);

    }

    /**
     * 根据ID更新
     *
     * @param resource
     */
    @Override
    public int update(Resource resource) {
        ResourceExample example = new ResourceExample();
        example.createCriteria().andIdEqualTo(resource.getId());
        return this.resourceMapper.updateByExample(resource, example);
    }

    /**
     * 根据ID删除
     *
     * @param id
     */
    @Override
    public int delete(int id) {
        ResourceExample example = new ResourceExample();
        example.createCriteria().andIdEqualTo(id);
        return this.resourceMapper.deleteByExample(example);
    }
}