package threads.ZadanieBankZrobione;

import threads.ZadanieBankZrobione.migration.CustomersMigration;

import java.util.List;

public class TestBank {

    public static void main(String[] args){
        Bank bank = new Bank ("SDA bank");
        Customer customer1= new Customer("Jan","Kowalski");
        Customer customer2= new Customer("Maria","Zarot");
        Customer customer3= new Customer("Anna","Misiewicz");

        bank.addCustomer(customer1);
        bank.addCustomer(customer2);
        bank.addCustomer(customer3);

        bank.addAccount(customer1, AccountKind.CURRENT);
        bank.addAccount(customer1, AccountKind.SAVINGS);
        bank.addAccount(customer2, AccountKind.CURRENT);
        bank.addAccount(customer3, AccountKind.CURRENT);
        bank.addAccount(customer3, AccountKind.SAVINGS);

        bank.printCustomerList(true);
        Account account = customer1.getAccounts().get(0);
        bank.deposit(customer1,account,10);
        account = customer3.getAccounts().get(1);
        bank.deposit(customer3,account,25);


        bank.printCustomerList(true);
        CustomersMigration migration = new CustomersMigration();
        List<Customer> migratedCustomers = migration.migrate("BankData","\\|");
        migration.addMigratedCustomers(bank,migratedCustomers);


        System.out.println("Migration done.");
        bank.printCustomerList(true);

        System.out.println("===========all accounts============");
        bank.printAllBankAccounts();
    }


}
