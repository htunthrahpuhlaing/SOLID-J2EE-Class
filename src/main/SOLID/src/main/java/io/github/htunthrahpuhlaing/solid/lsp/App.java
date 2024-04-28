package io.github.htunthrahpuhlaing.solid.lsp;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//srpAndOcp();
		Rectangle r = new Rectangle();
		r.setWidth(5.0);
		r.setLength(2.0);		
		System.out.println(r.area());
		
		Square s = new Square();
		s.setSide(2.0);	
		System.out.println(s.area());

	}

}
