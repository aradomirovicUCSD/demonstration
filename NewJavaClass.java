public class NewJavaClass {
    private String name;

    public NewJavaClass(String n) {
        this.name = n;
    }

    public void doubleName() {
        name+=name;
    }

    public void removeFirstLetterOfName() {
        name = name.substring(1);
    }

    public void removeLastLetterOfName() {
        name = name.substring(0,name.length());
    }

    public String getName() {
        return name;
    }
}