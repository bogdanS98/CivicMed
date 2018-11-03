package org.zamolxis.civicmed;

import android.os.Bundle;

import com.sirvar.robin.RobinActivity;

public class LoginActivity extends RobinActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // DO NOT call setContentView();

        // Set title for each screen
        setLoginTitle("Sign in to SAAP");
        setSignupTitle("Welcome to SAAP");
        setForgotPasswordTitle("Forgot Password");

        // Set logo for screens
        setImage(getResources().getDrawable(R.mipmap.ic_launcher));

        // Use custom font across all views
        //setFont(Typeface.createFromAsset(getAssets(), "flatline.ttf"));

        // Choose theme (default is LIGHT)
    }

    @Override
    protected void onLogin(String email, String password) {

    }

    @Override
    protected void onSignup(String name, String email, String password) {

    }

    @Override
    protected void onForgotPassword(String email) {

    }

    @Override
    protected void onGoogleLogin() {

    }

    @Override
    protected void onFacebookLogin() {

    }
}
