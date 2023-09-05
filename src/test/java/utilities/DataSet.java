package utilities;

import org.testng.annotations.DataProvider;

public class DataSet {
	
	@DataProvider (name = "FillupOrderForm")
	public static Object dataset() {
		Object [][] object = {
				{"Jabed Hosen"}, 
				{"01512345678"},
				{"01512345678"},
				{"abc@gmail.com"},
				{"Bangladesh"}
				};
		return object;
		
	}

}
