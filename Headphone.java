public class Headphone implements Wearable {
    public void putOn() {
        System.out.println("헤드폰을 착용했습니다. ");
    }

    public void putOff() {
        System.out.println("헤드폰을 벋었습니다. ");
    }

    public void setVolume(int volume) {
        System.out.println("볼륨을 조정했습니다. ");
    }
}
