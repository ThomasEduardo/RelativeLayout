package relative.ifpb.edu.br.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.coderefer.androidsplashscreenexample.R;
/**
 * Created by Lorena, Sarah and Thomas on 01/07/2016.
 */
public class ArteActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arte);
    }

    public void openArte1(View v) {
        Intent modern = new Intent(ArteActivity.this, Arte1.class);
        startActivity(modern);
    }

    public void openArte2(View v) {
        Intent xx = new Intent(ArteActivity.this, Arte2.class);
        startActivity(xx);
    }

    public void openArte3(View v) {
        Intent yy = new Intent(ArteActivity.this, Arte3.class);
        startActivity(yy);
    }
}

