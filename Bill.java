import java.time.LocalDate;
import java.util.Scanner;

public class Bill {
    int billID;
    LocalDate issueDate;
    LocalDate dueDate;

    Bill(){}

    Bill(int billID, LocalDate issuDate, LocalDate dueDate) {
        this.billID = billID;
        this.issueDate = issuDate;
        this.dueDate = dueDate;
    }

    public String toString() {
        return "\nBill Info\nBill ID: " + this.billID + "\tBill Issue Date: " + this.issueDate + "\tBill Due Date: " + this.dueDate
                + "\n";
    }

    Scanner scanner = new Scanner(System.in);
    public void recordBillDetail() {       
        
        System.out.println("Enter bill ID: ");
        this.billID = scanner.nextInt();
        System.out.println("issue date: ");
        String issue=scanner.next();
        this.issueDate = LocalDate.parse(issue);

        this.dueDate = LocalDate.now();
    }
    
    public void viewBillDatail() {
        System.out.println(toString());      
    }

    public double calculateBillAmount() {
        ElectricMeter e = new ElectricMeter();        

        System.out.println("Enter previousReading: ");
        e.previousReading = scanner.nextDouble();

        System.out.println("Enter currentReading: ");
        e.currentReading = scanner.nextDouble();

        double usage = e.calculateUsage();

        if (usage < 50) {
            return usage * 0.27;
        }

        else if (usage >= 50 && usage < 100) {
            return usage * 0.76;
        }
        else if (usage >= 100 && usage < 200) {
            return usage * 1.62;
        }
        else if (usage >= 200 && usage < 300) {
            return usage * 2.00;
        }
        else {
            return usage * 2.48;
        }
        
    } 
}
