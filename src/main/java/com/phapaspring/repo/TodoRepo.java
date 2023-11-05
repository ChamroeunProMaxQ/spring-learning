package com.phapaspring.repo;

import com.phapaspring.Model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface TodoRepo extends JpaRepository<Todo, BigInteger> {
}
