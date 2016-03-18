package com.crunchify.restjersey;
 
import java.util.List;
import javax.ws.rs.*;
import java.io.*;

@Path("/placeorder")
public class PlaceOrder {
	@POST
	@Produces("text/html")
	public String saveParameters(@FormParam("name") String name,
			@FormParam("address") String address,
			@FormParam("apt") String apt,
			@FormParam("phone") String contact_number,
			@FormParam("size") String size,
			@FormParam("crust") String crust,
			@FormParam("cheese") String cheese,
			@FormParam("sauce") String sauce,
			@FormParam("price") String price,
			@FormParam("topping") List<String> toppings
		) {
		Order item = new Order();
		item.setName(name);
		item.setAddress(address);
		item.setApt(apt);
		item.setPrice(price);
		item.setCrust(crust);
		item.setCheese(cheese);
		item.setPhone(contact_number);
		item.setSauce(sauce);
		item.setToppings(toppings);
		item.setSize(size);
		File file = new File("Orders.txt");
		FileWriter fileWriter = null;
		 try {
		// if file doesn't exists, then create it
		      if (!file.exists())
		      {
			      file.createNewFile();
			      
		      }    
	              fileWriter = new FileWriter(file.getAbsoluteFile(),true);
	              fileWriter.append(item.getName()+",");
	              fileWriter.append(item.getAddress()+",");
	              fileWriter.append(item.getPhone()+",");
	              fileWriter.append(item.getApt()+",");
	              fileWriter.append(item.getSize()+",");
	              fileWriter.append(item.getCheese()+",");  
	              fileWriter.append(item.getSauce()+",");
	              fileWriter.append(item.getCrust()+",");
	              fileWriter.append(item.getPrice()+",");
	              fileWriter.append(item.getToppings()+",");
	            }
	            catch (Exception e)
	            {
	            	System.out.println("Error in CsvFileWriter.");
	            	e.printStackTrace();
	            	
	            }
	            finally 
	            {
	            	 try 
	            	 {
	            	      fileWriter.flush();
	            	      fileWriter.close();	            	
	            	  }
	            	 catch (IOException e)
	            	 {
	            	         System.out.println("Error while flushing/closing fileWriter !!!");
	            	         e.printStackTrace();
	            	  }
	            	        }
		String result = "<html><body><h1>Thank you <b>"+name+"</b> for placing your order. The order has been saved.</body></html>" ;
		 return result;
		 
	}
}