package com.personal.jalvarez.voipmvp.interfaces;

/**
 * Created by jalvarez on 10/07/2017.
 */

public interface LoginInteractor {

    void validateUser(String user, String pass, OnLoginFinishListener listener);

}
