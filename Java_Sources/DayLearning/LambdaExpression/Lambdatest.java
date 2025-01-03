package DayLearning.LambdaExpression;

interface testfunctionalinterface{
    void display();
}
interface testLambdafunction{
    void display();
}
interface greetings{
    void sayHello(String name);
}

interface mathsOperation{
   int addFunction(int a, int b);
}


public class Lambdatest {
    public static void main(String[] args){

        mathsOperation addfunc = (a, b) -> a+b;
            System.out.println("Sum: " + addfunc.addFunction(5, 8));


        greetings greet = (name) ->{System.out.println("hello " + name);};
        greet.sayHello("Bahir");


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
