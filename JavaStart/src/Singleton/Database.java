package Singleton;

public class Database {
    private static Database singleton = new Database();

    private Database() {}

    public static Database getInstance() {
        return singleton;
    }

    private String connection = "MySQL";

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }
}
