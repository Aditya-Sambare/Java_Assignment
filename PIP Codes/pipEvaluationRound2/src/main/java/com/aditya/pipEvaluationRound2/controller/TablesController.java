package com.aditya.pipEvaluationRound2.controller;

import com.aditya.pipEvaluationRound2.dto.TablesDto;
import com.aditya.pipEvaluationRound2.service.MenuService;
import com.aditya.pipEvaluationRound2.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tables")
public class TablesController {
    @Autowired
    TablesService tablesService;

    @GetMapping("/get")
    public ResponseEntity addTables() {
        try {
            return tablesService.addTables();
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

//    @PostMapping("/book")
//    public ResponseEntity bookTables(@RequestBody TablesDto tablesDto) {
//        try {
//            return tablesService.BookTable(tablesDto);
//        } catch (Exception exception) {
//            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//    }
}
