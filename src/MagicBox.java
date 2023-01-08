import java.util.Random;

public class MagicBox<T> {

    protected int size;
    protected T[] items;
    protected boolean notFull = true;

    protected MagicBox(int size) {
        this.size = size;
        this.items = (T[]) new Object[size];
    }

    protected boolean add(T item) {
        if (this.notFull) {
            for (int i = 0; i < this.items.length; i++) {
                if (this.items[i] == null) {
                    this.items[i] = item;
                    if (i == this.items.length - 1) {
                        return this.notFull = false;
                    }
                    return this.notFull = true;
                }
            }
        }
        return false;
    }

    protected T pick() {
        if (!this.notFull) {
            Random random = new Random();
            return this.items[random.nextInt(this.size)];
        }
        int cell = 0;
        for (int i = 0; i < this.items.length; i++) {
            if (this.items[i] == null) {
                cell++;
            }
        }
        throw new RuntimeException("Необходимо заполнить " + cell + " ячеек");
    }

}