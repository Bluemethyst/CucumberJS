package dev.bluemethyst.toolsjs.kubejs;

import com.blakebr0.cucumber.item.tool.BaseBowItem;
import dev.latvian.mods.kubejs.item.custom.HandheldItemBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class BowItemBuilder extends HandheldItemBuilder {
    public BowItemBuilder(ResourceLocation i) {
        super(i, 0.5f, -2f);
    }

    @Override
    public Item createObject() {
        return new BaseBowItem(properties -> createItemProperties());
    }
}
