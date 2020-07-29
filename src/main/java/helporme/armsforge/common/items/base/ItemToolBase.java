package helporme.armsforge.common.items.base;

public class ItemToolBase extends ItemBase
{
    public ItemToolBase(String name)
    {
        super(name);
        this.setMaxStackSize(1);
    }

    public boolean isFull3D()
    {
        return true;
    }
}