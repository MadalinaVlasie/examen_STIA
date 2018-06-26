

public class NYMobileFactory extends MobileFactory {

	@Override
	public SpiceMobile constructMobile(String model) {
		
		SpiceMobile mobile = null;
		if (model == "SpiceFire"){
			mobile = new SpicePlus();
			mobile.setPrice(300);
		} else if (model == "SpiceBolt"){
			mobile = new SpiceBolt();
			mobile.setPrice(400);
		}	
		return mobile;
	}

}
