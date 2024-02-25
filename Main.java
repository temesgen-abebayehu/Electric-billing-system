import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();
        Tarrif tarrif = new Tarrif();
        Bill bill = new Bill();
        

        int choice;

        while (true) {
            Customer c = new Customer();
            System.out.println("-----------------------------------");            
            System.out.println("|     1. Register Customer        |");
            System.out.println("|     2. Update Customer          |");
            System.out.println("|     3. View  Customer           |");
            System.out.println("|     4. Disconnect Customer      |");
            System.out.println("|     5. Search Customer          |");
            System.out.println("|     6. Show Available Tarif     |");
            System.out.println("|     7. Show Rate                |");
            System.out.println("|     8. calculate Bill           |");
            System.out.println("|     0. EXIT                     |");
            System.out.println("__________________________________|");
            System.out.print("Enter your choice: ");
            choice=scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Emter ID: ");
                    c.customerID = scanner.nextInt();

                    System.out.print("Emter Name: ");
                    scanner.nextLine();
                    c.name = scanner.nextLine();

                    System.out.print("Emter Address: ");
                    c.address = scanner.nextLine();

                    System.out.print("Emter Email: ");
                    c.email = scanner.nextLine();
                    
                    c.updateBill();

                    customers.add(c);

                    System.out.println("Register Successfully");
                    break;
            
                case 2:
                    int x,id,found=0;
                    System.out.print("Enter the id of the customer: ");
                    id=scanner.nextInt();
                    for(int i=0;i<customers.size();i++){
                        if(id==customers.get(i).customerID){
                            System.out.println("************************");
                            System.out.println("*     1.For ID         *");
                            System.out.println("*     2.For Name       *");
                            System.out.println("*     3.For Address    *");
                            System.out.println("*     4.For Email      *");
                            System.out.println("*     0.Cancel         *");
                            System.out.println("************************");
                            System.out.print("Enter your choice: ");
                            x = scanner.nextInt();

                    switch (x) {
                        case 1:
                            System.out.print("Enter New ID: ");
                            customers.get(i).customerID = scanner.nextInt();
                            break;
                        case 2:
                            System.out.print("Emter New Name: ");
                            scanner.nextLine();
                            customers.get(i).name = scanner.nextLine();
                            break;
                        case 3:
                            System.out.print("Emter New Address: ");
                            scanner.nextLine();
                            customers.get(i).address = scanner.nextLine();
                            break;
                        case 4:
                            System.out.print("Emter New Email: ");
                            scanner.nextLine();
                            customers.get(i).email = scanner.nextLine();
                            break;
                        case 0:
                            System.out.println("Exiting....");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice. please try again.");
                            break;
                    }
                            found++;
                        }
                    }
                    
                    if(found==0){
                        System.out.println("Not Found");
                    }
                    else{
                        System.out.println("Update Successfully");
                    }
                    break;

                case 3:                    
                    for (int i = 0; i < customers.size(); i++) {
                        System.out.println("ID\tName\tAddress\t\tEmail");
                        System.out.print(customers.get(i).customerID+"\t");
                        System.out.print(customers.get(i).name+"\t");
                        System.out.print(customers.get(i).address+"\t");
                        System.out.print(customers.get(i).email + "\n");
                        System.out.println(customers.get(i).bill);
                    }
                    break;
                case 4:
                    found = 0;
                    System.out.println("Enter id: ");
                    id=scanner.nextInt();
                    
                    for(int i=0;i<customers.size();i++){
                        if(id==customers.get(i).customerID){
                            customers.remove(i);
                            found++;
                        }                        
                    }

                    if(found==0){
                        System.out.println("id not found");
                    }
                    else{
                        System.out.println("Disconnected successfully");
                    }
                    break;
                case 5:
                    found=0;
                    System.out.println("Enter id: ");
                    id=scanner.nextInt();
                    
                    for(int i=0;i<customers.size();i++){
                        if(id==customers.get(i).customerID){
                            System.out.println(customers.get(i));
                            found++;
                        }                        
                    }

                    if(found==0){
                        System.out.println("id not found");
                    }
                    break;
                case 6:
                    tarrif.viewAvailableTarrif();
                    break;
                case 7:
                    tarrif.viewAvailableRate();
                    break;
                case 8:                    
                    System.out.println("Amount is: "+bill.calculateBillAmount()+" Birr");
                    break;
                case 0:
                    System.out.println("Exiting....");
                    return;                
                default:
                    System.out.println("Invalid choice. please try again.");
                    break;
            }
        }
         
    }
}
