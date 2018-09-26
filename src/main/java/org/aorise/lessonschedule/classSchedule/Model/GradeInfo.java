package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;
import org.omg.CORBA.INTERNAL;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyao on 2018/9/17.
 */
@Data
public class GradeInfo {
    private Integer grade;//年级
    private String gradeName;//年级描述名称
    private Integer classCount;//班级数
    private Integer dayPerWeek;//每周几天课
    private Integer lessonPerDay;//每天几节课
    private Integer lessonAtAM;//上午课节
    private Integer lessonAtPM;//下午课节
    private List<SubjectInfo> subjectInfos;//年级开设科目列表
    private Map<Integer,ClassInfo> classInfos;//班级信息，以及班级任课信息

    public GradeInfo(Integer g, String gn, Integer c, Integer d, Integer l,Integer lam,Integer lpm) {
        this.grade = d;
        this.gradeName = gn;
        this.classCount = c;
        this.dayPerWeek = d;
        this.lessonPerDay = l;
        this.lessonAtAM=lam;
        this.lessonAtPM=lpm;
    }
}
