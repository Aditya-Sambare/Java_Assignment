package com.bean;

public class Players {
    private int jno;
    private String name;
    private int bidValue;

    public Players() {
    }

    public Players(int jno, String name, int bidValue) {
        this.jno = jno;
        this.name = name;
        this.bidValue = bidValue;
    }

    public int getJno() {
        return jno;
    }

    public void setJno(int jno) {
        this.jno = jno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBidValue() {
        return bidValue;
    }

    public void setBidValue(int bidValue) {
        this.bidValue = bidValue;
    }
}
