package net.militaryk.meinkoin.item;

import net.militaryk.meinkoin.MeinKoin;
import net.militaryk.meinkoin.item.custom.WalletItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MeinKoin.MOD_ID);

    public static final RegistryObject<Item> MEINKOIN  = ITEMS.register("koin", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.MEINKOIN_TAB).fireResistant().stacksTo(64).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> WALLET  = ITEMS.register("wallet", () -> new WalletItem(new Item.Properties().tab(ModCreativeModeTab.MEINKOIN_TAB).stacksTo(1).rarity(Rarity.EPIC)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
