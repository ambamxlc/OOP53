public class Counters {
    private int counter;

    public Counters() {
        this.counter = 0;
    }

    public Counters(int startValue) {
        this.counter = startValue;
    }

    public int value() {
        return counter;
    }

    public void increase() {
        counter++;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        } else {
                    counter += increaseBy;
        }
    }

    public void decrease() {
        counter--;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        } else {
                    counter -= decreaseBy;
        }
    }

    @Override
    public String toString() {
        return "current val of counterr:" + value();
    }
}