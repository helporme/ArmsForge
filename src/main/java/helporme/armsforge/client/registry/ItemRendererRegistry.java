package helporme.armsforge.client.registry;

import helporme.armsforge.common.blocks.models.ModelSuite;
import helporme.armsforge.common.registry.ModelsRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

public final class ItemRendererRegistry
{
    public static void registerItemRenderersFromModelSuites()
    {
        for (ModelSuite modelSuite : ModelsRegistry.getAllModelSuites())
        {
            Item item = Item.getItemFromBlock(modelSuite.block);
            registerItemRenderer(item, modelSuite.itemRenderer);
        }
    }

    public static void registerItemRenderer(Item item, IItemRenderer renderer)
    {
        MinecraftForgeClient.registerItemRenderer(item, renderer);
    }
}
