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
    public void addMenu() {
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
        menuRepository.save(menu);
        menuRepository.save(menu1);
        menuRepository.save(menu2);
        menuRepository.save(menu3);
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
