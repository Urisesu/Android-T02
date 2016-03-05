package urisesu.com.programa02;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Titanium on 05/03/16.
 */
public class Login extends AppCompatActivity{

    private EditText username;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = (EditText) findViewById(R.id.text_username);
        password = (EditText) findViewById(R.id.text_password);
        login = (Button) findViewById(R.id.button_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = password.getText().toString();
                String user = username.getText().toString();

                if(user.equalsIgnoreCase("")){
                    username.setError("Este campo es necesario");
                    username.requestFocus();
                }
                if(pass.equalsIgnoreCase("")){
                    password.setError("Este campo es necesario");
                    password.requestFocus();
                }

                if(user.equalsIgnoreCase("urisesu") && pass.equalsIgnoreCase("java")){
                    Toast.makeText(Login.this,"Success!!",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(Login.this,"Fail!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}
