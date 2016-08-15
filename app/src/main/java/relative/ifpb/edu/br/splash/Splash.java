package relative.ifpb.edu.br.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.coderefer.androidsplashscreenexample.R;

import java.util.Timer;
import java.util.TimerTask;
/**
 * Created by Lorena, Sarah and Thomas on 01/07/2016.
 */
public class Splash  extends Activity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);

            Thread timerThread = new Thread(){
                public void run(){
                    try{
                        sleep(5000);
                    }catch(InterruptedException e){
                        e.printStackTrace();
                    }finally{
                        Intent intent = new Intent(Splash.this,MainActivity.class);
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

