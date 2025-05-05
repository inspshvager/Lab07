public abstract class Account {
    protected final int id;
    protected final String username;
    protected String email;
    protected String password;

    public Account(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
    }

    int getId(){
        return id;
    };

    String getUsername(){
        return username;
    }

    void setEmail(String email){
        this.email = email;
    }

    void setPassword(String password){
        this.password = password;
    }

    abstract void showProfile();
}
