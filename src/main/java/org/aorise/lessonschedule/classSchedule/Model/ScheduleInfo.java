package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by xiaoyao on 2018/9/17.
 */
@Data
public class ScheduleInfo {
    private SubjectInfo subjectInfo;//安排的科目
    private String teacher;//任教老师
    private Map<SubjectInfo,SchedulingProcessInfo> validSubjects;
}
