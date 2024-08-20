public class temperature extends functions {


    public double bird(double value,String choice){

        if (choice.equals("Celsius")){
            double c=32+(value/5)*9;
            return c;
        }
        else {
            double c1=5/9*(value-32);
            return c1;
        }
    }
}
