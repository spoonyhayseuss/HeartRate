package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_j_b_intraPastDay extends ActivityInstrumentationTestCase2 {
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
    public c_heartRate_j_b_intraPastDay() throws ClassNotFoundException {
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

        solo.clickOnText(java.util.regex.Pattern.quote("Aug 19"));

        solo.sleep(500);
        solo.clickOnText(java.util.regex.Pattern.quote("Heart Rate"));
        solo.clickOnText(java.util.regex.Pattern.quote("Resting Heart Rate"));
        solo.clickOnText(java.util.regex.Pattern.quote("bpm"));
        solo.clickOnText(java.util.regex.Pattern.quote("Exercise Zones"));
        solo.clickOnText(java.util.regex.Pattern.quote("minutes"));
        solo.clickOnText(java.util.regex.Pattern.quote("calories"));
        solo.clickOnText(java.util.regex.Pattern.quote("Peak"));
        solo.clickOnText(java.util.regex.Pattern.quote("Cardio"));
        solo.clickOnText(java.util.regex.Pattern.quote("Fat Burn"));

        solo.clickOnView(solo.getView(android.widget.ImageButton.class, 1));

        solo.sleep(500);
    }
}