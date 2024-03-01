![CurseForge Downloads](https://img.shields.io/curseforge/dt/981646) ![Modrinth Downloads](https://img.shields.io/modrinth/dt/BjdncDG7)
# CucumberJS
### A KubeJS addon for creating [Cucumber Library](https://github.com/BlakeBr0/Cucumber) tools/weapons. That's it. idk why you'd need this

## [Download Here!](https://modrinth.com/mod/cucumberjs)

## Dependencies
- [KubeJS](https://www.curseforge.com/minecraft/mc-mods/kubejs)
- [Rhino](https://www.curseforge.com/minecraft/mc-mods/rhino)
- [Architectury](https://www.curseforge.com/minecraft/mc-mods/architectury-api)
- [Cucumber Library](https://www.curseforge.com/minecraft/mc-mods/cucumber)
### Recommend but not required
- [ProbeJS](https://www.curseforge.com/minecraft/mc-mods/probejs)

## Creating a tool
```js
// Inside startup_scripts, this will create a tool with no texture
StartupEvents.registry("item", (event) => {
    event.create("test_crossbow", "crossbow");
    event.create("test_fishingrod", "fishingrod");
    event.create("test_paxel", "paxel");
    event.create("test_scythe", "scythe");
    event.create("test_shear", "shears");
    event.create("test_sickle", "sickle");
    event.create("test_wateringcan", "wateringcan");
});
```

## Credits
[FooterMan15](https://github.com/FooterMan15) - KubeJS mod Addon template + PaxelJS references + being super great to work with!

[Bluemethyst](https://bluemethyst.dev) - Uh... being cool idk
