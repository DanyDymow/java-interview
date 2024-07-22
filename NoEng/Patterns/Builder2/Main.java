package NoEng.Patterns.Builder2;

public class Main {
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder("Smartphone")
                .description("Latest model with advanced features")
                .price(699.99)
                .manufacturer("TechCorp")
                .warrantyPeriod(24)
                .build();

        System.out.println("Product created: ");
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Manufacturer: " + product.getManufacturer());
        System.out.println("Warranty Period (months): " + product.getWarrantyPeriod());
    }
}

