package com.bean;

import dao.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    StudentDao studentDao = new StudentDao();
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public void showMenu() throws IOException {
        boolean entry =  true;
        while(entry){
            System.out.println("ENTER 1 TO INSERT RECORD\nENTER 2 TO UPDATE RECORD\nENTER 3 TO FETCH RECORDS" +
                    "\nENTER 4 TO DELETE RECORD\nENTER 5 TO EXIT\nENTER 6 TO FETCH BY RETRICTION" +
                    "\nENTER 7 TO ORDER BY NAME\nENTER 8 TO FETCH BY PROJECTION");
            int option = Integer.parseInt(bufferedReader.readLine());
            switch(option){
                case 1://insert record
                    studentDao.insertRecord();
                    break;
                case 2://update record
                    studentDao.updateRecords();
                    break;
                case 3://fetch records
                    studentDao.fetchRecords();
                    break;
                case 4://delete records
                    studentDao.deleteRecords();
                    break;
                case 5://exit
                    entry = false;
                    break;
                case 6://fetch by restriction
                    studentDao.fetchByRestriction();
                    break;
                case 7://fetch by order
                    studentDao.fetchOrderBy();
                    break;
                case 8://fetch by projection
                    studentDao.fetchByProjection();
                    break;
            }
        }
    }
}
