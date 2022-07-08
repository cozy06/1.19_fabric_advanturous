package git.cozy06.mod.item;

import git.cozy06.mod.Advanturous;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItem {

    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot",
            new Item(new FabricItemSettings().group(ItemGroup.MATERIALS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Advanturous.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Advanturous.LOGGER.info("Registering Mod Items for " + Advanturous.MOD_ID);
    }
}