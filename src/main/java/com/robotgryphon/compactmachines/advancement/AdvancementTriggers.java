package com.robotgryphon.compactmachines.advancement;

import com.robotgryphon.compactmachines.advancement.trigger.HowDidYouGetHereTrigger;
import net.minecraft.advancements.CriteriaTriggers;

public class AdvancementTriggers {

    public static final HowDidYouGetHereTrigger HOW_DID_YOU_GET_HERE = CriteriaTriggers.register(new HowDidYouGetHereTrigger());

    public static void init() {}
}
