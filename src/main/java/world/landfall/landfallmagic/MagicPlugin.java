package world.landfall.landfallmagic;

import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import world.landfall.landfallmagic.systems.ChunkKarmaSystem;

import javax.annotation.Nonnull;

public class MagicPlugin extends JavaPlugin {

    public MagicPlugin(@Nonnull JavaPluginInit init) {
        super(init);
    }

    @Override
    protected void setup() {
        ModComponents.setup(this);
    }
}