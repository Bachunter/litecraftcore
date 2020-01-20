package litecraftcore.blocks;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import litecraftcore.gthandler.LCMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class LCBlocks {

    private LCBlocks(){}
    /**
     * Важно чтобы сначала объявлялись блоки, а потом уже собирались в общий список потому что айтемы в конструкторе
     * класса добавляются в коллекцию и из неё уже потом попадают в LIST_BLOCKS
     */

    public static Block construction_alloy_bars = new BarsPane("construction_alloy_bars", 5.0F, 10F);
    public static Block soularium_bars = new BarsPane("soularium_bars", 5.0F, 15F);
    public static Block stainless_steel_bars = new BarsPane("stainless_steel_bars", 5.0F, 20F);
    public static Block titanium_bars = new BarsPane("titanium_bars", 5.0F, 25F);

    public static Block sign1 = new DecorateBlock("sign1");
    public static Block sign2 = new DecorateBlock("sign2");
    public static Block sign3 = new DecorateBlock("sign3");
    public static Block sign4 = new DecorateBlock("sign4");
    public static Block sign5 = new DecorateBlock("sign5");
    public static Block sign6 = new DecorateBlock("sign6");
    public static Block sign7 = new DecorateBlock("sign7");
    public static Block sign8 = new DecorateBlock("sign8");
    public static Block sign9 = new DecorateBlock("sign9");
    public static Block sign10 = new DecorateBlock("sign10");
    public static Block sign11 = new DecorateBlock("sign11");
    public static Block sign12 = new DecorateBlock("sign12");
    public static Block sign13 = new DecorateBlock("sign13");
    public static Block sign14 = new DecorateBlock("sign14");
    public static Block sign15 = new DecorateBlock("sign15");
    public static Block sign16 = new DecorateBlock("sign16");
    public static Block sign17 = new DecorateBlock("sign17");
    public static Block sign18 = new DecorateBlock("sign18");
    public static Block sign19 = new DecorateBlock("sign19");
    public static Block sign20 = new DecorateBlock("sign20");
    public static Block sign21 = new DecorateBlock("sign21");
    public static Block sign22 = new DecorateBlock("sign22");
    public static Block sign23 = new DecorateBlock("sign23");
    public static Block sign24 = new DecorateBlock("sign24");
    public static Block sign25 = new DecorateBlock("sign25");
    public static Block sign26 = new DecorateBlock("sign26");
    public static Block sign27 = new DecorateBlock("sign27");
    public static Block sign28 = new DecorateBlock("sign28");
    public static Block sign29 = new DecorateBlock("sign29");
    public static Block sign30 = new DecorateBlock("sign30");
    public static Block sign31 = new DecorateBlock("sign31");
    public static Block sign32 = new DecorateBlock("sign32");
    public static Block sign33 = new DecorateBlock("sign33");
    public static Block sign34 = new DecorateBlock("sign34");
    public static Block sign35 = new DecorateBlock("sign35");
    public static Block sign36 = new DecorateBlock("sign36");

    public static Block tile_blue = new DecorateBlock("tile_blue");
    public static Block tile_bone_mill = new DecorateBlock("tile_bone_mill");
    public static Block tile_brown = new DecorateBlock("tile_brown");
    public static Block tile_cyan = new DecorateBlock("tile_cyan");
    public static Block tile_empty = new DecorateBlock("tile_empty");
    public static Block tile_empty_random = new DecorateBlock("tile_empty_random");
    public static Block tile_full_color = new DecorateBlock("tile_full_color");
    public static Block tile_green = new DecorateBlock("tile_green");
    public static Block tile_lapis = new DecorateBlock("tile_lapis");
    public static Block tile_light_gray = new DecorateBlock("tile_light_gray");
    public static Block tile_lime = new DecorateBlock("tile_lime");
    public static Block tile_magenta = new DecorateBlock("tile_magenta");
    public static Block tile_orange = new DecorateBlock("tile_orange");
    public static Block tile_purple = new DecorateBlock("tile_purple");
    public static Block tile_red = new DecorateBlock("tile_red");
    public static Block tile_solid_steel = new DecorateBlock("tile_solid_steel");
    public static Block tile_yellow = new DecorateBlock("tile_yellow");

    private static List<Block> LIST_BLOCKS = new ArrayList<>();

    /**
     * Здесь все коллеции собираются в одну общую коллекцию из которой уже объекты регистрируются
     */
    static  {
        LIST_BLOCKS.addAll(BarsPane.getBarsPaneList());
        LIST_BLOCKS.addAll(DecorateBlock.getDecorateBlockList());
    }


    public static List<Block> getListBlocks(){
        return LIST_BLOCKS;
    }

    public static void registerRecipes(){
        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .EUt(4).duration(300)
                .circuitMeta(3)
                .input(OrePrefix.stick, LCMaterials.ConstructionAlloy, 3)
                .outputs(new ItemStack(construction_alloy_bars, 4))
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .EUt(4).duration(300)
                .circuitMeta(3)
                .input(OrePrefix.stick, LCMaterials.Soularium, 3)
                .outputs(new ItemStack(soularium_bars, 4))
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .EUt(4).duration(300)
                .input(OrePrefix.stick, Materials.StainlessSteel, 3)
                .outputs(new ItemStack(stainless_steel_bars, 4))
                .circuitMeta(3)
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .EUt(4).duration(300)
                .circuitMeta(3)
                .input(OrePrefix.stick, Materials.Titanium, 3)
                .outputs(new ItemStack(titanium_bars, 4))
                .buildAndRegister();
    }
}
