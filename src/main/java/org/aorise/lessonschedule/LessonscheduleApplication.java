package org.aorise.lessonschedule;

import org.aorise.lessonschedule.classSchedule.ClassScheduling;
import org.aorise.lessonschedule.classSchedule.Model.ClassInfo;
import org.aorise.lessonschedule.classSchedule.Model.GradeInfo;
import org.aorise.lessonschedule.classSchedule.Model.SchedulePositionInfo;
import org.aorise.lessonschedule.classSchedule.Model.SubjectInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SpringBootApplication
public class LessonscheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LessonscheduleApplication.class, args);

        ClassScheduling classScheduling = new ClassScheduling();
        Map<Integer, GradeInfo> gradeInfo = new HashMap<Integer, GradeInfo>();
        //6个年级 每个年级8个班  主课一个老师2个班  副科一个老师四个班  非文化课一个老师8个班
        //每周5天  每天7节
        for (Integer grade = 0; grade < 1; grade++) {
            GradeInfo gi = new GradeInfo(grade, grade.toString(), 8, 5, 7, 4, 3);
            List<SubjectInfo> subjectInfos = new ArrayList<SubjectInfo>();
//            subjectInfos.add(new SubjectInfo("yw", "语文", 1, 9));
//            subjectInfos.add(new SubjectInfo("sx", "数学", 2, 4));
//            subjectInfos.add(new SubjectInfo("en", "英语", 2, 3));
//            subjectInfos.add(new SubjectInfo("yy", "音乐", 3, 2));
//            subjectInfos.add(new SubjectInfo("xx", "信息", 2, 4));
//            subjectInfos.add(new SubjectInfo("ld", "劳动", 3, 2));
//            subjectInfos.add(new SubjectInfo("ms", "美术", 3, 1));
//            subjectInfos.add(new SubjectInfo("dl", "地理", 3, 1));

            subjectInfos.add(new SubjectInfo("yw", "语文", 1, 5));
            subjectInfos.add(new SubjectInfo("sx", "数学", 1, 5));
            subjectInfos.add(new SubjectInfo("en", "英语", 1, 4));
            subjectInfos.add(new SubjectInfo("yy", "音乐", 3, 1));
            subjectInfos.add(new SubjectInfo("xx", "信息", 3, 1));
            subjectInfos.add(new SubjectInfo("ld", "劳动", 3, 1));
            subjectInfos.add(new SubjectInfo("ms", "美术", 3, 1));
            subjectInfos.add(new SubjectInfo("dl", "地理", 2, 2));
            subjectInfos.add(new SubjectInfo("yx", "研学", 3, 1));
            subjectInfos.add(new SubjectInfo("ls", "历史", 2, 3));
            subjectInfos.add(new SubjectInfo("df", "道德", 2, 2));
            subjectInfos.add(new SubjectInfo("sw", "生物", 2, 2));
            subjectInfos.add(new SubjectInfo("gx", "国学", 3, 1));
            subjectInfos.add(new SubjectInfo("ty", "体育", 3, 1));
            subjectInfos.add(new SubjectInfo("jk", "健康", 3, 1));
            subjectInfos.add(new SubjectInfo("zt", "专题", 3, 1));
            subjectInfos.add(new SubjectInfo("sj", "实践", 3, 1));
            subjectInfos.add(new SubjectInfo("zq", "足球", 3, 1));
            subjectInfos.add(new SubjectInfo("tt", "团活", 3, 1));

            gi.setSubjectInfos(subjectInfos);
            Map<Integer, ClassInfo> classInfos = new HashMap<Integer, ClassInfo>();
            for (Integer classNo = 0; classNo < gi.getClassCount(); classNo++) {
                ClassInfo classInfo = new ClassInfo();
                classInfo.setClassName(classNo.toString());
                Map<SubjectInfo, String> subjectTeachers = new HashMap<SubjectInfo, String>();
                for (SubjectInfo item : subjectInfos) {
                    Integer c = (int) (Math.pow(2, item.getAttributes()));
                    subjectTeachers.put(item, String.format("%s%d%d", item.getSubjectCode(), grade, classNo / c));
                }
                classInfo.setSubjectTeachers(subjectTeachers);
                classInfos.put(classNo, classInfo);
            }
            gi.setClassInfos(classInfos);
            gradeInfo.put(grade, gi);
        }
        List<SchedulePositionInfo> fixedInfos=new ArrayList<SchedulePositionInfo>();
        fixedInfos.add(new SchedulePositionInfo(0,0,0,0,new SubjectInfo("sx", "数学", 1, 5),"sx00"));
        classScheduling.setUdfFixedSubjectList(fixedInfos);
        classScheduling.setGradeInfoMap(gradeInfo);
        classScheduling.makeLessonTable();

        for (Map.Entry<Integer, Map<Integer, Map<Integer, Map<Integer, SchedulePositionInfo>>>> item : classScheduling.getScheduleInfos().entrySet()) {
            for (Map.Entry<Integer, Map<Integer, Map<Integer, SchedulePositionInfo>>> itemItem : item.getValue().entrySet()) {
                System.out.println("_________________" + item.getKey().toString() + "年级" + itemItem.getKey().toString() + "班__________");
                for (Map.Entry<Integer, Map<Integer, SchedulePositionInfo>> itemItemItem : itemItem.getValue().entrySet()) {
                    System.out.print("周" + itemItemItem.getKey().toString() + "  ");
                    for (Map.Entry<Integer, SchedulePositionInfo> itemItemItemItem : itemItemItem.getValue().entrySet()) {
                        if (itemItemItemItem.getValue().getSubjectInfo() != null) {
                            System.out.print(itemItemItemItem.getValue().getSubjectInfo().getSubjectName() + "  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
