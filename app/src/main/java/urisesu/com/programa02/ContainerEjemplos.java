package urisesu.com.programa02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Titanium on 12/03/16.
 */
public class ContainerEjemplos extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        int pos = getIntent().getExtras().getInt("numeroEjemplo");
        //int pox = getIntent().getExtras("numeroEjemplo",0);
        Log.d("Container Ejemplos", "Position: " + pos);
    }
}
