package com.praylist.mobileJoy.splashAnimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.praylist.mobileJoy.R;
import com.praylist.mobileJoy.main.MainActivity;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SplashActivity extends AppCompatActivity {

    Random rand = new Random();
    Handler handler = new Handler();
    ImageView imageView;
    TextView textView;
    int iValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = (ImageView) findViewById(R.id.imageView);
        textView = (TextView) findViewById(R.id.textView);

        iValue = rand.nextInt(5);

        switch (iValue){
            case 0:
                imageView.setImageResource(R.drawable.ic_guitar);
                textView.setText("콘티 짜는 중...");
                imageView.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                break;
            case 1:
                imageView.setImageResource(R.drawable.ic_qt);
                textView.setText("큐티 가져오는 중...");
                imageView.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                break;
            case 2:
                imageView.setImageResource(R.drawable.ic_pray);
                textView.setText("기도문 준비 중...");
                imageView.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                break;
            case 3:
                imageView.setImageResource(R.drawable.ic_bible);
                textView.setText("성경말씀 찾는 중...");
                imageView.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                break;
            case 4:
                imageView.setImageResource(R.drawable.ic_sermon);
                textView.setText("설교문 작성 중...");
                imageView.setVisibility(View.VISIBLE);
                textView.setVisibility(View.VISIBLE);
                break;
        }


//        textView.setVisibility(View.INVISIBLE);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (iValue){
                    case 0:
                        imageView.setImageResource(R.drawable.ic_guitar_clicked);
                        break;
                    case 1:
                        imageView.setImageResource(R.drawable.ic_qt_clicked);
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.ic_pray_clicked);
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.ic_bible_clicked);
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.ic_sermon_clicked);
                        break;

                }
                textView.setText("준비 끝!");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
