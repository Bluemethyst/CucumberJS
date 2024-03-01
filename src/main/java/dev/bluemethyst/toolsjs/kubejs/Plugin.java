package dev.bluemethyst.toolsjs.kubejs;

import dev.latvian.mods.kubejs.KubeJSPlugin;
import dev.latvian.mods.kubejs.registry.RegistryInfo;

public class Plugin extends KubeJSPlugin {
    @Override
    public void init() {
        RegistryInfo.ITEM.addType("bow", BowItemBuilder.class, BowItemBuilder::new);
        RegistryInfo.ITEM.addType("scythe", ScytheItemBuilder.class, ScytheItemBuilder::new);
        RegistryInfo.ITEM.addType("crossbow", CrossbowItemBuilder.class, CrossbowItemBuilder::new);
        RegistryInfo.ITEM.addType("fishingrod", FishingrodItemBuilder.class, FishingrodItemBuilder::new);
        RegistryInfo.ITEM.addType("paxel", PaxelItemBuilder.class, PaxelItemBuilder::new);
        RegistryInfo.ITEM.addType("shears", ShearItemBuilder.class, ShearItemBuilder::new);
        RegistryInfo.ITEM.addType("sickle", SickleItemBuilder.class, SickleItemBuilder::new);
        RegistryInfo.ITEM.addType("wateringcan", WateringcanItemBuilder.class, WateringcanItemBuilder::new);
    }
}