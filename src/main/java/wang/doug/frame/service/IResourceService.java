package wang.doug.frame.service;

import wang.doug.frame.model.Resource;
import wang.doug.frame.vo.ResourceVo;

import java.util.List;

public interface IResourceService {
    /**
     * 查询所有
     *
     * @return
     */
    List<Resource> query();

    /**
     * 总数
     *
     * @return
     */
    long total();

    /**
     * 查询数量
     *
     * @param nameLike
     * @return
     */
    long countByName(String nameLike);

    /**
     * 分页查询
     *
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<Resource> query(long rowIndex, int pageSize);


    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<Resource> queryByName(String nameLike, long rowIndex, int pageSize);

    /**
     * 分页查询包含系统名和栏目名
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<ResourceVo> queryByNameContainSysAndCol(String nameLike, long rowIndex, int pageSize);

    /**
     * 插入
     *
     * @param resource
     */
    int insert(Resource resource);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    Resource loadById(int id);

    /**
     * 根据ID更新
     *
     * @param resource 学校
     * @return 更新的记录数
     */
    int update(Resource resource);

    /**
     * 根据ID删除
     *
     * @param id ID
     * @return 删除的记录数
     */
    int delete(int id);
}
