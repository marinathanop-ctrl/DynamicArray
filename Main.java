public class Main
{
    public static void main(String[] args)
    {
        DynamicArray array1 = new DynamicArray(4);
        System.out.println("The original array is:");
        array1.print();

        array1.add(10);
        array1.add(20);
        array1.add(30);
        array1.add(40);

        System.out.println("After adding 4 elements the array is:");
        array1.print();

        array1.add(50); //this should trigger resize method
    }
}
