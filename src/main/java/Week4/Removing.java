package Week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<String>();
        classNames.add("Progamming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Programming Logic"); // object
        System.out.println(classNames + " " + wasRemoved);

        classNames.remove("Project Management"); // this string is an object
        System.out.println(classNames);

        classNames.remove(0);  // int primitive type - index are primitive values
        System.out.println(classNames);

        classNames.set(1, "Systems Analysis");
        System.out.println(classNames);


        String search = "Systems Analysis";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);;

        } else {
            System.out.println("The list does NOT contain " + search);;
        }

        System.out.println(classNames.size());

        classNames.clear();

        System.out.println(classNames.size());
        System.out.println(classNames.isEmpty());

    }
}
