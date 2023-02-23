package witchinggadgets.mixins.late.thaumcraft;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import org.spongepowered.asm.mixin.Mixin;

import thaumcraft.common.items.wands.ItemFocusPouchBauble;
import travellersgear.api.IActiveAbility;
import witchinggadgets.WitchingGadgets;
import witchinggadgets.common.WGConfig;

@Mixin(ItemFocusPouchBauble.class)
public class MixinItemFocusPouchBauble implements IActiveAbility {

    @Override
    public boolean canActivate(EntityPlayer entityPlayer, ItemStack itemStack, boolean b) {
        return WGConfig.coremod_allowFocusPouchActive;
    }

    @Override
    public void activate(EntityPlayer entityPlayer, ItemStack itemStack) {
        if (!entityPlayer.worldObj.isRemote) entityPlayer.openGui(
                WitchingGadgets.instance,
                6,
                entityPlayer.worldObj,
                MathHelper.floor_double(entityPlayer.posX),
                MathHelper.floor_double(entityPlayer.posY),
                MathHelper.floor_double(entityPlayer.posZ));
    }

}
