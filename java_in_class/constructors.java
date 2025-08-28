class Book {
    String title;
    int pages;
    Book() {
        title ="unknown";
        pages = 0;
    }
    Book(String t) {
        title = t;
        pages = 100;
    }
     Book(String t, int p) {
         title = t;
         pages = p;
     }
     void show() {
          System.out.println("Title: " + title + "Pages: " + pages);
     }
     public static void main(String[] args) {
         Book b1 = new Book();
         Book b2 = new Book("Java Basics");
         Book b3 = new Book("Advanced Java",500);
         b1.show();
          b2.show();
          b3.show();
     }
}
