package helporme.armsforge.forge.wrapper.items;

public class ItemTool extends ItemBase
{
    public ItemTool(String name, String itemType)
    {
        super(name, itemType);
        this.setMaxStackSize(1);
    }

    @Override
    public boolean isFull3D()
    {
        return true;
    }
}