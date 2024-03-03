package study.javastudy.abstractEx01;

public class RecipeWithMicroWave extends AbstractRecipe{
    @Override
    void getReady() {
        System.out.println("Get the raw materials");
        System.out.println("switch on the microwave");
    }

    @Override
    void doTheDish() {
        System.out.println("do the dish");
        System.out.println("put in the microwave");
    }

    @Override
    void cleanUp() {
        System.out.println("CleanUp the utensils");
        System.out.println("switch off the microwave");
    }
}
