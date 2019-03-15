package com.ateam.christian;

import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(SillySwordMod.MODID)
public class SillySwordMod
{
    static final String MODID = "sillysword";
    private static final Logger LOGGER = LogManager.getLogger();

    public SillySwordMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addGenericListener(Item.class, this::registerItems);
    }

    private void registerItems(final RegistryEvent.Register<Item> itemRegistry) {
        final SillySword sillySword = new SillySword();
        sillySword.setRegistryName(MODID, "silly_sword");
        itemRegistry.getRegistry().register(sillySword);
        //Massive change by shreeni 
    }
}
