package com.example.springboot.board.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    private BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository) {
        this.boardRepository = boardRepository;
    }

    public void save(ServiceDto.Save dto) {
        boardRepository.save(dto);
    }

    public List<BoardDto.Board> list() {
        List<BoardEntity> result = boardRepository.findAll();

        return result.strean().map(BoardDto.Board::from).toList();
    }

    public BoardDto.Board read(Integer idx) {
        Optional<BoardDto.Board> result = boardRepository.findbyId(idx);

        if (result.isPresent()) {
            BoardDto.Board entity = result.get();

            return BoardDto.Board.from(entity);
        }
        return null;
    }

    public List<BoardDto.Board> search(String name) {
        List<BoardEntity> result = boardRepository.findByName(name);

        return result.stream().map(BoardDto.Board::from).toList();

    }


}
