package study.javastudy.abstractEx01;

public class RecipeRunner {

    public static void main(String[] args) {
        Recipe01 recipe = new Recipe01();
        recipe.execute();

        RecipeWithMicroWave recipeWithMicroWave = new RecipeWithMicroWave();
        recipeWithMicroWave.execute();
    }
}
