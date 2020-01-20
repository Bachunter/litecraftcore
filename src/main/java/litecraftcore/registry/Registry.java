package litecraftcore.registry;

import litecraftcore.blocks.LCBlocks;
import litecraftcore.items.LCItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

public class Registry {

    private Registry(){}

    public static void registerBlocks(){
        LCBlocks.getListBlocks().forEach(block -> {
            ForgeRegistries.BLOCKS.register(block);
            ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
        });
    }

    public static void registerItems(){
        LCItems.getListItems().forEach(ForgeRegistries.ITEMS::register);
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels(){
        LCBlocks.getListBlocks().forEach(block ->
                Minecraft
                        .getMinecraft()
                        .getRenderItem()
                        .getItemModelMesher()
                        .register(
                                Item.getItemFromBlock(block),
                                0,
                                new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()), "inventory")));

        LCItems.getListItems().forEach(item ->
                Minecraft
                        .getMinecraft()
                        .getRenderItem()
                        .getItemModelMesher()
                        .register(item,
                                0,
                                new ModelResourceLocation(Objects.requireNonNull(item.getRegistryName()), "inventory")));
    }
}
