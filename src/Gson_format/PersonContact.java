package Gson_format;

public class PersonContact {

    private String firstName ;
    private String email;
    private String city ;
    private String phone ;

    public PersonContact(String firstName, String email, String city, String phone) {
        this.firstName = firstName;
        this.email = email;
        this.city = city;
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail(){return email;}
    public String getCity(){return city;}
    public String getPhone(){return phone;}

    @Override
    public String toString(){
        return "Name :" + firstName +
                "\nEmail : " + email +
                "\nCity :" + city +
                "\nPhone :" + phone;

    }
}
