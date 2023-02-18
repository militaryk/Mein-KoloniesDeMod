package net.militaryk.meinkoin.event;

import net.militaryk.meinkoin.MeinKoin;
import net.militaryk.meinkoin.item.ModItems;
import net.militaryk.meinkoin.util.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.InputEvent;
import net.minecraft.network.chat.Component;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ClientEvents {
    public static int Wait = 120;
    public static long Fails = 0;

    public static boolean issafe = true;

    public static boolean active = false;
    @Mod.EventBusSubscriber(modid = MeinKoin.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key event){
            if (active) {
                if (KeyBinding.GET_KOIN.consumeClick()) {
                    if (issafe) {
                        if (System.currentTimeMillis() - KeyBinding.lastPressTime > Wait * 1000 || KeyBinding.lastPressTime == 0) {
                            Minecraft.getInstance().player.sendSystemMessage(Component.literal("You get a koin!"));
                            Minecraft.getInstance().player.getInventory().add(new ItemStack(ModItems.MEINKOIN.get()));
                            //Store the time of the last key press
                            KeyBinding.lastPressTime = System.currentTimeMillis();
                        } else {
                            long WaitTime = (int) (Wait - (System.currentTimeMillis() - KeyBinding.lastPressTime) / 1000);
                            Minecraft.getInstance().player.sendSystemMessage(Component.literal("You must wait " + WaitTime + " seconds to get another koin!"));
                            Fails++;
                            if (Fails > 5) {
                                Minecraft.getInstance().player.sendSystemMessage(Component.literal("You have failed to get a koin too many times!"));
                                issafe = false;
                            }
                        }
                    } else {
                        Minecraft.getInstance().player.sendSystemMessage(Component.literal("Unfortunantly you have been detected as a bot and are unable to get a koin! Please rejoin the server to get a koin again!"));
                    }

                }
            }
        }
    }

    @Mod.EventBusSubscriber(modid = MeinKoin.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public  static void onKeyRegister(RegisterKeyMappingsEvent event){
            event.register(KeyBinding.GET_KOIN);
        }
    }


}
