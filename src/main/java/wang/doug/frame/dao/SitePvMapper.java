package wang.doug.frame.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import wang.doug.frame.model.SitePv;
import wang.doug.frame.model.SitePvExample;
import wang.doug.frame.vo.SitePvVo;

public interface SitePvMapper {
    long countByExample(SitePvExample example);

    int countBySystem();

    int deleteByExample(SitePvExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SitePv record);

    int insertSelective(SitePv record);

    List<SitePv> selectByExample(SitePvExample example);

    List<SitePvVo> selectByExampleContainRcsName(SitePvExample example);

    List<SitePvVo> selectAllSystem();

    List<SitePvVo> selectAllYear(@Param("sysId") Integer sysId);

    SitePv selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SitePv record, @Param("example") SitePvExample example);

    int updateByExample(@Param("record") SitePv record, @Param("example") SitePvExample example);

    int updateByPrimaryKeySelective(SitePv record);

    int updateByPrimaryKey(SitePv record);
}