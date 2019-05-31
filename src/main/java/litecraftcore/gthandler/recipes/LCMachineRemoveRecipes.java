package litecraftcore.gthandler.recipes;

import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;


public class LCMachineRemoveRecipes {

    public static void init(){
        removeRecipe(RecipeMaps.CENTRIFUGE_RECIPES, new ItemStack(Blocks.SOUL_SAND));
    }


    public static void removeRecipe(RecipeMap map, ItemStack... itemInputs) {
        List<ItemStack> inputs = new ArrayList<>(Arrays.asList(itemInputs));
        map.removeRecipe(map.findRecipe(2147483647L, inputs, new ArrayList<>()));
    }

    public static void removeRecipe(RecipeMap map, FluidStack... fluidInputs) {
        List<FluidStack> inputs = new ArrayList<>(Arrays.asList(fluidInputs));
        map.removeRecipe(map.findRecipe(2147483647L, new ArrayList<>(), inputs));
    }

    public static void removeRecipe(RecipeMap map, ItemStack[] itemInputs, FluidStack[] fluidInputs) {
        List<ItemStack> itemIn = new ArrayList<>(Arrays.asList(itemInputs));
        List<FluidStack> fluidIn = new ArrayList<>(Arrays.asList(fluidInputs));
        map.removeRecipe(map.findRecipe(2147483647L, itemIn, fluidIn));
    }

    @SuppressWarnings("unchecked")
    public static void removeRecipesAll(RecipeMap map) {
        List<Recipe> recipes = new ArrayList<>(map.getRecipeList());
        for(Recipe r: recipes) {
            map.removeRecipe(r);
        }
    }
}
