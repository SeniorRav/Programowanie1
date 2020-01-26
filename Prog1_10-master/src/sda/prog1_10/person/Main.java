package sda.prog1_10.person;

public class Main {

	public static void main(String[] args) {
		Person person1 = new Polish();
		person1.setFirstName("Anna");
		person1.setLastName("Pradun");
		person1.setAge(35);
		person1.setSex(Sex.WOMAN);
		Person person2 = new Polish("Jan", "Kowalski", 4);

		System.out.println("Person1 : " + person1);
		System.out.println("Person2 : " + person2);

		Person polish1 = new Polish("Maria", "Wanat", 2);
		System.out.println("Polish : " + polish1);
		polish1.setSex(Sex.WOMAN);
		polish1.setAge(70);
		System.out.println(polish1.isRetired());

		Polish polish2 = new Polish("Andrzej", "Majkut", 4);
		polish2.setSex(Sex.MAN);
		System.out.println(polish2);

		Person english = new English("John", "Smith", "122358");
		english.isRetired();

		((Polish) polish1).enabledKdr();
	}
}
