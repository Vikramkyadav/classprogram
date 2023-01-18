//3. Write a Java Beans Program for the class BOOK with name, author, and International
//Standard Book Number (ISBN)public class Book
{
    String name;
    String author;
    String isbn;

    //Java Bean - POJO - Plain Old Java Object
    //setters and getters 
    public void setBook(String name,String author,String isbn ) 
    {
        this.name = name;
	this.author=author;
	this.isbn=isbn;
    }

    public String getName()
    {
        return name;
    }
  public String getAuthor()
    {
        return author;
}
  public String getIsbn()
    {
        return isbn;
}

    public static void main(String args[]) {
	Book b = new Book();

        b.setBook("Java","Harish H","123-456-789");
    

        System.out.println("Book Name:"+b.getName()+"Book Author:"+b.getAuthor() +"Book Isbn:" +b.getIsbn());
    }
}

			Output
			
			C:\java\bin>java Book
			Book Name:JavaBook Author:Harish HBook Isbn:123-456-789	
