package task;

/*public class Car implements Vehicle{

    private  boolean  hasFuel=true;

    public  void startCar(){
        System.out.println("Masin ise dusmeye hazirlnir ");
        if (checkFuel()){
            startEngine();
        }else {
            System.out.println("Masin suruse hazir deyil");
        }
    }
    @Override
    public void startEngine() {
        System.out.println("masin ise dusdu");

    }

    private  boolean checkFuel(){
        return hasFuel;
    }

    @Override
    public void stopEngine() {

    }

    @Override
    public double getFuelEfficiency() {
        return 0;
    }

    @Override
    public String getFuelType() {
        return "";
    }
}
