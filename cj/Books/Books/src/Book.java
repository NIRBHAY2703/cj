
public class Book {
int bookid;
String name;
int price;
int quanity;


public Book(int bookid, String name, int price, int quanity) {
	super();
	this.bookid = bookid;
	this.name = name;
	this.price = price;
	this.quanity = quanity;
}


public Book() {

}


public int getBookid() {
	return bookid;
}


public void setBookid(int bookid) {
	this.bookid = bookid;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}


public int getQuanity() {
	return quanity;
}


public void setQuanity(int quanity) {
	this.quanity = quanity;
}


@Override
public String toString() {
	return "Book [bookid=" + bookid + ", name=" + name + ", price=" + price + ", quanity=" + quanity + "]";
}


}
