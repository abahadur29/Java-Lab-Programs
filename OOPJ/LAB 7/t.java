class HrsException extends Exception{
    private int x;
    HrsException(int a)
    {
        x=a;
    }
    public String toString(){
        return "a";
    }
}
class MinException extends Exception{
    private int x;
    MinException(int a)
    {
        x=a;
    }
    public String toString(){
        return "a";
    }
}class SecException extends Exception{
    private int x;
    SecException(int a)
    {
        x=a;
    }
    public String toString(){
        return "a";
    }
}
class t{
    static void calculate(int h,int m,int s) throws HrsException,MinException,SecException
    {
        if(h>24)
        throw new HrsException(h);
        else if (m>60)
        throw new MinException(h);
        else if (s>60)
        throw new SecException(h);
    }
    public static void main(String[] args) {
        try{
            calculate(22,1,75);
        }
        catch(HrsException e){
            System.out.println("InvalidHoursException:hours is not greater than 24");
        }
        catch(MinException e){
            System.out.println("InvalidMinuteException:minutes is not greater than 60");
        }
        catch(SecException e){
            System.out.println("InvalidSecondException:seconds is not greater than 60");
        }
    }
}

