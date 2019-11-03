import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Person> phonebook = new ArrayList<Person>();

    public void add(String name, String number){
        Person temp = new Person(name, number);
        this.phonebook.add(temp);
    }

    public String searchNumber(String name){
        for(Person person: phonebook){
            if(person.getName().equals(name)){
                return person.getNumber();
            }
        }

        return "number not known";
    }

    public void printAll(){
        for(Person person: phonebook){
            System.out.println(person);
        }
    }
}
