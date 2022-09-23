package com.bean;

import com.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringJT.xml");
        BookDao bookDao = (BookDao) applicationContext.getBean("bdao");
        boolean entry = true;
        while(entry){
            System.out.println("================================================================================================================");
            System.out.println("Enter 1 to insert the book\nEnter 2 to fetch all book\nEnter 3 to update the book\nEnter 4 to delete the book\nEnter 5 to fetch the particular book\nEnter 6 to exit");
            System.out.println("================================================================================================================");
            int option = Integer.parseInt(bufferedReader.readLine());
            switch(option){
                case 1://insert book
                    bookDao.insertBook();
                    break;
                case 2://fetch all books
                    bookDao.fetchAllBooks();
                    break;
                case 3://update book
                    bookDao.updateBook();
                    break;
                case 4://delete book
                    bookDao.deleteBook();
                    break;
                case 5://fetch particular book
                    bookDao.fetchParticularBook();
                    break;
                case 6://exit
                    entry = false;
                    break;
            }

        }
    }
}
