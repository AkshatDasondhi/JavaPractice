

class Product {
	static int product(int a, int b)
	{
		return a * b;
	}

	static double product(double a, double b)
	{
		return a * b;
	}
}

public class Polymorphism {
    public static void main(String[] args)
	{
		System.out.println(Product.product(6, 7));
		System.out.println(Product.product(8.2, 7.3));
	}
}
