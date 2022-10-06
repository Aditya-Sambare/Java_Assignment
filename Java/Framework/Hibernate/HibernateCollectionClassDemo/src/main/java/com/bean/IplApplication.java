package com.bean;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class IplApplication {
    public static void main(String[] args) throws IOException {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        System.out.println("enter number of teams");
        count = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < count; i++) {
            Transaction transaction = session.beginTransaction();
            System.out.println("enter team and owner name");
            String teamName = bufferedReader.readLine();
            String ownerName = bufferedReader.readLine();
            System.out.println("how many players you want to add");
            int pcount = Integer.parseInt(bufferedReader.readLine());
            Map<String,Players> playersMap = new HashMap<String,Players>();
            for (int j = 0; j < pcount; j++) {
                Players players = new Players();
                System.out.println("enter name , bid value of player and country name");
                String name = bufferedReader.readLine();
                int bid = Integer.parseInt(bufferedReader.readLine());
                players.setName(name);
                players.setBidValue(bid);
                String countryname  = bufferedReader.readLine();
                playersMap.put(countryname,players);
                System.out.println(countryname);
            }
            IplTeamDetails iplTeamDetails = new IplTeamDetails();
            iplTeamDetails.setTeam_name(teamName);
            iplTeamDetails.setOwner_name(ownerName);
            iplTeamDetails.setPlayers(playersMap);
            session.save(iplTeamDetails);
            transaction.commit();
            session.close();

        }
    }
}
