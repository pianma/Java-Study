package study.javastudy.abstractEx01;

public class Recipe01 extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("Get the raw utensils");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
    }

    @Override
    void cleanUp() {
        System.out.println("CleanUp the utensils");
    }
}
