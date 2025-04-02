import java.util.ArrayList;
public  class Library { 



public static String  LibraryShelf() {
    ArrayList<String>  ComputerScience = new  ArrayList<>();
    ComputerScience.add("Clean Code - Robert C. Martin");
    ComputerScience.add("The Pragmatic Programmer - Andrew Hunt & David Thomas");
    ComputerScience.add("Design Patterns - Erich Gamma et al");
    ComputerScience.add("Java: The Complete Reference - Herbert Schildt");
    ComputerScience.add("Python Crash Course - Eric Matthes");
    ComputerScience.add("Effective Java -Joshua Bloch");

    ArrayList<String>  Fiction = new  ArrayList<>();
    Fiction.add("To Kill a Mockingbird - Harper Lee");
    Fiction.add("1984 - George Orwell");
    Fiction.add("The Great Gatsby - F. Scott Fitzgerald");
    Fiction.add("The Catcher in the Rye - J.D. Salinger");
    Fiction.add("Pride and Prejudice - Jane Austen");
    Fiction.add("The Hobbit - J.R.R. Tolkien");

    ArrayList<String>  SelfHelp = new  ArrayList<>();
    SelfHelp.add("Atomic Habits - James Clear");
    SelfHelp.add("The Power of Now - Eckhart Tolle");
    SelfHelp.add("Think and Grow Rich - Napoleon Hill");
    SelfHelp.add("How to Win Friends and Influence People - Dale Carnegie");
    SelfHelp.add("Deep Work - Cal Newport");
    SelfHelp.add("The Subtle Art of Not Giving a F*ck - Mark Manson");
    SelfHelp.add("Can't Hurt Me - David Goggins");

    ArrayList<String> SciencenTech = new ArrayList<>();
    SciencenTech.add("A Brief History of Time - Stephen Hawking");
    SciencenTech.add("Cosmos - Carl Sagan");
    SciencenTech.add("The Code Book - Simon Singh");
    SciencenTech.add("The Gene: An Intimate History - Siddhartha Mukherjee");
    SciencenTech.add("The Innovators - Walter Isaacson");
    SciencenTech.add("The Singularity Is Near - Ray Kurzweil");

    ArrayList<String> History = new ArrayList<>();
    History.add("Guns, Germs, and Steel - Jared Diamond");
    History.add("The Diary of a Young Girl - Anne Frank");
    History.add("The Wright Brothers - David McCullough");
    History.add("The Silk Roads - Peter Frankopan");
    History.add("The Art of War - Sun Tzu");
    History.add("SPQR: A History of Ancient Rome - Mary Beard");

    ArrayList<String>BookList = new ArrayList<>();
    BookList.add("");
    BookList.add("ComputerScience");
    
    BookList.addAll(ComputerScience);
    BookList.add("");
    BookList.add("Fiction");
   
    BookList.addAll(Fiction);
    BookList.add("");
    BookList.add("Science and Tech");
    
    BookList.addAll(SciencenTech);
    BookList.add("");
    BookList.add("History");
   
    BookList.addAll(History);
    BookList.add("");
    BookList.add("Self Help");
    
    BookList.addAll(SelfHelp);
    return  String.join(" \n", BookList);
}

public static void main(String[] args) {
    
}
	
}
