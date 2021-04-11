package coreJavaTraining;

import demopack.CentralTraffic;

public class AustralianTraffic implements CentralTraffic, ContinentalTraffic {

        public static void main(String[] args) {
            CentralTraffic a =  new AustralianTraffic();
            a.redStop();
            a.FlashYellow();
            a.greenGo();


//            walkonsymbol() method is created in AustralianTraffic, so need to create new object for that, cant use central traffic object a
            AustralianTraffic at = new AustralianTraffic();
            at.walkonsymbol();

            ContinentalTraffic ct = new AustralianTraffic();
            ct.Trainsymbol();

        }

    @Override
    public void greenGo() {
        System.out.println("Green Go implemetation");
    }

    @Override
    public void redStop() {
        System.out.println("Red Stop implemetation");

    }

    @Override
    public void FlashYellow() {
        System.out.println("Flash Yellow implemetation");


    }

    public void walkonsymbol(){
        System.out.println("Walking");

    }

    @Override
    public void Trainsymbol() {

    }
}
