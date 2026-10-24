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
        System.out.println("Resize gets triggered so we can successfully add this 5th element to the array. The array now is:");
        array1.print();

        //checking the getter
        System.out.println("For example, the element at index 2 is: " + array1.get(2));

        array1.remove(1);
        System.out.println("Using the remove method, we removed number at index 1: ");
        array1.print();

        array1.add(60);
        array1.add(70);
        array1.add(80);
        System.out.println("After adding another three numbers (60, 70 and 80): ");
        array1.print();

        array1.remove(0);
        array1.remove(array1.size() - 1);
        System.out.println("After removing the first and last elements: ")
        array1.print();

        System.out.println("The final size of the array, after all these changes is: " + array1.size());
    }
}
