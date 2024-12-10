package hometasks;

class GenericClass<T> {
    private T value;

    public GenericClass(T value) {
        this.value = value;
    }

    public T get() {

        return value;
    }
}

