package net.dzultra.realms_notification_nuker.mixin;

import com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets = "com.mojang.realmsclient.gui.screens.RealmsNotificationsScreen")
public class RealmsNotificationsScreenMixin {
    @Redirect(
            method = "extractRenderState",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/mojang/realmsclient/gui/screens/RealmsNotificationsScreen;extractIcons(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V"
            )
    )
    private void hideRealmsIcons(RealmsNotificationsScreen instance, GuiGraphicsExtractor graphics) {
        // Do nothing to prevent the icons from being extracted and displayed
    }
}

