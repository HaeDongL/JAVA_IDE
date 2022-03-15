
class Book
{//02.22
	///Field
		private String title;
		private int price;
	///Constructor
		public Book(){
		}
		public Book(String title, int price){
			this.title = title;
			this.price = price;
		}

	///Method

		//setter
		public void setTitle(String title){
			this.title = title;
		}

		public void setPrice(int price){
			this.price = price;
		}
		
		//getter
		public String getTitle(){
			return this.title;
		}
		public int getPrice(){
			return this.price;
		}
}//BookEnd

class BookMgr
{
	///Field
		private Book[] bookList;
	///Constructor
		public BookMgr(){
		}
		public BookMgr(Book[] bookList){
			this.bookList = bookList;
		}
	///Method
		public void printBookList(){
			for(int i=0; i<this.bookList.length; i++){
				System.out.println(this.bookList[i].getTitle());
			}//for
		}
		public void printTotalPrice(){
				int totalPrice = 0;
			for(int i=0; i<this.bookList.length; i++){
					totalPrice += this.bookList[i].getPrice();
				
			}
			System.out.println("전체 책 가격의 합 : "+totalPrice);
		}
}


public class Prob14 
{

	public static void main(String[] args) 
	{
		Book[] bookList = new Book[5];
		bookList[0] = new Book("Java Program",25000);
		bookList[1] = new Book("JSP Program",15000);
		bookList[2] = new Book("SQL Fundamentals",30000);
		bookList[3] = new Book("JDBC Program",28000);
		bookList[4] = new Book("EJB Program",34000);

		BookMgr mgr = new BookMgr(bookList);
		
		System.out.println("===책 목록===");
		mgr.printBookList();
		System.out.println("");

		System.out.println("===책 가격의 총합===");
		mgr.printTotalPrice();
	}
}
