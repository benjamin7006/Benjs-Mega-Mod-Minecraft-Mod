package net.Benj.BenjsMegaMod.Util.handlers;

import net.Benj.BenjsMegaMod.entity.EntityUnicorn;
import net.Benj.BenjsMegaMod.entity.render.RenderUnicorn;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderHandler {
	
	public static void registerEntityRenders() {
	
		RenderingRegistry.registerEntityRenderingHandler(EntityUnicorn.class, new IRenderFactory<EntityUnicorn>() {

			@Override
			public Render<? super EntityUnicorn> createRenderFor(RenderManager manager) {
				
				return new RenderUnicorn(manager);
			}
		});
	}
}
