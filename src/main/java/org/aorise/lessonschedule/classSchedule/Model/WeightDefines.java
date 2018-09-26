package org.aorise.lessonschedule.classSchedule.Model;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by xiaoyao on 2018/9/17.
 */
public class WeightDefines {
    public static Integer WEIGHT_BASE = 100;
    public static Integer SUBJECT_ATTRIBUTES = 5;//主副科权重
    public static Map<Double, Integer> SUBJECT_FREE_SPACE = new LinkedHashMap<Double, Integer>() {{
        put(5.0, 5);
        put(3.0, 3);
        put(2.0, 2);
        put(1.5, 1);
        put(1.0, 0);

    }};//可排课节数阶梯权重
    public static Integer SUBJECT_SEQNO_DIFF = 3;//同日同节课程尽量不同
    public static Integer SUBJECT_CONTINUE = 30;//连堂绝对优先
    public static Integer SUBJECT_PER_DAY = 6;//平均天课节阶梯权重
    public static Integer SUBJECT_FIRST_FIXED = 2;//从未安排过的科目优先

    public static Integer SUBJECT_NULL_LAST_AM = 50;
    public static Integer SUBJECT_NULL_LAST_PM = 0;
    public static Integer SUBJECT_NULL_OTHER = 100;
}
