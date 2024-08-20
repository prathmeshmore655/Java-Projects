public class length extends functions{
    public double[] dog(double value,String choice){
        functions f=new functions();
        {
            if (choice.equals("Cm")) {
                double[] n = f.cm(value);
                return n;
            } else if (choice.equals("M")) {
                double[] n = f.m(value);
                return n;
            } else if (choice.equals("Km")) {
                double[] n = f.km(value);
                return n;
            } else if (choice.equals("Foot")) {
                double[] n = f.foot(value);
                return n;
            } else if (choice.equals("Mile")) {
                double[] n = f.mile(value);
                return n;
            } else {
                double[] n = f.inch(value);
                return n;
            }
        }
    }
}
