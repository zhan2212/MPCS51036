package _04interfaces.E9_17;

public interface Measurable {
    double getMeasure();
    public static double average(Measurable[] objects)
    {
        if (objects.length == 0) { return 0; }
        double sum = 0;
        for (Measurable obj : objects)
        {
            double measure = obj.getMeasure();
            sum = sum + measure;
        }
        double result = sum / objects.length;
        return result;
    }

}
