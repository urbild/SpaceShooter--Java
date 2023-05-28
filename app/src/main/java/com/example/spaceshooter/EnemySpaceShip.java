package com.example.spaceshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class EnemySpaceShip {
    Context context;
    Bitmap enemySpaceShip;
    int ex,ey;
    int enemyVelocity;
    Random random;

    public EnemySpaceShip(Context context){
        this.context = context;
        enemySpaceShip = BitmapFactory.decodeResource(context.getResources(), R.drawable.rocket2);
        random = new Random();
        resetEnemySpaceShip();
    }
    public Bitmap getEnemySpaceShip(){
        return enemySpaceShip;
    }

    int getEnemySpaceshipWidth() {
        return enemySpaceShip.getWidth();
    }

    int getEnemySpaceshipHeight() {
        return enemySpaceShip.getHeight();
    }
    private void resetEnemySpaceShip() {
        ex = 200 + random.nextInt(400);
        ey = 0;
        enemyVelocity = 14 + random.nextInt(10);
    }
}
