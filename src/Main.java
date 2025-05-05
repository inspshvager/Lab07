import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AccountManager accountManager = new AccountManager();
        while(true){
            System.out.println("""
                    1. Dodaj użytkownika,\

                    2. Wyświetl konta\
                    
                    3. Edytuj konto\
                    
                    4. Usuń konto\
                    
                    5. Wyjdź""");
            switch (input.nextInt()){
                case 1:
                    accountManager.createAccount();
                    break;
                case 2:
                    accountManager.viewAccounts();
                    break;
                case 3:
                    System.out.println("Podaj id użytkownika do zaktualizownia");
                    accountManager.updateAccounts(input.nextInt());
                    break;
                case 4:
                    System.out.println("Podaj id użytkownika do usunięcia");
                    accountManager.deleteAccounts(input.nextInt());
                    break;
                case 5:
                    exit(0);
                default:
                    break;
            }
        }
    }
}