public class calculator{
    public int sumar(int numA, int numB) {
        return numA+numB;
    }
    public int sumar(int numA, int numB, int numC) {

        return numA+numB+ numC;
    }
    public static void main(String[] args) {
     calculator cal= new calculator();
     System.out.println(cal.sumar(2,4));
     System.out.println(cal.sumar(2, 4, 6));
      
    }
    
}