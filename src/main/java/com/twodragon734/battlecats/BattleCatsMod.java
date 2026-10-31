package com.twodragon734.battlecats;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BattleCatsMod implements ModInitializer {
    public static final String MOD_ID = "battle_cats";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final Item CAT_BELL = new Item(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "cat_bell"), CAT_BELL);
        LOGGER.info("Battle Cats mod loaded: meow!");
    }
}
