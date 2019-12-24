package cn.iwenchaos.funandroid.component;

import android.app.Activity;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chaos
 * on 2019/12/24. 10:00
 * 文件描述：
 */
public final class ActivityCollector {


    private static ActivityCollector sInstance;
    private Set<Activity> mActivities;

    private ActivityCollector() {
    }

    /**
     * 获取activity管理类
     *
     * @return
     */
    public static ActivityCollector getInstance() {
        if (sInstance == null) {
            synchronized (ActivityCollector.class) {
                if (sInstance == null) {
                    sInstance = new ActivityCollector();
                }
            }
        }
        return sInstance;
    }


    /**
     * 添加activity
     *
     * @param activity
     * @return
     * @throws IllegalArgumentException
     */
    public boolean add(Activity activity) {
        if (activity == null) {
            throw new IllegalArgumentException("不支持null类型的activity");
        }
        return getActivities().add(activity);

    }

    /**
     * 删除指定activity
     *
     * @param activity
     * @return
     */
    public boolean remove(Activity activity) {
        if (activity == null) {
            return true;
        }
        return getActivities().remove(activity);
    }

    private Set<Activity> getActivities() {
        if (mActivities == null) {
            mActivities = new HashSet<>();
        }
        return mActivities;
    }

}
