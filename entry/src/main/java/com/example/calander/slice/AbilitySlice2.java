package com.example.calander.slice;

import com.example.calander.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class AbilitySlice2 extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_main_slice2);

        Button btn2 = (Button) findComponentById(ResourceTable.Id_btn2);
        btn2.setClickedListener(new Component.ClickedListener() {
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
