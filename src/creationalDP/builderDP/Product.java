package creationalDP.builderDP;

import java.time.LocalDateTime;

public class Product {

    private Long id;
    private String name;
    private LocalDateTime date;
    private boolean inStock;
    private String description;
    private int price;

    //default const
    public Product() {
    }
    // parametreli const
    public Product(Long id, String name, LocalDateTime date, boolean inStock, String description, int price) {
        this.id = id;     //zorunlu -- olmazsa olmaz
        this.name = name; // //zorunlu -- olmazsa olmaz
        this.date = date;
        this.inStock = inStock;
        this.description = description;
        this.price = price;
    }
    //iki parametreli const
    public Product(Long id, String name) {
        this.id = id;     //zorunlu -- olmazsa olmaz
        this.name = name; // //zorunlu -- olmazsa olmaz

    }

    public Product(ProductBuilder productBuilder) {
        this.id= productBuilder.id;
        this.name= productBuilder.name;
        this.date=productBuilder.date;
        this.inStock= productBuilder.inStock;
        this.description= productBuilder.description;
        this.price= productBuilder.price;


    }

    // getter - setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    // toString
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", inStock=" + inStock +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public static class ProductBuilder{

        private Long id;
        private String name;
        private LocalDateTime date;
        private boolean inStock;
        private String description;
        private int price;

        public ProductBuilder id(Long id){
            this.id=id;
            return this;  // ProductBuilder i gonderiyor
        }

        public ProductBuilder name(String name){
            this.name=name;
            return this;  // ProductBuilder i gonderiyor
        }
        public ProductBuilder date(LocalDateTime date){
            this.date=date;
            return this;  // ProductBuilder i gonderiyor
        }
        public ProductBuilder inStock(boolean inStock){
            this.inStock=inStock;
            return this;  // ProductBuilder i gonderiyor
        }
        public ProductBuilder description(String description){
            this.description=description;
            return this;  // ProductBuilder i gonderiyor
        }
        public ProductBuilder price(int price){
            this.price=price;
            return this;  // ProductBuilder i gonderiyor
        }

        public Product build(){
            Product product = new Product(this);
            return product;
        } 



    }



}














