public class Hideout<T> {
    T value;

    public Hideout() {
    }

    public void putIntoHideout(T toHide) {
        if (value == toHide) {
            value = null;
        } else {
            value = toHide;
        }
    }

    public T takeFromHideout() {
        if (value == null) {
            return null;
        }
        T a = value;
        value = null;
        return a;
    }

    public boolean isInHideout() {
        return value != null;
    }
}
