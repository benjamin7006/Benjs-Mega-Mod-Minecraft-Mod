package net.Benj.BenjsMegaMod.entity.Model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelDevilcorn extends ModelBase {
	
    public ModelRenderer Ear_R;
    public ModelRenderer Head_Main;
    public ModelRenderer Ear_L;
    public ModelRenderer Front_Foot_L;
    public ModelRenderer Back_Leg_L;
    public ModelRenderer Back_Foot_L;
    public ModelRenderer Front_TopLeg_L;
    public ModelRenderer Front_TopLeg_R;
    public ModelRenderer Front_Leg_L;
    public ModelRenderer Front_Leg_R;
    public ModelRenderer Body;
    public ModelRenderer Tail;
    public ModelRenderer Back_TopLeg_L;
    public ModelRenderer Neck;
    public ModelRenderer Neck_Hair;
    public ModelRenderer Tail_Top;
    public ModelRenderer Tail_Hair;
    public ModelRenderer Back_TopLeg_R;
    public ModelRenderer Back_Leg_R;
    public ModelRenderer Back_Foot_R;
    public ModelRenderer Front_Foot_R;
    public ModelRenderer Corn;
    public ModelRenderer Nose_A;
    public ModelRenderer Nose_B;

    public ModelDevilcorn() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Back_Foot_L = new ModelRenderer(this, 78, 51);
        this.Back_Foot_L.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.Back_Foot_L.addBox(-2.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.Front_TopLeg_L = new ModelRenderer(this, 44, 29);
        this.Front_TopLeg_L.setRotationPoint(4.0F, 9.0F, -8.0F);
        this.Front_TopLeg_L.addBox(-1.9F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.Nose_B = new ModelRenderer(this, 24, 27);
        this.Nose_B.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Nose_B.addBox(-2.0F, -7.0F, -6.5F, 4, 2, 5, 0.0F);
        this.Tail_Hair = new ModelRenderer(this, 24, 3);
        this.Tail_Hair.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.Tail_Hair.addBox(-1.5F, -4.5F, 9.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Tail_Hair, -1.5707963267948966F, 0.0F, 0.0F);
        this.Ear_L = new ModelRenderer(this, 0, 0);
        this.Ear_L.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.Ear_L.addBox(-2.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(Ear_L, 0.5235987755982988F, 0.0F, 0.0F);
        this.Tail = new ModelRenderer(this, 38, 7);
        this.Tail.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.Tail.addBox(-1.5F, -2.0F, 3.0F, 3, 4, 7, 0.0F);
        this.setRotateAngle(Tail, -1.3089969389957472F, 0.0F, 0.0F);
        this.Head_Main = new ModelRenderer(this, 0, 0);
        this.Head_Main.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.Head_Main.addBox(-2.5F, -10.0F, -1.5F, 5, 5, 7, 0.0F);
        this.setRotateAngle(Head_Main, 0.5235987755982988F, 0.0F, 0.0F);
        this.Back_Leg_L = new ModelRenderer(this, 78, 43);
        this.Back_Leg_L.setRotationPoint(4.0F, 16.0F, 11.0F);
        this.Back_Leg_L.addBox(-2.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.Body = new ModelRenderer(this, 0, 34);
        this.Body.setRotationPoint(0.0F, 11.0F, 9.0F);
        this.Body.addBox(-5.0F, -8.0F, -19.0F, 10, 10, 24, 0.0F);
        this.Front_Foot_R = new ModelRenderer(this, 60, 51);
        this.Front_Foot_R.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.Front_Foot_R.addBox(-1.6F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.Front_Leg_R = new ModelRenderer(this, 60, 41);
        this.Front_Leg_R.setRotationPoint(-4.0F, 16.0F, -8.0F);
        this.Front_Leg_R.addBox(-1.1F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.Ear_R = new ModelRenderer(this, 0, 0);
        this.Ear_R.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.Ear_R.addBox(0.45F, -12.0F, 4.0F, 2, 3, 1, 0.0F);
        this.setRotateAngle(Ear_R, 0.5235987755982988F, 0.0F, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 12);
        this.Neck.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.Neck.addBox(-2.05F, -9.8F, -2.0F, 4, 14, 8, 0.0F);
        this.setRotateAngle(Neck, 0.5235987755982988F, 0.0F, 0.0F);
        this.Back_Leg_R = new ModelRenderer(this, 96, 43);
        this.Back_Leg_R.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.Back_Leg_R.addBox(-1.0F, 0.0F, -1.5F, 3, 5, 3, 0.0F);
        this.Corn = new ModelRenderer(this, 0, 37);
        this.Corn.setRotationPoint(-0.6F, -8.5F, -17.2F);
        this.Corn.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.setRotateAngle(Corn, 0.9105382707654417F, 0.0F, 0.0F);
        this.Nose_A = new ModelRenderer(this, 24, 18);
        this.Nose_A.setRotationPoint(0.0F, 0.02F, 0.02F);
        this.Nose_A.addBox(-2.0F, -10.0F, -7.0F, 4, 3, 6, 0.0F);
        this.Front_Leg_L = new ModelRenderer(this, 44, 41);
        this.Front_Leg_L.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.Front_Leg_L.addBox(-1.9F, 0.0F, -1.6F, 3, 5, 3, 0.0F);
        this.Back_TopLeg_L = new ModelRenderer(this, 78, 29);
        this.Back_TopLeg_L.setRotationPoint(4.0F, 9.0F, 11.0F);
        this.Back_TopLeg_L.addBox(-2.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.Tail_Top = new ModelRenderer(this, 44, 0);
        this.Tail_Top.setRotationPoint(0.0F, 3.0F, 14.0F);
        this.Tail_Top.addBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F);
        this.setRotateAngle(Tail_Top, -1.3089969389957472F, 0.0F, 0.0F);
        this.Neck_Hair = new ModelRenderer(this, 58, 0);
        this.Neck_Hair.setRotationPoint(0.0F, 4.0F, -10.0F);
        this.Neck_Hair.addBox(-1.0F, -11.5F, 5.0F, 2, 16, 4, 0.0F);
        this.setRotateAngle(Neck_Hair, 0.5235987755982988F, 0.0F, 0.0F);
        this.Back_TopLeg_R = new ModelRenderer(this, 96, 29);
        this.Back_TopLeg_R.setRotationPoint(-4.0F, 9.0F, 11.0F);
        this.Back_TopLeg_R.addBox(-1.5F, -2.0F, -2.5F, 4, 9, 5, 0.0F);
        this.Back_Foot_R = new ModelRenderer(this, 96, 51);
        this.Back_Foot_R.setRotationPoint(-4.0F, 16.0F, 11.0F);
        this.Back_Foot_R.addBox(-1.5F, 5.1F, -2.0F, 4, 3, 4, 0.0F);
        this.Front_TopLeg_R = new ModelRenderer(this, 60, 29);
        this.Front_TopLeg_R.setRotationPoint(-4.0F, 9.0F, -8.0F);
        this.Front_TopLeg_R.addBox(-1.1F, -1.0F, -2.1F, 3, 8, 4, 0.0F);
        this.Front_Foot_L = new ModelRenderer(this, 44, 51);
        this.Front_Foot_L.setRotationPoint(4.0F, 16.0F, -8.0F);
        this.Front_Foot_L.addBox(-2.4F, 5.1F, -2.1F, 4, 3, 4, 0.0F);
        this.Head_Main.addChild(this.Nose_B);
        this.Head_Main.addChild(this.Nose_A);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.Back_Foot_L.render(f5);
        this.Front_TopLeg_L.render(f5);
        this.Tail_Hair.render(f5);
        this.Ear_L.render(f5);
        this.Tail.render(f5);
        this.Head_Main.render(f5);
        this.Back_Leg_L.render(f5);
        this.Body.render(f5);
        this.Front_Foot_R.render(f5);
        this.Front_Leg_R.render(f5);
        this.Ear_R.render(f5);
        this.Neck.render(f5);
        this.Back_Leg_R.render(f5);
        this.Corn.render(f5);
        this.Front_Leg_L.render(f5);
        this.Back_TopLeg_L.render(f5);
        this.Tail_Top.render(f5);
        this.Neck_Hair.render(f5);
        this.Back_TopLeg_R.render(f5);
        this.Back_Foot_R.render(f5);
        this.Front_TopLeg_R.render(f5);
        this.Front_Foot_L.render(f5);
    }
    
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
    	this.Front_TopLeg_L.offsetX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	this.Back_TopLeg_L.offsetX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    	
    	this.Front_TopLeg_L.offsetX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	this.Back_TopLeg_R.offsetX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    	
    	this.Head_Main.rotateAngleY = netHeadYaw * 0.017453292F;
    	this.Head_Main.rotateAngleX = headPitch * 0.017453292F;
    }
}
