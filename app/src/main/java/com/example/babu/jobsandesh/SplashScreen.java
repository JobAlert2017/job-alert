package com.example.babu.jobsandesh;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.babu.jobsandesh.jobseeker.BackgroundJobseekerLogin;
import com.example.babu.jobsandesh.jobseeker.SessionJobseeker;

public class SplashScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{

                        Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                        startActivity(intent);

                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        // TODO Auto-generated method stub
        super.onPause();
        finish();
    }

}