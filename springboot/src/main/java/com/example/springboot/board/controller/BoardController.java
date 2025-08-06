package com.example.springboot.board.controller;

import com.example.springboot.board.model.BoardDto;
import com.example.springboot.board.service.BoardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/board")

public class BoardController {

    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestBody BoardDto.Save dto){
        boardService.save(dto);
        
        return ResponseEntity.status(200).body("완료");
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        List<BoardDto.Board> response = boardService.list();

        return ResponseEntity.status(200).body(response);
    }


    @GetMapping("/read")
    public ResponseEntity read(Integer idx){
        BoardDto.Board response = boardService.read(idx);

        return ResponseEntity.status(200).body(response);
    }

    @GetMapping("/search")
    public ResponseEntity search(String title){
        List<BoardDto.Board> response = boardService.search(title);

        return ResponseEntity.status(200).body(response);
    }

}
