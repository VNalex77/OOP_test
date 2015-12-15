import java.util.ArrayList;
import java.util.List;
import com.alexv.oop.*;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Calendar;

public class TestCar
{
        public  static  void  main(String[] args ){
            //some code
            int intWork = 11;
            short shortWork = 20;
            long longWork;
            int intLast = 12;
            byte byteOne =10;
            byte byteTwo =20;

            SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
            String dateInString = "31-08-1982 10:20:56";

            //Formatting date from string variable
            Calendar date =  Calendar.getInstance();
            date.set(1977,7,27);
            System.out.printf("%1$tb %1$td %1$tY\n", date.getTime()  ); //Tue Aug 31 10:20:56 SGT 1982

            List<String> AL = new ArrayList();
            ttcl t1 = new ttcl();
            Practic2 p2 = new Practic2();
            Practic2 clsWork = new  Practic2();

            AL.add( "blue+yellow" );
            AL.add( "bl0" );
            AL.add( "bl1" );
            AL.add( "bl2" );
            AL.add( "bl3" );
            Car car1 = new Car();
            Car car2 = new Car();
            //longWork= ClsWork.first( intWork );
            //clsWork.second( shortWork );
            //Practic2.second( shortWork );
            // clsWork.last( intLast );
            System.out.println( intLast);
            //clsWork.overMethod( byteOne,byteTwo );
            //clsWork.overMethod( intLast, intWork);
            clsWork.difParam('h',12,9,57,99,7);
            Practic2.gtYear();
            Practic2.difParam('w',2,34,547,9459,347);
            //System.out.println( longWork );
          /*  for ( String at : args
                 ) {
                System.out.println( at);
                }
          */


            car1.color="123";
            car2.color="red";
            for (  String A  : AL  ) {
                System.out.println("First cars color  is "+ A +t1.myName );
            }

        }
    public  static  void print (String s){

    }


}
