import java.util.ArrayList;
import java.util.List;
import com.alexv.oop.*;
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


}
