public class methods {
    public static void main(String[] args) {
        /// METODOS PRECISA SER DEFINIDOS DENTRO DE UMA CLASSE

        tv tv = new tv() ;

        System.out.println("Is tv on?  " + tv.status);
        System.out.println("How much channels? " + tv.channelQnt);
        System.out.println("Wich is the volume? " + tv.volume);
        System.out.println("Wich is the channel that is on? " + tv.volume);

        tv.turnOn();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeChannel();
        tv.changeVolume();
        tv.changeVolume();
        tv.changeVolume();
        tv.changeVolume();
        tv.turnOff();
    }
}
