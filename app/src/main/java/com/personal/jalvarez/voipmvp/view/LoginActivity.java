package com.personal.jalvarez.voipmvp.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.personal.jalvarez.voipmvp.R;
import com.personal.jalvarez.voipmvp.interfaces.LoginPresenter;
import com.personal.jalvarez.voipmvp.interfaces.LoginView;
import com.personal.jalvarez.voipmvp.presenter.LoginPresenterImpl;

public class LoginActivity extends AppCompatActivity implements LoginView {

    private EditText user;
    private EditText pass;
    private ProgressBar progress;
    private LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        user = (EditText) findViewById(R.id.user);
        pass = (EditText) findViewById(R.id.pass);
        progress = (ProgressBar) findViewById(R.id.progress);

        presenter = new LoginPresenterImpl(this);
    }

    @Override
    public void showProgress() {
        progress.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideProgress() {
        progress.setVisibility(View.GONE);
    }

    @Override
    public void setErrorUser() {
        user.setError("user obligatorio");
    }

    @Override
    public void setErrorPass() {
        pass.setError("pass obligatorio");
    }

    @Override
    public void navigateToHome() {
        startActivity(new Intent(LoginActivity.this, MenuActivity.class));
    }

    public void validacion(View v) {
        presenter.validateUser(user.getText().toString(), pass.getText().toString());
    }
}
