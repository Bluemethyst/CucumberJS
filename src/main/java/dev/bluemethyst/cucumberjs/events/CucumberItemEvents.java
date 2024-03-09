package dev.bluemethyst.cucumberjs.events;

import dev.bluemethyst.cucumberjs.item.CucumberItemModificationEventJS;
import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventHandler;

public interface CucumberItemEvents {
    EventGroup GROUP = EventGroup.of("CucumberItemEvents");

    EventHandler MODIFICATION = GROUP.startup("modification", () -> CucumberItemModificationEventJS.class);
}
