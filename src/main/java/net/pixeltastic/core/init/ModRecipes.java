package net.pixeltastic.core.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	public static void init() {
		GameRegistry.addSmelting(ModItems.brokenpokeball, new ItemStack(ModItems.pokeballfragment, 3), 1.5f);
	}
}
