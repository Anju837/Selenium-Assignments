package week3.day1;

public class Desktop implements HardWare, Software{

	public void softwareResources() {
		System.out.println("Software");
		
	}

	public void hardwareResources() {
		System.out.println("Hardware");
		
	}
	public void desktopModel()
	{
		System.out.println("The desktop model is latest version");
	}
	public static void main(String[] args) {
		Desktop type = new Desktop();
		type.softwareResources();
		type.hardwareResources();
		type.desktopModel();
	
	}

}
