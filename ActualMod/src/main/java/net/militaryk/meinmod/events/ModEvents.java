package net.militaryk.meinmod.events;

import net.militaryk.meinmod.MeinMod;
import net.militaryk.meinmod.commands.SetMessageCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = MeinMod.MOD_ID)
public class ModEvents {

    public static void onCommandRegister(RegisterCommandsEvent event) {
        new SetMessageCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());
    }

}
