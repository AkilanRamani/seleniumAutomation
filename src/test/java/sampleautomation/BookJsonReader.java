package sampleautomation;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BookJsonReader {

	public static void main(String[] argv) throws Exception
    {
 
        // Try block to check for exceptions
        try {
 
            // Creating Arrays of String type
            String a[]
                = new String[] {};
 
            // Getting the list view of Array
            List<String> list = Arrays.asList(a);
 
            // Printing all the elements in list object
            System.out.println("The list is: " + list);
        }
 
        // Catch block to handle exceptions
        catch (NullPointerException e) {
 
            // Print statement
            System.out.println("Exception thrown : " + e);
        }
    }
}
	

