public class DynamicArray
{
    private int[] data;
    private int size;
    private int capacity;

    public DynamicArray(int starting_cap)
    {
        this.size = 0;
        this.capacity = starting_cap;
        this.data = new int[capacity];        
    }

    public void add(int value)
    {
        if (size == capacity)
        {
            resize();
        }
        data[size] = value;
        size++;
    }
}