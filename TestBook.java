package ex4;
public class TestBook {
public static void main(String[] args) {
Book book = new Book("Java for All", 30);
System.out.println(book.getTitle() + " : " + book.getNbPages());
while (book.getNbPages() > 10) {
book.read(1);
System.out.print("p");
}
System.out.println();
System.out.println("Remaining pages: " + book.getNbPages());
book.setTitle("Java for All — 2nd Edition");
System.out.println(book.getTitle());
for (int i = 0; i < 10; i++) {
book.read(1);
System.out.print("p");
}
System.out.println();
System.out.println(book.getTitle() + " : " + book.getNbPages());
}
}