package dev.bluemethyst.toolsjs.kubejs;

import com.blakebr0.cucumber.item.tool.BaseShearsItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ShearItemBuilder extends HandheldItemBuilder {
    public ShearItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BaseShearsItem(properties -> createItemProperties());
    }
}
