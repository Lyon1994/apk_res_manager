package org.lyon_yan.apk_res_manager;

import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import org.lyon_yan.JBCS_framework.AppCompatActivity;
import org.lyon_yan.JBCS_framework.AppInit;
import org.lyon_yan.JBCS_framework.config.R;
import org.lyon_yan.JBCS_framework.listener.JavaScriptListerner;
import org.lyon_yan.JBCS_framework.listener.JavaScriptLoadWorkerStateListener;
import org.lyon_yan.JBCS_framework.view.AppCompatView;

public class Init extends AppInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 初始化配置
		 */
		R.image.icon_png = R.path.resource_path + "img/icon.png";
//		R.dimens.minWidth = 600;
//		R.dimens.minHeight = 800;
//		R.dimens.prefWidth = 600;
//		R.dimens.prefHeight = 800;
		R.page.index = R.path.resource_path + "index.html";
		System.err.println(R.page.index);
		R.value.stageTitle = "Wifimax\tOEM生成器";
		launch(args);
	}

	@Override
	protected Pane onPreCreate(Stage arg0) {
		// TODO Auto-generated method stub
		return new AppCompatActivity() {

			@Override
			protected void onRegistJavaScriptListener(JavaScriptListerner arg0) {
				// TODO Auto-generated method stub
				arg0.setJavaScriptLoadWorkerStateListener(new JavaScriptLoadWorkerStateListener() {

					@Override
					public void onSuccessedListener() {
						// TODO Auto-generated method stub
						System.err.println("onSuccessedListener");
					}

					@Override
					public void onScheduledListener() {
						// TODO Auto-generated method stub

						System.err.println("onScheduledListener");
					}

					@Override
					public void onRunningListener() {
						// TODO Auto-generated method stub

						System.err.println("onRunningListener");
					}

					@Override
					public void onReadyListener() {
						// TODO Auto-generated method stub

						System.err.println("onReadyListener");
					}

					@Override
					public void onFailedListener() {
						// TODO Auto-generated method stub

						System.err.println("onFailedListener");
					}

					@Override
					public void onCancelledListener() {
						// TODO Auto-generated method stub

						System.err.println("onCancelledListener");
					}
				});
			}

			@Override
			protected AppCompatView onCreate(AppCompatView arg0) {
				// TODO Auto-generated method stub
				return arg0;
			}
		};
	}

}
