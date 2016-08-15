package relative.ifpb.edu.br.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coderefer.androidsplashscreenexample.R;
/**
 * Created by Lorena, Sarah and Thomas on 01/07/2016.
 */
public class GeekActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.laygeek);
    }
    public void abrirLay1(View v) {
        Intent modern = new Intent(GeekActivity.this, Lay1.class);
        startActivity(modern);
    }

    public void abrirLay2(View v) {
        Intent modern = new Intent(GeekActivity.this, Lay2.class);
        startActivity(modern);



    }
}




