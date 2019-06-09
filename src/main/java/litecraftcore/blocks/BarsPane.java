package litecraftcore.blocks;

import litecraftcore.LitecraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class BarsPane extends BlockPane {
    protected BarsPane(String name, float hardness, float resistance) {
        super(Material.IRON, true);

        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        init();
        setCreativeTab(LitecraftCore.GENERIC_TAB);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add("Hardness: " + this.blockHardness + " Blast Resistant: " + this.blockResistance);

    }

    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(
                Item.getItemFromBlock(this),
                0,
                new ModelResourceLocation(Objects.requireNonNull(getRegistryName()).toString(), "inventory"));
    }

    public void init(Item item) {
        GameRegistry.findRegistry(Block.class).register(this);
        GameRegistry.findRegistry(Item.class).register(item);
    }

    public void init() {
        init(new ItemBlock(this).setRegistryName(Objects.requireNonNull(getRegistryName())));
    }
}
