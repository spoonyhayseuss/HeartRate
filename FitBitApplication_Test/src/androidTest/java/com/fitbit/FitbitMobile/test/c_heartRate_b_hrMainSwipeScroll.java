package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_b_hrMainSwipeScroll extends ActivityInstrumentationTestCase2 {
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
    public c_heartRate_b_hrMainSwipeScroll() throws ClassNotFoundException {
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

        //Click on -- bpm 64 bpm resting
		solo.clickInList(3, 0);

        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
		assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        //sleep - shot
        solo.sleep(1000);
        solo.takeScreenshot("b_hrMainSwipe_c_heartRate");
        //Scroll View to the right side
        solo.scrollToSide(Solo.RIGHT);

        //sleep - shot
        solo.sleep(500);
        solo.scrollToSide(Solo.LEFT);
        solo.takeScreenshot("b_hrMainSwipe_d_swipeTo");
        solo.scrollDown();
        solo.scrollDown();
        solo.scrollDown();
        solo.scrollDown();
        solo.scrollUp();
        solo.scrollUp();
        solo.scrollUp();
        solo.scrollUp();
        //solo.clickOnText(java.util.regex.Pattern.quote("THIS WEEK"));
        //sleep - shot


	}
}
