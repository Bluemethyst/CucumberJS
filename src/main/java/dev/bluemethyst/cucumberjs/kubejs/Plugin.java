package dev.bluemethyst.cucumberjs.kubejs;

import dev.bluemethyst.cucumberjs.events.CucumberItemEvents;
import dev.bluemethyst.cucumberjs.item.CucumberItemModificationEventJS;
import dev.bluemethyst.cucumberjs.kubejs.items.*;
import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;
import dev.latvian.mods.kubejs.script.ScriptType;

public class Plugin extends KubeJSPlugin {
    @Override
    public void init() {
        RegistryInfo.ITEM.addType("scythe", ScytheItemBuilder.class, ScytheItemBuilder::new);
        RegistryInfo.ITEM.addType("crossbow", CrossbowItemBuilder.class, CrossbowItemBuilder::new);
        RegistryInfo.ITEM.addType("fishingrod", FishingrodItemBuilder.class, FishingrodItemBuilder::new);
        RegistryInfo.ITEM.addType("paxel", PaxelItemBuilder.class, PaxelItemBuilder::new);
        RegistryInfo.ITEM.addType("sickle", SickleItemBuilder.class, SickleItemBuilder::new);
        RegistryInfo.ITEM.addType("wateringcan", WateringcanItemBuilder.class, WateringcanItemBuilder::new);
        RegistryInfo.ITEM.addType("horsearmor", HorsearmorItemBuilder.class, HorsearmorItemBuilder::new);
    }

    @Override
    public void registerEvents(){
        CucumberItemEvents.GROUP.register();
    }

    @Override
    public void afterInit(){
        CucumberItemEvents.MODIFICATION.post(ScriptType.STARTUP, new CucumberItemModificationEventJS());
    }
}