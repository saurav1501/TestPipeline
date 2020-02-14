package jsonsimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample2 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception, IOException, Exception 
	{
		 
		  
	      try {
	         //Parsing the contents of the JSON file
	    	  
	    	  FileReader path= new FileReader("employees2.json");
	    	  JSONParser jsonParser = new JSONParser();
	    	  
	         JSONObject jsonObject = (JSONObject) jsonParser.parse(path);
	         //Forming URL
	        
	         System.out.println("Contents of the JSON are: ");
	         System.out.println("ID: "+jsonObject.get("ID"));
	         System.out.println("First name: "+jsonObject.get("First_Name"));
	         System.out.println("Last name: "+jsonObject.get("Last_Name"));
	         System.out.println("Date of birth: "+ jsonObject.get("Date_Of_Birth"));
	         System.out.println("Place of birth: "+ jsonObject.get("Place_Of_Birth"));
	         System.out.println("Salary: "+jsonObject.get("Salary"));
	         //Retrieving the array
	         
	         JSONArray jsonArray = (JSONArray) jsonObject.get("contact");
	         System.out.println("");
	         System.out.println("Contact details: ");
	         //Iterating the contents of the array
	         Iterator<String> iterator = jsonArray.iterator();
	         while(iterator.hasNext()) {
	            System.out.println(iterator.next());
	         }
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	            e.printStackTrace();
	      } catch (ParseException e) {
	            e.printStackTrace();
	      }
	   }
	}