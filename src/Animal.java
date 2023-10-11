public class Animal {

    private String family, name;
    private int age;
    private boolean isMammal;


    public Animal() {

    }

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }


    public String getName() {
        return name;
    }

    public String getFamily() {

        return family;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsMammal() {
        return isMammal;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            System.out.println("le nom ne doit pas être vide");
        }

    }

    public void setFamily(String family) {
        this.family = family;

    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("l'age ne doit pas être negative");
        }
    }

    public void setIsMammal(boolean IsMammal) {
        this.isMammal = IsMammal;
    }


}
