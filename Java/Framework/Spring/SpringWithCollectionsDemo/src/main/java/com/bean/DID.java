package com.bean;

import java.util.List;
import java.util.Map;

public class DID {
    private String seasonName;
    private List<String> brandPartners;
    private Map<Participants,String> participants;

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public List<String> getBrandPartners() {
        return brandPartners;
    }

    public void setBrandPartners(List<String> brandPartners) {
        this.brandPartners = brandPartners;
    }

    public Map<Participants, String> getParticipants() {
        return participants;
    }

    public void setParticipants(Map<Participants, String> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "DID{" +
                "seasonName='" + seasonName + '\'' +
                ", brandPartners=" + brandPartners +
                ", participants=" + participants +
                '}';
    }
    public void display(){
        System.out.println("===================================================================================");
        System.out.println("DID Season name :: "+getSeasonName());
        List<String> list = getBrandPartners();
        System.out.println("Brand Partners Are :: ");
        for (String l :list){
            System.out.println(l);
        }
        Map<Participants,String> map = getParticipants();
        for (Map.Entry<Participants,String> p :map.entrySet()){
            System.out.println(p.getKey()+" : "+p.getValue());
        }
    }
}
