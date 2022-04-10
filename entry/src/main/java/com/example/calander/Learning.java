package com.example.calander;

import com.example.calander.slice.AbilitySlice1;
import com.example.calander.slice.AbilitySlice2;
import com.example.calander.slice.LearningSlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class Learning extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(LearningSlice.class.getName());

        super.addActionRoute("abilityslice1", AbilitySlice1.class.getName());
        super.addActionRoute("abilityslice2", AbilitySlice2.class.getName());
    }
}
