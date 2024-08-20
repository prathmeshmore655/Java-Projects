public class functions{

    public double[] cm(double v){
        double[] result=new double[5];

        result[0]=v*0.01;
        result[1]=v*(0.00001);
        result[2]=v*(0.032808399);
        result[3]=v*(0.000006214);
        result[4]=v*(0.393700787);

        return result;
    }

    public double[] m(double v){
        double[] result=new double[5];

        result[0]=v*(100);
        result[1]=v*(0.001);
        result[2]=v*(3.2808399);
        result[3]=v*(0.0006214);
        result[4]=v*(39.3700787);

        return result;
    }

    public double[] km(double v){
        double[] result=new double[5];

        result[0]=v*(100000);
        result[1]=v*(1000);
        result[2]=v*(3280.8399);
        result[3]=v*(0.6214);
        result[4]=v*(39370.0787);

        return result;
    }

    public double[] foot(double v){
        double[] result=new double[5];

        result[0]=v*(30.4799999536704);
        result[1]=v*(0.304799999536704);
        result[2]=v*(0.000304799999536704);
        result[3]=v*(0.0001894027197121078656);
        result[4]=v*(11.9999999695200000186048);

        return result;
    }

    public double[] mile(double v){
        double[] result=new double[5];

        result[0]=v*(1609.269391696169939);
        result[1]=v*(160926.9391696169939);
        result[2]=v*(1.609269391696169939);
        result[3]=v*(5279.75523012552301255230130517661);
        result[4]=v*(63357.0626005793369870041993);

        return result;
    }

    public double[] inch(double v){
        double[] result=new double[5];

        result[0]=v*(2.5400000025908);
        result[1]=v*(0.025400000025908);
        result[2]=v*(0.000025400000025908);
        result[3]=v*(0.083333333450000001292);
        result[4]=v*(0.0000157835600160992312);

        return result;
    }

    double[] gm(double v){
        double[] result=new double[4];

        result[0]=v*0.001;
        result[1]=v*(0.00001);
        result[2]=v*(0.000001);
        result[3]=v*(0.0022046226);

        return result;
    }

    double[] kg(double v){
        double[] result=new double[5];

        result[0]=v*1000;
        result[1]=v*(0.01);
        result[2]=v*(0.001);
        result[3]=v*(2.2046226);

        return result;
    }

    double[] quintal(double v){
        double[] result=new double[5];

        result[0]=v*100000;
        result[1]=v*(100);
        result[2]=v*(0.1);
        result[3]=v*(220.46226);

        return result;
    }

    double[] tonne(double v){
        double[] result=new double[5];

        result[0]=v*1000000;
        result[1]=v*(1000);
        result[2]=v*(10);
        result[3]=v*(2204.6226);

        return result;
    }

    double[] pound(double v){
        double[] result=new double[5];


        result[0]=v*453.592;
        result[1]=v*(0.453592);
        result[2]=v*(0.00453592);
        result[3]=v*(0.000453592);

        return result;
    }

}
