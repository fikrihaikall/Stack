package Drivers;
import Models.Mahasiswa;
import Utils.LinkedStack;
import java.util.stream.StreamSupport;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mahasiswa agus = new Mahasiswa("Agus","Trianto", 1);
        Mahasiswa beta = new Mahasiswa("Beta","Sonda", 2);
        Mahasiswa citra = new Mahasiswa("Citra", "Kirana", 3);
        Mahasiswa dadang = new Mahasiswa("Dadang", "Nurjaman", 4);
        Mahasiswa eko = new Mahasiswa("Eko", "Patrio", 5);

        LinkedStack stack = new LinkedStack();

        stack.push(agus);
        stack.push(beta);
        stack.push(citra);
        stack.push(dadang);
        stack.push(eko);

        stack.printStack();

        System.out.println("============");
        System.out.println(stack.peek());

        stack.pop();

        System.out.println("=============");
        stack.printStack();

        System.out.println(stack.size());
    }
    
}
