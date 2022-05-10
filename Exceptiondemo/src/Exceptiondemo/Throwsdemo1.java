package Exceptiondemo;

import java.io.IOException;

public class Throwsdemo1 {
	void Division() throws IOException
    {
        int a=45,b=0,rs;

        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);

    }
	public static void main(String[] args) throws IOException
	{
		Throwsdemo1 T = new Throwsdemo1();
        try
        {
            T.Division();
        }
        catch(ArithmeticException Ex)
        {
            System.err.print("\n\tError : " + Ex.getMessage());
        }
        System.out.print("\n\tEnd of program.");
	}
	

}
