package org.aorise.lessonschedule.classSchedule.Model;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xiaoyao on 2018/9/17.
 */
public class WeightDefines {
    public static Integer WEIGHT_BASE = 100;
    public static Integer SUBJECT_ATTRIBUTES = 6;//主副科权重
    public static Integer SUBJECT_FIRST_LESSON_WEIGHT=15;//第一节课主课优先级更高
    public static Integer SUBJECT_FREE_SPACE = 2;//可排课节数阶梯权重
    public static Integer SUBJECT_SEQNO_DIFF = 2;//同日同节课程尽量不同
    public static Integer SUBJECT_CONTINUE = 30;//连堂绝对优先
    public static Integer SUBJECT_PER_DAY = 8;//平均天课节阶梯权重
    public static Integer SUBJECT_FIRST_FIXED = 2;//从未安排过的科目优先

    public static Integer SUBJECT_NULL_POSITION = 50;
    public static Integer SUBJECT_NULL_OTHER = 100;
}
