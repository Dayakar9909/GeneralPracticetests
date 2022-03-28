package SteamsExamples;

import java.util.ArrayList;
import java.util.List;

class Product{
    int id;
    String name;
    double price;

public Product(int id, String name, double price) {
    this.id = id;
    this.name = name;
    this.price = price;
    }
}

public class FilterDemo4 {

    public static void main(String[] args){

        List <Product> productsList = new ArrayList<Product>();
        productsList.add(new Product(1, "HP Laptop", 75000));
        productsList.add(new Product(1, "Dell Laptop", 45000));
        productsList.add(new Product(1, "Toshiba Laptop", 38000));
        productsList.add(new Product(1, "Macbook Laptop", 95000));
        productsList.add(new Product(1, "Lenova Laptop", 25000));

        productsList.stream().filter(p->p.price>40000).forEach(pr->System.out.println(pr.price));

      //  productsList.stream().filter(p->p.price>40000).forEach(pr->System.out.println(pr.price));
    }

}
