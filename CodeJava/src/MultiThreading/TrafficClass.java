package MultiThreading;

class TrafficClass implements Runnable {
    private static String currentColor = "Red";
    private static final Object lock = new Object();
    private final String color;
    private final int duration;

    public TrafficClass(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                // Check if the current color is this thread's color
                if (currentColor.equals(color)) {
                    System.out.println("Current light: " + color);
                    try {
                        Thread.sleep(duration); // Signal active for specified duration
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    // Switch to the next color
                    switch (color) {
                        case "Red":
                            currentColor = "Green";
                            break;
                        case "Green":
                            currentColor = "Yellow";
                            break;
                        case "Yellow":
                            currentColor = "Red";
                            break;
                    }
                }
            }
            // Sleep briefly to prevent busy-waiting
            try {
                Thread.sleep(100); // Adjust this value as needed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        Thread redSignal = new Thread(new TrafficClass("Red", 3000));   // Red for 3 seconds
        Thread greenSignal = new Thread(new TrafficClass("Green", 3000)); // Green for 3 seconds
        Thread yellowSignal = new Thread(new TrafficClass("Yellow", 1000)); // Yellow for 1 second

        redSignal.start();
        yellowSignal.start();
        greenSignal.start();
    }
}

