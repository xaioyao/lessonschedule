package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ScheduleClassInfo {
    private SubjectInfo subjectInfo;//科目
    private Integer totalCount;//总课节数
    private Integer unUsedCount;//未排课节数
    private Integer freeSpace;//可排位置数
    private Map<Integer,SchedulePositionInfo> cannotSetPosMap;//本门课不能安排位置的列表

    public ScheduleClassInfo(SubjectInfo si,Integer tc,Integer uuc,Integer fs,Map<Integer,SchedulePositionInfo> csp){
        this.subjectInfo=si;
        this.totalCount=tc;
        this.unUsedCount=uuc;
        this.freeSpace=fs;
        this.cannotSetPosMap=csp;
    }
}
