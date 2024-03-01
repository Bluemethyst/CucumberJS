![CurseForge Downloads](https://img.shields.io/curseforge/dt/981423) ![Modrinth Downloads](https://img.shields.io/modrinth/dt/uhFMFB46)
# ScytheJS
### A KubeJS addon for creating [Cucumber Library](https://github.com/BlakeBr0/Cucumber) scythes. That's it. idk why you'd need this


## Dependencies
- [KubeJS](https://www.curseforge.com/minecraft/mc-mods/kubejs)
- [Rhino](https://www.curseforge.com/minecraft/mc-mods/rhino)
- [Architectury](https://www.curseforge.com/minecraft/mc-mods/architectury-api)
- [Cucumber Library](https://www.curseforge.com/minecraft/mc-mods/cucumber)
### Recommend but not required
- [ProbeJS](https://www.curseforge.com/minecraft/mc-mods/probejs)

## Creating a scythe
```js
// Inside startup_scripts, this will create a scythe with no texture named 'kubejs:test_scythe'
StartupEvents.registry("item", (event) => {
    event.create("test_scythe", "scythe");
});
```

## Credits
[FooterMan15](https://github.com/FooterMan15) - KubeJS mod Addon template + PaxelJS references

[Bluemethyst](https://bluemethyst.dev) - Uh... being cool idk
