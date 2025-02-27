package DayLearning.LambdaExpression;

interface testfunctionalinterface{
    void display();
}
interface testLambdafunction{
    void display();
}
public class Lambdatest {
    public static void main(String[] args){
        testfunctionalinterface tst = new testfunctionalinterface() {
            @Override
            public void display() {
                System.out.println("It's a Functional interface");
            }
        };
        tst.display();

        testLambdafunction tstlmbda = ()-> {
                System.out.println("It's a Lambda Function");
        };
        tstlmbda.display();
    }
}
