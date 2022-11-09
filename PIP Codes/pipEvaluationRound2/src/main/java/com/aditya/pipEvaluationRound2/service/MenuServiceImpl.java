package com.aditya.pipEvaluationRound2.service;

import com.aditya.pipEvaluationRound2.entities.Menu;
import com.aditya.pipEvaluationRound2.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    MenuRepository menuRepository;
    @Override
    public ResponseEntity addMenu() {
        Menu menu = new Menu();
        menu.setItemName("coffee");
        menu.setItemPrice(30);
        Menu menu1 = new Menu();
        menu1.setItemName("tea");
        menu1.setItemPrice(20);
        Menu menu2 = new Menu();
        menu2.setItemName("samosa");
        menu2.setItemPrice(40);
        Menu menu3 = new Menu();
        menu3.setItemName("misal");
        menu3.setItemPrice(50);
        Menu menu4 = new Menu();
        menu4.setItemName("pav bhaji");
        menu4.setItemPrice(80);
        Menu menu5 = new Menu();
        menu5.setItemName("Dosa");
        menu5.setItemPrice(50);
        Menu menu6 = new Menu();
        menu6.setItemName("Biryani");
        menu6.setItemPrice(100);
        Menu menu7 = new Menu();
        menu7.setItemName("Vada pav");
        menu7.setItemPrice(20);
        menuRepository.save(menu);
        menuRepository.save(menu1);
        menuRepository.save(menu2);
        menuRepository.save(menu3);
        menuRepository.save(menu4);
        menuRepository.save(menu5);
        menuRepository.save(menu6);
        menuRepository.save(menu7);
        List<Menu> menuList = menuRepository.findAll();
        if (menuList.size() == 0){
            return new ResponseEntity(Optional.of("Something went Wrong"),HttpStatus.NOT_ACCEPTABLE);
        }else{
            return new ResponseEntity(Optional.of(menuList),HttpStatus.ACCEPTED);
        }
    }

    @Override
    public ResponseEntity showMenu() {
        List<Menu> menuList = menuRepository.findAll();
        if (menuList==null){
            return new ResponseEntity(Optional.of("Menu not found"), HttpStatus.NOT_ACCEPTABLE);
        }else{
            return new ResponseEntity(Optional.of(menuList),HttpStatus.ACCEPTED);
        }
    }
}
