package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_e_removeTip extends ActivityInstrumentationTestCase2 {
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
    public c_heartRate_e_removeTip() throws ClassNotFoundException {
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
        solo.takeScreenshot("h_tapFaqBanner_a_dash");
        //Click on -- bpm 64 bpm resting
        solo.clickInList(3, 0);
        solo.takeScreenshot("h_tapFaqBanner_b_tapTile");
        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
        assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        //sleep - shot
        solo.sleep(500);
        solo.takeScreenshot("h_tapFaqBanner_c_heartRate");
        //Click on Resting heart rate measures your heart beats when you are still.
        solo.clickLongOnText(java.util.regex.Pattern.quote("Resting heart rate measures your heart beats when you are still. Wear during sleep for more accuracy. Learn more…"));
        solo.sleep(500);
    }
}