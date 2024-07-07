package empty.botics.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent TENDRIL = new FoodComponent.Builder().hunger(6).saturationModifier(0.3f).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA,80,2),0.8f).alwaysEdible().build();
}
