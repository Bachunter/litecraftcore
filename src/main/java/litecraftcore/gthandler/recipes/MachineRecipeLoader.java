package litecraftcore.gthandler.recipes;

import gregicadditions.GAMaterials;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.GTValues;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.LCValues;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Loader;

public class MachineRecipeLoader {
    public static void init() {

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
                .input(OrePrefix.dust, Materials.Ash)
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
                .input(OrePrefix.dust, Materials.Iron, 4)
                .input(OrePrefix.dust, Materials.Gold)
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

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .duration(100).EUt(4)
                .inputs(ModHandler.getModItem("biomesoplenty", "flesh", 1))
                .outputs(OreDictUnifier.get(OrePrefix.dust, GAMaterials.Meat, 2))
                .chancedOutput(OreDictUnifier.get(OrePrefix.dust, GAMaterials.Meat), 9000)
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
}