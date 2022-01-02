package net.pixeltastic.core.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import net.pixeltastic.core.Core;
import net.pixeltastic.core.blocks.BlockBasic;

@Mod.EventBusSubscriber(modid=Core.MODID)
public class ModBlocks {

	static Block crate;
	static Block fakeportalew;
	static Block fakeportal;
	static Block amogusplush;

    /*boolean isOpaqueCube(IBlockState state) {
        return false;
    }*/
	
	public static void init() {
		crate = new BlockBasic("crate", "crate", Material.ROCK).setHardness(1.5f).setCreativeTab(ModItems.pixeltastic).setLightLevel(1.0f).setBlockUnbreakable().setLightOpacity(0);
		crate.setHarvestLevel("pickaxe", 2);
		fakeportalew = new BlockBasic("fakeportalew", "fakeportalew", Material.ROCK).setHardness(1.5f).setCreativeTab(ModItems.pixeltastic).setLightLevel(1.0f).setBlockUnbreakable().setLightOpacity(0);
		fakeportal = new BlockBasic("fakeportal", "fakeportal", Material.ROCK).setHardness(1.5f).setCreativeTab(ModItems.pixeltastic).setLightLevel(1.0f).setBlockUnbreakable().setLightOpacity(0);
		amogusplush = new BlockBasic("amogusplush", "amogusplush", Material.ROCK).setHardness(1.5f).setCreativeTab(ModItems.pixeltastic).setLightOpacity(0);
        //amogusplush.isOpaqueCube();
		amogusplush.setHarvestLevel("axe", 1);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(new BlockBasic("crate", "crate", Material.ROCK).setHardness(1.5f).setLightLevel(1.0f).setBlockUnbreakable().setLightOpacity(0));
		event.getRegistry().registerAll(new BlockBasic("fakeportalew", "fakeportalew", Material.ROCK).setHardness(1.5f).setLightLevel(1.0f).setBlockUnbreakable().setLightOpacity(0));
		event.getRegistry().registerAll(new BlockBasic("fakeportal", "fakeportal", Material.ROCK).setHardness(1.5f).setLightLevel(1.0f).setBlockUnbreakable().setLightOpacity(0));
		event.getRegistry().registerAll(new BlockBasic("amogusplush", "amogusplush", Material.ROCK).setHardness(1.5f).setLightOpacity(0));
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(new ItemBlock(crate).setRegistryName("crate"));
		event.getRegistry().registerAll(new ItemBlock(fakeportalew).setRegistryName("fakeportalew"));
		event.getRegistry().registerAll(new ItemBlock(fakeportal).setRegistryName("fakeportal"));
		event.getRegistry().registerAll(new ItemBlock(amogusplush).setRegistryName("amogusplush"));
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(crate));
		registerRender(Item.getItemFromBlock(fakeportalew));
		registerRender(Item.getItemFromBlock(fakeportal));
		registerRender(Item.getItemFromBlock(amogusplush));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}