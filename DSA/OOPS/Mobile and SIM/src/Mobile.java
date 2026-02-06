//4. Mobile & SIM:-
//        ============
//
//Create:
//        - SIM class → number, network
//- Mobile class → brand, SIM sim
//- Create SIM object inside Mobile class.
//
//Rule
//- SIM should not exist without Mobile
//--

public class Mobile {
    String brand;
    SIM sim;

    Mobile(String brand , String Number , String Network){
        this.brand = brand;
        this.sim = new SIM(Number , Network);
    }

    void showDetails(){
        System.out.println("The mobile brand is " + brand + " and your phone number is " + sim.Number + " and the network is " + sim.Network);
    }

    class SIM {
        String Number;
        String Network;

        private SIM(String Number, String Network){
            this.Network = Network;
            this.Number = Number;
        }
    }



    public static  void main(String[] args){

        Mobile mobile = new Mobile("Apple" , "9044773732" , "Airtel");
        mobile.showDetails();
    }
}
