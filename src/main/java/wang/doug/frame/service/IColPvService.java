package wang.doug.frame.service;

import wang.doug.frame.model.ColPv;
import wang.doug.frame.model.ColPv;

import java.util.List;

public interface IColPvService {
    /**
     * 查询所有
     *
     * @return
     */
    List<ColPv> query();

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
    List<ColPv> query(long rowIndex, int pageSize);

    List<ColPv> query(Integer sysId,short tdYear,short tdMonth);


    /**
     * 分页查询
     *
     * @param nameLike 名称
     * @param rowIndex 开始记录索引
     * @param pageSize 查询数量
     * @return
     */
    List<ColPv> queryByName(String nameLike, long rowIndex, int pageSize);


    /**
     * 插入
     *
     * @param colPv
     */
    int insert(ColPv colPv);

    /**
     * 根据ID查询
     *
     * @param id
     * @return
     */
    ColPv loadById(int id);

    /**
     * 根据ID更新
     *
     * @param colPv 学校
     * @return 更新的记录数
     */
    int update(ColPv colPv);

    /**
     * 根据ID删除
     *
     * @param id ID
     * @return 删除的记录数
     */
    int delete(int id);
}
