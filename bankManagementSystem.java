//class Accounts{
//    String name;
//    long CNIC,account_number;
//    double balance;
//    }
////following accounts is a constructor;
//Accounts(String name,long CNIC,long account_number,double balance){
//    this.name=name;
//    this.CNIC=CNIC;
//    this.account_number=account_number;
//    this.balance=balance;
//}
//public double checkBalance(){
//    return this.balance;
//}
import java.util.Scanner;
class FindSmallest{
    int num1,num2,smallest;
    FindSmallest(int num1,int num2){
        this.num1=num1;
        this.num2=num2;
    }
    public int show(int num1,int num2){
        if (num1>num2){
            this.smallest=num2;
        }
        else{
            this.smallest=num1;
        }
        return smallest;
    }
}
public class bankManagementSystem{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
        System.out.print("ENTER FIRST NUMBER:");
        int n1=Sc.nextInt();
        System.out.print("ENTER SECOND NUMBER:");
        int n2=Sc.nextInt();
        FindSmallest Obj1=new FindSmallest(n1,n2);
        System.out.println("THE SMALLEST NUMBER IS:"+Obj1.show(n1,n2));


     
    }
}