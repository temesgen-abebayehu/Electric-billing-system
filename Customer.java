
class Customer {
    int customerID;
    String name;
    String address;
    String email;
    Bill bill = new Bill();

    Customer() {
    }

    Customer(int customerID, String name, String address, String email) {
        this.customerID = customerID;
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String toString() {
        String billDetail = this.bill.toString();
        return "Customer ID: " + this.customerID + "\tName: " + this.name + "\taddress: " + this.address+ "\tEmail: " + 
        this.email +billDetail+ "\n";
    }

    public void updateBill() {
        this.bill.recordBillDetail();
    }

    public void displayBil() {
        this.bill.viewBillDatail();
    }
}