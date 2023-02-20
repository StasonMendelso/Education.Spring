package org.example;

import org.springframework.stereotype.Component;

/**
 * @author Stanislav Hlova
 */
public class PopMusic implements Music{
    private PopMusic(){}
    public void init(){
        System.out.println("Initialization...");
    }
    public void destroy(){
        System.out.println("Destroying...");
    }    @Override
    public String getSong() {
        return "Blame";
    }
    public static PopMusic getPopMusic(){
        return new PopMusic();
    }
}
