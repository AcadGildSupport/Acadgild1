
public class HelloEx {

	//comments
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("Hello World !!! .... ");	
System.out.println("Hello World !!! .... ");	
System.out.println("Hello World !!! .... ");		
		//classname.object.task
		
		//DataType variableName,variableName1;
		short number1,number2;
		int sum;
		
		//variableName=value;		
		number1=128;
		number2=200;
		
		sum=number1+number2;
		
		System.out.println("1. the number is : "+number1);
		System.out.println("2. the number 2 is : "+number2);
		System.out.println("2. the sum of two numbers is : "+sum);
		
		sum=sum-100;
		System.out.println("2. the sum value after diff of 100 is : "+sum);
		
		int value=100; //dataType variableName=value;
		float fl=value;//100.0 //widening
		
		System.out.println("int --- > float : "+fl);
		
		float float1=100.21f;
		int value_int=(int) float1;//100 // loss of 0.21 //narrowing
		System.out.println("float --- > int : "+value_int);
	}

}
