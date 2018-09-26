package org.aorise.lessonschedule.classSchedule.Model;

import lombok.Data;

import java.util.Map;

/**
 * Created by xiaoyao on 2018/9/17.
 */
@Data
public class ClassInfo {
    private String className;//班级名称
    private Map<SubjectInfo,String> subjectTeachers;//班级任课信息
}
