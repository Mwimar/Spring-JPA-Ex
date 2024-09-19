package com.mwimar.Spring_JPA_Ex;

import com.mwimar.Spring_JPA_Ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer> {
    @Query("select s from Student where s.name = ?")
    List students<Student> findByName(String name);

}
