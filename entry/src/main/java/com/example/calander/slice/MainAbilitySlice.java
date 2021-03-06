package com.example.calander.slice;

import com.example.calander.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Component;
import ohos.agp.components.Text;

public class MainAbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_first_layout);

        Text btn = (Text)findComponentById(ResourceTable.Id_text);
        btn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                Intent intent1 = new Intent();
                present(new AbilitySlice1(), intent1);
            }
        });

        //        Text text = (Text)findComponentById(ResourceTable.Id_text_helloworld);
//        Button button = (Button)findComponentById(ResourceTable.Id_btn_add);
//        button.setClickedListener(new Component.ClickedListener() {
//            @Override
//            public void onClick(Component component) {
//                count++;
//                text.setText(count + "");
//            }
//        });
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
