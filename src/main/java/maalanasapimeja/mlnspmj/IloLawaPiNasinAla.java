package maalanasapimeja.mlnspmj;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.player.PlayerSleepInBedEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;

/**
 * ilo lawa mute tawa lawa e ijo pi ma ala nasa pimeja. li jo ala e nasin.
 */
public class IloLawaPiNasinAla {
    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void kamaPiJanLiLapeLonSupaLape(PlayerSleepInBedEvent kamaPiJanLiLapeLonSupaLape) {
        //if (kamaPiJanLiLapeLonSupaLape.getPlayer().getEntityWorld().getDimensionKey().getRegistryName().toString().equals("ma_ala_nasa_pimeja")) {
            kamaPiJanLiLapeLonSupaLape.setResult((PlayerEntity.SleepResult) null);
        //}
    }
}
