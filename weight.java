public class weight extends functions{
    public double[] cat(double value,String choice){
        functions f=new functions();

        {
            if (choice.equals("G")) {
                double[] n = f.gm(value);
                return n;
            } else if (choice.equals("Kg")) {
                double[] n = f.kg(value);
                return n;
            } else if (choice.equals("Quintal")) {
                double[] n = f.quintal(value);
                return n;
            } else if (choice.equals("Tonne")) {
                double[] n = f.tonne(value);
                return n;
            } else{
                double[] n = f.pound(value);
                return n;
            }
        }




    }
}
