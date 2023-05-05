package com.example.ds2bilet;

import java.io.Serializable;

public class bilet implements Serializable {

    private String name;
    private String mesto;
    private String mesto2;
    private String time;
    private String time2;
    private String coins;

    public bilet(String name, String mesto, String mesto2, String time, String time2, String coins) {
        this.name = name;
        this.mesto = mesto;
        this.mesto2 = mesto2;
        this.time = time;
        this.time2 = time2;
        this.coins = coins;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMesto() {
        return mesto;
    }

    public void setMesto(String mesto) {
        this.mesto = mesto;
    }

    public String getMesto2() {
        return mesto2;
    }

    public void setMesto2(String mesto2) {
        this.mesto2 = mesto2;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTime2() {
        return time2;
    }

    public void setTime2(String time2) {
        this.time2 = time2;
    }

    public String getCoins() {
        return coins;
    }

    public void setCoins(String coins) {
        this.coins = coins;
    }
}







