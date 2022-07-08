package git.cozy06.mod;

import git.cozy06.mod.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Advanturous implements ModInitializer {

	public static final String MOD_ID = "advanturous";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItem.registerModItems();
	}
}
