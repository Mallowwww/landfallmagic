package world.landfall.landfallmagic;

import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import world.landfall.landfallmagic.components.ChunkKarmaComponent;

public class ModComponents {
    private static ComponentType<ChunkStore, ChunkKarmaComponent> chunkKarmaComponent;

    public static void setup(MagicPlugin plugin) {
        chunkKarmaComponent = plugin.getChunkStoreRegistry().registerComponent(ChunkKarmaComponent.class, "ChunkKarmaComponent", ChunkKarmaComponent.CODEC);
    }
    public static ComponentType<ChunkStore, ChunkKarmaComponent> getChunkKarmaComponent() {
        return chunkKarmaComponent;
    }
}
