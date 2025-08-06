package com.example.springboot.movie.model;

public class MovieDto {
    public static class Movie{
        private String title;
        private String contents;
        private Integer time;

        public static MovieDto.Movie from(MovieEntity entity) {
            MovieDto.Movie dto  = new MovieDto.Movie();
            dto.setTitle(entity.getTitle());
            dto.setContents(entity.getContents());
            dto.setTime(entity.getTime());

            return dto;
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

        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

    public static class Save{
        private String title;
        private String contents;
        private Integer time;

        public MovieEntity toEntity() {
            MovieEntity entity = new MovieEntity();
            entity.setTitle(title);
            entity.setContents(contents);
            entity.setTime(time);
            return entity;
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

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }
    }
}
