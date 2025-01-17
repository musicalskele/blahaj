package org.prismlauncher.blahaj;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;

import java.util.List;
import java.util.function.Consumer;

public class Common implements ModInitializer {
	public static String MODID = "blahaj";

	public void onInitialize() {
		Item grayShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.gray_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("gray_shark"), grayShark);

		Item blueShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.blue_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("blue_shark"), blueShark);

		Item prideShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.pride_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("pride_shark"), prideShark);

		Item transShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.trans_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("trans_shark"), transShark);

		Item enbyShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.enby_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("enby_shark"), enbyShark);

		Item lesbianShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.lesbian_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("lesbian_shark"), lesbianShark);

		Item panShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.pan_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("pan_shark"), panShark);

		Item aroaceShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.aroace_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("aroace_shark"), aroaceShark);

		Item genderqueerShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.genderqueer_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("genderqueer_shark"), genderqueerShark);

		Item genderfluidShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.genderfluid_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("genderfluid_shark"), genderfluidShark);

		Item aroShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.aro_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("aro_shark"), aroShark);

		Item aceShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.ace_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("ace_shark"), aceShark);

		Item demisexualShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.demisexual_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("demisexual_shark"), demisexualShark);
		
		Item demiboyShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.demiboy_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("demiboy_shark"), demiboyShark);
		
		Item demigirlShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.demigirl_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("demigirl_shark"), demigirlShark);

		Item demiromanticShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.demiromantic_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("demiromantic_shark"), demiromanticShark);

		Item biShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.bi_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("bi_shark"), biShark);

		Item gayShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.gay_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("gay_shark"), gayShark);

		Item polyShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.poly_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("poly_shark"), polyShark);

		Item greyroseShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.greyrose_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("greyrose_shark"), greyroseShark);

		Item greysexualShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.greysexual_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("greysexual_shark"), greysexualShark);

		Item greyromanticShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.greyromantic_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("greyromantic_shark"), greyromanticShark);

		Item agenderShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.agender_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("agender_shark"), agenderShark);

		Item intersexShark = new CuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.intersex_shark.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("intersex_shark"), intersexShark);

		Item blueWhale = new ItemContainerCuddlyItem(new Item.Properties().stacksTo(1), "item.blahaj.blue_whale.tooltip");
		Registry.register(BuiltInRegistries.ITEM, asResource("blue_whale"), blueWhale);

		Item breadPillow = new CuddlyItem(new Item.Properties().stacksTo(1), null);
		Registry.register(BuiltInRegistries.ITEM, asResource("bread"), breadPillow);

		// Register items to item group
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register((content) -> {
			content.accept(blueShark);
			content.accept(grayShark);
			content.accept(prideShark);
			content.accept(transShark);
			content.accept(enbyShark);
			content.accept(lesbianShark);
			content.accept(aroaceShark);
			content.accept(panShark);
			content.accept(blueWhale);
			content.accept(breadPillow);
			content.accept(genderqueerShark);
			content.accept(genderfluidShark);
			content.accept(aroShark);
			content.accept(aceShark);
			content.accept(demisexualShark);
			content.accept(demiromanticShark);
			content.accept(demigirlShark);
			content.accept(demiboyShark);
			content.accept(biShark);
			content.accept(gayShark);
		    content.accept(polyShark);
			content.accept(greyroseShark);
			content.accept(greysexualShark);
			content.accept(greyromanticShark);
			content.accept(agenderShark);
			content.accept(intersexShark);
		});

		LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
			if(!source.isBuiltin()) return;
			if(id.equals(BuiltInLootTables.STRONGHOLD_CROSSING)
				|| id.equals(BuiltInLootTables.STRONGHOLD_CORRIDOR)) {
				LootPool pb = LootPool.lootPool()
					.with(LootItem.lootTableItem(grayShark)
						.setWeight(5).build())
					.with(LootItem.lootTableItem(Items.AIR)
						.setWeight(100).build()).build();
				tableBuilder.pool(pb);
			}
			else if(id.equals(BuiltInLootTables.VILLAGE_PLAINS_HOUSE)) {
				LootPool pb = LootPool.lootPool()
					.with(LootItem.lootTableItem(grayShark).build())
					.with(LootItem.lootTableItem(Items.AIR)
						.setWeight(43).build()).build();
				tableBuilder.pool(pb);
			}
			else if(id.equals(BuiltInLootTables.VILLAGE_TAIGA_HOUSE)
				|| id.equals(BuiltInLootTables.VILLAGE_SNOWY_HOUSE)) {
				LootPool pb = LootPool.lootPool()
					.with(LootItem.lootTableItem(grayShark)
						.setWeight(5).build())
					.with(LootItem.lootTableItem(Items.AIR)
						.setWeight(54).build()).build();
				tableBuilder.pool(pb);
			}
		});

		Consumer<List<VillagerTrades.ItemListing>> lambda = factories -> {
			factories.add((entity, random) -> new MerchantOffer(
				new ItemStack(Items.EMERALD, 15), new ItemStack(grayShark),
				2, 30, 0.1f));
		};

		TradeOfferHelper.registerVillagerOffers(VillagerProfession.SHEPHERD, 5, lambda);
	}

	public static ResourceLocation asResource(String name) {
		return new ResourceLocation(MODID, name);
	}
}
