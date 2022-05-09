package com.play.constructor;

public class Apple {
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}
