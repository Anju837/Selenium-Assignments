package week1.day2;

public class FibonocciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int firstNo=0;
int sum=0;
int secnNo=1;
int range=8;
System.out.println("0");
System.out.println("1");
for (int i = 0; i<=range;i++) {
	sum= firstNo+secnNo;
	firstNo=secnNo;
	secnNo=sum;
	System.out.println(sum);
}
	}

}
