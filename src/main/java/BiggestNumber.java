class BiggestNumber {
    public static int biggestNumber() {
        int[] arr = new int[]{4, 3, 9, 11, 1, 2};
        int temp;
        System.out.println("Elements of original array: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Elements of array sorted in Descending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("Largest element in array: "+arr[0]);
        return arr[0];
    }

}
