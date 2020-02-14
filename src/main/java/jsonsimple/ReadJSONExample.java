package jsonsimple;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONExample 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception, IOException, Exception 
	{
		//JSON parser object to parse read file
		JSONParser jsonParser = new JSONParser();
		FileReader path = new FileReader("employees.json");
		JSONArray obj = (JSONArray) jsonParser.parse(path); 
        

		
		Iterator<String> iterator = obj.iterator();
        while(iterator.hasNext()) {
        	
        }
            
       // System.out.println(lastName); 
       
		
		
		/*try (FileReader reader = new FileReader("employees.json"))
		{
			//Read JSON file
            Object obj = jsonParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
            
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
	}

	private static void parseEmployeeObject(JSONObject employee) 
	{
		//Get employee object within list
		JSONObject employeeObject = (JSONObject) employee.get("employee");
		
		//Get employee first name
		String firstName = (String) employeeObject.get("firstName");	
		System.out.println(firstName);
		
		//Get employee last name
		String lastName = (String) employeeObject.get("lastName");	
		System.out.println(lastName);
		
		//Get employee website name
		String website = (String) employeeObject.get("website");	
		System.out.println(website);
	}*/
}
}