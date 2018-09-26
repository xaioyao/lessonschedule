package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;

/**
 * Created by xiaoyao on 2018/9/17.
 */
@Data
public class SubjectInfo {
    private String subjectCode;//课程代号
    private String subjectName;//课程名称
    private Integer attributes;//主副科
    private Integer subjectCount;//课程节数

    public SubjectInfo(String sc,String sn,Integer a,Integer s){
        this.subjectCode=sc;
        this.subjectName=sn;
        this.attributes=a;
        this.subjectCount=s;
    }
}
