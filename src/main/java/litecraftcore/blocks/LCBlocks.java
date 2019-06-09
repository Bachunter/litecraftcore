package litecraftcore.blocks;

public class LCBlocks {

    public static BarsPane construction_alloy_bars;
    public static BarsPane soularium_bars;
    public static BarsPane stainless_steel_bars;
    public static BarsPane titanium_bars;



    public static void init(){
        construction_alloy_bars = new BarsPane("construction_alloy_bars", 5.0F, 50F);
        soularium_bars = new BarsPane("soularium_bars", 5.0F, 80F);
        stainless_steel_bars = new BarsPane("stainless_steel_bars", 5.0F, 120F);
        titanium_bars = new BarsPane("titanium_bars", 5.0F, 170F);
    }

    public static void registerModels(){
        construction_alloy_bars.initModel();
        soularium_bars.initModel();
        stainless_steel_bars.initModel();
        titanium_bars.initModel();
    }
}
