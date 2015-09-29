package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_h_e_1yearPortrait extends ActivityInstrumentationTestCase2 {
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
    public c_heartRate_h_e_1yearPortrait() throws ClassNotFoundException {
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
        //sleep - shot
        solo.sleep(500);

        //Click on -- bpm 64 bpm resting
        solo.clickInList(3, 0);

        //Wait for activity: 'com.fitbit.heartrate.landing.HeartRateLandingActivity'
        assertTrue("HeartRateLandingActivity is not found!", solo.waitForActivity("HeartRateLandingActivity"));
        //sleep - shot
        solo.sleep(500);

        //Scroll View to the right side
        solo.scrollViewToSide(solo.getView(android.view.ViewGroup.class, 19), Solo.RIGHT);
        //sleep - shot
        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("Minutes in"));
        //Wait for activity: 'com.fitbit.heartrate.charts.ExerciseHeartRateChartActivity_'
        assertTrue("ExerciseHeartRateChartActivity is not found!", solo.waitForActivity("ExerciseHeartRateChartActivity"));

        //Click on 1 WEEK
        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        solo.clickOnText(java.util.regex.Pattern.quote("d"));
        solo.clickOnText(java.util.regex.Pattern.quote("hr"));
        solo.clickOnText(java.util.regex.Pattern.quote("min"));
        solo.clickOnText(java.util.regex.Pattern.quote("Fat Burn"));
        solo.clickOnText(java.util.regex.Pattern.quote("Cardio"));
        solo.clickOnText(java.util.regex.Pattern.quote("Peak"));



        //sleep - shot
        solo.sleep(1000);

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

        solo.clickOnView(solo.getView("btn_shrink"));
    }
}
