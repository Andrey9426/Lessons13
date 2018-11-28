import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        String nick="Nick";
        String ivan="Ivan";
        String vasiy="Vasiy";
        names.add(nick);
        names.add(ivan);
        names.add("Stepan");
        System.out.println(names.size());
        System.out.println(names.get(3));
        if(names.contains("Ivan")){
            System.out.println("Hello Ivan");
        }
    }
}
