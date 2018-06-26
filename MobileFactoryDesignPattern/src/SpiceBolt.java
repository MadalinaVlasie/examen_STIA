
public class SpiceBolt extends SpiceMobile {

	@Override
	public void prepare() {
		System.out.println("Preparing Spice Bolt");
	}

	@Override
	public void bundle() {
		System.out.println("Bundling Spice Bolt");
	}

	@Override
	public void label() {
		System.out.println("Adding label to Spice Bolt");
	}
}
