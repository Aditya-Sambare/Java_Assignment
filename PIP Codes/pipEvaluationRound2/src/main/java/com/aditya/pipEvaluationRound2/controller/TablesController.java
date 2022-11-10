package com.aditya.pipEvaluationRound2.controller;

import com.aditya.pipEvaluationRound2.dto.requestDto.TableBookingDto;
import com.aditya.pipEvaluationRound2.service.TablesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/tables")
public class TablesController {
    @Autowired
    TablesService tablesService;

    @GetMapping("/addTables")
    public ResponseEntity addTables() {
        try {
            return tablesService.addTables();
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getTables")
    public ResponseEntity getTables() {
        try {
            return tablesService.getTables();
        } catch (Exception exception) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/bookTable")
    public ResponseEntity bookTables(@RequestBody TableBookingDto tableBookingDto) {
        try {
            return new ResponseEntity(Optional.of(tablesService.bookTables(tableBookingDto)),HttpStatus.ACCEPTED);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
