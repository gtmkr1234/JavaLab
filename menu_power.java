/* Design a class Room that has properties AC_ON, HOME_THEATRE_ON, FAN_ON and LIGHT_ON that stores Boolean values to indicate whether the appliance is ON or OFF. Design a menu driven program in java that puts ON/OFF the corresponding appliances and gives appropriate message. If the total power consumed is more than 2kW, show a message Overload. Assume AC consumes 1200 watts, Home Theatre consumes 600 watts, 
Fan consumes 400 watts and light consumes 100 watt. */


import java.util.Scanner;

class Room
{
    private Boolean AC_ON,HOME_THEATER_ON,FAN_ON,LIGHT_ON;
    private int power;


    Room()
    {
        power =0;
        AC_ON = false;
        HOME_THEATER_ON = false;
        FAN_ON = false;
        LIGHT_ON =false;
    }

    public String getAC()
    {
        if(AC_ON) return "ON";
        else
            return "OFF";
    }

    public String getTheater()
    {
        if(HOME_THEATER_ON) return "ON";
        else
            return "OFF";
    }

    public String getFan()
    {
        if(FAN_ON) return "ON";
        else
            return "OFF";
    }

    public String getLight()
    {
        if(LIGHT_ON) return "ON";
        else
            return "OFF";
    }

    public int getPower()
    {
        return power;
    }

    public void setAC_ON()
    {
        if(AC_ON) {
            AC_ON = false;
            power -= 1200;
        }
        else {
            AC_ON = true;
            power += 1200;
        }


    }

    public  void  setHOME_THEATER_ON()
    {
        if(HOME_THEATER_ON){
            HOME_THEATER_ON = false;
            power-=600;
        }
        else {
            HOME_THEATER_ON = true;
            power += 600;
        }

    }

    public void setFAN_ON()
    {
        if(FAN_ON) {
            FAN_ON = false;
            power -= 400;
        }

        else {
            FAN_ON = true;
            power += 400;
        }

    }

    public void setLIGHT_ON()
    {
        if(LIGHT_ON)
        {
            LIGHT_ON=false;
            power-=100;

        }
        else {
            LIGHT_ON = true;
            power += 100;
        }

    }


    public  void  checkOverload()
    {
        if(power>2000) System.out.println("\nWARNING! POWER OVERLOAD");
    }

}


public class PowerMenu{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Room r = new Room();
        int n;
        while(true) {

            System.out.println("MENU");
            System.out.println("1. Enter 1 to (ON/OFF) AC :                 CURRENT STATUS (AC) --->          " + r.getAC());
            System.out.println("2. Enter 2 to (ON/OFF) HOME THEATER :       CURRENT STATUS (HOME THEATER)---> " + r.getTheater());
            System.out.println("3. Enter 3 to (ON/OFF) FAN :                CURRENT STATUS (FAN) --->         " + r.getFan());
            System.out.println("4. Enter 4 to (ON/OFF) LIGHT :              CURRENT STATUS (LIGHT) --->       " + r.getLight());
            System.out.println("5. Enter 0 to exit                          TOTAL POWER CONSUME --->          " + r.getPower());
            r.checkOverload();
            n = s.nextInt();

            switch (n) {
                case 1 -> r.setAC_ON();
                case 2 -> r.setHOME_THEATER_ON();
                case 3 -> r.setFAN_ON();
                case 4 -> r.setLIGHT_ON();
                case 0 -> System.exit(0);
            }


        }

    }
}
