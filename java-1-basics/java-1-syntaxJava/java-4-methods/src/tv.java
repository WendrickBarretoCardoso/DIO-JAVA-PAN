public class tv {
    boolean status = false;
    int channelQnt = 10;
    int volume = 1;
    int actualChannel = 1;

    public void turnOn() {
        status = true;
        System.out.println("Tv is on.");
    }
    public void turnOff() {
        status = true;
        actualChannel = 1;
        volume = 1;
        System.out.println("Tv is off.");
    }

    public void changeChannel() {
        if (status == true) {
            if (actualChannel >= 1 && actualChannel < 10) {
                actualChannel++;
                System.out.println("Channel: " + actualChannel);
            } else {
                actualChannel = 1;
                System.out.println("Channel: " + actualChannel);
            }
        } else {
            System.out.println("Turn the tv on first.");
        }
    }

    public void changeVolume() {
        if (status == true) {
            if (volume >= 1 && actualChannel < 10) {
                volume++;
                System.out.println("Volume: " + volume);
            } else {
                volume = 1;
                System.out.println("Volume: " + volume);
            }
        } else {
            System.out.println("Turn the tv on first.");
        }
    }
}
