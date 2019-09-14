package litecraftcore.blocks;

import litecraftcore.LitecraftCore;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class DecorateBlock extends Block {
    protected DecorateBlock(String name) {
        super(Material.IRON);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(LitecraftCore.LC_BLOCKS_TAB);

        DecorateBlockList.add(this);
    }

    private static List<Block> DecorateBlockList = new ArrayList<>();

    public static List<Block> getDecorateBlockList(){
        return DecorateBlockList;
    }
}
