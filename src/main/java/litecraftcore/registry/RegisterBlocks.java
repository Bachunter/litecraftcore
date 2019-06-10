package litecraftcore.registry;

import gregtech.api.util.GTLog;
import litecraftcore.blocks.LCBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

public class RegisterBlocks {

    private RegisterBlocks(){}

    public static void registerBlocks(){
        for (Block block:LCBlocks.getListBlocks()){
            ForgeRegistries.BLOCKS.register(block);
            ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(Objects.requireNonNull(block.getRegistryName())));
        }
    }

    @SideOnly(Side.CLIENT)
    public static void registerModels(){
        for (Block block:LCBlocks.getListBlocks()) {
            Minecraft
                    .getMinecraft()
                    .getRenderItem()
                    .getItemModelMesher()
                    .register(
                            Item.getItemFromBlock(block),
                            0,
                            new ModelResourceLocation(Objects.requireNonNull(block.getRegistryName()), "inventory")
                    );
            GTLog.logger.info(block.getUnlocalizedName() + " From Register Models Litecraftcore");
        }
    }
}
