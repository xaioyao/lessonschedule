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
            GradeInfo gi = new GradeInfo(grade, grade.toString(), 7, 5, 6, 4, 2,4);
            List<SubjectInfo> subjectInfos = new ArrayList<SubjectInfo>();
            subjectInfos.add(new SubjectInfo("yw", "语文", 1, 9));
            subjectInfos.add(new SubjectInfo("sx", "数学", 1, 4));
            subjectInfos.add(new SubjectInfo("dd", "道德", 3, 3));
            subjectInfos.add(new SubjectInfo("ty", "体育", 3, 4));
            subjectInfos.add(new SubjectInfo("yy", "音乐", 3, 2));
            subjectInfos.add(new SubjectInfo("kx", "科学", 3, 1));
            subjectInfos.add(new SubjectInfo("ms", "美术", 3, 2));
            subjectInfos.add(new SubjectInfo("dh", "队会", 3, 1));

//            subjectInfos.add(new SubjectInfo("yw", "语文", 1, 5));
//            subjectInfos.add(new SubjectInfo("sx", "数学", 1, 5));
//            subjectInfos.add(new SubjectInfo("en", "英语", 1, 4));
//            subjectInfos.add(new SubjectInfo("yy", "音乐", 3, 1));
//            subjectInfos.add(new SubjectInfo("xx", "信息", 3, 1));
//            subjectInfos.add(new SubjectInfo("ld", "劳动", 3, 1));
//            subjectInfos.add(new SubjectInfo("ms", "美术", 3, 1));
//            subjectInfos.add(new SubjectInfo("dl", "地理", 2, 2));
//            subjectInfos.add(new SubjectInfo("yx", "研学", 3, 1));
//            subjectInfos.add(new SubjectInfo("ls", "历史", 2, 3));
//            subjectInfos.add(new SubjectInfo("df", "道德", 2, 2));
//            subjectInfos.add(new SubjectInfo("sw", "生物", 2, 2));
//            subjectInfos.add(new SubjectInfo("gx", "国学", 3, 1));
//            subjectInfos.add(new SubjectInfo("ty", "体育", 3, 1));
//            subjectInfos.add(new SubjectInfo("jk", "健康", 3, 1));
//            subjectInfos.add(new SubjectInfo("zt", "专题", 3, 1));
//            subjectInfos.add(new SubjectInfo("sj", "实践", 3, 1));
//            subjectInfos.add(new SubjectInfo("zq", "足球", 3, 1));
//            subjectInfos.add(new SubjectInfo("tt", "团活", 3, 1));

            gi.setSubjectInfos(subjectInfos);
            Map<Integer, ClassInfo> classInfos = new HashMap<Integer, ClassInfo>();
            for (Integer classNo = 0; classNo < gi.getClassCount(); classNo++) {
                ClassInfo classInfo = new ClassInfo();
                classInfo.setClassName(classNo.toString());
                Map<SubjectInfo, String> subjectTeachers = new HashMap<SubjectInfo, String>();
//                for (SubjectInfo item : subjectInfos) {
//                    Integer c = (int) (Math.pow(2, item.getAttributes()));
//                    subjectTeachers.put(item, String.format("%s%d%d", item.getSubjectCode(), grade, classNo / c));
//                }
                switch (classNo){
                    case 0:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"111");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"118");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"124");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"12");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"118");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"120");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"111");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"118");
                        break;
                    case 1:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"112");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"119");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"124");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"123");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"118");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"112");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"119");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"112");
                        break;
                    case 2:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"113");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"120");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"124");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"123");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"118");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"120");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"120");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"120");
                        break;
                    case 3:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"114");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"119");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"125");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"123");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"118");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"120");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"119");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"114");
                        break;
                    case 4:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"115");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"121");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"125");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"123");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"115");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"121");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"106");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"115");
                        break;
                    case 5:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"116");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"122");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"18");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"113");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"54");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"120");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"122");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"116");
                        break;
                    case 6:
                        subjectTeachers.put(new SubjectInfo("yw", "语文", 1, 9),"117");
                        subjectTeachers.put(new SubjectInfo("sx", "数学", 1, 4),"121");
                        subjectTeachers.put(new SubjectInfo("dd", "道德", 3, 3),"121");
                        subjectTeachers.put(new SubjectInfo("ty", "体育", 3, 4),"27");
                        subjectTeachers.put(new SubjectInfo("yy", "音乐", 3, 2),"54");
                        subjectTeachers.put(new SubjectInfo("kx", "科学", 3, 1),"120");
                        subjectTeachers.put(new SubjectInfo("ms", "美术", 3, 2),"117");
                        subjectTeachers.put(new SubjectInfo("dh", "队会", 3, 1),"117");
                        break;
                }
                classInfo.setSubjectTeachers(subjectTeachers);
                classInfos.put(classNo, classInfo);
            }
            gi.setClassInfos(classInfos);
            gradeInfo.put(grade, gi);
        }
        List<SchedulePositionInfo> fixedInfos=new ArrayList<SchedulePositionInfo>();
        fixedInfos.add(new SchedulePositionInfo(0,0,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
        fixedInfos.add(new SchedulePositionInfo(0,1,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
        fixedInfos.add(new SchedulePositionInfo(0,2,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
        fixedInfos.add(new SchedulePositionInfo(0,3,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
        fixedInfos.add(new SchedulePositionInfo(0,4,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
        fixedInfos.add(new SchedulePositionInfo(0,5,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
        fixedInfos.add(new SchedulePositionInfo(0,6,4,5,new SubjectInfo("dh", "队会", 3, 1),""));
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
                        else{
                            System.out.print("--  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
    }
}
