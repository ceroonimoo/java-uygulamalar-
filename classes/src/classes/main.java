package classes;

public class main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		int sayı1=10;
		int sayı2=20;
		sayı2=sayı1;
		sayı1=30;
		System.out.println(sayı2);
		int[] sayılar1=new int[] {1,2,3};
		int[] sayılar2=new int[] {4,5,6};
		sayılar2=sayılar1;
		sayılar1[0]=10;
		System.out.println(sayılar2[0]); 
		}
	}
