package com.example.hanshu.mybroadcast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent();
                in.setAction("com.example.hanshu.mybrodcast.haha");
                in.putExtra("haha","你好，我是广播者");
//              sendBroadcast(in);
               /* Bundle bundle=new Bundle();
                bundle.putString("haha","你好，我是广播者");
                sendOrderedBroadcast(in,null,null,null,0,null,bundle);*/
                sendOrderedBroadcast(in,null);


            }
        });
    }
}
