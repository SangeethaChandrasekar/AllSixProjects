class BiggestNumber {
    public static int biggestNumber(int[] arr) {
        int temp;
        BiggestNumber obj = new BiggestNumber();
        System.out.println("Elements of original array: ");
        obj.printingClass(arr);
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
        obj.printingClass(arr);
        System.out.println();
        System.out.println("Largest element in array: "+arr[0]);
        return arr[0];
    }
    public void printingClass(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}