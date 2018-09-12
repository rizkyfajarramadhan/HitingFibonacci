package dynamic.programming;
import java.util.*;

public class HitungFibonacci {
    private static void tampilJudul(String identitas) {
        System.out.println("Identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21, ... dst.\n");
    }
    
    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Bilangan ke-1");
        int n = scanner.nextInt();
        
        return n;
    }
    
    public static void main(String[] args) {
        String identitas = "Rizky Fajar Ramadhan / XRPL4 / 32";
        
        tampilJudul(identitas);
        
        int n = tampilInput();
        
    }
    
}
