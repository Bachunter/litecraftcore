package litecraftcore.blocks;

import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import litecraftcore.gthandler.LCMaterials;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCBlocks {

    private static List<Block> LIST_BLOCKS = new ArrayList<>();

    public static BarsPane construction_alloy_bars;
    public static BarsPane soularium_bars;
    public static BarsPane stainless_steel_bars;
    public static BarsPane titanium_bars;

    static {
        LIST_BLOCKS.addAll(Arrays.asList(
                construction_alloy_bars = new BarsPane("construction_alloy_bars", 5.0F, 10F),
                soularium_bars = new BarsPane("soularium_bars", 5.0F, 15F),
                stainless_steel_bars = new BarsPane("stainless_steel_bars", 5.0F, 20F),
                titanium_bars = new BarsPane("titanium_bars", 5.0F, 25F)
                )
        );
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
