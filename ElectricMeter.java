
public class ElectricMeter {
    double previousReading;
	double currentReading;
    
    ElectricMeter(){}

    ElectricMeter(double previousReading, double currentReading) {
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public void recordsMeterReading() {
                  
    }
    public void viewMeterReadingHistory() {
    }

    public double calculateUsage() {
        return this.currentReading - this.previousReading;  
    }
    
}
