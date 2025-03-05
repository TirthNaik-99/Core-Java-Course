package tools;

class Calc{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

public class Inheritance {
    public static void main(String[] args) {

        SciCalc sciCalc = new SciCalc();
        System.out.println(sciCalc.add(1,2));
        System.out.println(sciCalc.sub(3,4));
        System.out.println(sciCalc.multiply(5,6));
        System.out.println(sciCalc.divide(50,6));

    }
}
