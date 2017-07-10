package com.personal.jalvarez.voipmvp.interfaces;

/**
 * Created by jalvarez on 10/07/2017.
 */

public interface LoginView {

    void showProgress();

    void hideProgress();

    void setErrorUser();

    void setErrorPass();

    void navigateToHome();

}
