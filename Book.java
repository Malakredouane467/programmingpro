package ex4;
public class Book {
private String title;
private int nbPages;
public Book(String title, int nbPages) {
this.title = title;
this.nbPages = nbPages;
}
public String getTitle() {
return title;
}
public int getNbPages() {
return nbPages;
}
public void setTitle(String title) {
this.title = title;
}
public void read(int n) {
if (n > 0) {
nbPages = nbPages - n;
if (nbPages < 0) {
nbPages = 0;
}
}
}
}