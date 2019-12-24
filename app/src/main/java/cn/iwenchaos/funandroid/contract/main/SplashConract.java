package cn.iwenchaos.funandroid.contract.main;

import cn.iwenchaos.funandroid.base.presenter.AbstractPresenter;
import cn.iwenchaos.funandroid.base.view.AbstractView;

/**
 * Created by chaos
 * on 2019/12/24. 10:49
 * 文件描述：
 */
public interface SplashConract {

    interface View extends AbstractView {

        /**
         * go to main page
         */
        void jumpToMain();
    }

    interface Presenter extends AbstractPresenter<View> {

    }

}
