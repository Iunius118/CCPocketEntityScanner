package iunius118.mods.ccpocketentityscanner;

import dan200.computercraft.api.ComputerCraftAPI;
import iunius118.mods.ccpocketentityscanner.pocket.PocketEntityScanner;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = CCPocketEntityScanner.MOD_ID, name = CCPocketEntityScanner.MOD_NAME, version = CCPocketEntityScanner.MOD_VERSION, dependencies = CCPocketEntityScanner.MOD_DEPENDENCIES, useMetadata = true)
@EventBusSubscriber
public class CCPocketEntityScanner
{

    public static final String MOD_ID = "ccpocketentityscanner";
    public static final String MOD_NAME = "CCPocketEntityScanner";
    public static final String MOD_VERSION = "${version}";
    public static final String MOD_DEPENDENCIES = "required-after:forge@[1.12-14.21.1.2387,);required-after:computercraft";

    public static final String NAME_ITEM_ENTITY_SCANNER = "entity_scanner";

    @SidedProxy
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void Init(FMLInitializationEvent event)
    {
        ComputerCraftAPI.registerPocketUpgrade(new PocketEntityScanner());
    }

    @ObjectHolder(MOD_ID)
    public static class ITEMS
    {
        @ObjectHolder(NAME_ITEM_ENTITY_SCANNER)
        public static final Item itemEntityScanner = null;
    }


    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                new Item().setRegistryName(NAME_ITEM_ENTITY_SCANNER).setUnlocalizedName(MOD_ID + ":" + NAME_ITEM_ENTITY_SCANNER).setCreativeTab(CreativeTabs.MISC)
                );
    }

    public static class CommonProxy
    {
        public void preInit(FMLPreInitializationEvent event)
        {

        }
    }


    @SideOnly(Side.SERVER)
    public static class ServerProxy extends CommonProxy
    {

    }

    @SideOnly(Side.CLIENT)
    public static class ClientProxy extends CommonProxy
    {
        @Override
        public void preInit(FMLPreInitializationEvent event)
        {
            super.preInit(event);
            MinecraftForge.EVENT_BUS.register(this);
        }

        @SubscribeEvent
        public void registerModels(ModelRegistryEvent event)
        {
            ModelLoader.setCustomModelResourceLocation(ITEMS.itemEntityScanner, 0, new ModelResourceLocation(MOD_ID + ":" + NAME_ITEM_ENTITY_SCANNER, "inventory"));
        }
    }

}
