package com.example.springboot.board.repository;

import com.example.springboot.board.model.BoardDto;
import com.example.springboot.board.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BoardRepository extends JpaRepository<BoardEntity, Integer> {
    List<BoardEntity> findByTitle(String name);

    Optional<BoardDto.Board> findbyId(Integer idx);
}
