public class TestClass {

    private Library testLib = new Library("MyLibrary");

    public TestClass(){
        this.testLib.AddBook(new Book("The Testement", "Stephen King", "Colson", 2019, 1231423324));
        this.testLib.AddBook(new Book("The Topeka", "Stephen King", "Macfarlane",  2018, 1241324));
        this.testLib.AddBook(new Book("The Nickel Boys", "Ocean Vuon", "Jia", 2002, 12341234));
        this.testLib.AddBook(new Book("On Earth", "Carmen Martin", "Luiselii", 1938, 1663261324));
	this.testLib.AddBook(new Book("On Mars", "James Cameron", "Luiselii", 1998, 166326422));

        System.out.println("Books: ");
        System.out.println(testLib.getStringAllBooks());

        this.testLib.removeBooksByAuthor("Stephen King");

        System.out.println("Books: ");
        System.out.println(testLib.getStringAllBooks());
    }
}
