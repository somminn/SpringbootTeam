package com.example.springboot.product.model;

public class ProductDto {
    public static class Product{
        private String name;
        private String contents;
        private int price;

        public static Product from(ProductEntity entity) {
            Product dto  = new Product();
            dto.setName(entity.getName());
            dto.setContents(entity.getContents());
            dto.setPrice(entity.getPrice());

            return dto;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }

    public static class Save{
        private String name;
        private String contents;
        private int price;

        public ProductEntity toEntity() {
            ProductEntity entity = new ProductEntity();
            entity.setName(name);
            entity.setContents(contents);
            entity.setPrice(price);
            return entity;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getContents() {
            return contents;
        }

        public void setContents(String contents) {
            this.contents = contents;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }
    }
}
