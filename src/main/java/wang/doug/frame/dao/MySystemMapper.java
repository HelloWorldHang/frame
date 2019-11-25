package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.MySystem;
import wang.doug.frame.model.MySystemExample;

public interface MySystemMapper {
    long countByExample(MySystemExample example);

    int deleteByExample(MySystemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MySystem record);

    int insertSelective(MySystem record);

    List<MySystem> selectByExample(MySystemExample example);

    MySystem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MySystem record, @Param("example") MySystemExample example);

    int updateByExample(@Param("record") MySystem record, @Param("example") MySystemExample example);

    int updateByPrimaryKeySelective(MySystem record);

    int updateByPrimaryKey(MySystem record);
}