public class TestCar
{
        public  static  void  main(String[] args ){
            //some code
            Car car1 = new Car();
            Car car2 = new Car();

            car1.color="blue+yellow";
            car2.color="red";

                System.out.println("First cars color  is "+ car1.color );
                System.out.println("Hello from branch2 "+ car1.color );
                
                System.out.println("Second cars color is "+ car2.color );

        }

}
