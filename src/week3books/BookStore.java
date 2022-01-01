package week3books;

public class BookStore {
    public static void main(String[] args) {
        Book b1;
        Dictionary d1;
        Object o;

        d1 = new Dictionary(12);
        b1 = null;

        b1 =new GermanDictionary();
        //d1 = b1;
        b1 = d1;
        o = b1;
        o = d1;
        String str = "A ";
        System.out.println(b1.getPages());
        System.out.println(str);
    }
}