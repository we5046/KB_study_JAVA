package submit0420.exam01;

public class RemoteControlExample {
    public static void main(String[] args) {
        Remotecontrol rc;

        rc = new Television();
        rc.turnOn();

        rc = new Audiot();
        rc.turnOn();
    }
}
