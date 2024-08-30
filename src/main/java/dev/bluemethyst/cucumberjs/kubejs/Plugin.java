package dev.bluemethyst.cucumberjs.kubejs;

import dev.bluemethyst.cucumberjs.events.CucumberItemEvents;
import dev.bluemethyst.cucumberjs.kubejs.items.*;
import dev.latvian.mods.kubejs.BuiltinKubeJSPlugin;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.BuilderTypeRegistry;
import dev.latvian.mods.kubejs.script.ScriptType;
import net.minecraft.core.registries.Registries;

public class Plugin implements KubeJSPlugin {

    @Override
    public void registerBuilderTypes(BuilderTypeRegistry registry) {
        registry.of(Registries.ITEM, reg -> {
            reg.add("scythe", ScytheItemBuilder.class, ScytheItemBuilder::new);
            reg.add("sickle", SickleItemBuilder.class, SickleItemBuilder::new);
            reg.add("paxel", PaxelItemBuilder.class, PaxelItemBuilder::new);
            reg.add("crossbow", CrossbowItemBuilder.class, CrossbowItemBuilder::new);
            reg.add("fishingrod", FishingrodItemBuilder.class, FishingrodItemBuilder::new);
            reg.add("wateringcan", WateringcanItemBuilder.class, WateringcanItemBuilder::new);
            //reg.add("horsearmor", HorsearmorItemBuilder.class, HorsearmorItemBuilder::new);
        });
    }

    public void registerEvents(){
        //CucumberItemEvents.GROUP.register();
    }
}