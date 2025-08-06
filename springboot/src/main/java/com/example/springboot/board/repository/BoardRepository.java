package com.example.springboot.board.repository;

import com.example.springboot.board.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    List<BoardEntity> findByName(String name);
}
