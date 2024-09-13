package com.mwimar.Spring_JPA_Ex;

import com.mwimar.Spring_JPA_Ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository <Student, Integer> {
}
