package xiyan.example.com.xiyandemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {

    private EditText et_name;
    private EditText et_pwd;
    private Button but_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_name = (EditText) findViewById(R.id.et_name);
        et_pwd = (EditText) findViewById(R.id.et_pwd);
        but_login = (Button) findViewById(R.id.but_login);
        initLintener();
    }

    private void initLintener(){
        but_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String pwd = et_pwd.getText().toString();
                if ("admin".equals(name)
                        && "123456".equals(pwd)){
                    //登陆成功
                    Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(intent);
                    finish();
                }


            }
        });
    }
}
