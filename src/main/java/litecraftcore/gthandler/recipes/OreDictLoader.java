package litecraftcore.gthandler.recipes;

import gregtech.api.recipes.ModHandler;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.ore.OrePrefix;
import litecraftcore.blocks.LCBlocks;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.ModNameValues;
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

        if (Loader.isModLoaded(ModNameValues.EnderIO)){
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.EnderIO, "block_end_iron_bars", 1), "barsEndSteel");
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.EnderIO, "block_dark_iron_bars", 1), "barsDarkSteel");
        }

        if (Loader.isModLoaded(ModNameValues.ExtremeReactors)){
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.ExtremeReactors, "mineralanglesite", 1), OrePrefix.gem, LCMaterials.Anglesite);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.ExtremeReactors, "mineralbenitoite", 1), OrePrefix.gem, LCMaterials.Benitoite);
        }

        if(Loader.isModLoaded(ModNameValues.Avaritia)){
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "resource", 1, 2), OrePrefix.dustTiny, LCMaterials.CosmicNeutronium);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "resource", 1, 3), OrePrefix.nugget, LCMaterials.CosmicNeutronium);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "resource", 1, 4), OrePrefix.ingot, LCMaterials.CosmicNeutronium);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "block_resource", 1), OrePrefix.block, LCMaterials.CosmicNeutronium);

            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "resource", 1, 5), OrePrefix.ingot, LCMaterials.InfinityCatalyst);

            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "resource", 1, 6), OrePrefix.ingot, LCMaterials.Infinity);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.Avaritia, "block_resource", 1, 1), OrePrefix.block, LCMaterials.Infinity);
        }

        if(Loader.isModLoaded(ModNameValues.SimplyJetpacks)) {
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.SimplyJetpacks, "metaitemmods", 1, 3), OrePrefix.ingot, LCMaterials.DarkSoularium);
        }

        if(Loader.isModLoaded(ModNameValues.GalacticraftPlanets)) {
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.GalacticraftPlanets, "item_basic_mars", 1, 1), OrePrefix.stick, LCMaterials.Desh);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.GalacticraftPlanets, "item_basic_mars", 1, 2), OrePrefix.ingot, LCMaterials.Desh);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.GalacticraftPlanets, "basic_block_core", 1, 12), OrePrefix.block, LCMaterials.Desh);
        }

        if(Loader.isModLoaded(ModNameValues.PlusTiC)){
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.PlusTiC, "alumitenugget", 1), OrePrefix.nugget, LCMaterials.Alumite);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.PlusTiC, "alumiteingot", 1), OrePrefix.ingot, LCMaterials.Alumite);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.PlusTiC, "alumiteblock", 1), OrePrefix.block, LCMaterials.Alumite);

        }

        if(Loader.isModLoaded(ModNameValues.ProjectRedCore)){
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.ProjectRedCore, "resource_item", 1, 104), OrePrefix.ingot, LCMaterials.ElectrotineAlloy);
            OreDictUnifier.registerOre(ModHandler.getModItem(ModNameValues.ProjectRedCore, "resource_item", 1, 105), OrePrefix.dust, LCMaterials.Electrotine);

        }
    }
}
