import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> names= new ArrayList<>();
        String nick="Nick";
        String ivan="Ivan";
        String vasiy="Vasiy";
        names.add(nick);
        names.add(ivan);
        names.add(vasiy);
        names.add("Stepan");
        System.out.println(names.size());
        System.out.println(names.get(2));
        if(names.contains("Ivan")){
            System.out.println("Hello Ivan");
        }


        System.out.println(names.remove(3));        // удаление по индексу
        System.out.println(names.remove("Dmitry"));       // удаление по названию
        for(String name: names){
            System.out.println(name);
        }
        for(String name:names){
            if("Ivan".equals(name)){                  // Удаление элемента
                names.remove(name);
            }

        }
        Iterator <String> namesIterator= names.iterator();
        while (namesIterator.hasNext()){
            String name=namesIterator.next();
            if("Nick".equals(name)){
                namesIterator.remove();
            }
        }
        System.out.println(" ");

        LinkedList<String> linkedNames=new LinkedList<>();

        linkedNames.add(nick);
        linkedNames.add(ivan);
        linkedNames.add(vasiy);
        linkedNames.add("Olga");
        linkedNames.add("Helga");

        linkedNames.removeLast();
        linkedNames.get(2);
    }

}
