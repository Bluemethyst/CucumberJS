package dev.bluemethyst.cucumberjs.mixin;

import com.blakebr0.cucumber.item.tool.BasePickaxeItem;
import dev.bluemethyst.cucumberjs.weapons.BasicWeapon;
import org.spongepowered.asm.mixin.*;

@Mixin(value = BasePickaxeItem.class, remap = false)
public abstract class BasePickaxeItemMixin implements BasicWeapon {
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
