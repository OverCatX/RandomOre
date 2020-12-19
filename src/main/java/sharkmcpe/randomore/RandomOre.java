package sharkmcpe.randomore;

import cn.nukkit.plugin.PluginBase;
import sharkmcpe.randomore.Events.BlockUpdate;

public class RandomOre extends PluginBase {

    @Override
    public void onEnable() {
        getLogger().info("สร้างโดย SharkMCPE");
        this.saveDefaultConfig();
        registerEvent();
    }

    private void registerEvent() {
        getServer().getPluginManager().registerEvents(new BlockUpdate(), this);
    }
}