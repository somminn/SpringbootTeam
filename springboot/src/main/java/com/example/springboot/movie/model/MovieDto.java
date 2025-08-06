package com.example.springboot.movie.model;

public class MovieDto {
    public static class Movie{
        private String title;
        private String contents;
        private int runTime;

        public static MovieDto.Movie from(MovieEntity entity) {
            MovieDto.Movie dto  = new MovieDto.Movie();
            dto.setName(entity.getTitle());
            dto.setContents(entity.getContents());
            dto.setPrice(entity.getRuntime());

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

        public int getRunTime() {
            return runTime;
        }

        public void setRunTime(int runTime) {
            this.runTime = runTime;
        }
    }

    public static class Save{
        private String title;
        private String contents;
        private int runTime;

        public MovieEntity toEntity() {
            MovieEntity entity = new MovieEntity();
            entity.setTitle(title);
            entity.setContents(contents);
            entity.setRuntime(runTime);
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

        public int getRunTime() {
            return runTime;
        }

        public void setRunTime(int runTime) {
            this.runTime = runTime;
        }
    }
}
