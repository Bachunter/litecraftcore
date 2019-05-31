package litecraftcore.gthandler.recipes;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.UnificationEntry;
import gregtech.common.items.MetaItems;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.ModNameValues;
import net.minecraftforge.fml.common.Loader;

public class CraftingRecipeLoader {

    public static void init(){
        ModHandler.addShapelessRecipe("RedstoneAlloy", OreDictUnifier.get(OrePrefix.dust, LCMaterials.RedstoneAlloy, 3), "dustCopper", "dustSilicon", "dustRedstone");
        ModHandler.addShapelessRecipe("Conductiveiron", OreDictUnifier.get(OrePrefix.dust, LCMaterials.ConductiveIron, 4), "dustInvar", "dustInvar", "dustAlumite", "dustRedstone");
        ModHandler.addShapelessRecipe("EnergeticAlloy", OreDictUnifier.get(OrePrefix.dust, LCMaterials.EnergeticAlloy, 6), "dustGold",  "dustGold", "dustGold", "dustManganese", "dustGlowstone", "dustRedstone");
        ModHandler.addShapelessRecipe("PulsatingIron", OreDictUnifier.get(OrePrefix.dust, LCMaterials.PulsatingIron, 4), "dustIron", "dustChrome", "dustAlumite", "dustEnderPearl");
        ModHandler.addShapelessRecipe("VibrantAlloy", OreDictUnifier.get(OrePrefix.dust, LCMaterials.VibrantAlloy, 4), "dustEnergeticAlloy", "dustEnergeticAlloy", "dustPlatinum", "dustEnderPearl");

        ModHandler.addShapelessRecipe("ConstructionAlloy", OreDictUnifier.get(OrePrefix.dust, LCMaterials.ConstructionAlloy, 9), "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustTinAlloy", "dustSilicon");
        ModHandler.addShapelessRecipe("DarkSteel", OreDictUnifier.get(OrePrefix.dust, LCMaterials.DarkSteel, 9), "dustSteel", "dustSteel", "dustBlackBronze", "dustSteel", "dustSteel", "dustBlackBronze", "dustSteel", "dustVanadium", "dustObsidian");
        ModHandler.addShapelessRecipe("ElectricalSteel", OreDictUnifier.get(OrePrefix.dust, LCMaterials.ElectricalSteel, 9), "dustSteel", "dustSteel", "dustSteel", "dustSteel", "dustSteel", "dustSteel", "dustSteel", "dustSilicon", "dustNeodymium");
        ModHandler.addShapelessRecipe("EndSteel", OreDictUnifier.get(OrePrefix.dust, LCMaterials.EndSteel, 6), "dustSteel", "dustSteel", "dustSteel", "dustSteel", "dustSteel", "dustEndstone");
        ModHandler.addShapelessRecipe("Soularium", OreDictUnifier.get(OrePrefix.dust, LCMaterials.Soularium, 6), "dustIron", "dustIron", "dustIron", "dustIron", "dustGold", "dustSoulSand");

        ModHandler.addShapelessRecipe("Alumite", OreDictUnifier.get(OrePrefix.dust, LCMaterials.Alumite, 9), "dustAluminium", "dustAluminium", "dustSteel", "dustAluminium", "dustAluminium", "dustSteel", "dustAluminium", "dustObsidian", "dustObsidian");

        ModHandler.addShapelessRecipe("Alubrass", OreDictUnifier.get(OrePrefix.dust, LCMaterials.AluminumBrass, 4), "dustAluminium", "dustAluminium", "dustAluminium", "dustCopper");

        if(Loader.isModLoaded(ModNameValues.SimplyJetpacks)) {
            ModHandler.addShapelessRecipe("DarkSoularium", OreDictUnifier.get(OrePrefix.dust, LCMaterials.DarkSoularium, 6), "dustDarkSteel", "dustDarkSteel", "dustDarkSteel", "dustDarkSteel", "dustSoularium", "dustPulsatingIron");
        }
    }

}
