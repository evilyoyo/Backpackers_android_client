package com.kingshijie.backpackers;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Contribute extends Activity {
	
	private Button mHostelsBtn;
	private Button mCampingsBtn;
	private Button mSceneriesBtn;
	

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contribute);
		
		mHostelsBtn = (Button)findViewById(R.id.hostels);
		mCampingsBtn = (Button)findViewById(R.id.campings);
		mSceneriesBtn = (Button)findViewById(R.id.sceneries);
		
		mHostelsBtn.setOnClickListener(new hostelsOnClick());
		mCampingsBtn.setOnClickListener(new campingsOnClick());
		mSceneriesBtn.setOnClickListener(new sceneriesOnClick());
	}
	
	private class hostelsOnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(Contribute.this,Additions.class);
			startActivity(intent);
		}
		
	}
	
	private class campingsOnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			Intent intent = new Intent(Contribute.this,Additions.class);
			startActivity(intent);
		}
		
	}
	
	private class sceneriesOnClick implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent(Contribute.this,Additions.class);
			startActivity(intent);
		}
		
	}

}
