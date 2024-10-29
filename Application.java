import java.io.PrintStream;
import java.io.IOException;
import java.io.File;

import java.util.Random;

public class WriteToFile
{	public static void main(String[] args)
	{	try
		{	PrintStream writer = new PrintStream( new File("randInts.txt"));
			Random r = new Random();
			final int LIMIT = 100;

			for(int i = 0; i < LIMIT; i++)
			{	writer.println( r.nextInt() );
			}
			writer.close();
		}
		catch(IOException e)
		{	System.out.println("An error occured while trying to write to the file");
		}
	}
#feature202 changes for ethan for Reports module
public class MyClass {

    // Public field
    public int publicField = 10;

    // Public method
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    // Main method to run the program
    public static void main(String[] args) {
        // Creating an object of MyClass
        MyClass myObject = new MyClass();

        // Accessing the public field
        System.out.println("Public Field: " + myObject.publicField);

        // Calling the public method
        myObject.publicMethod();
    }
}
}