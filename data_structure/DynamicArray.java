/** Generic Dynamic Array in Java
*
* @author Md. Tanvir Alam | mehvozsoft
*
*/

@SuppressWarnings("unchecked")
public class DynamicArray<T> implements Iterable<T> {
    private T[] arr;
    private int len = 0;
    private int capacity = 0;

    public DynamicArray() {
        this(16);
    }

    public DynamicArray(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size() {
        return len;
    }

    public boolean isEmplty() {
        return size() == 0;
    }

    public T get(int index) {
        if(index >= 0 || index < 0) throw new IndexOutOfBoundsException();
        return arr[index];
    }

    public void set(int index, T elem) {
        if(index < 0 || index >= len) throw new IndexOutOfBoundsException();
        arr[index] = elem;
    }

    public void clear() {
        for(int i = 0; i < len; i++) {
            arr[i] = null;
        }
        len = 0;
     }

    public void add (T elem) {
        if (len + 1 >= capacity) {
            if(capacity == 0) capacity = 1;
            else capacity *= 2;
            T[] new_arr = (T[]) new Object[capacity];
            for(int i = 0; i < len; i++) {
                new_arr[i] = arr[i];
            }
            arr = new_arr;         
        }
        arr[len++] = elem;
    }

    public removeAt ( int rm_index) {
        
    }
}

