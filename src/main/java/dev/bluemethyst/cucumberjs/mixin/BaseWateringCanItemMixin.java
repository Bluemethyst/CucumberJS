package dev.bluemethyst.cucumberjs.mixin;

import com.blakebr0.cucumber.item.BaseWateringCanItem;
import dev.bluemethyst.cucumberjs.weapons.WateringCan;
import dev.latvian.mods.kubejs.typings.Info;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(value = BaseWateringCanItem.class, remap = false)
public abstract class BaseWateringCanItemMixin implements WateringCan {

        @Mutable
        @Shadow @Final private int range;

        @Mutable
        @Shadow @Final private double chance;

        @Override
        public void kjs_ccmbr$setRange(int range) {
            this.range = range;
        }

        @Override
        public void kjs_ccmbr$setChance(double chance) {
            this.chance = chance;
        }
}


