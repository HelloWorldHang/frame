package wang.doug.frame.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wang.doug.frame.dao.ResPvMapper;
import wang.doug.frame.model.ResPv;
import wang.doug.frame.service.IResPvService;

import java.util.List;

/**
 * @description: *
 * @author: 司云航
 * @create: 2019-07-23 17:32
 */
@Service
public class ResPvServiceImpl  implements IResPvService {

    @Autowired
    private ResPvMapper resPvMapper;
    @Override
    public List<ResPv> selectByYearAndMonthAndSysIdAndColId(short tdYear, short tdMonth, Integer sysId, Integer colId) {
        return resPvMapper.selectByYearAndMonthAndSysIdAndColId(tdYear,tdMonth,sysId,colId);
    }
}
