//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account account = new Account("Jan Kowalski", 1000, "123456789");

        try {
            account.transfer(1500);
        } catch (NotEnoughMoneyException e) {
            System.out.println("Something gone wrong: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Something gone wrong: " + e.getMessage());
        } finally {
            System.out.println("Account balance: " + account.getBalance() + " PLN");
        }
    }
}