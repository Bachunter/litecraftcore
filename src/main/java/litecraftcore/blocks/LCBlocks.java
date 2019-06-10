package litecraftcore.blocks;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LCBlocks {

    private static List<Block> LIST_BLOCKS = new ArrayList<>();
    static {
        BarsPane construction_alloy_bars;
        BarsPane soularium_bars;
        BarsPane stainless_steel_bars;
        BarsPane titanium_bars;


        LIST_BLOCKS.addAll(Arrays.asList(
                construction_alloy_bars = new BarsPane("construction_alloy_bars", 5.0F, 10F),
                soularium_bars = new BarsPane("soularium_bars", 5.0F, 15F),
                stainless_steel_bars = new BarsPane("stainless_steel_bars", 5.0F, 20F),
                titanium_bars = new BarsPane("titanium_bars", 5.0F, 25F)
                )
        );
    }

    public static List<Block> getListBlocks(){
        return LIST_BLOCKS;
    }
}
