package dev.bluemethyst.cucumberjs.weapons;

import dev.latvian.mods.kubejs.typings.Info;
import dev.latvian.mods.rhino.util.RemapForJS;
import dev.latvian.mods.rhino.util.RemapPrefixForJS;

@RemapPrefixForJS("kjs_ccmbr$")
@SuppressWarnings("unused")
public interface WateringCan {

    @Info(value = "Modify the range of an already created Cucumber Library watering can")
    default void kjs_ccmbr$setRange(int range) {}

    @Info(value = "Modify the chance to bonemeal on an already created Cucumber Library watering can")
    default void kjs_ccmbr$setChance(double chance) {}

}
