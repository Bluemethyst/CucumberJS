package dev.bluemethyst.cucumberjs.weapons;

import dev.latvian.mods.kubejs.core.NoMixinException;
import dev.latvian.mods.rhino.util.RemapPrefixForJS;

@SuppressWarnings("unused")
@RemapPrefixForJS("kjs_ccmbr$")
public interface RangedWeapon extends BasicWeapon {

    default void kjs_ccmbr$setRange(int range){}
    default int kjs_ccmbr$getRange(){
        throw new NoMixinException();
    }
}
