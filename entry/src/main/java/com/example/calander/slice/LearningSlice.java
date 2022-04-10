package com.example.calander.slice;

import com.example.calander.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class LearningSlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_learning);

        Text btn = (Text)findComponentById(ResourceTable.Id_text_helloworld);
        btn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1 = new Intent();
                present(new AbilitySlice1(), intent1);
            }
        });
    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
