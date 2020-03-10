//Emma David COP3502
import java.util.Scanner;
    public class Hello {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Hello. What is your name? ");
            String name = sc.next (); //answer the question, say your name
            System.out.print("It's nice to meet you, " + name + ". How old are you? ");
            String age = sc.next (); //say your age
            System.out.println("I see that you are still quite young at only " + age + ". ");
            System.out.print("Where do you live? ");
            String home = sc.next (); //say where you live
            System.out.print("Wow! I've always wanted to go to " + home + ". Thanks for chatting with me. Bye!");

        }
    }
