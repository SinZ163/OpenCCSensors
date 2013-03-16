package openccsensors.common.helper;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import openccsensors.common.items.ItemSensorCard;

public class IC2Helper {
	public static ItemStack getItemStack(String itemName) {
		ItemStack itemStack = null;
		try {
			itemStack = ic2.api.Items.getItem(itemName);
		}catch(Exception e) {}
		return itemStack;
	}

	public static void addTier1CardRecipe() {
		ItemStack icStack = IC2Helper.getItemStack("copperCableItem");
		if (icStack == null) {
			icStack = new ItemStack(Item.flint);
		}
		RecipeHelper.addTier1CardRecipe(ItemSensorCard.INDUSTRIALCRAFT_TIER_1, icStack);
	
	}
}
