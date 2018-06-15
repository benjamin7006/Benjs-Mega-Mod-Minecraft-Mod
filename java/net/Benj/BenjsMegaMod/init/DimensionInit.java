package net.Benj.BenjsMegaMod.init;

import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.world.dimension.magic.DimensionMagic;
import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit {
	
	public static final DimensionType MAGIC = DimensionType.register("Magic", "_magic", Reference.DIMENSION_MAGIC_ID, DimensionMagic.class, false);
	
	public static void registerDimensions() {
		DimensionManager.registerDimension(Reference.DIMENSION_MAGIC_ID, MAGIC);
	}
}
