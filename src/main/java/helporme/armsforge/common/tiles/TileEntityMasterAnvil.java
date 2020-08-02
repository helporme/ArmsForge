package helporme.armsforge.common.tiles;

import helporme.armsforge.api.blocks.tables.CraftingTableType;
import helporme.armsforge.common.tiles.base.TileEntityCraftingTableBase;

public class TileEntityMasterAnvil extends TileEntityCraftingTableBase
{
    @Override
    public CraftingTableType getType()
    {
        return new CraftingTableType("Anvil", 1);
    }
}
