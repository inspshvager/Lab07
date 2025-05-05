public class RegularUser extends Account{
    private int postsCount = 0;

    public RegularUser(int id, String username, String email, String password, int postsCount) {
        super(id, username, email, password);
        this.postsCount = postsCount;
    }

    @Override
    public void showProfile(){
        System.out.println(id + ", " + username + ", " + email + ", " + password + ", " + postsCount);
    }
}
