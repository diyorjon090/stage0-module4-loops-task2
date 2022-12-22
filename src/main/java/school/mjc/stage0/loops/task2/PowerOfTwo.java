package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if(power  < 0){
            System.out.println("too much power");
            return;
        }
        int result = 1, counter = 0;
        while(counter <= power){
            System.out.println(result);
            result *= 2;
            counter++ ;
        }
    }
}
