package helporme.armsforge.client.render.fx;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import helporme.armsforge.api.utils.Vector3;
import helporme.armsforge.common.core.Version;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class EntityFXBase extends EntityFX
{
    protected ResourceLocation texture;

    public EntityFXBase(World world, Vector3 position, Vector3 motion)
    {
        super(world, position.x, position.y, position.z, motion.x, motion.y, motion.z);
    }

    @Override
    public void renderParticle(Tessellator tessellator, float tick, float lrX, float udY, float lrZ, float udX, float udZ)
    {
        Minecraft minecraft = Minecraft.getMinecraft();

        double x = prevPosX + (posX - prevPosX) * tick - interpPosX;
        double y = prevPosY + (posY - prevPosY) * tick - interpPosY;
        double z = prevPosZ + (posZ - prevPosZ) * tick - interpPosZ;
        double scale = 0.1f * particleScale;

        minecraft.renderEngine.bindTexture(texture);

        GL11.glDepthMask(false);
        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.003921f);

        tessellator.startDrawingQuads();
        tessellator.setBrightness(getBrightnessForRender(tick));
        tessellator.addVertexWithUV(x - lrX * scale - udX * scale, y - udY * scale, z - lrZ * scale - udZ * scale, 0, 0);
        tessellator.addVertexWithUV(x - lrX * scale + udX * scale, y + udY * scale, z - lrZ * scale + udZ * scale, 1, 0);
        tessellator.addVertexWithUV(x + lrX * scale + udX * scale, y + udY * scale, z + lrZ * scale + udZ * scale, 1, 1);
        tessellator.addVertexWithUV(x + lrX * scale - udX * scale, y - udY * scale, z + lrZ * scale - udZ * scale, 0, 1);
        tessellator.draw();

        GL11.glDisable(GL11.GL_BLEND);
        GL11.glDepthMask(true);
        GL11.glAlphaFunc(GL11.GL_GREATER, 0.1f);
    }

    @Override
    public int getFXLayer()
    {
        return 3;
    }
}
