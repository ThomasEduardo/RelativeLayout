package relative.ifpb.edu.br.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.coderefer.androidsplashscreenexample.R;
/**
 * Created by Lorena, Sarah and Thomas on 01/07/2016.
 */
public class MainActivity extends Activity {

    ImageButton Btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        }

        public void abrirArte(View v){
            Intent mona = new Intent(MainActivity.this, ArteActivity.class);
            startActivity(mona);
        }

    public void abrirZuera(View v) {
        Intent modern = new Intent(MainActivity.this, ZueraActivity.class);
        startActivity(modern);
    }

    public void abrirGeek(View v) {
        Intent geek = new Intent(MainActivity.this, GeekActivity.class);
        startActivity(geek);
    }

    public void abrirShow(View v) {
        Intent show = new Intent(MainActivity.this, ShowActivity.class);
        startActivity(show);
    }}
