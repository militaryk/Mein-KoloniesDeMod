package net.militaryk.meinkoin.item.custom;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
//

public class WalletItem extends Item {
    public WalletItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, InteractionHand interactionHand) {

        if (!level.isClientSide && interactionHand == InteractionHand.MAIN_HAND) {
            //Tell the player the time in real life



        }

        return super.use(level, player, interactionHand);
    }
}