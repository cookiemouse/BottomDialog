package com.yundian.bottomdialogtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.yundian.bottomdialog.BottomDialog;


public class MainActivity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.btn_activity_main_showdialog);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomDialog bottomDialog = new BottomDialog();
                View view = LayoutInflater.from(MainActivity.this).inflate(R.layout.view_dialog, null);
                bottomDialog.setContentView(view);
                bottomDialog.show(getFragmentManager(), "testfragment");
            }
        });
    }
}
