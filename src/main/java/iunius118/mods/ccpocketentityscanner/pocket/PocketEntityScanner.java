package iunius118.mods.ccpocketentityscanner.pocket;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

import dan200.computercraft.api.peripheral.IPeripheral;
import dan200.computercraft.api.pocket.IPocketAccess;
import dan200.computercraft.api.pocket.IPocketUpgrade;
import iunius118.mods.ccpocketentityscanner.CCPocketEntityScanner;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class PocketEntityScanner implements IPocketUpgrade
{

    @Override
    @Nonnull
    public ResourceLocation getUpgradeID()
    {
        return CCPocketEntityScanner.ITEMS.itemEntityScanner.getRegistryName();
    }

    @Override
    @Nonnull
    public String getUnlocalisedAdjective()
    {
        return "upgrade.ccpocketentityscanner:entity_scanner.adjective";
    }

    @Override
    @Nonnull
    public ItemStack getCraftingItem()
    {
        return new ItemStack(CCPocketEntityScanner.ITEMS.itemEntityScanner);
    }

    @Override
    @Nullable
    public IPeripheral createPeripheral(@Nonnull IPocketAccess access)
    {
        return null;
    }

    @Override
    public void update(IPocketAccess access, IPeripheral peripheral)
    {
        IPocketUpgrade.super.update(access, peripheral);
    }

    @Override
    public boolean onRightClick(World world, IPocketAccess access, IPeripheral peripheral)
    {
        return IPocketUpgrade.super.onRightClick(world, access, peripheral);
    }

}
