package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int i = 1, fac = 1;
        while(i <= printToInclusive){
            fac *= i;
            i++;
        }
        System.out.println(fac);

    }
}

