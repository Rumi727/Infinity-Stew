package kr.kro.teamdodoco.infinity_stew;

import kr.kro.teamdodoco.infinity_stew.items.InfinityStewItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item INFINITY_STEW = register(
            // Ignore the food component for now, we'll cover it later in the food section.
            new InfinityStewItem(),
            "infinity_stew"
    );

    public static Item register(Item item, String id)
    {
        // Create the identifier for the item.
        Identifier itemID = new Identifier(InfinityStew.MOD_ID, id);

        // Return the registered item!
        return Registry.register(Registries.ITEM, itemID, item);
    }

    public static void initialize() {
    }
}
