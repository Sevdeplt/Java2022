package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		/*
		 * System.out.println("HelloWorld!");
		 * 
		 * int sayi1 = 10; int sayi2 = 20; sayi1 = sayi2; sayi2 = 100;
		 * System.out.println(sayi1); // 20
		 * 
		 * int[] sayilar1 = new int[] { 1, 2, 3 }; int[] sayilar2 = new int[] { 10, 20,
		 * 30 }; sayilar1 = sayilar2; sayilar2[0] = 1000;
		 * 
		 * System.out.println(sayilar1[0]);
		 * 
		 * 
		 * 
		 * 
		 * 
		 * CreditManager creditManager = new CreditManager();
		 * 
		 * creditManager.calculate();
		 * 
		 * Customer customer = new Customer(); //instance creation customer.id = 1;
		 * customer.city = "Ankara";
		 * 
		 * 
		 * CustomerManager customerManager = new CustomerManager(customer);
		 * customerManager.save(); customerManager.delete();
		 * 
		 * Company company=new Company(); company.taxnumber="10000";
		 * company.companyName="Arçelik"; company.id=100;
		 * 
		 * CustomerManager customerManager2=new CustomerManager(new Person());
		 * 
		 * Person person=new Person(); person.nationalIdentity="123456";
		 * 
		 * Customer c1=new Customer(); Customer c2=new Person(); Customer c3=new
		 * Company();
		 */

		CustomerManager customerManager = new CustomerManager(new Customer(), new TeacherCreditManager());
		customerManager.giveCredit();

	}

}
