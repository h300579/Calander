package com.example.calander.slice;

import com.example.calander.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Component;

public class AbilitySlice1 extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_main_slice1);

        Button btn1 = (Button)findComponentById(ResourceTable.Id_btn1);
        btn1.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1 = new Intent();
                present(new AbilitySlice2(), intent1);
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
