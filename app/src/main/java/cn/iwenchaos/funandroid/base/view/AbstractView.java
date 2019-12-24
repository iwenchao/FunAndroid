package cn.iwenchaos.funandroid.base.view;

/**
 * Created by chaos
 * on 2019/12/24. 10:22
 * 文件描述：
 */
public interface AbstractView {


    /**
     * use night mode
     *
     * @param isNightMode if is night mode
     */
    void useNightMode(boolean isNightMode);


    /**
     * show error msg
     *
     * @param eMessage error message
     */
    void showErrorMsg(String eMessage);

    void showNormal();

    void showError();

    void showLoading();

    void showLoginView();

    void showLogoutView();

    void showCancelCollectSuccess();

    /**
     * show snackBar
     *
     * @param message 内容
     */
    void showSnackBar(String message);

}
