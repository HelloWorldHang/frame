package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.ResPv;
import wang.doug.frame.model.ResPvExample;

public interface ResPvMapper {
    long countByExample(ResPvExample example);

    int deleteByExample(ResPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ResPv record);

    int insertSelective(ResPv record);

    List<ResPv> selectByExample(ResPvExample example);

    List<ResPv> selectByYearAndMonthAndSysIdAndColId(@Param("tdYear") short tdYear, @Param("tdMonth") short tdMonth,@Param("sysId") Integer sysId,@Param("colId") Integer colId);

    ResPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ResPv record, @Param("example") ResPvExample example);

    int updateByExample(@Param("record") ResPv record, @Param("example") ResPvExample example);

    int updateByPrimaryKeySelective(ResPv record);

    int updateByPrimaryKey(ResPv record);
}