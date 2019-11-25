package wang.doug.frame.service;

import wang.doug.frame.model.ResPv;

import java.util.List;

public interface IResPvService {
    List<ResPv> selectByYearAndMonthAndSysIdAndColId(short tdYear,short tdMonth,Integer sysId,Integer colId);
}
