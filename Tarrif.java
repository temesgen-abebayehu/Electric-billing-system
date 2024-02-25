public class Tarrif {    

    public void viewAvailableTarrif() {
        System.out.println("1.post paid greater than 50kwh total bill=42.00 birr");
        System.out.println("2.post paid less than or equals to 50kwh total bill=10.00 birr");
        System.out.println("3.pre paid greater than 50kwh total bill=14.70 birr");
        System.out.println("4.pre paid less than or equels to 50kwh total bill=3.50 birr");

    }

    public void viewAvailableRate() {
        System.out.println("1.less than 50kwh rate=0.27");
        System.out.println("2.between  50kwh and 100kwh rate=0.76");
        System.out.println("3.between 100kwh and 200kwh rate=1.62");
        System.out.println("4.between 200kwh and 300kwh rate=2.00");
        System.out.println("1.greater than 300kwh rate=2.47");
        
    }
}
