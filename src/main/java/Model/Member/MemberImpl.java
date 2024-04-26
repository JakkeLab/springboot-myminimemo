package Model.Member;

public class MemberImpl implements Member{


    private Long id;
    private String name;
    private String password;
    private String email;

    @Override
    public Long getMemberId() {
        return id;
    }

    @Override
    public void setMemberId(Long id) {
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
