package submit0420.exam02;

public class Audio implements RemoteControl {
    private int volume;
    @Override
    public void turnOn() {
        System.out.println("오디오를 킵니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("오디오를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = Math.max(MIN_VOLUME, Math.min(MAX_VOLUME, volume));
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}
