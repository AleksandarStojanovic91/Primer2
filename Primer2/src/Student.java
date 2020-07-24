public class Student extends Person{
    public String indexNumber;

    public Student(String firstName, String lastName,String indexNumber) {
        super(firstName, lastName);
        this.indexNumber = indexNumber;
    }

    @Override
    public void show() {
        //super.show();
        System.out.println("Person: "+firstName+ " "+lastName+" "+indexNumber);
    }

    public void show(String firstName) {
        //super.show();
        System.out.println("Person: "+firstName+ " "+lastName+" "+indexNumber);
    }

    public void show(String firstName, String lastName) {
        //super.show();
        System.out.println("Person: "+firstName+ " "+lastName+" "+indexNumber);
    }

    @Override
    public String toString() {
        return "Hello from "+firstName;
    }
}
