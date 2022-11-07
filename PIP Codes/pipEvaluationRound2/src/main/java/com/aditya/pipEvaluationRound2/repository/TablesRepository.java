package com.aditya.pipEvaluationRound2.repository;

import com.aditya.pipEvaluationRound2.entities.Tables;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TablesRepository extends JpaRepository<Tables,Integer> {
    @Query("select t from Tables t where t.tableSeats = ?1")
    List<Tables> findTableBySeats(int tableSeats);

}
