import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
       HashSet<String> names = new HashSet<>();
        names.add("Nick");
        names.add("Ivan");
        names.add("Vasiy");
        names.add("Nick");
        for(String name: names){
            System.out.println(name);
        }

//        HashSet<Person> persons = new HashSet<>();
//        persons.add(new Person(20,"Ivan","Ivanov"));
//        persons.add(new Person(12,"Ivan","Ivanov"));
//        persons.add(new Person(85,"Oleg","Drozdov"));
//        persons.add(new Person(78,"Eugenie","Drozdov"));
//
//        for(Person p : persons){
//            System.out.println(p);
//        }

        TreeSet<Person> persons  = new TreeSet<>();
        persons.add(new Person(20,"Ivan","Ivanov"));
        persons.add(new Person(12,"Ivan","Ivanov"));
        persons.add(new Person(85,"Oleg","Drozdov"));
        persons.add(new Person(78,"Eugenie","Drozdov"));

        for(Person p : persons){
            System.out.println(p);
        }
    }



}
