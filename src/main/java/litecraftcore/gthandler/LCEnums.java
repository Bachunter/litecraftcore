package litecraftcore.gthandler;

import gregtech.api.unification.Element;
import net.minecraftforge.common.util.EnumHelper;

public class LCEnums {
    public static void preInit(){
        EnumHelper.addEnum(Element.class, "Ai"  , new Class[]{long.class, long.class, long.class, String.class, String.class, boolean.class}, 50L, 63L, -1L, null, "Ardite", false);
        EnumHelper.addEnum(Element.class, "SpNt", new Class[]{long.class, long.class, long.class, String.class, String.class, boolean.class}, 130L, 163L, -1L, null, "Cosmic Neutronium", false);
        EnumHelper.addEnum(Element.class, "If"  , new Class[]{long.class, long.class, long.class, String.class, String.class, boolean.class}, 131L, 167L, -1L, null, "Infinity", false);
        EnumHelper.addEnum(Element.class, "SpIf", new Class[]{long.class, long.class, long.class, String.class, String.class, boolean.class}, 132L, 173L, -1L, null, "Infinity Catalyst", false);
    }
}
