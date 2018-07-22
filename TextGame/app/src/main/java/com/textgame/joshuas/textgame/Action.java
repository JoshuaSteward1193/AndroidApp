package com.textgame.joshuas.textgame;

/**
 * Created by Joshua S on 7/21/2018.
 */

public class Action {
    public String description;
    //The term 'Destination' is used even in cases where an action does not take the player to another
    //physical location. For example, a conversation could have another conversation as its destination.
    public Encounter destination;

    public Action(String des, Encounter loc){
        description = des;
        destination = loc;
    }
}
