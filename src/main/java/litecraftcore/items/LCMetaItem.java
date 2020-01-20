package litecraftcore.items;

import gregicadditions.item.GAMetaItems;
import gregicadditions.recipes.GARecipeMaps;
import gregtech.api.items.materialitem.MaterialMetaItem;
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
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.Arrays;

import static litecraftcore.items.LCMetaItems.*;

public class LCMetaItem extends MaterialMetaItem {
    public LCMetaItem(){
        super();
    }

    private static final MaterialStack[] solderingList = {
            new MaterialStack(Materials.Tin, 2L),
            new MaterialStack(Materials.SolderingAlloy, 1L),
            new MaterialStack(Materials.Lead, 4L)
    };

    @Override
    public void registerSubItems(){
        HeavyDutyAlloyIngotT1 = addItem(0, "heavy_duty_alloy_ingot_t1");
        HeavyDutyAlloyIngotT2 = addItem(1, "heavy_duty_alloy_ingot_t2");
        HeavyDutyAlloyIngotT3 = addItem(2, "heavy_duty_alloy_ingot_t3");
        HeavyDutyAlloyIngotT4 = addItem(3, "heavy_duty_alloy_ingot_t4");
        HeavyDutyAlloyIngotT5 = addItem(4, "heavy_duty_alloy_ingot_t5");
        HeavyDutyAlloyIngotT6 = addItem(5, "heavy_duty_alloy_ingot_t6");

        RawSDHCAlloy = addItem(6, "raw_sdhc_alloy");

        processor_fluid_printed = addItem(7, "processor_fluid_printed");
        processor_fluid = addItem(8, "processor_fluid");

        core_printed_storage_component = addItem(9, "core_printed_storage_component");
        core_printed_fluid_storage_component = addItem(10, "core_printed_fluid_storage_component");
        core_printed_spatial_storage_component = addItem(11, "core_printed_spatial_storage_component");
        core_storage_component = addItem(12, "core_storage_component");
        core_fluid_storage_component = addItem(13, "core_fluid_storage_component");
        core_spatial_storage_component = addItem(14, "core_spatial_storage_component");

        cover_interface = addItem(15, "cover_interface");

        AE_CIRCUIT = addItem(16, "ae_circuit");
        ADV_AE_CIRCUIT = addItem(17, "adv_ae_circuit");
        FLUID_CIRCUIT = addItem(18, "fluid_circuit");
        AE_WAFER = addItem(19, "ae_wafer");
        AE_CHIP = addItem(20, "ae_chip");

        charged_certus_quartz_dust = addItem(21, "charged_certus_quartz_dust");

        basic_circuit_chip = addItem(22, "basic_circuit_chip");
        advanced_circuit_chip = addItem(23, "advanced_circuit_chip");

        printed_control_processor = addItem(24, "printed_control_processor");
        control_processor = addItem(25, "control_processor");
        printed_item_processor = addItem(26, "printed_item_processor");
        item_processor = addItem(27, "item_processor");
        redstone_matrix = addItem(28, "redstone_matrix");

    }

    public void registerRecipes(){
        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .inputs(LCMetaItems.core_printed_storage_component.getStackForm(),
                        ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 20))
                .fluidInputs(Materials.Redstone.getFluid(144))
                .outputs(LCMetaItems.core_storage_component.getStackForm())
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .inputs(LCMetaItems.core_printed_fluid_storage_component.getStackForm(),
                        ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 20))
                .fluidInputs(Materials.Redstone.getFluid(144))
                .outputs(LCMetaItems.core_fluid_storage_component.getStackForm())
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .inputs(LCMetaItems.core_printed_spatial_storage_component.getStackForm(),
                        ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 20))
                .fluidInputs(Materials.Redstone.getFluid(144))
                .outputs(LCMetaItems.core_spatial_storage_component.getStackForm())
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200).EUt(30)
                .inputs(LCMetaItems.processor_fluid_printed.getStackForm(),
                        ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 20),
                        LCMetaItems.redstone_matrix.getStackForm())
                .fluidInputs(Materials.RedAlloy.getFluid(144))
                .outputs(LCMetaItems.processor_fluid.getStackForm())
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200).EUt(30)
                .inputs(LCMetaItems.printed_item_processor.getStackForm(),
                        ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 20),
                        LCMetaItems.redstone_matrix.getStackForm())
                .fluidInputs(Materials.RedAlloy.getFluid(144))
                .outputs(LCMetaItems.item_processor.getStackForm())
                .buildAndRegister();

        RecipeMaps.ASSEMBLER_RECIPES.recipeBuilder()
                .duration(200).EUt(30)
                .inputs(LCMetaItems.printed_control_processor.getStackForm(),
                        ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 20),
                        LCMetaItems.redstone_matrix.getStackForm())
                .fluidInputs(Materials.RedAlloy.getFluid(144))
                .outputs(LCMetaItems.control_processor.getStackForm())
                .buildAndRegister();

        RecipeMaps.MACERATOR_RECIPES.recipeBuilder()
                .duration(100).EUt(4)
                //Charged Certus Quartz
                .inputs(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 1))
                .outputs(LCMetaItems.charged_certus_quartz_dust.getStackForm(1))
                .buildAndRegister();

        RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                .duration(100).EUt(120)
                .inputs(LCMetaItems.AE_WAFER.getStackForm())
                .outputs(LCMetaItems.AE_CHIP.getStackForm(4))
                .buildAndRegister();

        RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                .duration(600).EUt(30)
                .inputs(ModHandler.getModItem(LCValues.ModName.AdvancedRocketry, "itemcircuitplate", 1, 0))
                .outputs(LCMetaItems.basic_circuit_chip.getStackForm(8))
                .buildAndRegister();

        RecipeMaps.CUTTER_RECIPES.recipeBuilder()
                .duration(600).EUt(30)
                .inputs(ModHandler.getModItem(LCValues.ModName.AdvancedRocketry, "itemcircuitplate", 1, 1))
                .outputs(LCMetaItems.advanced_circuit_chip.getStackForm(8))
                .buildAndRegister();

        RecipeMaps.CHEMICAL_RECIPES.recipeBuilder()
                .duration(600).EUt(4)
                .input(OrePrefix.dust, Materials.CertusQuartz)
                .input(OrePrefix.dust, Materials.Redstone)
                .fluidInputs(Materials.Water.getFluid(1000))
                .outputs(LCMetaItems.charged_certus_quartz_dust.getStackForm())
                .buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .duration(100).EUt(16)
                .notConsumable(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 14))
                .input(OrePrefix.plate, Materials.Lapis)
                .outputs(LCMetaItems.processor_fluid_printed.getStackForm())
                .buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .duration(100).EUt(16)
                .notConsumable(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 14))
                .input(OrePrefix.plate, Materials.Emerald)
                .outputs(LCMetaItems.core_printed_storage_component.getStackForm())
                .buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .duration(100).EUt(16)
                .notConsumable(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 14))
                .inputs(new ItemStack(Items.PRISMARINE_CRYSTALS))
                .outputs(LCMetaItems.core_printed_fluid_storage_component.getStackForm())
                .buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .duration(100).EUt(16)
                .notConsumable(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 14))
                .inputs(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 9))
                .outputs(LCMetaItems.core_printed_spatial_storage_component.getStackForm())
                .buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .duration(100).EUt(16)
                .notConsumable(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 14))
                .input(OrePrefix.plate, Materials.Glowstone)
                .outputs(LCMetaItems.printed_control_processor.getStackForm())
                .buildAndRegister();

        RecipeMaps.FORMING_PRESS_RECIPES.recipeBuilder()
                .duration(100).EUt(16)
                .notConsumable(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 1, 14))
                .input(OrePrefix.plate, Materials.Olivine)
                .outputs(LCMetaItems.printed_item_processor.getStackForm())
                .buildAndRegister();

        RecipeMaps.LASER_ENGRAVER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .inputs(MetaItems.GLOWSTONE_WAFER.getStackForm())
                .notConsumable(OrePrefix.lens, LCMaterials.Electrotine)
                .outputs(LCMetaItems.AE_WAFER.getStackForm())
                .buildAndRegister();

        RecipeMaps.LASER_ENGRAVER_RECIPES.recipeBuilder()
                .duration(200).EUt(480)
                .inputs(MetaItems.NAQUADAH_WAFER.getStackForm())
                .notConsumable(OrePrefix.lens, LCMaterials.Electrotine)
                .outputs(LCMetaItems.AE_WAFER.getStackForm(2))
                .buildAndRegister();

        RecipeMaps.LASER_ENGRAVER_RECIPES.recipeBuilder()
                .duration(600).EUt(480)
                .input(OrePrefix.plate, Materials.Redstone)
                .notConsumable(OrePrefix.craftingLens, MarkerMaterials.Color.Red)
                .outputs(LCMetaItems.redstone_matrix.getStackForm())
                .buildAndRegister();

        Arrays.stream(solderingList).forEach(stack -> {
            IngotMaterial material = (IngotMaterial) stack.material;
            int multiplier = (int) stack.amount;
            GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                    .duration(200).EUt(480)
                    .inputs(GAMetaItems.ADVANCED_BOARD.getStackForm())
                    .inputs(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 4, 22))
                    .inputs(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 4, 23))
                    .inputs(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 2, 24))
                    .inputs(LCMetaItems.AE_CHIP.getStackForm(4))
                    .input(OrePrefix.wireFine, LCMaterials.EnergeticAlloy, 16)
                    .fluidInputs(material.getFluid(72 * multiplier))
                    .outputs(LCMetaItems.AE_CIRCUIT.getStackForm())
                    .buildAndRegister();
            GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                    .duration(400).EUt(1920)
                    .inputs(GAMetaItems.EXTREME_BOARD.getStackForm())
                    .inputs(ModHandler.getModItem(LCValues.ModName.AppliedEnergistics, "material", 4, 23))
                    .input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 2)
                    .inputs(LCMetaItems.AE_CHIP.getStackForm(4))
                    .input(OrePrefix.wireFine, LCMaterials.PulsatingIron, 16)
                    .fluidInputs(material.getFluid(72 * multiplier))
                    .outputs(LCMetaItems.ADV_AE_CIRCUIT.getStackForm())
                    .buildAndRegister();
            GARecipeMaps.CIRCUIT_ASSEMBLER_RECIPES.recipeBuilder()
                    .duration(300).EUt(480)
                    .inputs(GAMetaItems.EXTREME_BOARD.getStackForm())
                    .inputs(LCMetaItems.processor_fluid.getStackForm(4))
                    .inputs(LCMetaItems.AE_CHIP.getStackForm(4))
                    .input(OrePrefix.circuit, MarkerMaterials.Tier.Extreme, 1)
                    .input(OrePrefix.wireFine, LCMaterials.ConductiveIron, 16)
                    .fluidInputs(material.getFluid(72 * multiplier))
                    .outputs(LCMetaItems.FLUID_CIRCUIT.getStackForm(1))
                    .buildAndRegister();
        });

    }
}
