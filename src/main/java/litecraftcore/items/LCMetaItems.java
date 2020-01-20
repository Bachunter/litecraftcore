package litecraftcore.items;

import gregtech.api.items.metaitem.MetaItem;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public final class LCMetaItems {

    private static List<MetaItem<?>> ITEMS = MetaItem.getMetaItems();

    public static MetaItem<?>.MetaValueItem HeavyDutyAlloyIngotT1;
    public static MetaItem<?>.MetaValueItem HeavyDutyAlloyIngotT2;
    public static MetaItem<?>.MetaValueItem HeavyDutyAlloyIngotT3;
    public static MetaItem<?>.MetaValueItem HeavyDutyAlloyIngotT4;
    public static MetaItem<?>.MetaValueItem HeavyDutyAlloyIngotT5;
    public static MetaItem<?>.MetaValueItem HeavyDutyAlloyIngotT6;

    public static MetaItem<?>.MetaValueItem RawSDHCAlloy;

    public static MetaItem<?>.MetaValueItem processor_fluid_printed;
    public static MetaItem<?>.MetaValueItem processor_fluid;

    public static MetaItem<?>.MetaValueItem core_printed_storage_component;
    public static MetaItem<?>.MetaValueItem core_printed_fluid_storage_component;
    public static MetaItem<?>.MetaValueItem core_printed_spatial_storage_component;
    public static MetaItem<?>.MetaValueItem core_storage_component;
    public static MetaItem<?>.MetaValueItem core_fluid_storage_component;
    public static MetaItem<?>.MetaValueItem core_spatial_storage_component;

    public static MetaItem<?>.MetaValueItem cover_interface;

    public static MetaItem<?>.MetaValueItem AE_CIRCUIT;
    public static MetaItem<?>.MetaValueItem ADV_AE_CIRCUIT;
    public static MetaItem<?>.MetaValueItem FLUID_CIRCUIT;
    public static MetaItem<?>.MetaValueItem AE_WAFER;
    public static MetaItem<?>.MetaValueItem AE_CHIP;

    public static MetaItem<?>.MetaValueItem charged_certus_quartz_dust;

    public static MetaItem<?>.MetaValueItem basic_circuit_chip;
    public static MetaItem<?>.MetaValueItem advanced_circuit_chip;

    public static MetaItem<?>.MetaValueItem printed_control_processor;
    public static MetaItem<?>.MetaValueItem control_processor;
    public static MetaItem<?>.MetaValueItem printed_item_processor;
    public static MetaItem<?>.MetaValueItem item_processor;
    public static MetaItem<?>.MetaValueItem redstone_matrix;


    public static void init() {
        LCMetaItem item = new LCMetaItem();
        item.setRegistryName("lc_meta_item");
    }

    public static void registerOreDict() {
        ITEMS.stream()
                .filter(item -> item instanceof LCMetaItem)
                .forEach(item -> ((LCMetaItem) item).registerOreDict());
    }

    public static void registerRecipes() {
        ITEMS.stream()
                .filter(item -> item instanceof LCMetaItem)
                .forEach(item -> registerRecipes());
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        ITEMS.forEach(MetaItem::registerModels);
    }

    @SideOnly(Side.CLIENT)
    public static void registerColors() {
        ITEMS.forEach(MetaItem::registerColor);
    }
}
