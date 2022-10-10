package com.bean;

import javax.persistence.Embeddable;

@Embeddable
public class EmbedableDemo {
    int embedableID;
    String embedableName;

    public EmbedableDemo() {
    }

    public EmbedableDemo(int embedableID, String embedableName) {
        this.embedableID = embedableID;
        this.embedableName = embedableName;
    }

    public int getEmbedableID() {
        return embedableID;
    }

    public void setEmbedableID(int embedableID) {
        this.embedableID = embedableID;
    }

    public String getEmbedableName() {
        return embedableName;
    }

    public void setEmbedableName(String embedableName) {
        this.embedableName = embedableName;
    }

    @Override
    public String toString() {
        return "EmbedableDemo{" +
                "embedableID=" + embedableID +
                ", embedableName='" + embedableName + '\'' +
                '}';
    }
}
