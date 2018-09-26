package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;

/**
 * Created by xiaoyao on 2018/9/17.
 */
@Data
public class SchedulingProcessInfo {
    private ScheduleClassInfo scheduleClassInfo;//班级排课情况
    private Integer weights=100;//权重
    private boolean isCanSelect=true;
    private Integer cannotSelReason;//0:都可以选；1：因同一老师在其他班上课 2，本科目已经排完 3:没有位置可排：4：外部设置不可排

    public SchedulingProcessInfo(ScheduleClassInfo s,Integer ws,boolean b,Integer csr){
        this.scheduleClassInfo=s;
        this.weights=ws;
        this.isCanSelect=b;
        this.cannotSelReason=csr;
    }
}
