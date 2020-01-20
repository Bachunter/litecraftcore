package litecraftcore.items;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import litecraftcore.gthandler.LCMaterials;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public final class LCItems {

    /**
     * Важно чтобы сначала объявлялись айтемы, а потом уже собирались в общий список потому что айтемы в конструкторе
     * класса добавляются в коллекцию и из неё уже потом попадают в LIST_ITEMS
     */

    public static Item bronze_shears = new LCShears("bronze_shears", 192);
    public static Item steel_shears = new LCShears("steel_shears", 512);
    public static Item stainless_steel_shears = new LCShears("stainless_steel_shears", 480);
    public static Item blue_steel_shears = new LCShears("blue_steel_shears", 1024);
    public static Item red_steel_shears = new LCShears("red_steel_shears", 896);

    private static List<Item> LIST_ITEMS = new ArrayList<>();

    /**
     * Здесь все коллекции собираются в одну общую коллекцию из которой уже объекты регистрируются
     */
    static {
        LIST_ITEMS.addAll(LCShears.getShearsList());
    }

    public static List<Item> getListItems(){
        return LIST_ITEMS;
    }


    /**
     * Символы обязательно надо приводить к типу Character ибо 'h' instanceof Character нихуя не true, а вот
     * (Character)'h' instanceof Character совсем другое дело :3
     * Это справедливо только для метода addShapelessRecipe(String, ItemStack, Object...)
     */
    public static void registerRecipes(){
        ModHandler.addShapelessRecipe("bronze_shears", new ItemStack(bronze_shears),
                (Character)'h', new UnificationEntry(OrePrefix.plate, Materials.Bronze),
                new UnificationEntry(OrePrefix.plate, Materials.Bronze), (Character)'f');

        ModHandler.addShapelessRecipe("steel_shears", new ItemStack(steel_shears),
                (Character)'h', new UnificationEntry(OrePrefix.plate, Materials.Steel),
                new UnificationEntry(OrePrefix.plate, Materials.Steel), (Character)'f');

        ModHandler.addShapelessRecipe("stainless_steel_shears", new ItemStack(stainless_steel_shears),
                (Character)'h', new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel),
                new UnificationEntry(OrePrefix.plate, Materials.StainlessSteel), (Character)'f');

        ModHandler.addShapelessRecipe("blue_steel_shears", new ItemStack(blue_steel_shears),
                (Character)'h', new UnificationEntry(OrePrefix.plate, Materials.BlueSteel),
                new UnificationEntry(OrePrefix.plate, Materials.BlueSteel), (Character)'f');

        ModHandler.addShapelessRecipe("red_steel_shears", new ItemStack(red_steel_shears),
                (Character)'h', new UnificationEntry(OrePrefix.plate, Materials.RedSteel),
                new UnificationEntry(OrePrefix.plate, Materials.RedSteel), (Character)'f');
    }
}
