package Assignment_6_part1;

public class StackDemo {
    public static void main(String[] args){
        int stack[] = new int[5];
        int t=-1;
        Fixed_STK fixed_stk = new Fixed_STK(stack,t);
        fixed_stk.push(1);
        fixed_stk.push(2);
        fixed_stk.push(3);
        fixed_stk.displayStack();
        System.out.println(fixed_stk.pop());
        fixed_stk.displayStack();

        Growable_STK growable_stk = new Growable_STK();
        growable_stk.push(1);
        growable_stk.push(2);
        growable_stk.push(3);
        growable_stk.push(4);
        growable_stk.push(5);
        growable_stk.push(6);
        growable_stk.displayStack();
        System.out.println(growable_stk.pop());
        growable_stk.displayStack();
    }
}
