package Singleton;

public class DatabaseExample {

    public static void main(String[] args) {
        Database myDB = Database.getInstance();

        String conn = myDB.connect();
        System.out.println("데이터베이스: " + conn);
        myDB.close();

    }



}
