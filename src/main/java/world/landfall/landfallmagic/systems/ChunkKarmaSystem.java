package world.landfall.landfallmagic.systems;

import com.hypixel.hytale.component.ArchetypeChunk;
import com.hypixel.hytale.component.CommandBuffer;
import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.component.query.Query;
import com.hypixel.hytale.component.system.tick.EntityTickingSystem;
import com.hypixel.hytale.component.system.tick.TickingSystem;
import com.hypixel.hytale.server.core.universe.world.chunk.WorldChunk;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import world.landfall.landfallmagic.ModComponents;
import world.landfall.landfallmagic.components.ChunkKarmaComponent;

public class ChunkKarmaSystem extends EntityTickingSystem<ChunkStore> {
    @Override
    public void tick(float dt, int i, @NonNullDecl ArchetypeChunk<ChunkStore> archetypeChunk, @NonNullDecl Store<ChunkStore> store, @NonNullDecl CommandBuffer<ChunkStore> commandBuffer) {
        var karmaChunk = archetypeChunk.getComponent(i, ModComponents.getChunkKarmaComponent());
        var worldChunk = archetypeChunk.getComponent(i, WorldChunk.getComponentType());
        Ref<ChunkStore> ref = archetypeChunk.getReferenceTo(i);



    }

    @NullableDecl
    @Override
    public Query<ChunkStore> getQuery() {
        return Query.and(ChunkKarmaComponent.get());
    }
}
