package com.fg.character;

import com.fg.actions.entities.Action;

import java.io.Serializable;
import java.util.List;

/**
 * Created by raheela on 01/02/2019.
 */
public class Character implements Serializable {
    private Integer id;

    private String name;

    private List<Action> actions;

    public Character() {
    }

    public Character(Integer id, String name, List<Action> actions) {
        this.id = id;
        this.name = name;
        this.actions = actions;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    @Override
    public String toString() {
        return new StringBuffer(" id ").append(this.getId())
                .append(" Name: ").append(this.getName()).append(" Actions : ").append(this.getActions()).toString();
    }
}
