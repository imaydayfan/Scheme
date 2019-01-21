package com.example.administrator.scheme;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);

        Uri uri = getIntent().getData();
        if(uri != null){
            String url = uri.toString();
            Log.e("myScheme","Url:" + url);

            String scheme = uri.getScheme();
            Log.e("myScheme","Scheme:" + scheme);

            String host = uri.getHost();
            Log.e("myScheme","Host:" + host);

            int port = uri.getPort();
            Log.e("myScheme","Port:" + port);

            String path = uri.getPath();
            Log.e("myScheme","Path:" + path);
            List<String> pathSegments = uri.getPathSegments();

            String query = uri.getQuery();
            Log.e("myScheme","Query:" + query);
        }
        setContentView(R.layout.activity_main);
    }

    public void baidu(View v){
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        Uri uri =Uri.parse("https://www.baidu.com");
        intent.setData(uri);
        startActivity(intent);
    }
}
