package com.example.springboot.menu.model;

import com.example.springboot.movie.model.MovieDto;
import com.example.springboot.movie.model.MovieEntity;
import lombok.Builder;
import lombok.Getter;

public class MenuDto {
    @Builder
    public static class Menu {
        private Integer idx;
        private String title;
        private Integer price;
        private Integer calorie;

        public static MenuDto.Menu from(MenuEntity entity) {
            MenuDto.Menu dto = Menu.builder()
                    .idx(entity.getIdx())
                    .title(entity.getTitle())
                    .price(entity.getPrice())
                    .calorie(entity.getCalorie())
                    .build();

            return dto;
        }
    }

    @Getter
    public static class save {
        private String title;
        private Integer price;
        private Integer calorie;

        public MenuEntity toEntity() {
            MenuEntity entity = MenuEntity.builder()
                    .title(title)
                    .price(price)
                    .calorie(calorie)
                    .build();

            return entity;
        }
    }
}
