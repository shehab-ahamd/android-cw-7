package com.example.classwork;

public class pokemon {
    public String name;
    public int image;
    public int attack;
    public int defence;
    public int toatl;

    public pokemon(String name, int image, int attack, int defence, int toatl) {
        this.name = name;
        this.image = image;
        this.attack = attack;
        this.defence = defence;
        this.toatl = toatl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getToatl() {
        return toatl;
    }

    public void setToatl(int toatl) {
        this.toatl = toatl;
    }
}
