package helporme.armsforge.client.render.block.tiles.base;

import helporme.armsforge.common.block.model.ModelInfo;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

public class TileEntityRenderEightFacedBase extends TileEntityRendererBase
{
    public TileEntityRenderEightFacedBase(ModelInfo modelInfo)
    {
        super(modelInfo);
    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float timeDelta)
    {
        bindTexture(texture);
        GL11.glPushMatrix();
        GL11.glTranslated(x + 0.5d, y, z + 0.5d);
        GL11.glRotated(tile.getBlockMetadata() * -45d, 0, 1, 0);
        model.renderAll();
        GL11.glPopMatrix();
    }
}