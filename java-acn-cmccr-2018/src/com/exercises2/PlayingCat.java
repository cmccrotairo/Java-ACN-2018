package com.exercises2;

public class PlayingCat {
    public static boolean isCatPlaying (boolean summer, int temperature){ //isCatPlaying(true, 10); ==false
        if (temperature <25 || temperature>45){
            return false;
        }else if (summer==false && temperature>=25 && temperature <=35){
            return true;
        }else if (summer==true && temperature>=25 && temperature <=45){
            return true;
        }else
            return false;

    }
}
