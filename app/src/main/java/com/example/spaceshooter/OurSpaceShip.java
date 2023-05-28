package com.example.spaceshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.Random;

public class OurSpaceShip {
    Context context;
    Bitmap ourSpaceship;
    int ox,oy;
    boolean isAlive = true;
    int ourVelocity;
    Random random;

    public OurSpaceShip(Context context){
        this.context = context;
        ourSpaceship = BitmapFactory.decodeResource(context.getResources(), R.drawable.rocket1);
        random = new Random();
        resetOurSpaceship();
    }
    public Bitmap getOurSpaceship(){
        return ourSpaceship;
    }
    int getOurSpaceshipWidth(){
        return ourSpaceship.getWidth();
    }
    private void resetOurSpaceship() {
        ox = random.nextInt(SpaceShooter.screenWidth);
        oy = SpaceShooter.screenHeight - ourSpaceship.getHeight();
        ourVelocity = 10 + random.nextInt(6);
    }
}
