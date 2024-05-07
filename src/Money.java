public class Money {
    private long rubles;
    private byte kopecks;

    public Money(long rubles, byte kopecks) {
        this.rubles = rubles;
        this.kopecks = kopecks;
    }

    public Money add(Money other) {
        long newRubles = this.rubles + other.rubles;
        byte newKopecks = (byte) (this.kopecks + other.kopecks);
        if (newKopecks >= 100) {
            newRubles++;
            newKopecks -= 100;
        }
        return new Money(newRubles, newKopecks);
    }

    public Money subtract(Money other) {
        long newRubles = this.rubles - other.rubles;
        byte newKopecks = (byte) (this.kopecks - other.kopecks);
        if (newKopecks < 0) {
            newRubles--;
            newKopecks += 100;
        }
        return new Money(newRubles, newKopecks);
    }

    public Money multiply(double multiplier) {
        long totalKopecks = (long) ((this.rubles * 100 + this.kopecks) * multiplier);
        return new Money(totalKopecks / 100, (byte) (totalKopecks % 100));
    }

    public Money divide(double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Не может делить на ноль");
        }
        long totalKopecks = this.rubles * 100 + this.kopecks;
        return new Money(totalKopecks / (long) divisor, (byte) (totalKopecks % (long) divisor));
    }

    public int compareTo(Money other) {
        if (this.rubles < other.rubles) {
            return -1;
        } else if (this.rubles > other.rubles) {
            return 1;
        } else {
            return Byte.compare(this.kopecks, other.kopecks);
        }
    }

    @Override
    public String toString() {
        return rubles + "," + (kopecks < 10 ? "0" : "") + kopecks;

    }

    public static void main (String[] args){
    }
}


