public class Main {

    public static void main(String[] args) {
        Person person = new Person("Nikola","Tesla");
        Student st = new Student("John","Smith","10/2020");
        Profesor profesor = new Profesor("Charles","Xavier","X-MAN");

        //System.out.println(st);

        person.show();
        st.show();
        profesor.show();

        st.show("Nemanja");
        st.show("Nemanja","Mitic");
    }
}
