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
            throw new IndexOutOfBoundsException("Invalid index:" + index);
        }

        return data[index];
    }

    //this on the other hand let's us remove data from the array without having it break while also keeping in mind potential problems that have to do with the index exception
    public void remove(int index)
    {
        if(index < 0 || index >= size)
        {
             throw new IndexOutOfBoundsException("Invalid index:" + index);
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
        capacity *= 2; //it doubles the capacity so we can be sure the array won't have any problems accepting all the new data
        int[] newData = new int[capacity]; //making a new, bigger array

        for (int i = 0; i < size; i++)
        {
            newData[i] = data[i];        
        } //this for loop copies all the old data we had in our origina array

        data = newData; // we change up our old array with this new, bigger one that still holds older data that was originally in our old array
    }

    public int size()
    {
        return size; //so we can clearly see the size of our array when our main is running
    }

    //this next method will allow our program to print only the data our array has without showing us the empty slots
    public void print()
    {
        System.out.println("[ ");

        for (int i = 0; i < size; i++)
        {
            System.out.println(data[i] + " ");
        }

        System.out.println("]");
    }
