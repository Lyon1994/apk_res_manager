package org.lyon_yan.apk_res_manager;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.lyon_yan.JBCS_framework.AppCompatActivity;
import org.lyon_yan.JBCS_framework.AppInit;
import org.lyon_yan.JBCS_framework.config.R;
import org.lyon_yan.JBCS_framework.listener.JavaScriptListerner;
import org.lyon_yan.JBCS_framework.view.AppCompatView;

public class Init extends AppInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 初始化配置
		 */
		R.image.icon_png=R.path.resource_path+"img/icon.png";
		R.page.index=R.path.resource_path+"install.html";
		R.value.stageTitle="Wifimax\tOEM生成器";
		launch(args);
	}

	@Override
	protected Pane onPreCreate(Stage arg0) {
		// TODO Auto-generated method stub
		return new AppCompatActivity() {
			
			@Override
			protected void onRegistJavaScriptListener(JavaScriptListerner arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			protected AppCompatView onCreate(AppCompatView arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
		};
	}
	
}
