package Homework_OOP_Array;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer ThinkPad = new Computer();
        ThinkPad.year = 2017;
        ThinkPad.price = 1700;
        ThinkPad.isNotebook = false;
        ThinkPad.hardDiskMemory=300;
        ThinkPad.freeMemory=400;
        ThinkPad.operationSystem="Windows";
        
        Computer MAC = new Computer();
        MAC.year = 2016;
        MAC.price = 3000;
        MAC.isNotebook = true;
        MAC.hardDiskMemory=500;
        MAC.freeMemory=1000;
        MAC.operationSystem="iOS";
        
        System.out.println("The year of the computer is:" + ThinkPad.year);
        System.out.println("The price of the computer is:" + ThinkPad.price);
        System.out.println("The computer is Notebook:" + ThinkPad.isNotebook);
        System.out.println("The computer's hard disk memory is:" + ThinkPad.hardDiskMemory);
        System.out.println("The computer's free memory is:" + ThinkPad.freeMemory);
        ThinkPad.useMemory(100.80);
        System.out.println("The computer's free memory is:" + ThinkPad.freeMemory);
        System.out.println("The computer's operation system is:" + ThinkPad.operationSystem);
        
        System.out.println("The year of the computer is:" + MAC.year);
        System.out.println("The price of the computer is:" + MAC.price);
        System.out.println("The computer is Notebook:" + MAC.isNotebook);
        System.out.println("The computer's hard disk memory is:" + MAC.hardDiskMemory);
        System.out.println("The computer's free memory is:" + MAC.freeMemory);
        System.out.println("The computer's operation system is:" + MAC.operationSystem);
        MAC.changeOperationSystem("Linux");
        System.out.println("The computer's operation system is:" + MAC.operationSystem);
        
        Computer Asus = new Computer(2014, 1300, 200, 100);
        Computer Toshiba = new Computer(2015, 1100, false, 300, 100, "Windows 10");
        
        System.out.println(Asus.comparePrice(Toshiba));
        System.out.println(ThinkPad.comparePrice(MAC));
    }
}
