package kr.kro.teamdodoco.infinity_stew;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;

public class InfinityStew implements ModInitializer
{
    public static String MOD_ID = "infinity_stew";

    @Override
    public void onInitialize()
    {
        ModItems.initialize();

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK)
                .register((itemGroup) -> itemGroup.add(ModItems.INFINITY_STEW));
    }
}
