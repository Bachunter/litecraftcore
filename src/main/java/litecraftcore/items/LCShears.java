package litecraftcore.items;

import litecraftcore.LitecraftCore;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;

import java.util.ArrayList;
import java.util.List;

public class LCShears extends ItemShears {

    public LCShears(String name, int maxDamage) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setMaxDamage(maxDamage);
        setCreativeTab(LitecraftCore.GENERAL_TAB);

        ShearsList.add(this);
    }

    private static List<Item> ShearsList = new ArrayList<>();

    public static List<Item> getShearsList(){
        return ShearsList;
    }
}
