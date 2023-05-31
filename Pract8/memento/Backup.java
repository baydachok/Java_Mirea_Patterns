package Pract8.memento;

public class Backup {
    private final int amountOfFiles;
    private final String username;

    public Backup(int amountOfFiles, String username) {
        this.amountOfFiles = amountOfFiles;
        this.username = username;
    }

    public int getAmountOfFiles() {
        return amountOfFiles;
    }

    public String getUsername() {
        return username;
    }
}