package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.ColPv;
import wang.doug.frame.model.ColPvExample;

public interface ColPvMapper {
    long countByExample(ColPvExample example);

    int deleteByExample(ColPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ColPv record);

    int insertSelective(ColPv record);

    List<ColPv> selectByExample(ColPvExample example);

    List<ColPv> selectBySysIdAndYearAndMonth(@Param("sysId") Integer sysId,@Param("tdYear") short tdYear,@Param("tdMonth") short tdMonth);

    ColPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ColPv record, @Param("example") ColPvExample example);

    int updateByExample(@Param("record") ColPv record, @Param("example") ColPvExample example);

    int updateByPrimaryKeySelective(ColPv record);

    int updateByPrimaryKey(ColPv record);
}