package thisandsuper;

//Print the fields/instance members of the parent class using super

public class Answer2 
{
	
		public int x = 100 ;
		public int y = 200 ;
		
		public void add() // declaring instance methood in the class , will be accessed by this keyword.
		{
			int x = 20 , y = 30 ;
			int z = x + y ;
			System.out.println(z);
		}
		
		public void printVariables()
		{
			System.out.println("Value of x is : "+this.x); // Accessing the variable with this keyword.
			System.out.println("Value of y is : "+this.y); // Accessing the variable with this keyword.
			
			this.add(); //Accessing the method with this keyword.
		}

}
