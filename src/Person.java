public class Person implements Comparable <Person>{



    private int id;
    private String firstName;
    private String lestName;

    public Person(int id, String firstName, String lestName) {
        this.id = id;
        this.firstName = firstName;
        this.lestName = lestName;
    }

    @Override

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Person p = (Person) obj; // обязательно сделать преобразование !!!!
        return id == p.id && (firstName == p.firstName || (firstName!= null && firstName.equals(p.firstName)) &&
                (lestName == p.lestName || (lestName != null && lestName.equals(p.lestName))));
    }


    public int hashcode(){
        int result = id;
        result= 31*result+ (firstName!= null ? firstName.hashCode() : 0);
        result = 31* result +(lestName != null ? lestName.hashCode():0);
        return result;
    }

    public static void main(String[] args) {
        Person p1 = new Person(13, "Ivan", "Petrov");
        Person p2 = new Person(13, "Ivan", "Petrov");
        Object p3 = new Person(13, "Ivan", "Petrov");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lestName='" + lestName + '\'' +
                '}';
    }
    @Override

    public int compareTo(Person o){
        if(id> o.id){
            return 1;                    // Сортировка id
        }if(id <o.id){
            return -1;
        }return 0;

    }
}