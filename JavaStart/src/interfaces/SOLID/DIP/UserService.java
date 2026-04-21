package interfaces.SOLID.DIP;

public class UserService {
    private UserRepository repository;
    // 구현체를 구현하기위해 사용했던 것을 has-a 로 활용


    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void register(String name) {
        repository.save(name);
    }

    public static void main(String[] args) {
        new UserService(new OracleRepository());
    }
}
