package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class c_heartRate_j_c_intraExpanded extends ActivityInstrumentationTestCase2 {
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
    public c_heartRate_j_c_intraExpanded() throws ClassNotFoundException {
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

        solo.clickOnText(java.util.regex.Pattern.quote("Beats Per Minute"));
        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("WEDNESDAY, AUG 19"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 hr"));
        solo.clickOnText(java.util.regex.Pattern.quote("45 min"));
        solo.clickOnText(java.util.regex.Pattern.quote("in exercise zones"));

        solo.scrollToSide(solo.RIGHT);
        solo.clickOnText(java.util.regex.Pattern.quote("THURSDAY, AUG 20"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 hr"));
        //solo.clickOnText(java.util.regex.Pattern.quote("45 min"));
        solo.clickOnText(java.util.regex.Pattern.quote("in exercise zones"));
        solo.scrollToSide(solo.RIGHT);
        solo.scrollToSide(solo.RIGHT);
        solo.scrollToSide(solo.LEFT);
        solo.scrollToSide(solo.LEFT);
        solo.scrollToSide(solo.LEFT);
        solo.scrollToSide(solo.LEFT);



    }
}