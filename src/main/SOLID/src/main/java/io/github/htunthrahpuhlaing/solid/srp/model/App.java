package io.github.htunthrahpuhlaing.solid.srp.model;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> products = new ArrayList<>();
		
		products.add(new Product("Apple", Color.Red, Size.M));
		products.add(new Product("Banana", Color.Yellow, Size.M));
		products.add(new Product("Strawberry", Color.Red, Size.S));
		products.add(new Product("Coconut", Color.Green, Size.l));
		products.add(new Product("Watermelon", Color.Green, Size.l));
		
		ProductFilter product = new ProductFilter();
//		product.filter(products, Color.Yellow);
//		product.filter(products, Size.l);
//		product.filter(products, Color.Red, Size.S);
		
		product.filter(products, new ColorCondition(Color.Red));
		product.filter(products, new SizeCondition(Size.M));

	}

}
