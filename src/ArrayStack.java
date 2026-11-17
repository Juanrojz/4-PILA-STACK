public class ArrayStack implements StackInterface {
    //     NOTA: Si vas a implementar la pila con la opcion 2: Lista simplemente enlazada (ListStack) puedes borrar este archivo.
    int size;
    Object[] array;
    int top;

    public ArrayStack(int tam) {
        this.size = tam;
        this.array = new Object[tam];
        this.top = -1;
    }

    public ArrayStack() {
        this(10);
    }

    public void clear() {
        for (int i = 0; i <= top; i++) {
            array[i] = null;
        }
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return array[top];
    }

    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        Object obj = array[top];
        array[top] = null;
        top--;
        return obj;
    }

    public boolean push(Object obj) {
        if (obj == null || top == size - 1) {
            return false;
        }
        top++;
        array[top] = obj;
        return true;
    }

    public int size() {
        return top + 1;
    }

    public boolean search(Object obj) {
        for (int i = 0; i <= top; i++) {
            if (array[i].equals(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String res = "[";
        for (int i = top; i >= 0; i--) {
            res += array[i];
            if (i > 0) {
                res += ", ";
            }
        }
        res += "]";
        return res;
    }

}
