package access_specifiers;

public class Product_Default {

	int pId;
	String pName;
	float pPrice;
	
	public Product_Default(int pId, String pName, float pPrice)
	{
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	public void showProductInfo()
	{
		System.out.println(this.pId);
		System.out.println(this.pName);
		System.out.println(this.pPrice);
	}
	
}
