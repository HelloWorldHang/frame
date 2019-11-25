package wang.doug.frame.service;

import wang.doug.frame.model.SitePv;
import wang.doug.frame.vo.SitePvVo;

import java.util.List;

public interface ISitePvService {
    /**
     * 查询所有
     *
     * @return
     */
    List<SitePvVo> query();

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
     * 查询共有多少个系统
     *
     * @param
     * @return
     */
    long countBySystem();

    /**
     * 查询数量
     *
     * @param ipLike
     * @return
     */
    long countByIp(String ipLike);

    /**
     * 分页查询
     *
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<SitePvVo> query(long rowIndex, int pageSize);


    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<SitePvVo> queryByName(String nameLike, long rowIndex, int pageSize);

    List<SitePvVo> selectAllSystem();

    List<SitePvVo> selectAllYear(Integer sysId);

    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<SitePvVo> queryAllSystemPv(String nameLike, long rowIndex, int pageSize);

    /**
     * 分页查询
     *
     * @param ipLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<SitePvVo> queryByIp(String ipLike, long rowIndex, int pageSize);

    /**
     * 插入
     *
     * @param sitePv
     */
    int insert(SitePv sitePv);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    SitePvVo loadById(int id);

    /**
     * 根据ID更新
     *
     * @param sitePv 学校
     * @return 更新的记录数
     */
    int update(SitePv sitePv);

    /**
     * 根据ID删除
     *
     * @param id ID
     * @return 删除的记录数
     */
    int delete(int id);
}
