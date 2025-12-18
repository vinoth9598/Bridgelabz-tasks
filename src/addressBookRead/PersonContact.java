package addressBookRead;

public class PersonContact {

    private String firstName ;
    private String email ;
    private String mobile ;

    public PersonContact(String firstName, String email, String mobile) {
        this.firstName = firstName;
        this.email = email;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return firstName + " " + email + " " + mobile;
    }
}
