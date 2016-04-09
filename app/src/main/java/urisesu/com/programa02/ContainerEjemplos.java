package urisesu.com.programa02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import urisesu.com.programa02.fragments.CustomList;
import urisesu.com.programa02.fragments.CustomList2;
import urisesu.com.programa02.fragments.MovieFragment;

/**
 * Created by Titanium on 12/03/16.
 */
public class ContainerEjemplos extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);
        int pos = getIntent().getExtras().getInt("numeroEjemplo");
        if(pos == 0){
            getSupportFragmentManager().beginTransaction().replace( R.id.container_fragment_ejemplos, new CustomList()).commit();
        }
        else if(pos == 1){
            getSupportFragmentManager().beginTransaction().replace( R.id.container_fragment_ejemplos,
                new CustomList2()).commit();
        }
        else if(pos == 2){
            getSupportFragmentManager().beginTransaction().replace( R.id.container_fragment_ejemplos,
                    new MovieFragment()).commit();
        }
        //int pox = getIntent().getExtras("numeroEjemplo",0);
        //Log.d("Container Ejemplos", "Position: " + pos);
    }
}
