package world.landfall.landfallmagic.components;

import com.hypixel.hytale.codec.Codec;
import com.hypixel.hytale.codec.KeyedCodec;
import com.hypixel.hytale.codec.builder.BuilderCodec;
import com.hypixel.hytale.component.Component;
import com.hypixel.hytale.component.ComponentType;
import com.hypixel.hytale.server.core.universe.world.storage.ChunkStore;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import world.landfall.landfallmagic.ModComponents;

public class ChunkKarmaComponent implements Component<ChunkStore> {
    private int karma;

    public static final BuilderCodec<ChunkKarmaComponent> CODEC = BuilderCodec.<ChunkKarmaComponent>builder(
            ChunkKarmaComponent.class, ChunkKarmaComponent::new
    )
            .append(new KeyedCodec<Integer>("karma", Codec.INTEGER), (data, value) -> data.karma = value, (data) -> data.karma)
            .add().build();

    public ChunkKarmaComponent() {
        karma = 0;
    }
    private ChunkKarmaComponent(ChunkKarmaComponent clone) {
        karma = clone.karma;
    }

    @NullableDecl
    @Override
    public Component<ChunkStore> clone() {
        return new ChunkKarmaComponent(this);
    }
    public int getKarma() {
        return karma;
    }
    public void setKarma(int karma) {
        this.karma = karma;
    }
    public static ComponentType<ChunkStore, ChunkKarmaComponent> get() {
        return ModComponents.getChunkKarmaComponent();
    }

}
