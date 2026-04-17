        //peek()
        //pop()
        //push()
        //empty()
        //search()
import java.util.Stack;

public class Filo {
    public static void main(String[] args) {
        
        Stack<String> games = new Stack<>();

        games.push("12");
        games.push("2");
        games.push("15");
        games.push("20");
        games.push("5");

        //reverse order
        for (int i = games.size() - 1; i >= 0; i--) {
            System.out.println(games.get(i));
        }
    }
}