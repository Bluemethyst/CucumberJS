package dev.bluemethyst.cucumberjs.weapons;

import dev.latvian.mods.rhino.util.RemapForJS;
import dev.latvian.mods.rhino.util.RemapPrefixForJS;

@RemapPrefixForJS("kjs_ccmbr$")
@SuppressWarnings("unused")
public interface BasicWeapon {

    @RemapForJS("setCucumberAttackDamage")
    default void kjs_ccmbr$setAttackDamage(float dmg) {}

    @RemapForJS("setCucumberAttackSpeed")
    default void kjs_ccmbr$setAttackSpeed(float speed){}
}
