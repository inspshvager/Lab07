import java.util.ArrayList;
import java.util.Scanner;

public class AccountManager implements AccountOperations{
    private final ArrayList<Account> accounts = new ArrayList<Account>();
    private int idCounter = 0;
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public void createAccount() {
        System.out.println("Podaj nazwe użytkownika:\n");
        String username = scanner.nextLine();
        System.out.println("Podaj email:\n");
        String email = scanner.nextLine();
        System.out.println("Podaj hasło:\n");
        String password = scanner.nextLine();
        System.out.println("Wybierz jakiego użytkownika stworzyć:\n 1 - RegularUser, 2 - Moderator, 3 - Admin");
        switch(scanner.nextInt()){
            case 1:
                accounts.add(new RegularUser(idCounter++, username, email, password, 0));
                break;
            case 2:
                accounts.add(new Moderator(idCounter++, username, email, password, 0));
                break;
            case 3:
                System.out.println("Podaj poziom admina:\n");
                accounts.add(new Admin(idCounter++, username, email, password, scanner.nextInt()));
                break;
            default:
                break;
        }
    }

    @Override
    public void viewAccounts() {
        for(Account x : accounts){
            x.showProfile();
        }
    }

    @Override
    public void updateAccounts(int i) {
        for(Account x : accounts){
            if(x.getId() == scanner.nextInt()){
                System.out.println("Podaj co chcesz zedytować:\n 1 - email, 2 - hasło");
                switch(scanner.nextInt()){
                    case 1:
                        System.out.println("Podaj email:\n");
                        x.setEmail(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Podaj hasło:\n");
                        x.setPassword(scanner.nextLine());
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public void deleteAccounts(int i) {
        accounts.removeIf(x -> x.getId() == scanner.nextInt());
    }

    private boolean isUsernameTaken(String username){
        return accounts.stream().anyMatch(a -> a.getUsername().equals(username));
    }

    private Account findAccountById(int id){
        for (Account x : accounts){
            if(x.getId() == id) return x;
        };
        return null;
    }
}
