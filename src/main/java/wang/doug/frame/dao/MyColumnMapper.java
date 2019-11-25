package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.MyColumn;
import wang.doug.frame.model.MyColumnExample;
import wang.doug.frame.vo.MyColumnVo;

public interface MyColumnMapper {
    long countByExample(MyColumnExample example);

    int deleteByExample(MyColumnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MyColumn record);

    int insertSelective(MyColumn record);

    List<MyColumn> selectByExample(MyColumnExample example);

    List<MyColumnVo> selectContainSystemName(MyColumnExample example);

    MyColumn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MyColumn record, @Param("example") MyColumnExample example);

    int updateByExample(@Param("record") MyColumn record, @Param("example") MyColumnExample example);

    int updateByPrimaryKeySelective(MyColumn record);

    int updateByPrimaryKey(MyColumn record);
}