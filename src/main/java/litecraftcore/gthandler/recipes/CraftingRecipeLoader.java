package litecraftcore.gthandler.recipes;

import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import litecraftcore.blocks.LCBlocks;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.LCValues;
import litecraftcore.items.LCMetaItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

public class CraftingRecipeLoader {

    public static void init(){

        ModHandler.addShapedRecipe("construction_alloy_bars", new ItemStack(LCBlocks.construction_alloy_bars, 8), " w ", "XXX", "XXX", 'X', new UnificationEntry(OrePrefix.stick, LCMaterials.ConstructionAlloy));
        ModHandler.addShapedRecipe("soularium_bars"         , new ItemStack(LCBlocks.soularium_bars         , 8), " w ", "XXX", "XXX", 'X', new UnificationEntry(OrePrefix.stick, LCMaterials.Soularium));
        ModHandler.addShapedRecipe("stainless_steel_bars"   , new ItemStack(LCBlocks.stainless_steel_bars   , 8), " w ", "XXX", "XXX", 'X', new UnificationEntry(OrePrefix.stick, Materials  .StainlessSteel));
        ModHandler.addShapedRecipe("titanium_bars"          , new ItemStack(LCBlocks.titanium_bars          , 8), " w ", "XXX", "XXX", 'X', new UnificationEntry(OrePrefix.stick, Materials  .Titanium));

        ModHandler.addShapedRecipe("cover_interface", LCMetaItems.cover_interface.getStackForm(),
                "PRP",
                "GAB",
                "PDP",
                'P', new UnificationEntry(OrePrefix.plate, Materials.Aluminium),
                'A', new UnificationEntry(OrePrefix.plate, Materials.Glass),
                'D', new UnificationEntry(OrePrefix.dust, Materials.Glowstone),
                'R', new UnificationEntry(OrePrefix.dye, MarkerMaterials.Color.Red),
                'G', new UnificationEntry(OrePrefix.dye, MarkerMaterials.Color.Green),
                'B', new UnificationEntry(OrePrefix.dye, MarkerMaterials.Color.Blue));

        
        if(GTValues.isModLoaded(LCValues.ModName.EnderIO)) {
            ModHandler.addShapelessRecipe("RedstoneAlloy" , OreDictUnifier.get(OrePrefix.dust, LCMaterials.RedstoneAlloy , 3), "dustCopper", "dustSilicon", "dustRedstone");
            ModHandler.addShapelessRecipe("Conductiveiron", OreDictUnifier.get(OrePrefix.dust, LCMaterials.ConductiveIron, 4), "dustInvar", "dustInvar", "dustAlumite", "dustRedstone");
            ModHandler.addShapelessRecipe("EnergeticAlloy", OreDictUnifier.get(OrePrefix.dust, LCMaterials.EnergeticAlloy, 6), "dustGold", "dustGold", "dustGold", "dustManganese", "dustGlowstone", "dustRedstone");
            ModHandler.addShapelessRecipe("PulsatingIron" , OreDictUnifier.get(OrePrefix.dust, LCMaterials.PulsatingIron , 4), "dustIron", "dustChrome", "dustAlumite", "dustEnderPearl");
            ModHandler.addShapelessRecipe("VibrantAlloy"  , OreDictUnifier.get(OrePrefix.dust, LCMaterials.VibrantAlloy  , 4), "dustEnergeticAlloy", "dustEnergeticAlloy", "dustPlatinum", "dustEnderPearl");

            ModHandler.addShapelessRecipe("ConstructionAlloy", OreDictUnifier.get(OrePrefix.dust, LCMaterials.ConstructionAlloy, 9), "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustSilicon");
        }

        if (GTValues.isModLoaded(LCValues.ModName.Tconstruct)) {
            ModHandler.addShapelessRecipe("Alumite", OreDictUnifier.get(OrePrefix.dust, LCMaterials.Alumite, 9), "dustAluminium", "dustAluminium", "dustSteel", "dustAluminium", "dustAluminium", "dustSteel", "dustAluminium", "dustObsidian", "dustObsidian");
        }

        if (GTValues.isModLoaded(LCValues.ModName.PlusTiC)) {
            ModHandler.addShapelessRecipe("Alubrass", OreDictUnifier.get(OrePrefix.dust, LCMaterials.AluminumBrass, 4), "dustAluminium", "dustAluminium", "dustAluminium", "dustCopper");
        }
    }

}
