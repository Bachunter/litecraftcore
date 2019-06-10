package litecraftcore.proxy;

import gregtech.api.util.GTLog;
import litecraftcore.LitecraftCore;
import litecraftcore.blocks.LCBlocks;
import litecraftcore.gthandler.recipes.CraftingRecipeLoader;
import litecraftcore.gthandler.recipes.LCMachineRemoveRecipes;
import litecraftcore.gthandler.recipes.MachineRecipeLoader;
import litecraftcore.gthandler.recipes.OreDictLoader;
import litecraftcore.items.LCMetaItems;
import litecraftcore.registry.RegisterBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = LitecraftCore.MODID)
public class CommonProxy {

    @SubscribeEvent
    public static void registerRecipes(RegistryEvent.Register<IRecipe> event){
        LCMachineRemoveRecipes.init();

        GTLog.logger.info("Registering ore dictionary...");
        LCMetaItems.registerOreDict();
        OreDictLoader.init();

        GTLog.logger.info("Registering recipes for Litecraft Core...");
        LCMetaItems.registerRecipes();
        MachineRecipeLoader.init();
        CraftingRecipeLoader.init();
    }

    public void preInit(FMLPreInitializationEvent event){
        RegisterBlocks.registerBlocks();
    }

    public void init(FMLInitializationEvent event) {}

    public void postInit(FMLPostInitializationEvent event) {}
}
