package Week4;

import java.util.ArrayList;
import java.util.List;
import static input.InputUtils.stringInput;


public class ToDoList {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true) {
            String data = stringInput("Type a a task you need to do, or Enter to quit");
            if (data.isEmpty()) {
                break;
            }
            if (containsIgnoreCase(todoList, data)) {
                System.out.println("You already added that!");
            } else {
                todoList.add(data);

            }
        }

        System.out.println("Thank you, your tasks are:");

        for (String input: todoList) {
            System.out.println(input);
        }

        System.out.println("You have " + todoList.size() + " task to do");
    }

    public static boolean containsIgnoreCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }

        return false;
    }
}
