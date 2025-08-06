package com.example.springboot.product.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    BoardService boardService;

    public ProductController(BoardService boardService) {
        this.boardService = boardService;
    }

    @PostMapping("/save")
    public ResponseEntity save(@RequestMapping BoardDto.Create dto) {
        boardService.save(dto);
        return ResponseEntity.status(200).body("저장완료");
    }
}
