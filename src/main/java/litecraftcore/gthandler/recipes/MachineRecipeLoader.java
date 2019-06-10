package litecraftcore.gthandler.recipes;

import gregicadditions.GAMaterials;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.recipes.ModHandler;
import gregtech.api.recipes.RecipeMaps;
import gregtech.api.unification.OreDictUnifier;
import gregtech.api.unification.material.MarkerMaterials;
import gregtech.api.unification.material.Materials;
import gregtech.api.unification.ore.OrePrefix;
import gregtech.common.items.MetaItems;
import litecraftcore.gthandler.LCMaterials;
import litecraftcore.gthandler.ModNameValues;
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
                .input(OrePrefix.dust, Materials.Iron, 9)
                .inputs(new ItemStack(Items.SLIME_BALL, 2))
                .inputs(new ItemStack(Items.ROTTEN_FLESH, 2))
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


        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .duration(100).EUt(4)
                .inputs(ModHandler.getModItem("biomesoplenty", "flesh", 1))
                .chancedOutput(new ItemStack(Items.ROTTEN_FLESH, 1), 1000)
                .buildAndRegister();

        if(Loader.isModLoaded(ModNameValues.SimplyJetpacks) && Loader.isModLoaded(ModNameValues.GregicAdditions)) {
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