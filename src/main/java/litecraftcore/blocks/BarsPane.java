package litecraftcore.blocks;

import litecraftcore.LitecraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public class BarsPane extends BlockPane {
    public BarsPane(String name, float hardness, float resistance) {
        super(Material.IRON, true);
        setUnlocalizedName(name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setCreativeTab(LitecraftCore.GENERAL_TAB);

        BarsPaneList.add(this);
    }

    private static List<Block> BarsPaneList = new ArrayList<>();

    @Nonnull
    public static List<Block> getBarsPaneList(){
        return BarsPaneList;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World player, List<String> tooltip, ITooltipFlag advanced) {
        tooltip.add("Hardness: " + this.blockHardness + " Blast Resistance: " + this.blockResistance);

    }
}
