public class TweleveInts
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9 ,10, 11, 12};
        int i;
        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + "  ");
        System.out.println();
        for (i = array.length - 1; i >= 0; i--)
            System.out.print("" + array[i] + "  ");
        System.out.println();
    }
}
