public class Moderator extends Account{
    private int reportsHandled = 0;

    public Moderator(int id, String username, String email, String password, int reportsHandled) {
        super(id, username, email, password);
        this.reportsHandled = reportsHandled;
    }

    @Override
    public void showProfile(){
        System.out.println(id + ", " + username + ", " + email + ", " + password + ", " + reportsHandled);
    }

}
