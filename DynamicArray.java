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

    //this method is made so we can freely add data to our dynamic array
    public void add(int value)
    {
        if (size == capacity)
        {
            resize();
        }
        data[size] = value;
        size++;
    }

    //this let's us see what data does the index show and makes sure it throws an exception when there is an invaid index that can't point to actual data
    public int get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Invalid inex:" + index);
        }

        return data[index];
    }

    //this on the other hand let's us remove data from the array without having it break while also keeping in mind potential problems that have to do with the index exception
    public void remove(int index)
    {
        if(index < 0 || index >= size)
        {
             throw new IndexOutOfBoundsException("Invalid inex:" + index);
        }

        for(int i = index; i< size-1; i++)
        {
            data[i] = data[i + 1];
        }

        size--;
    }
    //this one is needed so the array can get bigger when more space is needed
    private void resize()
    {
        capacity *= 2;
    }
