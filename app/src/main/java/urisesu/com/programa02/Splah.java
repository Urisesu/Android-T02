package urisesu.com.programa02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splah);

        Thread hilo = new Thread(){
            @Override
            public void run(){
                try{
                    sleep(2000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent login = new Intent(Splah.this,Login.class);
                    startActivity(login);
                    finish();
                }
            }
        };

        hilo.start();
    }
}
