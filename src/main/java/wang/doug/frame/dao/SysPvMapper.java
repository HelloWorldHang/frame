package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.SysPv;
import wang.doug.frame.model.SysPvExample;

public interface SysPvMapper {
    long countByExample(SysPvExample example);

    int deleteByExample(SysPvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysPv record);

    int insertSelective(SysPv record);

    List<SysPv> selectByExample(SysPvExample example);

    SysPv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysPv record, @Param("example") SysPvExample example);

    int updateByExample(@Param("record") SysPv record, @Param("example") SysPvExample example);

    int updateByPrimaryKeySelective(SysPv record);

    int updateByPrimaryKey(SysPv record);
}