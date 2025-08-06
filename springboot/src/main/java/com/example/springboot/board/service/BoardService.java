package com.example.springboot.board.service;

import com.example.springboot.board.model.BoardDto;
import com.example.springboot.board.model.BoardEntity;
import com.example.springboot.board.repository.BoardRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void save(BoardDto.Save dto) {
        boardRepository.save(dto.toEntity());
    }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();

        return result.stream().map(BoardDto.Board::from).toList();
    }

    public BoardDto.Board read(Integer idx) {
        Optional<BoardEntity> result = boardRepository.findById(idx);

        if (result.isPresent()) {
            BoardEntity entity = result.get();

            return BoardDto.Board.from(entity);
        }
        return null;
    }

    public List<BoardDto.Board> search(String name) {
        List<BoardEntity> result = boardRepository.findByTitle(name);

        return result.stream().map(BoardDto.Board::from).toList();

    }


}
