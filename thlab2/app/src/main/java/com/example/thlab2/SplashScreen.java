package com.example.thlab2;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.Random;

public class SplashScreen extends AppCompatActivity {
    private int[] imgRd= {R.drawable.lion,
                            R.drawable.penguin,
                            R.drawable.bee,
                            R.drawable.fox,
                            R.drawable.chick,
                            R.drawable.koala,
                            R.drawable.snake,
                            R.drawable.turtle,
                            R.drawable.whale};
    private int[] colorRd= {R.color.purple_700,R.color.purple_200,R.color.purple_500,R.color.teal_200};
    private ImageView img;
    private LinearLayout constraintLayout;
    private  Random random = new Random();
    private  Random random1 = new Random();
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        img = findViewById(R.id.imageView);
        constraintLayout = findViewById(R.id.constraint);
        img.setImageResource(imgRd[random.nextInt(10)]);
        constraintLayout.setBackgroundResource(colorRd[random1.nextInt(5)]);
//        RotateAnimation rotate = new RotateAnimation(0, 360,
//                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
//                RotateAnimation.RELATIVE_TO_SELF, 0.5f);
//
//        rotate.setDuration(2000);  // Thời gian quay (2 giây)
//        rotate.setRepeatCount(RotateAnimation.INFINITE);  // Quay vô hạn
//        img.startAnimation(rotate);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Chuyển đến MainActivity sau thời gian hiển thị
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Đóng SplashScreenActivity
            }
        }, 2000);
    }
}
