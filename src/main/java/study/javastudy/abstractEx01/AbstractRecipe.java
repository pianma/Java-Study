package study.javastudy.abstractEx01;

public abstract class AbstractRecipe {
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }


   abstract void getReady();
   abstract void doTheDish();
   abstract void cleanUp();
    //prepare


    //receipe


    //cleanup
}
