public class person {
    public static void main(String[] args) {
        id personId = new id("Wendrick", 21, "123456");
        String password = personId.getPassword("Wendrick", 20);
        String password2 = personId.getPassword("Wendrick", 21);

        personId.changeName("Wendrick Barreto Cardoso");
        password = personId.getPassword("Wendrick", 21);
        password2 = personId.getPassword("Wendrick Barreto Cardoso", 21);

        password = password + password2;
    }
}
