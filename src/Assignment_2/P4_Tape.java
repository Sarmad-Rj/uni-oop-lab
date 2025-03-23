package Assignment_2;

class P4_Tape extends P4_Publication {
    private int playingTime;

    // Getters and Setters
    public int getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Playing Time: " + playingTime + " minutes");
    }
}