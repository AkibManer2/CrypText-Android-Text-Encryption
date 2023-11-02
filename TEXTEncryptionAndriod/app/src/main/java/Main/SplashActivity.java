package Main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Algorithms.R;


public class SplashActivity extends AppCompatActivity {

    private int Splash_Screen = 3000;
    private ImageView LogoImg;

    private Animation topAnimation,bottomAnimation;

    private TextView LogoText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LogoImg = findViewById(R.id.SplashPC);
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        LogoImg.setAnimation(topAnimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i =new Intent(SplashActivity.this, MainActivity.class);
                startActivity(i);
            }
        },Splash_Screen);


         LogoText = findViewById(R.id.logotext);
         bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_aniation);
         LogoText.setAnimation(bottomAnimation);


    }
}
