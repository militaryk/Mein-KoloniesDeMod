package net.militaryk.meinmod.commands;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.commands.CommandSource;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class SetMessageCommand {
    public SetMessageCommand(CommandDispatcher<CommandSourceStack> dispatcher){
        Commands.literal("setmessage").then(Commands.literal("set").executes((command) -> {
            // Your code here
            return 0;
        }));
    }

    // When /setmessage command is run this method will post "Hello" into the chat
    public static int setMessage(CommandSource source) throws CommandSyntaxException {
        return 1;
    }
}
