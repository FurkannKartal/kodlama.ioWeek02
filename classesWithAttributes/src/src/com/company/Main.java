package src.com.company;

public class Main {

    public static void main(String[] args) {
        Product product= new Product(1,"Laptop","Asus",3000,2,"Mavi");
      /*  product.setName("Laptop");
        product.setId(3);
        product.setDescription("Car");
        product.setPrice(300000);
        product.setStockAmount(3);*/

        ProductManager productManager= new ProductManager();
        productManager.Add(product);
        productManager.Add2(2,"furkan","deneme",3,5,"mavi");
        productManager.Add2(2,"furkan","deneme",3,5,"mavi");
        productManager.Add2(2,"furkan","deneme",3,5,"mavi");
        productManager.Add2(2,"furkan","deneme",3,5,"mavi");

    }
}
