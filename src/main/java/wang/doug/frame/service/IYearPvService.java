package wang.doug.frame.service;

import wang.doug.frame.model.YearPv;

import java.util.List;

public interface IYearPvService {
    /**
     * 查询所有
     *
     * @return
     */
    List<YearPv> query();

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
     * 查询某sysId下所有年份共多少条记录
     *
     * @param sysId
     * @return
     */
    long countBySysId(Integer sysId);

    /**
     * 分页查询
     *
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<YearPv> query(long rowIndex, int pageSize);
    /**
     * 根据系统id查询所有年份的
     *
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<YearPv> queryBySysId(Integer sysId, long rowIndex, int pageSize);


    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<YearPv> queryByName(String nameLike, long rowIndex, int pageSize);

    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<YearPv> queryByName(String nameLike, long rowIndex, int pageSize, String orderByClause);

    /**
     * 插入
     *
     * @param yearPv
     */
    int insert(YearPv yearPv);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    YearPv loadById(int id);

    /**
     * 根据ID更新
     *
     * @param yearPv 学校
     * @return 更新的记录数
     */
    int update(YearPv yearPv);

    /**
     * 根据ID删除
     *
     * @param id ID
     * @return 删除的记录数
     */
    int delete(int id);
}
