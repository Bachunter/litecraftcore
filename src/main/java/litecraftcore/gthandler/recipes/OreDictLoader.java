package litecraftcore.gthandler.recipes;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import litecraftcore.blocks.LCBlocks;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.LCValues;
import litecraftcore.items.LCMetaItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

public class OreDictLoader {
    public static void init(){

        OreDictUnifier.registerOre(new ItemStack(LCBlocks.construction_alloy_bars), "barsConstructionAlloy");
        OreDictUnifier.registerOre(new ItemStack(LCBlocks.stainless_steel_bars), "barsStainlessSteel");
        OreDictUnifier.registerOre(new ItemStack(LCBlocks.soularium_bars), "barsSoularium");
        OreDictUnifier.registerOre(new ItemStack(LCBlocks.titanium_bars), "barsTitanium");

        OreDictUnifier.registerOre(LCMetaItems.charged_certus_quartz_dust.getStackForm(), "dustChargedCertusQuartz");

        if (Loader.isModLoaded(LCValues.ModName.EnderIO)){
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.EnderIO, "block_end_iron_bars", 1), "barsEndSteel");
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.EnderIO, "block_dark_iron_bars", 1), "barsDarkSteel");
        }

        if (Loader.isModLoaded(LCValues.ModName.ExtremeReactors)){
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.ExtremeReactors, "mineralanglesite", 1), OrePrefix.gem, LCMaterials.Anglesite);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.ExtremeReactors, "mineralbenitoite", 1), OrePrefix.gem, LCMaterials.Benitoite);
        }

        if(Loader.isModLoaded(LCValues.ModName.Avaritia)){
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "resource", 1, 2), OrePrefix.dustTiny, LCMaterials.CosmicNeutronium);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "resource", 1, 3), OrePrefix.nugget, LCMaterials.CosmicNeutronium);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "resource", 1, 4), OrePrefix.ingot, LCMaterials.CosmicNeutronium);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "block_resource", 1), OrePrefix.block, LCMaterials.CosmicNeutronium);

            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "resource", 1, 5), OrePrefix.ingot, LCMaterials.InfinityCatalyst);

            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "resource", 1, 6), OrePrefix.ingot, LCMaterials.Infinity);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.Avaritia, "block_resource", 1, 1), OrePrefix.block, LCMaterials.Infinity);
        }

        if (Loader.isModLoaded(LCValues.ModName.VulpesLibrary)){
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.VulpesLibrary, "productcrystal", 1, 0), OrePrefix.gem, LCMaterials.Dilithium);
        }

        if(Loader.isModLoaded(LCValues.ModName.SimplyJetpacks)) {
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.SimplyJetpacks, "metaitemmods", 1, 3), OrePrefix.ingot, LCMaterials.DarkSoularium);
        }

        if(Loader.isModLoaded(LCValues.ModName.GalacticraftPlanets)) {
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.GalacticraftPlanets, "item_basic_mars", 1, 1), OrePrefix.stick, LCMaterials.Desh);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.GalacticraftPlanets, "item_basic_mars", 1, 2), OrePrefix.ingot, LCMaterials.Desh);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.GalacticraftPlanets, "basic_block_core", 1, 12), OrePrefix.block, LCMaterials.Desh);
        }

        if(Loader.isModLoaded(LCValues.ModName.PlusTiC)){
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.PlusTiC, "alumitenugget", 1), OrePrefix.nugget, LCMaterials.Alumite);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.PlusTiC, "alumiteingot", 1), OrePrefix.ingot, LCMaterials.Alumite);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.PlusTiC, "alumiteblock", 1), OrePrefix.block, LCMaterials.Alumite);

        }

        if(Loader.isModLoaded(LCValues.ModName.ProjectRedCore)){
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.ProjectRedCore, "resource_item", 1, 104), OrePrefix.ingot, LCMaterials.ElectrotineAlloy);
            OreDictUnifier.registerOre(ModHandler.getModItem(LCValues.ModName.ProjectRedCore, "resource_item", 1, 105), OrePrefix.dust, LCMaterials.Electrotine);

        }
    }
}
