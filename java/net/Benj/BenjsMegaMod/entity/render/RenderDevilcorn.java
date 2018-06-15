package net.Benj.BenjsMegaMod.entity.render;

import net.Benj.BenjsMegaMod.Util.Reference;
import net.Benj.BenjsMegaMod.entity.EntityDevilcorn;
import net.Benj.BenjsMegaMod.entity.Model.ModelDevilcorn;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderDevilcorn extends RenderLiving<EntityDevilcorn> {

	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/devilcorn.png");
	
	public RenderDevilcorn(RenderManager manager) {
		super(manager, new ModelDevilcorn(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityDevilcorn entity) {
		return TEXTURES;
	}
	
	@Override
	protected void applyRotations(EntityDevilcorn entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) {
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}

}
