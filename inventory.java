import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;

class inventory{
	
	public static void main(String [] args){
		System.out.println("Macapagal!");
		
		
		item a = new item("HBW", "Ball point", 7.00f);
		item b = new item("PINK", "Rollerball", 20.00f);
		item c = new item("G-tech", "Affluent", 2500.00f);
		
		List<item> bolpen = new ArrayList();
		bolpen.add(a);
		bolpen.add(b);
		bolpen.add(c);
		
		
		
		// find item/product frm List
    
    String itemName;
		
		System.out.println("Enter Item Name: ");
		Read rd = new Read(new Input(System.in));
		itemName = rd.readLine();
		
		System.out.println("You inputted Item:");
		System.out.println(itemName);
    
     for(Item x : bolpen){
           
           if(x.Getname()=="Ballpoint"){
                System.out.println("Product Found");
            }
            
            else{
                System.out.println("Product not Found");
		
	}
	
	
}