package com.personal.jalvarez.voipmvp.interactor;

import android.os.Handler;

import com.personal.jalvarez.voipmvp.interfaces.LoginInteractor;
import com.personal.jalvarez.voipmvp.interfaces.OnLoginFinishListener;


/**
 * Created by jalvarez on 10/07/2017.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void validateUser(final String user, final String pass, final OnLoginFinishListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (!user.equals("") && !pass.equals("")) {
                    listener.successfulLogin();
                } else {
                    if (user.equals(""))
                        listener.userError();

                    if (pass.equals(""))
                        listener.passError();
                }
            }
        }, 2000);
    }

}
