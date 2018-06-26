public class Client {

	public static void main(String[] args) {

		MobileFactory ldfactory = new LondonMobileFactory();
		SpiceMobile mobile = ldfactory.produceMobile("SpicePlus");

		MobileFactory ldfactory2 = new LondonMobileFactory();
		SpiceMobile mobile2 = ldfactory2.produceMobile("SpiceBolt");
				
		MobileFactory nyFactory = new NYMobileFactory();
		SpiceMobile mobile3 = nyFactory.produceMobile("SpiceFire");
		
		MobileFactory nyFactory2 = new NYMobileFactory();
		SpiceMobile mobile4 = nyFactory2.produceMobile("SpiceBolt");

	}
}