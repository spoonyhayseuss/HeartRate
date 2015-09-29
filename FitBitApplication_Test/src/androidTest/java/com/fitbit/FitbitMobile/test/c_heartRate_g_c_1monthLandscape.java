package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_g_c_1monthLandscape extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public c_heartRate_g_c_1monthLandscape() throws ClassNotFoundException {
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
        solo.waitForActivity("LandingActivity_", 1000);

        //Click on -- bpm 64 bpm resting
        solo.clickInList(3, 0);

        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
        assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        solo.sleep(500);
        //Click on Empty Text View
        solo.clickOnText(java.util.regex.Pattern.quote("Resting"));
        //Wait for activity: 'com.fitbit.heartrate.charts.RestingHeartRateChartActivity_'
        assertTrue("RestingHeartRateChartActivity is not found!", solo.waitForActivity("RestingHeartRateChartActivity"));
        //sleep - shot
        solo.sleep(500);

        //Rotate the screen
        solo.setActivityOrientation(Solo.LANDSCAPE);

        //Click on 1 WEEK
        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("RESTING HEART RATE"));




        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);

        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.RIGHT);

        solo.sleep(500);

        solo.goBack();

    }
}
