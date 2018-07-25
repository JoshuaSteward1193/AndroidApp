package com.textgame.joshuas.textgame;

/**
 * Created by Joshua S on 7/23/2018.
 */

public class GameEngine {
    public static void navigate(int i){
        GameData.currentLocation.actions.get(i).carryOut();

    }
}
