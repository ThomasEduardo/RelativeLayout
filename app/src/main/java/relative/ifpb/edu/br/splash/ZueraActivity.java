package relative.ifpb.edu.br.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.coderefer.androidsplashscreenexample.R;
/**
 * Created by Lorena, Sarah and Thomas on 01/07/2016.
 */
public class ZueraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layzuera);
    }

    public void abrirZ1(View v) {
        Intent modern = new Intent(ZueraActivity.this, Z1.class);
        startActivity(modern);
    }

    public void abrirZ2(View v) {
        Intent modern = new Intent(ZueraActivity.this, Z2.class);
        startActivity(modern);
    }

    public void abrirZ3(View v) {
        Intent modern = new Intent(ZueraActivity.this, Z3.class);
        startActivity(modern);
    }
    public void abrirZ4(View v) {
        Intent modern = new Intent(ZueraActivity.this, Z4.class);
        startActivity(modern);
    }
}



