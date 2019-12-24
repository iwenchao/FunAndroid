package cn.iwenchaos.funandroid.base.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import cn.iwenchaos.funandroid.component.ActivityCollector;
import me.yokeyword.fragmentation.SupportActivity;

/**
 * Created by chaos
 * on 2019/12/24. 09:47
 * 文件描述：作为support activity的封装基类
 */
public abstract class AbstractSupportActivity extends SupportActivity {

    private Unbinder mUnbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        mUnbinder = ButterKnife.bind(this);
        ActivityCollector.getInstance().add(this);
        onViewCreated();
        initToolbar();
        initEventAndData();
    }

    /**
     * 返回页面布局id
     *
     * @return
     * @apiNote 目前只支持xml类型的布局id
     */
    protected abstract int getLayoutId();


    /**
     * 在ui控件实例化之后
     */
    protected abstract void onViewCreated();


    /**
     * 初始化 toolbar
     */
    protected abstract void initToolbar();


    /**
     * 初始化数据
     */
    protected abstract void initEventAndData();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.getInstance().remove(this);
        if (mUnbinder != null) {
            mUnbinder.unbind();
            mUnbinder = null;
        }
    }
}
