package com.example.androidbasic101v;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    boolean imageOneShowing = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onPressImage(View view){
        Log.i("info", "image tapped");
        ImageView imageViewOne = (ImageView) findViewById(R.id.imageView2);
        ImageView imageViewTwo = (ImageView) findViewById(R.id.imageView3);

        if(imageOneShowing){
            imageOneShowing =false;
            Log.i("info", " 0 - 1 :"+ imageOneShowing );
            imageViewOne.animate().alpha(0).setDuration(2000);
            imageViewTwo.animate().alpha(1).setDuration(2000);
        }
        else {

            imageOneShowing =true;
            Log.i("info", " 1 - 0: "+imageOneShowing );
            imageViewOne.animate().alpha(1).setDuration(2000);
            imageViewTwo.animate().alpha(0).setDuration(2000);

        }
        ;
//        imageViewTwo.animate().alpha(0).setDuration(2000);



//        imageViewOne.animate().alpha(1).setDuration(2000);


    }
}