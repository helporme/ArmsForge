package helporme.armsforge.common.registry.items;

import helporme.armsforge.common.items.weapon.*;

public class WeaponList extends ItemList
{
    @Override
    public void addDefault()
    {
        addItems(
                new ItemCinquedaWeapon(),
                new ItemCommonWeapon(),
                new ItemErzacWeapon(),
                new ItemGladiusWeapon(),
                new ItemKarolingWeapon(),
                new ItemKatanaWeapon(),
                new ItemKopisWeapon(),
                new ItemNinzatoWeapon(),
                new ItemSabreWeapon(),
                new ItemScimitarWeapon(),
                new ItemMaceWeapon(),
                new ItemMetalclubWeapon(),
                new ItemHammerWeapon(),
                new ItemSixfighterWeapon(),
                new ItemDaggerWeapon(),
                new ItemBattleknifeWeapon(),
                new ItemDegenWeapon(),
                new ItemStickTwoHandedWeapon());
    }
}
