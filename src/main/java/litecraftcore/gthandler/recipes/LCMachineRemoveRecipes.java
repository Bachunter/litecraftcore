package litecraftcore.gthandler.recipes;

import gregtech.api.recipes.Recipe;
import gregtech.api.recipes.RecipeMap;
import gregtech.api.recipes.RecipeMaps;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidStack;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LCMachineRemoveRecipes {

    public static void init(){
        removeRecipe(RecipeMaps.CENTRIFUGE_RECIPES, new ItemStack(Blocks.SOUL_SAND));
    }


    public static void removeRecipe(RecipeMap map, ItemStack... itemInputs) {
        List<ItemStack> inputs = new ArrayList<>(Arrays.asList(itemInputs));
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, inputs, Collections.emptyList()));
    }

    public static void removeRecipe(RecipeMap map, FluidStack... fluidInputs) {
        List<FluidStack> inputs = new ArrayList<>(Arrays.asList(fluidInputs));
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, Collections.emptyList(), inputs));
    }

    public static void removeRecipe(RecipeMap map, ItemStack[] itemInputs, FluidStack[] fluidInputs) {
        List<ItemStack> itemIn = new ArrayList<>(Arrays.asList(itemInputs));
        List<FluidStack> fluidIn = new ArrayList<>(Arrays.asList(fluidInputs));
        map.removeRecipe(map.findRecipe(Integer.MAX_VALUE, itemIn, fluidIn));
    }

    @SuppressWarnings("unchecked")
    public static void removeRecipesAll(RecipeMap map) {
        List<Recipe> recipes = new ArrayList<>(map.getRecipeList());
        recipes.forEach(map::removeRecipe);
    }
}
