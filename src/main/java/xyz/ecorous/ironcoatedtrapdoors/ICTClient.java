package xyz.ecorous.ironcoatedtrapdoors;

import net.minecraft.client.render.RenderLayer;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.client.ClientModInitializer;
import org.quiltmc.qsl.block.extensions.api.client.BlockRenderLayerMap;

public class ICTClient implements ClientModInitializer {
	/**
	 * Runs the mod initializer on the client environment.
	 *
	 * @param mod the mod which is initialized
	 */
	@Override
	public void onInitializeClient(ModContainer mod) {
		// .putBlock(IronCoatedTrapdoors.IRON_COATED_TRAPDOOR, RenderLayer.getCutout());
		BlockRenderLayerMap.put(RenderLayer.getCutout(), IronCoatedTrapdoors.IRON_COATED_TRAPDOOR);
	}
}
