package duanyingkui.flappybird;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import duanyingkui.flappybird.view.FlappyBirdSurfaceView;

public class FlappyBirdActivity extends AppCompatActivity {

    FlappyBirdSurfaceView mFlappyBird;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();//隐藏标题栏
        mFlappyBird = new FlappyBirdSurfaceView(this);
        setContentView(R.layout.activity_flappy_bird);
//        setContentView(mFlappyBird);
    }
}
