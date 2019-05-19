package interfaces;

//Create an interface and inherit it from the other interface.

public interface Answer7Interface2 extends Answer7Interface1 {
	Answer7Interface1 ans = new Answer7Interface1() // All the methods are inherited from the other interface.
	{												// Use of anonymous class.

		public void printline() // method from the other interface.
		{

		}

		public void method2()// method from the other interface. 
		{

		}

		public void method1() // method from the other interface.
		{

		}
	};
}
