package xyz.ecorous.ironcoatedtrapdoors;

import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.block.extensions.api.QuiltBlockSettings;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IronCoatedTrapdoors implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod name as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("IronCoatedTrapdoors");
	public static final IronCoatedTrapdoor IRON_COATED_TRAPDOOR = new IronCoatedTrapdoor(QuiltBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).nonOpaque().sounds(BlockSoundGroup.METAL).strength(4.0F).requiresTool());
	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("Hello Quilt world from {}!", mod.metadata().name());
		Registry.register(Registry.BLOCK, new Identifier("ironcoatedtrapdoors", "iron_coated_trapdoor"), IRON_COATED_TRAPDOOR);
		Registry.register(Registry.ITEM, new Identifier("ironcoatedtrapdoors", "iron_coated_trapdoor"), new BlockItem(IRON_COATED_TRAPDOOR, new QuiltItemSettings().group(ItemGroup.REDSTONE)));
	}
}
