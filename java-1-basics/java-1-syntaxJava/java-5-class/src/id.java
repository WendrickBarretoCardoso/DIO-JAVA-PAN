public class id {
    private String name;
    private int age;
    private String password;

    public id(String name, int age, String password){
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public void changeName(String name) {
        this.name = name;
    }

    public void changeAge(int age) {
        this.age = age;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    public String getName(){
        return name;
    }

    public int getAge (){
        return age;
    }

    public String getPassword(String name, int age){
        if (this.name == name && this.age == age) {
            System.out.println(".");
            return password;
        } else {
            System.out.println("Informe o nome e a idade corretas para pegar a Senha.");
            return "Senha Não Encontrada";
        }
    }
}
