package io.github.abdurazaaqmohammed.ui.activities;
import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import com.google.android.material.button.MaterialButton;
import io.github.abdurazaaqmohammed.core.ui.base.BaseActivity;
public class InteractionActivity extends BaseActivity {
 @Override protected void onCreate(Bundle state) {
 super.onCreate(state);
 LinearLayout body=new LinearLayout(this); body.setOrientation(1); body.setPadding(dpPx(24),dpPx(24),dpPx(24),dpPx(24));
 TextView title=new TextView(this); title.setText("互动 · Codex Manager"); title.setTextSize(24); body.addView(title);
 TextView welcome=new TextView(this); welcome.setText("欢迎使用 Codex Manager\n管理文件，探索应用。选择下方操作，开始使用。\n本页面无需联网。"); welcome.setTextSize(16); welcome.setPadding(0,dpPx(24),0,dpPx(24)); body.addView(welcome);
 action(body,"返回文件管理",null);
 action(body,"工具箱",io.github.abdurazaaqmohammed.tools.ToolsHubActivity.class);
 action(body,"应用提取",io.github.abdurazaaqmohammed.ApkExtractor.APKExtractorActivity.class);
 action(body,"设置",io.github.abdurazaaqmohammed.features.files.MainSettingsActivity.class);
 ScrollView scroll=new ScrollView(this); scroll.addView(body); setContentView(scroll);
 }
 private void action(LinearLayout body,String label,Class<?> target) { MaterialButton button=new MaterialButton(this); button.setText(label); body.addView(button,new LinearLayout.LayoutParams(-1,-2)); button.setOnClickListener(v->{if(target==null) finish(); else startActivity(new Intent(this,target));}); }
}
