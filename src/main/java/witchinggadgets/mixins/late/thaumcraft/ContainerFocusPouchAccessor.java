package witchinggadgets.mixins.late.thaumcraft;

import net.minecraft.item.ItemStack;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

import thaumcraft.common.container.ContainerFocusPouch;

@Mixin(ContainerFocusPouch.class)
public interface ContainerFocusPouchAccessor {

    @Accessor(value = "blockSlot", remap = false)
    void setBlockSlot(int blockSlot);

    @Accessor(value = "pouch", remap = false)
    void setPouch(ItemStack pouch);

    @Accessor(value = "pouch", remap = false)
    ItemStack getPouch();

}
