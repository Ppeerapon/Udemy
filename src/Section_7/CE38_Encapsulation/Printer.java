package Section_7.CE38_Encapsulation;

public class Printer {

    private int tonerLevel, pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int toner) {
        if (toner > 0 && toner <= 100) {
            if (this.tonerLevel + toner > 100) {
                return -1;
            }
            return this.tonerLevel += toner;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        if (this.duplex) {
            pages = pages/2 + pages%2;
        }
        this.pagesPrinted += pages;
        return pages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

