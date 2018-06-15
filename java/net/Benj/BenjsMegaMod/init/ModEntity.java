package net.Benj.BenjsMegaMod.init;

import net.Benj.BenjsMegaMod.Main;
import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.entity.EntityDevilcorn;
import net.Benj.BenjsMegaMod.entity.EntityUnicorn;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ModEntity {

	public static void registerEntities() {
		registerEntity("Unicorn", EntityUnicorn.class, Reference.ENTITY_UNICORN, 50, 16711839, 7733503);
		registerEntity("Devilcorn", EntityDevilcorn.class, Reference.ENTITY_DEVILCORN, 50, 000000, 7733503);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
