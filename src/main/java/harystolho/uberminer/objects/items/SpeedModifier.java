package harystolho.uberminer.objects.items;

import harystolho.uberminer.Main;
import harystolho.uberminer.init.ItemInit;
import harystolho.uberminer.utils.IHasModel;
import net.minecraft.item.Item;

public class SpeedModifier extends Item implements IHasModel{

	public SpeedModifier(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setMaxStackSize(1);
		setMaxDamage(0);
		setCreativeTab(Main.UBERMINER);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}


}