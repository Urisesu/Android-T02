package urisesu.com.programa02;

import android.content.Intent;
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

    private String user;
    private String pass;

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
                pass = password.getText().toString();
                user = username.getText().toString();

                if(validation()){
                    if(user.equalsIgnoreCase("urisesu") && pass.equalsIgnoreCase("java")){
                        Toast.makeText(Login.this,getString(R.string.login_success),Toast.LENGTH_LONG).show();
                        Intent listIntent = new Intent(Login.this, List.class);
                        startActivity(listIntent);
                    }else{
                        Toast.makeText(Login.this,getString(R.string.login_fail),Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }

    private boolean validation(){
        boolean success = true;
        if(user.equalsIgnoreCase("")){
            username.setError(getString(R.string.error_field_require));
            username.requestFocus();
            success = false;
        }
        if(pass.equalsIgnoreCase("")){
            password.setError(getString(R.string.error_field_require));
            password.requestFocus();
            success = false;
        }
        return success;
    }


}
