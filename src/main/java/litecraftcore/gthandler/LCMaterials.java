package litecraftcore.gthandler;

import gregtech.api.GTValues;
import gregtech.api.unification.Element;
import gregtech.api.unification.material.IMaterialHandler;
import gregtech.api.unification.material.MaterialIconSet;
import gregtech.api.unification.material.type.DustMaterial;
import gregtech.api.unification.material.type.GemMaterial;
import gregtech.api.unification.material.type.IngotMaterial;
import gregtech.api.unification.stack.MaterialStack;
import net.minecraftforge.fml.common.Loader;

import static com.google.common.collect.ImmutableList.of;
import static gregtech.api.GTValues.*;
import static gregtech.api.unification.material.Materials.*;
import static gregtech.api.unification.material.type.DustMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.GemMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.IngotMaterial.MatFlags.*;
import static gregtech.api.unification.material.type.Material.MatFlags.*;
import static gregtech.api.unification.material.type.SolidMaterial.MatFlags.*;


@IMaterialHandler.RegisterMaterialHandler
public class LCMaterials {
    LCMaterials(){
        if (GTValues.isModLoaded(LCValues.ModName.GalacticraftPlanets)) {
            gcMaterials();
        }
    }

    private static final long CONSTRUCT_MATERIALS = GENERATE_PLATE | GENERATE_DENSE | GENERATE_BOLT_SCREW | GENERATE_ROD | GENERATE_LONG_ROD;
    private static final long WIRE_MATERIALS = GENERATE_PLATE | GENERATE_FINE_WIRE;

    /**
     * Vanilla Materials
     */

    public static DustMaterial SoulSand = new DustMaterial(800, "soul_sand", 0x6B5E4F, MaterialIconSet.DULL, 0, of(), NO_SMASHING | NO_SMELTING | NO_WORKING);

    /**
     * PlusTiC Materials
     */

    public static IngotMaterial Alumite = new IngotMaterial(801, "alumite", 0xE9ADDA, MaterialIconSet.METALLIC, 1, of(new MaterialStack(Aluminium, 5), new MaterialStack(Iron, 2), new MaterialStack(Obsidian, 2)), GENERATE_PLATE, null, 8.0F, 7.0f, 768, 1000);

    /**
     * Project Red Materials
     */

    public static GemMaterial Electrotine = new GemMaterial(802, "electrotine", 0x0E73AA, MaterialIconSet.RUBY, 1, of(new MaterialStack(Calcium, 2), new MaterialStack(Magnesium, 5), new MaterialStack(Silicon, 8), new MaterialStack(Oxygen, 22), new MaterialStack(Hydrogen, 2), new MaterialStack(Oxygen, 2)), GENERATE_ORE | GENERATE_LENSE | NO_SMASHING | NO_SMELTING | HIGH_SIFTER_OUTPUT);
    public static IngotMaterial ElectrotineAlloy = new IngotMaterial(825, "electrotine_alloy", 0x6173AA, MaterialIconSet.DULL, 1, of(new MaterialStack(Iron, 1), new MaterialStack(Electrotine, 4)), CONSTRUCT_MATERIALS);

    /**
     * Galacticraft Materials
     */

    public static IngotMaterial MeteoricIron;
    public static IngotMaterial Desh;

    public static void gcMaterials() {
        MeteoricIron = new IngotMaterial(803, "meteoric_iron", 0xA09589, MaterialIconSet.DULL, 1, of(new MaterialStack(Iron, 1)), GENERATE_ORE | GENERATE_PLATE, null, 8.0F, 7.0f, 512, 1000);
        Desh = new IngotMaterial(804, "desh", 0x313131, MaterialIconSet.DULL, 2, of(new MaterialStack(Tungsten, 1), new MaterialStack(Tellurium, 2)), GENERATE_ORE | GENERATE_PLATE, null, 10.0F, 8.0f, 1024, 3500);
    }

    /**
     * EnderIO Materials
     */

    public static IngotMaterial RedstoneAlloy = new IngotMaterial(805, "redstone_alloy", 0xEB5050, MaterialIconSet.METALLIC, 1, of(new MaterialStack(Copper, 1), new MaterialStack(Silicon, 1), new MaterialStack(Redstone, 1)), WIRE_MATERIALS);
    public static IngotMaterial ConductiveIron = new IngotMaterial(806, "conductive_iron", 0xDBB1AA, MaterialIconSet.DULL, 2, of(new MaterialStack(Invar, 2), new MaterialStack(Alumite, 1), new MaterialStack(Redstone, 1)), WIRE_MATERIALS);
    public static IngotMaterial EnergeticAlloy = new IngotMaterial(807, "energetic_alloy", 0xFCAF38, MaterialIconSet.SHINY, 3, of(new MaterialStack(Gold, 3), new MaterialStack(Manganese, 1), new MaterialStack(Glowstone, 1), new MaterialStack(Redstone, 1)), WIRE_MATERIALS, null, 2000);
    public static IngotMaterial PulsatingIron =  new IngotMaterial(808, "pulsating_iron", 0x749D7D, MaterialIconSet.METALLIC, 3, of(new MaterialStack(Iron, 1), new MaterialStack(Chrome, 1), new MaterialStack(Alumite, 1), new MaterialStack(EnderPearl, 1)), WIRE_MATERIALS, null, 3500);
    public static IngotMaterial VibrantAlloy = new IngotMaterial(809, "vibrant_alloy", 0xBAC63F, MaterialIconSet.SHINY, 5, of(new MaterialStack(EnergeticAlloy, 2), new MaterialStack(Platinum, 1), new MaterialStack(EnderPearl, 1)), WIRE_MATERIALS, null, 4200);

    public static IngotMaterial ConstructionAlloy = new IngotMaterial(810, "construction_alloy", 0x706E70, MaterialIconSet.DULL, 1, of(new MaterialStack(Silicon, 1), new MaterialStack(TinAlloy, 8)), DECOMPOSITION_BY_CENTRIFUGING | CONSTRUCT_MATERIALS, null, 6.0F, 3.0f, 512);
    public static IngotMaterial DarkSteel = new IngotMaterial(811, "dark_steel", 0x2B2B2B, MaterialIconSet.DULL, 3, of(new MaterialStack(VanadiumSteel, 6), new MaterialStack(BlackBronze, 2), new MaterialStack(Obsidian,1)), CONSTRUCT_MATERIALS, null, 12.0F, 9.0f, 1024, 2000);
    public static IngotMaterial ElectricalSteel = new IngotMaterial(812, "electrical_steel", 0x7F7F7F, MaterialIconSet.SHINY, 2, of(new MaterialStack(Steel, 7), new MaterialStack(Silicon, 1), new MaterialStack(Vanadium, 1), new MaterialStack(Neodymium, 1)), CONSTRUCT_MATERIALS, null, 9.0F, 8.0f, 900, 2000);
    public static IngotMaterial EndSteel = new IngotMaterial(813, "end_steel", 0xFCFDCA, MaterialIconSet.SHINY, 4, of(new MaterialStack(DarkSteel, 1), new MaterialStack(Titanium, 1), new MaterialStack(Endstone, 1)), CONSTRUCT_MATERIALS, null, 14.0F, 12.0f, 1536, 5000);
    public static IngotMaterial Soularium = new IngotMaterial(814, "soularium", 0x6B5E4F, MaterialIconSet.DULL, 2, of(new MaterialStack(Gold, 4), new MaterialStack(SterlingSilver, 1), new MaterialStack(SoulSand, 1)), CONSTRUCT_MATERIALS, null,1000);

    /**
     * Simply Jetpacks Material
     */

    public static IngotMaterial DarkSoularium = new IngotMaterial(815, "dark_soularium", 8221029, MaterialIconSet.DULL, 6, of(new MaterialStack(DarkSteel, 4), new MaterialStack(Soularium, 1), new MaterialStack(PulsatingIron, 1L)), CONSTRUCT_MATERIALS, null, 7000);


    /**
     * Tinker's Materials
     */

    public static IngotMaterial Ardite = new IngotMaterial(816, "ardite", 0xCD5117, MaterialIconSet.METALLIC, 2, of(), GENERATE_PLATE | GENERATE_ORE, Element.valueOf("Ai"), 10.0F, 5.5f, 768,2000);
    public static IngotMaterial Manyullyn = new IngotMaterial(817, "manyullyn", 0xA97DE0, MaterialIconSet.DULL, 4, of(new MaterialStack(Cobalt, 1), new MaterialStack(Ardite, 1)), GENERATE_PLATE, null,  11.0F, 7.0F, 1024,3500);
    public static IngotMaterial AluminumBrass = new IngotMaterial(818, "alubrass", 0xF0D467, MaterialIconSet.DULL, 0, of(new MaterialStack(Aluminium, 3), new MaterialStack(Copper, 1)), GENERATE_PLATE);
    public static IngotMaterial Knightslime = new IngotMaterial(819, "knightslime", 0xD57DF4, MaterialIconSet.METALLIC, 3, of(), GENERATE_PLATE, null, 10.0F, 5F, 1024,3000);

    /**
     * Thermal Foundation Materials
     */

    public static IngotMaterial Signalum = new IngotMaterial(820, "signalum", 0xFF9118, MaterialIconSet.METALLIC, 3, of(new MaterialStack(Titanium, 12), new MaterialStack(Alumite, 4), new MaterialStack(Redstone, 4)), CONSTRUCT_MATERIALS, null, 12.0F, 12.0f, 1768,3500);
    public static IngotMaterial Lumium = new IngotMaterial(821, "lumium", 0xE2E79A, MaterialIconSet.DULL, 1, of(new MaterialStack(Platinum, 4), new MaterialStack(Lanthanum, 1), new MaterialStack(Lutetium, 1)), WIRE_MATERIALS, null, 2000);

    /**
     * Avaritia Materials
     */

    public static IngotMaterial CosmicNeutronium = new IngotMaterial(822, "cosmic_neutronium", 0x1C1C1C, MaterialIconSet.METALLIC, 5, of(), GENERATE_ORE | CONSTRUCT_MATERIALS,  Element.valueOf("SpNt"), 20.0F, 20.0F, 3072, 9000);
    public static IngotMaterial Infinity         = new IngotMaterial(823, "infinity",          0xFFF0EA, MaterialIconSet.METALLIC, 3, of(), GENERATE_ORE | WIRE_MATERIALS,       Element.valueOf("If")  , 7200);
    public static IngotMaterial InfinityCatalyst = new IngotMaterial(824, "infinity_catalyst", 0xFEEDC5, MaterialIconSet.METALLIC, 4, of(), GENERATE_ORE | WIRE_MATERIALS,       Element.valueOf("SpIf"), 8000);

    /**
     * Extreme Reactors Material
     */

    public static GemMaterial Anglesite = new GemMaterial(826, "anglesite", 0xF0AC0A, MaterialIconSet.GEM_VERTICAL, 1, of(new MaterialStack(Lead, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Oxygen, 4)), GENERATE_ORE | GENERATE_PLATE);
    public static GemMaterial Benitoite = new GemMaterial(827, "benitoite", 0x56CFF7, MaterialIconSet.GEM_VERTICAL, 1, of(new MaterialStack(Barium, 1), new MaterialStack(Titanium, 1), new MaterialStack(Silicon, 3), new MaterialStack(Oxygen, 9)), GENERATE_ORE | GENERATE_PLATE | DISABLE_DECOMPOSITION);

    /**
     * Advanced Rocketry Materials
     */

    public static GemMaterial   Dilithium = new GemMaterial(828, "dilithium", 0xE6E6E6, MaterialIconSet.GEM_VERTICAL, 1, of(), GENERATE_PLATE);
    public static IngotMaterial TitaniumAluminide = new IngotMaterial(829, "titanium_aluminide", 0x7C899D, MaterialIconSet.DULL, 4, of(new MaterialStack(Titanium, 7), new MaterialStack(Aluminium, 3)), GENERATE_BOLT_SCREW | GENERATE_PLATE, null, 3000);
    public static IngotMaterial TitaniumIridium = new IngotMaterial(830, "titanium_iridium", 0x989DA1, MaterialIconSet.DULL, 4, of(new MaterialStack(Titanium, 1), new MaterialStack(Iridium, 1)), GENERATE_BOLT_SCREW | GENERATE_PLATE, null, 4200);

    /**
     * Nuclear Craft Materials
     */

    public static GemMaterial Rhodochrosite = new GemMaterial(831, "rhodochrosite", 0xAD1E39, MaterialIconSet.RUBY, 1, of(new MaterialStack(Manganese, 1), new MaterialStack(Carbon, 1), new MaterialStack(Oxygen, 3)), 0);
    public static GemMaterial BoronNitride = new GemMaterial(832, "boron_nitride", 0x597652, MaterialIconSet.RUBY, 1, of(new MaterialStack(Boron, 1), new MaterialStack(Nitrogen, 1)), 0);
    public static GemMaterial Fluorite = new GemMaterial(833, "fluorite", 0x83AF8C, MaterialIconSet.RUBY, 1, of(new MaterialStack(Calcium, 1), new MaterialStack(Fluorine, 2)), 0);
    public static GemMaterial Villiaumite = new GemMaterial(834, "villiaumite", 0xBB785E, MaterialIconSet.RUBY, 1, of(new MaterialStack(Sodium, 1), new MaterialStack(Fluorine, 1)), 0);
    public static GemMaterial Carobbiite = new GemMaterial(835, "carobbiite", 0xA4B45C, MaterialIconSet.RUBY, 1, of(new MaterialStack(Potassium, 1), new MaterialStack(Fluorine, 1)),0);
    public static GemMaterial BoronArsenide = new GemMaterial(836, "boron_arsenide", 0x8E8C79, MaterialIconSet.RUBY, 1, of(new MaterialStack(Boron, 1), new MaterialStack(Arsenic, 1)), 0);

    public static IngotMaterial Zirconium = new IngotMaterial(837, "zirconium", 0xEEEFD7, MaterialIconSet.DULL, 1, of(), GENERATE_PLATE, Element.Zr, 2000);
    public static IngotMaterial ThoriumOxide = new IngotMaterial(838, "thorium_oxide", 0x242424, MaterialIconSet.DULL, 0, of(new MaterialStack(Thorium, 1), new MaterialStack(Oxygen, 1)), GENERATE_PLATE);
    public static IngotMaterial UraniumOxide = new IngotMaterial(839, "uranium_oxide", 0x3C6B3C, MaterialIconSet.DULL, 0, of(new MaterialStack(Uranium, 1), new MaterialStack(Oxygen, 1)), GENERATE_PLATE);
    public static IngotMaterial ManganeseOxide = new IngotMaterial(840, "manganese_oxide", 0x739073, MaterialIconSet.DULL, 0,of(new MaterialStack(Manganese, 1), new MaterialStack(Oxygen, 1)), GENERATE_PLATE);
    public static IngotMaterial ManganeseDioxide = new IngotMaterial(841, "manganese_dioxide", 0x241E1B, MaterialIconSet.DULL, 0, of(new MaterialStack(Manganese, 1), new MaterialStack(Oxygen, 2)), GENERATE_PLATE);
    public static IngotMaterial Ferroboron = new IngotMaterial(842, "ferroboron", 0x767676, MaterialIconSet.DULL, 1, of(new MaterialStack(Iron, 1), new MaterialStack(Boron, 1)), GENERATE_PLATE, null, 1000);
    public static IngotMaterial Tough = new IngotMaterial(843, "tough", 0x171221, MaterialIconSet.DULL, 1, of(new MaterialStack(Ferroboron, 1), new MaterialStack(Lithium, 1)), GENERATE_PLATE, null, 1600);
    public static IngotMaterial HardCarbon = new IngotMaterial(844, "hard_carbon", 0x307390, MaterialIconSet.SHINY, 3, of(new MaterialStack(Carbon, 2), new MaterialStack(Diamond, 1)), GENERATE_PLATE);
    public static IngotMaterial MagnesiumDiboride = new IngotMaterial(845, "magnesium_diboride", 0x14110A, MaterialIconSet.DULL, 1, of(new MaterialStack(Magnesium, 1), new MaterialStack(Boron, 2)), GENERATE_PLATE);
    public static IngotMaterial LithiumManganeseDioxide = new IngotMaterial(846, "lithium_manganese_dioxide", 0x696969, MaterialIconSet.DULL, 1, of(new MaterialStack(ManganeseDioxide, 1), new MaterialStack(Lithium, 1)), GENERATE_PLATE);
    public static IngotMaterial Shibuichi = new IngotMaterial(847, "shibuichi", 0xB9B3AE, MaterialIconSet.DULL, 0, of(new MaterialStack(Copper, 3), new MaterialStack(Silver, 1)), GENERATE_PLATE);
    public static IngotMaterial TinSilver = new IngotMaterial(848, "tin_silver", 0xF0F0FF, MaterialIconSet.DULL, 0, of(new MaterialStack(Tin, 3), new MaterialStack(Silver, 1)), GENERATE_PLATE);
    public static IngotMaterial LeadPlatinum = new IngotMaterial(849, "lead_platinum", 0x537278, MaterialIconSet.DULL, 0, of(new MaterialStack(Lead, 3), new MaterialStack(Platinum, 1)), GENERATE_PLATE);
    public static IngotMaterial Extreme = new IngotMaterial(850, "extreme", 0x712A3E, MaterialIconSet.DULL, 4, of(new MaterialStack(Tough, 1), new MaterialStack(HardCarbon, 1)), GENERATE_PLATE, null, 4200);
    public static IngotMaterial Thermoconducting = new IngotMaterial(851, "thermoconducting", 0x65724F, MaterialIconSet.DULL, 3, of(new MaterialStack(Extreme, 1), new MaterialStack(BoronArsenide, 1)), GENERATE_PLATE, null,5500);
    public static IngotMaterial Zircaloy = new IngotMaterial(852, "zircaloy", 0xDADBDC, MaterialIconSet.DULL, 1, of(new MaterialStack(Zirconium, 7), new MaterialStack(Tin, 1)), GENERATE_PLATE, null, 1900);
    public static IngotMaterial HSLASteel = new IngotMaterial(853, "hsla_steel", 0x8176AA, MaterialIconSet.SHINY, 3, of(new MaterialStack(Iron, 15), new MaterialStack(Manganese, 1), new MaterialStack(Carbon, 1)), CONSTRUCT_MATERIALS, null, 2500);

    public static DustMaterial CalciumSulfate = new DustMaterial(854, "calcium_sulfate", 0xD1CAC2, MaterialIconSet.SAND, 0, of(new MaterialStack(Calcium, 1), new MaterialStack(Sulfur, 1), new MaterialStack(Oxygen, 4)), 0);
    public static DustMaterial SodiumFluoride = new DustMaterial(855, "sodium_fluoride", 0xC3B19E, MaterialIconSet.SAND, 0, of(new MaterialStack(Sodium, 1), new MaterialStack(Fluorine, 1)), 0);
    public static DustMaterial PotassiumHydroxide = new DustMaterial(856, "potassium_hydroxide", 0xCDD9C7, MaterialIconSet.SAND, 0, of(new MaterialStack(Potassium, 1), new MaterialStack(Oxygen, 1), new MaterialStack(Hydrogen, 1)), 0);
    public static DustMaterial PotassiumFluoride = new DustMaterial(857, "potassium_fluoride", 0xD5DCB6, MaterialIconSet.SAND, 0, of(new MaterialStack(Potassium, 1), new MaterialStack(Fluorine, 1)), 0);


    static {
        RedstoneAlloy.setCableProperties(GTValues.V[ULV], 2, 0);
        ConstructionAlloy.setCableProperties(GTValues.V[LV], 2, 1);
        ConductiveIron.setCableProperties(GTValues.V[MV], 4, 1);
        EnergeticAlloy.setCableProperties(GTValues.V[HV], 4, 1);
        PulsatingIron.setCableProperties(GTValues.V[EV], 4, 1);
        VibrantAlloy.setCableProperties(GTValues.V[IV], 4, 1);
        Lumium.setCableProperties(GTValues.V[LuV], 4, 1);
        Infinity.setCableProperties(GTValues.V[ZPM], 4, 1);
        InfinityCatalyst.setCableProperties(GTValues.V[UV], 4, 1);

        Electrotine.setOreMultiplier(2);
        Anglesite.setOreMultiplier(2);
        Benitoite.setOreMultiplier(2);

        Electrotine.addOreByProducts(Lapis, Kyanite);
        Ardite.addOreByProducts(Lanthanum, Lanthanum);


        CosmicNeutronium.addOreByProducts(Ytterbium, Lutetium, Americium);
        Infinity.addOreByProducts(Europium, Platinum, Iridium);
        InfinityCatalyst.addOreByProducts(Infinity, Americium, Ytterbium);

        if (Loader.isModLoaded(LCValues.ModName.GalacticraftPlanets)){
            MeteoricIron.addOreByProducts(Iron, Nickel);
            Desh.addOreByProducts(Lanthanum, Rutile);
        }
    }
}
