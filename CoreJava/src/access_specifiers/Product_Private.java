package access_specifiers;

public class Product_Private {

	private int pId;
	private String pName;
	private float pPrice;
	
	public Product_Private(int pId, String pName, float pPrice)
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
