package net.militaryk.meinkoin.util;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.minecraftforge.client.settings.KeyConflictContext;
import org.lwjgl.glfw.GLFW;

public class KeyBinding {
    public static final String KEY_CATERGORY = "key.meinkoin.category";
    public static final String KEY_Money = "key.meinkoin.get_koin";

    public static final KeyMapping GET_KOIN = new KeyMapping(KEY_Money, KeyConflictContext.IN_GAME, InputConstants.Type.KEYSYM, GLFW.GLFW_KEY_GRAVE_ACCENT, KEY_CATERGORY);
    public static long lastPressTime;
}
