package Model.Member;

public interface Member {
    Long getMemberId();
    void setMemberId(Long id);
    String getName();
    void setName(String name);
    String getPassword();
    void setPassword(String password);
    String getEmail();
    void setEmail(String email);
}
