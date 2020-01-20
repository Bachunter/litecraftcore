package litecraftcore.gthandler.recipes;

import gregicadditions.GAMaterials;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.api.unification.stack.MaterialStack;
import gregtech.common.items.MetaItems;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.LCValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

public class MachineRecipeLoader {
    public static void init() {
        registerAlloySmelterRecipes();

        RecipeMaps.BLAST_RECIPES.recipeBuilder()
                .duration(600).EUt(120)
                .input(OrePrefix.ingot, Materials.Cobalt)
                .input(OrePrefix.ingot, LCMaterials.Ardite)
                .outputs(OreDictUnifier.get(OrePrefix.ingotHot, LCMaterials.Manyullyn, 2))
                .blastFurnaceTemp(LCMaterials.Manyullyn.blastFurnaceTemperature)
                .buildAndRegister();

        RecipeMaps.CENTRIFUGE_RECIPES.recipeBuilder()
                .duration(200).EUt(80)
                .inputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.SoulSand))
                .chancedOutput(OreDictUnifier.get(OrePrefix.dustSmall, Materials.Saltpeter), 8000)
                .chancedOutput(new ItemStack(Blocks.SAND), 9000)
                .chancedOutput(OreDictUnifier.get(OrePrefix.dustTiny, Materials.Coal), 2000)
                .fluidOutputs(Materials.Oil.getFluid(80))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(400).EUt(120)
                .input(OrePrefix.dust, Materials.Iron)
                .input(OrePrefix.dust, Materials.Boron)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Ferroboron, 2))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Thorium)
                .fluidInputs(Materials.Oxygen.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.ThoriumOxide))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Uranium)
                .fluidInputs(Materials.Oxygen.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.UraniumOxide))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Manganese)
                .fluidInputs(Materials.Oxygen.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.ManganeseOxide))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, LCMaterials.ManganeseOxide)
                .fluidInputs(Materials.Oxygen.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.ManganeseDioxide))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Magnesium)
                .input(OrePrefix.dust, Materials.Boron, 2)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.MagnesiumDiboride))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Calcium)
                .fluidInputs(Materials.AceticAcid.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.CalciumSulfate))
                .fluidOutputs(Materials.Hydrogen.getFluid(1000))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Sodium)
                .fluidInputs(Materials.HydrofluoricAcid.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.SodiumFluoride))
                .fluidOutputs(Materials.Hydrogen.getFluid(1000))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Potassium)
                .fluidInputs(ModHandler.getWater(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.PotassiumHydroxide))
                .fluidOutputs(Materials.Hydrogen.getFluid(500))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(200).EUt(120)
                .input(OrePrefix.dust, Materials.Potassium)
                .fluidInputs(Materials.HydrofluoricAcid.getFluid(1000))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.PotassiumFluoride))
                .fluidOutputs(Materials.Hydrogen.getFluid(1000))
                .buildAndRegister();

        RecipeMaps.ELECTROLYZER_RECIPES.recipeBuilder()
                .duration(600).EUt(1920)
                .input(OrePrefix.dust, LCMaterials.Benitoite, 14)
                .outputs(
                        OreDictUnifier.get(OrePrefix.dust, Materials.Barium),
                        OreDictUnifier.get(OrePrefix.dust, Materials.Rutile),
                        OreDictUnifier.get(OrePrefix.dust, Materials.Silicon, 3)
                )
                .fluidOutputs(Materials.Oxygen.getFluid(7000))
                .buildAndRegister();


        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .duration(100).EUt(4)
                .inputs(new ItemStack(Blocks.SOUL_SAND))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.SoulSand))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .input(OrePrefix.dust, Materials.Titanium, 12)
                .input(OrePrefix.dust, LCMaterials.Alumite, 4)
                .input(OrePrefix.dust, Materials.Redstone, 4)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Signalum, 20))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .input(OrePrefix.dust, LCMaterials.DarkSteel, 8)
                .inputs(new ItemStack(Items.SLIME_BALL, 16))
                .inputs(new ItemStack(Items.ROTTEN_FLESH, 4))
                .input(OrePrefix.dust, Materials.Ash, 4)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Knightslime, 10))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(1920)
                .input(OrePrefix.dust, Materials.Platinum, 4)
                .input(OrePrefix.dust, Materials.Lanthanum)
                .input(OrePrefix.dust, Materials.Lutetium)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Lumium, 6))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(900).EUt(480)
                .input(OrePrefix.dust, Materials.VanadiumSteel, 6)
                .input(OrePrefix.dust, Materials.BlackBronze, 2)
                .input(OrePrefix.dust, Materials.Obsidian)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.DarkSteel, 9))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(800).EUt(120)
                .input(OrePrefix.dust, Materials.Steel, 7)
                .input(OrePrefix.dust, Materials.Silicon)
                .input(OrePrefix.dust, Materials.Vanadium)
                .input(OrePrefix.dust, Materials.Neodymium)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.ElectricalSteel, 10))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(1920)
                .input(OrePrefix.dust, LCMaterials.DarkSteel)
                .input(OrePrefix.dust, Materials.Titanium)
                .input(OrePrefix.dust, Materials.Endstone)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.EndSteel, 3))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(1200).EUt(480)
                .input(OrePrefix.dust, Materials.Gold, 4)
                .input(OrePrefix.dust, Materials.SterlingSilver)
                .input(OrePrefix.dust, LCMaterials.SoulSand)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Soularium, 6))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(30720)
                .input(OrePrefix.dust, LCMaterials.DarkSteel, 4)
                .input(OrePrefix.dust, LCMaterials.Soularium)
                .input(OrePrefix.dust, LCMaterials.PulsatingIron)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.DarkSoularium, 6))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(1920)
                .input(OrePrefix.dust, Materials.Titanium, 7)
                .input(OrePrefix.dust, Materials.Aluminium, 3)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.TitaniumAluminide, 10))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(1920)
                .input(OrePrefix.dust, Materials.Titanium)
                .input(OrePrefix.dust, Materials.Iridium)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.TitaniumIridium, 2))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(480)
                .input(OrePrefix.dust, Materials.Iron, 15)
                .inputs(ModHandler.getModItem(LCValues.ModName.Nuclearcraft, "compound", 1, 9))
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.HSLASteel, 16))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(300).EUt(30)
                .input(OrePrefix.dust, Materials.Graphite, 2)
                .input(OrePrefix.dust, Materials.Diamond)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.HardCarbon, 3))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(300).EUt(120)
                .input(OrePrefix.dust, LCMaterials.Zirconium, 7)
                .input(OrePrefix.dust, Materials.Tin)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Zircaloy, 8))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(600).EUt(1920)
                .input(OrePrefix.dust, LCMaterials.Extreme)
                .input(OrePrefix.dust, LCMaterials.BoronArsenide)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Thermoconducting))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(300).EUt(120)
                .input(OrePrefix.dust, LCMaterials.ManganeseDioxide)
                .input(OrePrefix.dust, Materials.Lithium)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.LithiumManganeseDioxide, 2))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(300).EUt(120)
                .input(OrePrefix.dust, LCMaterials.Ferroboron)
                .input(OrePrefix.dust, Materials.Lithium)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Tough, 2))
                .buildAndRegister();

        RecipeMaps.MIXER_RECIPES.recipeBuilder()
                .duration(300).EUt(480)
                .input(OrePrefix.dust, LCMaterials.Tough)
                .input(OrePrefix.dust, LCMaterials.HardCarbon)
                .outputs(OreDictUnifier.get(OrePrefix.dust, LCMaterials.Thermoconducting, 2))
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .duration(100).EUt(4)
                .inputs(ModHandler.getModItem("biomesoplenty", "flesh", 1))
                .outputs(OreDictUnifier.get(OrePrefix.dust, GAMaterials.Meat, 2))
                .chancedOutput(OreDictUnifier.get(OrePrefix.dust, GAMaterials.Meat), 9000)
                .buildAndRegister();

        RecipeMaps.IMPLOSION_RECIPES.recipeBuilder()
                .explosivesAmount(1)
                .input(OrePrefix.dust, LCMaterials.HardCarbon)
                .outputs(OreDictUnifier.get(OrePrefix.ingot, LCMaterials.HardCarbon))
                .buildAndRegister();

        if(GTValues.isModLoaded(LCValues.ModName.SimplyJetpacks)) {
            GARecipeMaps.ASSEMBLY_LINE_RECIPES.recipeBuilder()
                    .duration(600).EUt(30720)
                    .input(OrePrefix.plate, LCMaterials.DarkSoularium, 12)
                    .input(OrePrefix.circuit, MarkerMaterials.Tier.Master, 3)
                    .inputs(ModHandler.getModItem("simplyjetpacks", "metaitemmods", 2, 11))
                    .inputs(ModHandler.getModItem("simplyjetpacks", "metaitemmods", 2, 6))
                    .input(OrePrefix.wireGtSingle, GAMaterials.LuVSuperconductor, 6)
                    .inputs(MetaItems.ENERGY_LAPOTRONIC_ORB2.getStackForm(1))
                    .outputs(ModHandler.getModItem("simplyjetpacks", "itemjetpack", 1, 9))
                    .buildAndRegister();
        }
    }

    private static void registerAlloySmelterRecipes(){
        MaterialStack[][] alloySmelterList = {
                {new MaterialStack(Materials.Copper, 3), new MaterialStack(Materials.Silver, 1), new MaterialStack(LCMaterials.Shibuichi, 4)},
                {new MaterialStack(Materials.Tin, 3), new MaterialStack(Materials.Silver, 1), new MaterialStack(LCMaterials.TinSilver, 4)},
                {new MaterialStack(Materials.Lead, 3), new MaterialStack(Materials.Platinum, 1), new MaterialStack(LCMaterials.LeadPlatinum, 4)}};

        for (MaterialStack[] stack : alloySmelterList) {
            if (stack[0].material instanceof IngotMaterial) {
                RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                        .duration((int) stack[2].amount * 50).EUt(16)
                        .input(OrePrefix.ingot, stack[0].material, (int) stack[0].amount)
                        .input(OrePrefix.dust, stack[1].material, (int) stack[1].amount)
                        .outputs(OreDictUnifier.get(OrePrefix.ingot, stack[2].material, (int) stack[2].amount))
                        .buildAndRegister();
            }
            if (stack[1].material instanceof IngotMaterial) {
                RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                        .duration((int) stack[2].amount * 50).EUt(16)
                        .input(OrePrefix.dust, stack[0].material, (int) stack[0].amount)
                        .input(OrePrefix.ingot, stack[1].material, (int) stack[1].amount)
                        .outputs(OreDictUnifier.get(OrePrefix.ingot, stack[2].material, (int) stack[2].amount))
                        .buildAndRegister();
            }
            if (stack[0].material instanceof IngotMaterial && stack[1].material instanceof IngotMaterial) {
                RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                        .duration((int) stack[2].amount * 50).EUt(16)
                        .input(OrePrefix.ingot, stack[0].material, (int) stack[0].amount)
                        .input(OrePrefix.ingot, stack[1].material, (int) stack[1].amount)
                        .outputs(OreDictUnifier.get(OrePrefix.ingot, stack[2].material, (int) stack[2].amount))
                        .buildAndRegister();
            }
            RecipeMaps.ALLOY_SMELTER_RECIPES.recipeBuilder()
                    .duration((int) stack[2].amount * 50).EUt(16)
                    .input(OrePrefix.dust, stack[0].material, (int) stack[0].amount)
                    .input(OrePrefix.dust, stack[1].material, (int) stack[1].amount)
                    .outputs(OreDictUnifier.get(OrePrefix.ingot, stack[2].material, (int) stack[2].amount))
                    .buildAndRegister();
        }
    }
}





























