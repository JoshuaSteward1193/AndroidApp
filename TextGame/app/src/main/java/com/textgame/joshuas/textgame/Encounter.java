package com.textgame.joshuas.textgame;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Joshua S on 7/21/2018.
 */

public class Encounter {
    public String name;
    public String description;
    public List<Action> actions = new ArrayList<Action>();

    public Encounter(String n, String d){
        name = n;
        description = d;
    }
    public void AddAction(Action x){
        actions.add(x);
    }
}
