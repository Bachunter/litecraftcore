package litecraftcore.items;

import gregtech.api.items.metaitem.MetaItem;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class LCMetaItems {
    public LCMetaItems(){}

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

    public static void init() {
        LCMetaItem item = new LCMetaItem();
        item.setRegistryName("lc_meta_item");
    }

    public static void registerOreDict() {
        for (MetaItem<?> item : ITEMS)
            if (item instanceof LCMetaItem)
                ((LCMetaItem) item).registerOreDict();
    }

    public static void registerRecipes() {
        for (MetaItem<?> item : ITEMS)
            if (item instanceof LCMetaItem)
                ((LCMetaItem) item).registerRecipes();
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels() {
        for (MetaItem<?> item : ITEMS)
            item.registerModels();
    }

    @SideOnly(Side.CLIENT)
    public static void registerColors() {
        for (MetaItem<?> item : ITEMS)
            item.registerColor();
    }

}
