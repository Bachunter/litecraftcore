package litecraftcore;

import litecraftcore.creativetabs.CreativeTab;
import litecraftcore.items.LCMetaItems;
import litecraftcore.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(
        modid = LitecraftCore.MODID,
        name = LitecraftCore.NAME,
        version = LitecraftCore.VERSION
)

public class LitecraftCore {

    public static final String MODID = "litecraftcore";
    public static final String NAME = "Litecraft Core";
    public static final String VERSION = "1.0";

    @SidedProxy(
            clientSide = "litecraftcore.proxy.ClientProxy",
            serverSide = "litecraftcore.proxy.CommonProxy"
    )

    public static CommonProxy proxy;

    public static final CreativeTabs GENERIC_TAB = new CreativeTab("LitecraftCore");

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
        LCMetaItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}
