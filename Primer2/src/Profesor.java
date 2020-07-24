public class Profesor extends Person{
    public String className;

    public Profesor(String firstName, String LastName, String className){
        super(firstName,LastName);
        this.className = className;
    }

    @Override
    public void show() {
        System.out.println("Person: "+firstName+ " "+lastName+" "+className);
    }
}
