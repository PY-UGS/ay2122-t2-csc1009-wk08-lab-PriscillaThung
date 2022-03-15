public class CircleWithException{
    protected double radius;
    protected double area;
    protected double diameter;
    private static final double PI = 3.142;

    public static void main(String[] args) {
        CircleWithException circle = new CircleWithException();
        try{
            String input = "700";
            double r = Double.valueOf(input);
            if(r <= 0)
            {
                throw new IllegalArgumentException("Input cannot be 0 or less than 0");
            }
            else 
            {
                try {
                    double testArea = 2 * PI * r *r;
                    if(testArea > 1000)
                    {
                        TestRadius();
                    } 
                    else
                    {
                        circle.SetRadius(r);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


        } catch (IllegalArgumentException e){
            System.out.println("Amount exception caught: " + e.getMessage());
        } 

        finally{
            System.out.println("Radius of circle: " + circle.GetRadius());
        }
    }

    public static void TestRadius() throws Exception
    {
        throw new Exception("Radius too large");
    }

    public CircleWithException()
    {
        radius = 5;
        area = 2 * PI * radius * radius;
        diameter = 2 * PI * radius;
    }

    public void SetRadius(Double newRad)
    {
        radius = newRad;
        area = 2 * PI * radius * radius;
        diameter = 2 * PI * radius;
    }

    public double GetRadius()
    {
        return radius;
    }

    public double GetArea()
    {
        return area;
    }

    public double GetDiameter()
    {
        return diameter;
    }
}

class DefinedException extends Exception{
    public DefinedException(String message)
    {
        super(message);
    }
}