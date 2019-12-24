package cn.iwenchaos.funandroid.base.presenter;

import cn.iwenchaos.funandroid.base.view.AbstractView;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by chaos
 * on 2019/12/24. 10:45
 * 文件描述：
 */
public class BasePresenter<T extends AbstractView> implements AbstractPresenter<T> {


    protected T mView;
    private CompositeDisposable mCompositeDisposable;

    public BasePresenter() {

    }

    @Override
    public void attachView(T view) {
        this.mView = view;
    }

    @Override
    public void detachView() {
        this.mView = null;
        if (mCompositeDisposable != null) {
            mCompositeDisposable.clear();
        }
    }

    @Override
    public void addRxBindingSubscribe(Disposable disposable) {
        addSubscribe(disposable);
    }

    @Override
    public boolean getNightModeState() {
        return false;
    }

    @Override
    public void setLoginStatus(boolean loginStatus) {

    }

    @Override
    public boolean getLoginStatus() {
        return false;
    }

    @Override
    public String getLoginAccount() {
        return null;
    }

    @Override
    public void setLoginAccount(String account) {

    }

    @Override
    public void setLoginPassword(String password) {

    }

    @Override
    public int getCurrentPage() {
        return 0;
    }

    protected void addSubscribe(Disposable disposable) {
        if (mCompositeDisposable != null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }
}
