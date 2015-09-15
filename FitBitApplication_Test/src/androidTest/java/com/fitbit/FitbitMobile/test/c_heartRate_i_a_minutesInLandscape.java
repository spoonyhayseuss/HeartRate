package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_i_a_minutesInLandscape extends ActivityInstrumentationTestCase2 {
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
    public c_heartRate_i_a_minutesInLandscape() throws ClassNotFoundException {
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
        //sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("g_minutesInExpandedLandscape_a_dash");
        //Click on -- bpm 64 bpm resting
		solo.clickInList(3, 0);
        solo.takeScreenshot("g_minutesInExpandedLandscape_b_tapTile");
        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
		assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        //sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("g_minutesInExpandedLandscape_c_heartRate");
        //Scroll View to the right side
		solo.scrollViewToSide(solo.getView(android.view.ViewGroup.class, 19), Solo.RIGHT);
        //sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("g_minutesInExpandedLandscape_d_swipeTo");
        //Click on Empty Text View
        solo.clickOnText(java.util.regex.Pattern.quote("Minutes in"));
        //Wait for activity: 'com.fitbit.heartrate.charts.ExerciseHeartRateChartActivity_'
		assertTrue("ExerciseHeartRateChartActivity is not found!", solo.waitForActivity("ExerciseHeartRateChartActivity"));
        //sleep - shot
        solo.sleep(3000);
        solo.takeScreenshot("g_minutesInExpandedLandscape_e_expand");
        //Rotate the screen
		solo.setActivityOrientation(Solo.LANDSCAPE);
        //sleep - shot
        solo.sleep(2000);
        solo.takeScreenshot("g_minutesInExpandedLandscape_f_rotate");

	}
}
