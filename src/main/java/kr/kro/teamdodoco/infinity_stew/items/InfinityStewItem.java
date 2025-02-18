package kr.kro.teamdodoco.infinity_stew.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfinityStewItem extends Item
{
    public InfinityStewItem()
    {
        super(new FabricItemSettings().maxCount(1).food(new FoodComponent.Builder().alwaysEdible().snack().hunger(40).saturationModifier(0.5f).build()));
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity entity)
    {
        entity.eatFood(world, stack.copy());
        return stack;
    }
}
