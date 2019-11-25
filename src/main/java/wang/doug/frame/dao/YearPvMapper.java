package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.YearPv;
import wang.doug.frame.model.YearPvExample;

public interface YearPvMapper {
    long countByExample(YearPvExample example);

    int deleteByExample(YearPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YearPv record);

    int insertSelective(YearPv record);

    List<YearPv> selectByExample(YearPvExample example);

    YearPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YearPv record, @Param("example") YearPvExample example);

    int updateByExample(@Param("record") YearPv record, @Param("example") YearPvExample example);

    int updateByPrimaryKeySelective(YearPv record);

    int updateByPrimaryKey(YearPv record);
}