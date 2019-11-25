package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.MonthPv;
import wang.doug.frame.model.MonthPvExample;

public interface MonthPvMapper {
    long countByExample(MonthPvExample example);

    int deleteByExample(MonthPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MonthPv record);

    int insertSelective(MonthPv record);

    List<MonthPv> selectByExample(MonthPvExample example);

    List<MonthPv> selectBySysIdAndYear(@Param("sysId")Integer sysId,@Param("tdYear")Short tdYear);

    MonthPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MonthPv record, @Param("example") MonthPvExample example);

    int updateByExample(@Param("record") MonthPv record, @Param("example") MonthPvExample example);

    int updateByPrimaryKeySelective(MonthPv record);

    int updateByPrimaryKey(MonthPv record);
}