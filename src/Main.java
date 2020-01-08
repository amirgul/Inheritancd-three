public class Main
{

    public static void main(String[] args)
    {
        TitledPerson one = new TitledPerson("ahad", "Mr");
        TitledPerson second = new TitledPerson("ahad", "Mr");
        compare(one, second);


    }
    public static void compare(TitledPerson one, TitledPerson second)
    {
        if(one.equal(second))
            System.out.println("name: " + one.getName() + " titla: "+ one.getTitle() + " ====" + second.getName() + " titile" +  second.getTitle());
        else
            System.out.println("they are not equal");
    }
}
