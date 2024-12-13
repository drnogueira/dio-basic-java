public class User {
    public static void main(String[] args) throws Exception {

        // Creating a SmartTV object
        SmartTV myTV = new SmartTV();

        // Testing the functionality
        myTV.turnOn();
        myTV.nextChannel();
        myTV.decreaseVolume();
        myTV.nextChannel();
        myTV.setChannel(10);
        myTV.previousChannel();
        myTV.increaseVolume();
        myTV.turnOff();

    }
}
