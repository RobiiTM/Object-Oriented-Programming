package enunt;

public class Main {
    public static void main(String[] args) {
       for ( ProductType type : ProductType.values()) {
           System.out.println(type);
       }

       Product product = new Product();
       product.setProductType(ProductType.FRUCTE);

        System.out.println(product.getProductType());
    }
}