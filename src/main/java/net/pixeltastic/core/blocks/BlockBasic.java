package net.pixeltastic.core.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBasic extends Block {

	public BlockBasic(String name, String registry, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(registry);
	}
}