package net.Benj.BenjsMegaMod.entity.render;

import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.entity.EntityUnicorn;
import net.Benj.BenjsMegaMod.entity.Model.ModelUnicorn;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderUnicorn extends RenderLiving<EntityUnicorn> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/unicorn.png");
	
	public RenderUnicorn(RenderManager manager) {
		super(manager, new ModelUnicorn(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityUnicorn entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityUnicorn entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
