package dev.bluemethyst.cucumberjs.mixin;

import com.blakebr0.cucumber.item.BaseWateringCanItem;
import com.blakebr0.cucumber.item.tool.*;
import dev.bluemethyst.cucumberjs.item.CucumberItem;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = {BaseAxeItem.class, BaseHoeItem.class, BasePickaxeItem.class, BaseShovelItem.class, BaseScytheItem.class, BaseSickleItem.class, BaseSwordItem.class, BaseWateringCanItem.class, BasePaxelItem.class}, remap = false)
public abstract class CucumberItemMixin implements CucumberItem {
}
