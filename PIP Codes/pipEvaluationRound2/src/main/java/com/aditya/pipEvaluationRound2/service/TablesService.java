package com.aditya.pipEvaluationRound2.service;

import com.aditya.pipEvaluationRound2.dto.TablesDto;
import com.aditya.pipEvaluationRound2.entities.Tables;
import org.springframework.http.ResponseEntity;

public interface TablesService {
    public ResponseEntity addTables();
    public ResponseEntity BookTable(TablesDto tablesDto);
}
