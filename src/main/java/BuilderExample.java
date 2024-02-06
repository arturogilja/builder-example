public class BuilderExample {
    public static void main(String[] args) {
        UserBuilder builder = new UserBuilder();
        User user = builder
                .setName("Arturo")
                .setLastName("Gil")
                .setAge(27)
                .setEmail("arturo.gil@beatport.com")
                .setGender("male")
                .setRfc("GIJA961106000")
                .setPhoneNumber("+521234567890")
                .build();

        System.out.println(user);
    }
}
