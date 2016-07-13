package com.example.syl.test1;

import android.app.Dialog;
import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.InputStream;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addsControls();
    }

    private void addsControls() {
        img = (ImageView) findViewById(R.id.img);
        img.setImageResource(getResources().getIdentifier("avatar.jpg","drawable",getPackageName()));
        btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                showDialog(0);
            }
        });
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        switch (id){
            case 0:
                return new AlertDialog.Builder(this)
                        .setIcon(R.drawable.folder_icon)
                        .setTitle("Hi hi, d0's, nG0k's")
                        .create();
        }
        return null;
    }
}
