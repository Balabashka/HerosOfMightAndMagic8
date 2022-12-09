package com.example.herosofmightandmagic8.Heros;

import com.example.herosofmightandmagic8.Effects.Effects;

public class Hero {
    private  String name;
    private int team;
    private int maxHP;
    private int currentHP;
    private int initiative;
    private int currentInitiative;
    private boolean isAlive = true;
    private String[] attackList;
    private Effects effects = new Effects();

    public String getName() {
        return name;
    }

    public int getTeam() {
        return team;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public int getInitiative() {
        return initiative;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public String[] getAttackList() {
        return attackList;
    }

    public int getCurrentInitiative() {
        return currentInitiative;
    }

    public void setCurrentInitiative(int currentInitiative) {
        this.currentInitiative = currentInitiative;
    }

    public int getCurrentHP() {
        return currentHP;
    }

    public void setCurrentHP(int currentHP) {
        this.currentHP = currentHP;
    }

    public Effects getEffects() {
        return effects;
    }

    public void setEffects(Effects effects) {
        this.effects = effects;
    }

    public void takeDamage(int damage)
    {
        currentHP -= damage;
        if(currentHP <= 0)
        {
            isAlive = false;
        }
    }

    public void takeHealing(int healing)
    {
        currentHP += healing;
        if(currentHP > maxHP)
        {
            currentHP = maxHP;
        }
    }

    public boolean attackRequest(String userInput)
    {
        switch (userInput)
        {
            default:
                return false;
        }
    }
    //takes in an attack user wants to do. If it is successful returns true otherwise false

    public Hero(String name, int team, int maxHP, int initiative) {
        this.name = name;
        this.team = team;
        this.maxHP = maxHP;
        this.initiative = initiative;
        this.currentInitiative = initiative;
    }
}
