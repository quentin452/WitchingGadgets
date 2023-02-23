package witchinggadgets.mixins.late.thaumcraft;

import net.minecraft.init.Items;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import org.spongepowered.asm.mixin.Mixin;

import thaumcraft.common.items.armor.ItemBootsTraveller;
import witchinggadgets.common.WGConfig;

@Mixin(ItemBootsTraveller.class)
public class MixinItemBootsTraveller extends ItemArmor {

    @Override
    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2) {
        return WGConfig.coremod_allowBootsRepair && stack2.isItemEqual(new ItemStack(Items.leather));
    }

    /* Needs constructor matching super */
    public MixinItemBootsTraveller(ArmorMaterial p_i45325_1_, int p_i45325_2_, int p_i45325_3_) {
        super(p_i45325_1_, p_i45325_2_, p_i45325_3_);
    }
}
