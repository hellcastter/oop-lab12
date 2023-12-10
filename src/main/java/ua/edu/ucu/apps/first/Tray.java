package ua.edu.ucu.apps.first;

public class Tray {
    private Tray next;
    public int denomination;

    public Tray(int denomination) {
        this.denomination = denomination;
    }

    public Tray setNext(Tray nextTray) {
        this.next = nextTray;
        return nextTray;
    }

    public void process(int amount) {
        if (next != null) {
            next.process(amount % denomination);
        } else if (amount % denomination != 0) {
            throw new IllegalArgumentException();
        }

        System.out.format(
                "Please take %d of denomination %d\n",
                amount / denomination,
                denomination
        );
    }
}
