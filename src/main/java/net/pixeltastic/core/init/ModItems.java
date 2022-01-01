package net.pixeltastic.core.init;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.pixeltastic.core.Core;
import net.pixeltastic.core.items.ItemBasic;

@Mod.EventBusSubscriber(modid=Core.MODID)
public class ModItems {
	static Item elecrockbadge;
	static Item waterbadge;
	static Item flyingbadge;
	static Item badge4;
	static Item badge5;
	static Item badge6;
	static Item badge7;
	static Item badge8;
	static Item brokenpokeball;
	static Item pokeballpart;
	static Item pokeballfragment;
	static Item retributionkeycardpart;
	static Item retributionkeycardchip;
	static Item retributionkeycard;
	static Item retributionmasterkeycard;
	static Item dummyitem;
	static Item debugitem;
	static Item masterballpart;
	static Item fakemasterball;
	
	static final CreativeTabs pixeltastic = (new CreativeTabs("pixeltastic") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(retributionkeycard);
		}
	});
	
	public static void init() {
		elecrockbadge = new ItemBasic("elecrockbadge").setCreativeTab(pixeltastic).setMaxStackSize(1);
		waterbadge = new ItemBasic("waterbadge").setCreativeTab(pixeltastic).setMaxStackSize(1);
		flyingbadge = new ItemBasic("flyingbadge").setCreativeTab(pixeltastic).setMaxStackSize(1);
		badge4 = new ItemBasic("badge4").setCreativeTab(pixeltastic).setMaxStackSize(1);
		badge5 = new ItemBasic("badge5").setCreativeTab(pixeltastic).setMaxStackSize(1);
		badge6 = new ItemBasic("badge6").setCreativeTab(pixeltastic).setMaxStackSize(1);
		badge7 = new ItemBasic("badge7").setCreativeTab(pixeltastic).setMaxStackSize(1);
		badge8 = new ItemBasic("badge8").setCreativeTab(pixeltastic).setMaxStackSize(1);
		brokenpokeball = new ItemBasic("brokenpokeball").setCreativeTab(pixeltastic).setMaxStackSize(16);
		pokeballpart = new ItemBasic("pokeballpart").setCreativeTab(pixeltastic).setMaxStackSize(64);
		pokeballfragment = new ItemBasic("pokeballfragment").setCreativeTab(pixeltastic).setMaxStackSize(64);
		brokenpokeball = new ItemBasic("brokenpokeball").setCreativeTab(pixeltastic).setMaxStackSize(16);
		retributionkeycardpart = new ItemBasic("retributionkeycardpart").setCreativeTab(pixeltastic).setMaxStackSize(64);
		retributionkeycardchip = new ItemBasic("retributionkeycardchip").setCreativeTab(pixeltastic).setMaxStackSize(64);
		retributionkeycard = new ItemBasic("retributionkeycard").setCreativeTab(pixeltastic).setMaxStackSize(2);
		retributionmasterkeycard = new ItemBasic("retributionmasterkeycard").setCreativeTab(pixeltastic).setMaxStackSize(2);
		dummyitem = new ItemBasic("dummyitem").setMaxStackSize(64);
		debugitem = new ItemBasic("debugitem").setMaxStackSize(64);
		masterballpart = new ItemBasic("masterballpart").setCreativeTab(pixeltastic).setMaxStackSize(64);
		fakemasterball = new ItemBasic("fakemasterball").setCreativeTab(pixeltastic).setMaxStackSize(64);
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(elecrockbadge);
		event.getRegistry().registerAll(waterbadge);
		event.getRegistry().registerAll(flyingbadge);
		event.getRegistry().registerAll(badge4);
		event.getRegistry().registerAll(badge5);
		event.getRegistry().registerAll(badge6);
		event.getRegistry().registerAll(badge7);
		event.getRegistry().registerAll(badge8);
		event.getRegistry().registerAll(pokeballpart);
		event.getRegistry().registerAll(pokeballfragment);
		event.getRegistry().registerAll(brokenpokeball);
		event.getRegistry().registerAll(retributionkeycardpart);
		event.getRegistry().registerAll(retributionkeycardchip);
		event.getRegistry().registerAll(retributionkeycard);
		event.getRegistry().registerAll(retributionmasterkeycard);
		event.getRegistry().registerAll(dummyitem);
		event.getRegistry().registerAll(debugitem);
		event.getRegistry().registerAll(masterballpart);
		event.getRegistry().registerAll(fakemasterball);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(elecrockbadge);
		registerRender(waterbadge);
		registerRender(flyingbadge);
		registerRender(badge4);
		registerRender(badge5);
		registerRender(badge6);
		registerRender(badge7);
		registerRender(badge8);
		registerRender(pokeballpart);
		registerRender(pokeballfragment);
		registerRender(brokenpokeball);
		registerRender(retributionkeycardpart);
		registerRender(retributionkeycardchip);
		registerRender(retributionkeycard);
		registerRender(retributionmasterkeycard);
		registerRender(dummyitem);
		registerRender(debugitem);
		registerRender(masterballpart);
		registerRender(fakemasterball);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}
