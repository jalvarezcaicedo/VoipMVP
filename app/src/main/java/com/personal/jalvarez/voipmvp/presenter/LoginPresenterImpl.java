package com.personal.jalvarez.voipmvp.presenter;

import com.personal.jalvarez.voipmvp.interactor.LoginInteractorImpl;
import com.personal.jalvarez.voipmvp.interfaces.LoginInteractor;
import com.personal.jalvarez.voipmvp.interfaces.LoginPresenter;
import com.personal.jalvarez.voipmvp.interfaces.LoginView;
import com.personal.jalvarez.voipmvp.interfaces.OnLoginFinishListener;

/**
 * Created by jalvarez on 10/07/2017.
 */

public class LoginPresenterImpl implements LoginPresenter, OnLoginFinishListener {

    private LoginView view;
    private LoginInteractor interactor;

    public LoginPresenterImpl(LoginView view) {
        this.view = view;
        interactor = new LoginInteractorImpl();
    }

    @Override
    public void validateUser(String user, String pass) {
        if (view != null) {
            view.showProgress();
        }
        interactor.validateUser(user, pass, this);
    }

    @Override
    public void userError() {
        if (view != null) {
            view.hideProgress();
            view.setErrorUser();
        }
    }

    @Override
    public void passError() {
        if (view != null) {
            view.hideProgress();
            view.setErrorPass();
        }
    }

    @Override
    public void successfulLogin() {
        if (view != null) {
            view.hideProgress();
            view.navigateToHome();
        }
    }
}
