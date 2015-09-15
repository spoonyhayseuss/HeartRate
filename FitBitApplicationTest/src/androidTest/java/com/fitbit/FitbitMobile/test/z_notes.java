package com.fitbit.FitbitMobile.test;

import com.robotium.solo.*;
import android.test.ActivityInstrumentationTestCase2;


@SuppressWarnings("rawtypes")
public class z_notes extends ActivityInstrumentationTestCase2 {
  	private Solo solo;
  	
  	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
           throw new RuntimeException(e);
        }
    }
  	
  	@SuppressWarnings("unchecked")
    public z_notes() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

  	public void setUp() throws Exception {
        super.setUp();
		solo = new Solo(getInstrumentation());
		getActivity();
  	}
  
   	@Override
   	public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
  	}
  
	public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
		solo.waitForActivity("LandingActivity_", 2000);
        //Wait for activity: 'com.fitbit.home.ui.HomeActivity_'
		assertTrue("HomeActivity_ is not found!", solo.waitForActivity("HomeActivity_"));
        //Sleep for 2410 milliseconds
		solo.sleep(2410);
        //Click on -- bpm 64 bpm resting
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
		assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        //Sleep for 1965 milliseconds
		solo.sleep(1965);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 0));
        //Sleep for 2207 milliseconds
		solo.sleep(2207);
        //Click on -- bpm 64 bpm resting
		solo.clickInList(3, 0);
        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
		assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        //Sleep for 1192 milliseconds
		solo.sleep(1192);
        //Click on Today 64 bpm resting
		solo.clickOnText(java.util.regex.Pattern.quote("Today"));
        //Wait for activity: 'com.fitbit.heartrate.details.HeartRateDetailsActivity_'
		assertTrue("HeartRateDetailsActivity_ is not found!", solo.waitForActivity("HeartRateDetailsActivity_"));
        //Sleep for 1813 milliseconds
		solo.sleep(1813);
        //Click on ImageView
		solo.clickOnView(solo.getView(android.widget.ImageButton.class, 1));
        //Sleep for 5357 milliseconds
		solo.sleep(5357);
        //Click on Resting Heart Rate, Last 30 Days FrameLayout
		solo.clickOnText(java.util.regex.Pattern.quote("Resting Heart Rate, Last 30 Days"));
        //Wait for activity: 'com.fitbit.heartrate.charts.RestingHeartRateChartActivity'
		assertTrue("RestingHeartRateChartActivity is not found!", solo.waitForActivity("RestingHeartRateChartActivity"));
	}
}
