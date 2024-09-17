package women;

import genericUtility.Base_Class;
import objectRepository.HoddiesPage;
import objectRepository.Home_Page;

public class Hoodies_Test extends Base_Class {
	
	public void Hoodie()
	{
		Home_Page hp=new Home_Page(driver);
		hp.clickonsignin();
		hp.womenproductOnTop(driver);
		HoddiesPage hdp=new HoddiesPage(driver);
		hdp.operationOnHoddies();
		
		
	}

}
