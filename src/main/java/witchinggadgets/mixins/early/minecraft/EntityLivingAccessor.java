package witchinggadgets.mixins.early.minecraft;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(EntityLiving.class)
public interface EntityLivingAccessor {

    @Accessor
    int getExperienceValue();

    @Accessor
    void setAttackTarget(EntityLivingBase attackTarget);

}
