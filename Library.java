import java.util.ArrayList;
public class Library { 



public String  LibraryShelf() {
    ArrayList<String>  ComputerScience = new  ArrayList<>();
    ComputerScience.add("Clean Code – Robert C. Martin");
    ComputerScience.add("The Pragmatic Programmer – Andrew Hunt & David Thomas");
    ComputerScience.add("Design Patterns – Erich Gamma et al");
    ComputerScience.add("Java: The Complete Reference – Herbert Schildt");
    ComputerScience.add("Python Crash Course – Eric Matthes");
    ComputerScience.add("Effective Java – Joshua Bloch");
     

    ArrayList<String>  Fiction = new  ArrayList<>();
    Fiction.add("To Kill a Mockingbird – Harper Lee");
    Fiction.add("1984 – George Orwell");
    Fiction.add("The Great Gatsby – F. Scott Fitzgerald");
    Fiction.add("The Catcher in the Rye – J.D. Salinger");
    Fiction.add("Pride and Prejudice – Jane Austen");
    Fiction.add("The Hobbit – J.R.R. Tolkien");



    ArrayList<String>  SelfHelp = new  ArrayList<>();
    SelfHelp.add("Atomic Habits – James Clear");
    SelfHelp.add("The Power of Now – Eckhart Tolle");
    SelfHelp.add("Think and Grow Rich – Napoleon Hill");
    SelfHelp.add("How to Win Friends and Influence People – Dale Carnegie");
    SelfHelp.add("Deep Work – Cal Newport");
    SelfHelp.add("The Subtle Art of Not Giving a F*ck – Mark Manson");
    SelfHelp.add("Can’t Hurt Me – David Goggins");

    

    return "Library shelf initialized with Computer Science books.";
}
	
}
