package com.ateam.christian;

import net.minecraft.item.*;

public class SillySword extends ItemSword {
    private static final int ATTACK_DAMAGE = 900;
    private static final float ATTACK_SPEED = 10f;
    public SillySword() {
        super(ItemTier.IRON, ATTACK_DAMAGE, ATTACK_SPEED, (new Item.Properties()).group(ItemGroup.COMBAT));
    }
}
