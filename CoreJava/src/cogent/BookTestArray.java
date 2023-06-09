package cogent;

import java.util.Scanner;

public class BookTestArray {
	public static void main(String[] args) {
		
		Book books[] = new Book[2];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < books.length; i++)
		{
			Book b = new Book();
			System.out.println("***Input Book " + (i + 1) + " details***");
			System.out.println("Please enter book number: ");
			b.setBookNum(sc.nextInt());
			System.out.println("Please enter book name: ");
			sc.nextLine();
			b.setBookName(sc.nextLine());
			System.out.println("Please enter book price: ");
			b.setBookPrice(sc.nextFloat());
			System.out.println("Please enter author name: ");
			sc.nextLine();
			b.setAuthorName(sc.nextLine());
			books[i] = b;
		}
		
		for(int j = 0; j < books.length; j++)
		{
			System.out.println("___Book " + (j + 1) + " Details___");
			System.out.println("Book number: " + books[j].getBookNum());
			System.out.println("Book name: " + books[j].getBookName());
			System.out.println(String.format("Book price: %.2f", books[j].getBookPrice()));
			System.out.println("Author name: " + books[j].getAuthorName());
		}
		
		
	}
}
