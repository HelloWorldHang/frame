package wang.doug.frame.service;

import wang.doug.frame.model.MonthPv;
import wang.doug.frame.model.SitePv;

import java.util.List;

public interface IMonthPvService {
    /**
     * 查询所有
     *
     * @return
     */
    List<MonthPv> query();

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
    List<MonthPv> query(long rowIndex, int pageSize);

    List<MonthPv> query(int sysId, short year);


    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<MonthPv> queryByName(String nameLike, long rowIndex, int pageSize);


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
    MonthPv loadById(int id);

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
