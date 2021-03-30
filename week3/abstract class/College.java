package week3.day1;

public class College extends University
 {

	

	@Override
	public void ug() {
		System.out.println("ug implementated");
		
	}

	public static void main(String[] args) {
		College uni = new College();
		uni.pg();
		uni.ug();
	}
}
