package dev.bluemethyst.cucumberjs.mixin;

import com.blakebr0.cucumber.item.tool.BaseHoeItem;
import dev.bluemethyst.cucumberjs.weapons.BasicWeapon;
import org.spongepowered.asm.mixin.*;

@Mixin(value = BaseHoeItem.class, remap = false)
public abstract class BaseHoeItemMixin implements BasicWeapon {
    @Mutable
    @Shadow @Final private float attackDamage;

    @Mutable
    @Shadow @Final private float attackSpeed;

    @Override
    public void kjs_ccmbr$setAttackDamage(float dmg) {
        this.attackDamage = dmg;
    }

    @Override
    public void kjs_ccmbr$setAttackSpeed(float speed) {
        this.attackSpeed = speed;
    }
}
