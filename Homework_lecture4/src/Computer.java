package Homework_OOP_Array;

public class Computer {

    int year;
    double price;
    boolean isNotebook;
    double hardDiskMemory;
    double freeMemory;
    String operationSystem;
    
    void changeOperationSystem(String newOperationSystem){
        operationSystem = newOperationSystem;
    }
    
    void useMemory(double memory){
        freeMemory -= memory;
    }
    
    Computer() {
    	isNotebook = false;
    	operationSystem = "Win XP";
    }
    
    Computer(int year, double price, double hardDiskMemory, double freeMemory) {
    	this();
    	this.year = year;
    	this.price = price;
    	this.hardDiskMemory = hardDiskMemory;
    	this.freeMemory = freeMemory;
	}


	Computer(int year, double price, boolean isNotebook,double hardDiskMemory, double freeMemory, String operationSystem){
		this.year = year;
    	this.price = price;
    	this.hardDiskMemory = hardDiskMemory;
    	this.freeMemory = freeMemory;
    	this.operationSystem = operationSystem;
    }

	int comparePrice(Computer c) {
		if(this.price > c.price) {
			System.out.println("The price of the first computer is higher.");
			return -1;
		}
		
		if (this.price < c.price) {
			System.out.println("The price of the first computer is lower." );
			return 1;
		}
		
		if (this.price == c.price) {
			System.out.println("The price of the first computer is equal." );
			return 0;
		}
		
		return 1;
		
	}

    
}
