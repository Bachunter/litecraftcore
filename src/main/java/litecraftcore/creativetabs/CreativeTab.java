package litecraftcore.creativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;


import javax.annotation.Nonnull;

public class CreativeTab extends CreativeTabs {

    public CreativeTab(String label) {
        super(label);
    }

    @Nonnull
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Blocks.GLASS);
    }
}
