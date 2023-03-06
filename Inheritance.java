class C
{
   public void disp()
   {
	System.out.println("C");
   }
}

class A extends C
{
   public void disp()
   {
	System.out.println("A");
   }
}

class B extends C
{
   public void disp()
   {
	System.out.println("B");
   }
	
}

class Inheritance extends A
{
   public void disp()
   {
	System.out.println("D");
   }
   public static void main(String args[]){

	Inheritance obj = new Inheritance();
	obj.disp();
   }
}