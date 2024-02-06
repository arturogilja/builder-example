public class UserBuilder {
    private String name;
    private String lastName;
    private int age;
    private String email;
    private String phoneNumber;
    private String rfc;
    private String gender;

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public UserBuilder setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder setRfc(String rfc) {
        this.rfc = rfc;
        return this;
    }

    public UserBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder setGender(String gender){
        this.gender = gender;
        return this;
    }

    User build() {
        return new User(this.name, this.lastName, this.age, this.email, this.phoneNumber, this.rfc, this.gender);
    }
}