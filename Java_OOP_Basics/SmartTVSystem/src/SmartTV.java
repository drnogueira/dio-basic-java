public class SmartTV {
    // TV characteristics
    private boolean isOn;
    private int channel;
    private int volume;

    // Constructor
    public SmartTV() {
        this.isOn = false;
        this.channel = 1; // Initialize with channel 1
        this.volume = 10; // Initialize with volume set to 10
    }

    // Method to turn the TV on
    public void turnOn() {
        this.isOn = true;
        System.out.println("TV is now ON.");
    }

    // Method to turn the TV off
    public void turnOff() {
        this.isOn = false;
        System.out.println("TV is now OFF.");
    }

    // Method to increase the volume
    public void increaseVolume() {
        if (isOn) {
            if (volume < 100) {
                volume++;
                System.out.println("Volume increased to: " + volume);
            } else {
                System.out.println("Volume is already at the maximum (100).");
            }
        } else {
            System.out.println("The TV is OFF. Cannot change the volume.");
        }
    }

    // Method to decrease the volume
    public void decreaseVolume() {
        if (isOn) {
            if (volume > 0) {
                volume--;
                System.out.println("Volume decreased to " + volume);
            } else {
                System.out.println("Volume is already at the minimum (0).");
            }
        } else {
            System.out.println("The TV is OFF. Cannot change the volume.");
        }
    }

    // Method to change the channel (increment)
    public void nextChannel() {
        if (isOn) {
            if (channel < 200) {
                channel++;
                System.out.println("Channel increased to " + channel);
            } else {
                System.out.println("You are already on the highest channel (200).");
            }
        } else {
            System.out.println("The TV is OFF. Cannot change the channel.");
        }
    }

    // Method to change the channel (decrement)
    public void previousChannel() {
        if (isOn) {
            if (channel > 1) {
                channel--;
                System.out.println("Channel decreased to " + channel);
            } else {
                System.out.println("You are already on the lowest channel (1).");
            }
        } else {
            System.out.println("The TV is OFF. Cannot change the channel.");
        }
    }

    // Method to set a specific channel
    public void setChannel(int newChannel) {
        if (isOn) {
            if (newChannel >= 1 && newChannel <= 200) {
                this.channel = newChannel;
                System.out.println("Channel set to " + newChannel);
            } else {
                System.out.println("Invalid channel number. It must be between 1 and 200.");
            }
        } else {
            System.out.println("The TV is OFF. Cannot change the channel.");
        }
    }

    // Getter methods
    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
}
