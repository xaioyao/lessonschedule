package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;

/**
 * Created by xiaoyao on 2018/9/17.
 */
@Data
public class SchedulePositionInfo {
    private Integer grade;
    private Integer classNo;
    private Integer weekDay;
    private Integer seqNo;
    private SubjectInfo subjectInfo;//科目
    private String teacher;//老师

    public SchedulePositionInfo(Integer g, Integer cn, Integer wd, Integer sn, SubjectInfo si,String t){
        this.grade=g;
        this.classNo=cn;
        this.weekDay=wd;
        this.seqNo=sn;
        this.subjectInfo=si;
        this.teacher=t;
    }
}
