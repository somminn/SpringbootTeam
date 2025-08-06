package com.example.springboot.board.model;

public class BoardDto {

    public static class Board{
        private Integer idx;
        private String title;
        private String contents;

        public static BoardDto.Board from(BoardEntity entity){
            BoardDto.Board dto = new BoardDto.Board();
            dto.setIdx(entity.getIdx());
            dto.setTitle(entity.getTitle());
            dto.setContents(entity.getContents());

            return dto;
        }


        public Integer getIdx() {
            return idx;
        }

        public void setIdx(Integer idx) {
            this.idx = idx;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }

    public static class Save{
        private String title;
        private String contents;


        public BoardEntity toEntity(){
            BoardEntity entity = new BoardEntity();
            entity.setTitle(title);
            entity.setContents(contents);
            return  entity;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }
    }
}
