public class Admin extends Account{
    private int level = 0;

    public Admin(int id, String username, String email, String password, int level) {
        super(id, username, email, password);
        this.level = level;
    }

    @Override
    public void showProfile(){
        System.out.println(id + ", " + username + ", " + email + ", " + password + ", " + level);
    }
}
