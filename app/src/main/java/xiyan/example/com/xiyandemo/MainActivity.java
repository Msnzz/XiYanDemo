package xiyan.example.com.xiyandemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button but_info;
    private Button but_control;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_info = (Button) findViewById(R.id.but_info);
        but_control = (Button) findViewById(R.id.but_control);
        initLintener();
    }

    private void initLintener() {
        //信息查看
        but_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InfoActivity.class);
                startActivity(intent);
            }
        });

        //大棚控制
        but_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ControlActivity.class);
                startActivity(intent);
            }
        });
    }
}
