package NoEng.Patterns.Builder2;

public class Product {
    private String name;
    private String description;
    private double price;
    private String manufacturer;
    private int warrantyPeriod;

    private Product(ProductBuilder builder) {
        this.name = builder.name;
        this.description = builder.description;
        this.price = builder.price;
        this.manufacturer = builder.manufacturer;
        this.warrantyPeriod = builder.warrantyPeriod;
    }

    // Getters for the fields

    public static class ProductBuilder {
        private String name;
        private String description;
        private double price;
        private String manufacturer;
        private int warrantyPeriod;

        public ProductBuilder(String name) {
            this.name = name;
        }

        public ProductBuilder description(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder price(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder manufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public ProductBuilder warrantyPeriod(int warrantyPeriod) {
            this.warrantyPeriod = warrantyPeriod;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public int getWarrantyPeriod(){
        return warrantyPeriod;
    }
}

