package dev.bluemethyst.cucumberjs.mixin;

import com.blakebr0.cucumber.item.tool.BaseScytheItem;
import dev.bluemethyst.cucumberjs.weapons.RangedWeapon;
import org.spongepowered.asm.mixin.*;

@Mixin(value = BaseScytheItem.class, remap = false)
public abstract class BaseScytheItemMixin implements RangedWeapon {
    @Mutable
    @Shadow @Final private float attackDamage;

    @Mutable
    @Shadow @Final private float attackSpeed;

    @Mutable
    @Shadow @Final private int range;

    @Override
    public void kjs_ccmbr$setAttackDamage(float dmg) {
        this.attackDamage = dmg;
    }

    @Override
    public void kjs_ccmbr$setAttackSpeed(float speed) {
        this.attackSpeed = speed;
    }

    @Override
    public void kjs_ccmbr$setRange(int range) {
        this.range = range;
    }

    @Override
    public int kjs_ccmbr$getRange() {
        return this.range;
    }
}
