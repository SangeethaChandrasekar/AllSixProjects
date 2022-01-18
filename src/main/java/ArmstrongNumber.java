import java.lang.Math;
class ArmstrongNumber{
    public static int armstrongNumber(int number){
        int temp, remainder,count=0, result=0;
        temp=number;
        while (temp!=0)
        {
            temp=temp/10;
            count++;
        }
        temp=number;
        while (temp>0){
            remainder = temp%10;
            result += Math.pow(remainder,count);
            temp=temp/10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number");
        else
            System.out.println(number +  " is not an Armstrong number");
        return number;
    }
}
