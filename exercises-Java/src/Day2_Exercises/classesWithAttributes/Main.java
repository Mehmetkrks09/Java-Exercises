package Day2_Exercises.classesWithAttributes;

public class Main {

	public static void main(String[] args) {

  Product product = new Product();
  
  product.setId(1);
  product.setName("Notebook");
  product.setPrice(16.500);
  product.setDescription("GTA 5 Kaldırır");
  product.setStockAmount(1);
  
  ProductManager manager= new ProductManager();
  
  manager.add(product );

	}

}
