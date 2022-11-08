package com.aditya.pipEvaluationRound2.service;

import com.aditya.pipEvaluationRound2.dto.TablesDto;
import com.aditya.pipEvaluationRound2.entities.Tables;
import com.aditya.pipEvaluationRound2.repository.TablesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TablesServiceImpl implements TablesService{
  @Autowired
  TablesRepository tablesRepository;
    @Override
    public ResponseEntity addTables() {
        Tables tables1 = new Tables();
        tables1.setTableName("T1");
        tables1.setTableSeats(2);
        tables1.setTableStatus("available");
      Tables tables2 = new Tables();
      tables2.setTableName("T2");
      tables2.setTableSeats(2);
      tables2.setTableStatus("available");
      Tables tables3 = new Tables();
      tables3.setTableName("T3");
      tables3.setTableSeats(2);
      tables3.setTableStatus("available");
      Tables tables4 = new Tables();
      tables4.setTableName("T4");
      tables4.setTableSeats(2);
      tables4.setTableStatus("available");
      Tables tables5 = new Tables();
      tables5.setTableName("T5");
      tables5.setTableSeats(2);
      tables5.setTableStatus("available");
      Tables tables6 = new Tables();
      tables6.setTableName("T6");
      tables6.setTableSeats(2);
      tables6.setTableStatus("available");
      Tables tables7 = new Tables();
      tables7.setTableName("T7");
      tables7.setTableSeats(2);
      tables7.setTableStatus("available");
      Tables tables8 = new Tables();
      tables8.setTableName("T8");
      tables8.setTableSeats(2);
      tables8.setTableStatus("available");
      Tables tables14 = new Tables();
      tables14.setTableName("T9");
      tables14.setTableSeats(4);
      tables14.setTableStatus("available");
      Tables tables24 = new Tables();
      tables24.setTableName("T10");
      tables24.setTableSeats(4);
      tables24.setTableStatus("available");
      Tables tables34 = new Tables();
      tables34.setTableName("T11");
      tables34.setTableSeats(4);
      tables34.setTableStatus("available");
      Tables tables44 = new Tables();
      tables44.setTableName("T12");
      tables44.setTableSeats(4);
      tables44.setTableStatus("available");
      Tables tables36 = new Tables();
      tables36.setTableName("T13");
      tables36.setTableSeats(6);
      tables36.setTableStatus("available");
      Tables tables46 = new Tables();
      tables46.setTableName("T14");
      tables46.setTableSeats(6);
      tables46.setTableStatus("available");
      Tables tables38 = new Tables();
      tables38.setTableName("T15");
      tables38.setTableSeats(8);
      tables38.setTableStatus("available");
      Tables tables48 = new Tables();
      tables48.setTableName("T16");
      tables48.setTableSeats(8);
      tables48.setTableStatus("available");
      List<Tables> tablesList = new ArrayList<>();
      tablesList.add(tables1);
      tablesList.add(tables2);
      tablesList.add(tables3);
      tablesList.add(tables4);
      tablesList.add(tables5);
      tablesList.add(tables6);
      tablesList.add(tables7);
      tablesList.add(tables8);
      tablesList.add(tables14);
      tablesList.add(tables24);
      tablesList.add(tables34);
      tablesList.add(tables44);
      tablesList.add(tables36);
      tablesList.add(tables46);
      tablesList.add(tables38);
      tablesList.add(tables48);
      List<Tables> tablesList1 = tablesRepository.saveAll(tablesList);
      if (tablesList1==null){
        return new ResponseEntity(Optional.of("Tables not found"), HttpStatus.NOT_ACCEPTABLE);
      }else{
        return new ResponseEntity(Optional.of(tablesList1),HttpStatus.ACCEPTED);

      }
    }

//    @Override
//    public ResponseEntity BookTable(TablesDto tablesDto) {
//      Tables tables = new Tables();
//      tables.setTableBookingDate(tablesDto.getTableBookingDate());
//      tables.setTableBookingTime(tablesDto.getTableBookingTime());
//      tables.setTableId(tablesDto.getTableId());
//      tables.setTableName(tablesDto.getTableName());
//      tables.setTableSeats(tablesDto.getTableSeats());
//      tables.setTableStatus("booked");
//      List<Tables> tablesList = tablesRepository.findTableBySeats(tablesDto.getTableSeats());
//      List<Tables> tablesList1 = tablesList.stream().filter(s->s.getTableBookingDate().before(tablesDto.getTableBookingDate())||s.getTableBookingDate().after(tablesDto.getTableBookingDate())).collect(Collectors.toList());
//        if (tablesList1.size() < 0 ){
//          Tables tables1 = tablesRepository.save(tables);
//          if (tables1 == null){
//            return new ResponseEntity<>(Optional.of("table not Booked"),HttpStatus.NOT_ACCEPTABLE);
//          }else{
//            return new ResponseEntity(Optional.of(tables1),HttpStatus.ACCEPTED);
//          }
//        }else{
//          return null;
//        }
//    }
}
