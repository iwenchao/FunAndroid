package cn.iwenchaos.funandroid.base.presenter;

import cn.iwenchaos.funandroid.base.view.AbstractView;
import io.reactivex.disposables.Disposable;

/**
 * Created by chaos
 * on 2019/12/24. 10:28
 * 文件描述：
 */
public interface AbstractPresenter<T extends AbstractView> {

    /**
     * 注入 view
     *
     * @param view view
     */
    void attachView(T view);

    /**
     * 回收view
     */
    void detachView();


    /**
     * add rxbind subscribe manager
     *
     * @param disposable disposable
     */
    void addRxBindingSubscribe(Disposable disposable);

    /**
     * get night mode state
     *
     * @return if is night mode
     */
    boolean getNightModeState();

    /**
     * set login status
     *
     * @param loginStatus
     */
    void setLoginStatus(boolean loginStatus);


    /**
     * get login status
     *
     * @return if is login status
     */
    boolean getLoginStatus();

    /**
     * get login account
     *
     * @return login account
     */
    String getLoginAccount();


    /**
     * set login account
     *
     * @param account account
     */
    void setLoginAccount(String account);


    /**
     * set login password
     *
     * @param password password
     */
    void setLoginPassword(String password);

    /**
     * get current page
     *
     * @return current page
     */
    int getCurrentPage();
}
