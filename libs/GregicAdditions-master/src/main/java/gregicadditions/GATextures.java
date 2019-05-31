package gregicadditions;

import gregicadditions.machines.DrumRenderer;
import gregtech.api.gui.resources.TextureArea;
import gregtech.api.render.OrientedOverlayRenderer;
import gregtech.api.render.OrientedOverlayRenderer.OverlayFace;
import gregtech.api.render.SimpleCubeRenderer;

public class GATextures {
    public static SimpleCubeRenderer COKE_OVEN_BRICKS;

    public static SimpleCubeRenderer FUSION_TEXTURE;

    public static SimpleCubeRenderer ACTIVE_FUSION_TEXTURE;

    public static OrientedOverlayRenderer COKE_OVEN_OVERLAY;

    public static OrientedOverlayRenderer NAQADAH_OVERLAY;

    public static OrientedOverlayRenderer REPLICATOR_OVERLAY;

    public static OrientedOverlayRenderer MASS_FAB_OVERLAY;

    public static OrientedOverlayRenderer FUSION_REACTOR_OVERLAY;

    public static OrientedOverlayRenderer STEAM_MIXER_OVERLAY;

    public static DrumRenderer BARREL = new DrumRenderer("storage/drums/barrel");
    public static DrumRenderer DRUM = new DrumRenderer("storage/drums/drum");

    //Gui Textures
    public static final TextureArea BRONZE_FLUID_SLOT = TextureArea.fullImage("textures/gui/steam/fluid_slot.png");
    public static final TextureArea COAL_OVERLAY = TextureArea.fullImage("textures/gui/steam/bronze/overlay_bronze_coal.png");

    public static OrientedOverlayRenderer BREAKER_OVERLAY;

    static {
        COKE_OVEN_BRICKS = new SimpleCubeRenderer("casings/solid/machine_coke_oven_bricks");

        FUSION_TEXTURE = new SimpleCubeRenderer("casings/fusion/machine_casing_fusion_glass");

        ACTIVE_FUSION_TEXTURE = new SimpleCubeRenderer("gregtech:casings/fusion/machine_casing_fusion_glass_yellow");

        COKE_OVEN_OVERLAY = new OrientedOverlayRenderer("machines/ga_coke_oven", new OverlayFace[]{OverlayFace.FRONT});

        NAQADAH_OVERLAY = new OrientedOverlayRenderer("machines/naquadah_reactor", new OverlayFace[]{OverlayFace.FRONT, OverlayFace.BACK, OverlayFace.TOP});

        REPLICATOR_OVERLAY = new OrientedOverlayRenderer("machines/replicator", new OverlayFace[]{OverlayFace.FRONT});

        MASS_FAB_OVERLAY = new OrientedOverlayRenderer("machines/mass_fab", new OverlayFace[]{OverlayFace.FRONT});

        FUSION_REACTOR_OVERLAY = new OrientedOverlayRenderer("machines/fusion_reactor", new OverlayFace[]{OverlayFace.FRONT});

        BREAKER_OVERLAY = new OrientedOverlayRenderer("machines/rock_breaker", new OverlayFace[]{OverlayFace.BACK});

        STEAM_MIXER_OVERLAY = new OrientedOverlayRenderer("machines/steam_mixer", new OverlayFace[]{OverlayFace.FRONT, OverlayFace.SIDE, OverlayFace.TOP});
    }
}
