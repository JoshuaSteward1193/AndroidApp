package com.textgame.joshuas.textgame;

/**
 * Created by Joshua S on 7/23/2018.
 */

public class GameEngine {
    public static void navigate(int i){
        Encounter currentRoom = GameData.currentLocation;
        GameData.currentLocation = currentRoom.actions.get(i).destination;
    }
}
