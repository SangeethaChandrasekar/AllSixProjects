class ArmstrongNumber{
    public static int armstrongNumber(){
        int number=1634,temp, remainder, result=0;
        temp=number;
        while (temp!=0)
        {
            remainder = temp%10;
            result += Math.pow(remainder,4);
            temp=temp/10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number + " is not an Armstrong number");
        return number;
    }
}
