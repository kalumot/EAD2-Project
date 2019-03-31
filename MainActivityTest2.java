package org.gc.helloworldvolleyclient;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest2 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest2() {
        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner.perform(click());

        ViewInteraction appCompatSpinner2 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner2.perform(click());

        ViewInteraction appCompatSpinner3 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner3.perform(click());

        ViewInteraction appCompatSpinner4 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner4.perform(click());

        ViewInteraction appCompatSpinner5 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner5.perform(click());

        ViewInteraction appCompatSpinner6 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner6.perform(click());

        ViewInteraction appCompatSpinner7 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner7.perform(click());

        ViewInteraction appCompatSpinner8 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner8.perform(click());

        ViewInteraction appCompatSpinner9 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner9.perform(click());

        ViewInteraction appCompatSpinner10 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner10.perform(click());

        ViewInteraction appCompatSpinner11 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner11.perform(click());

        ViewInteraction appCompatSpinner12 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner12.perform(click());

        ViewInteraction appCompatSpinner13 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner13.perform(click());

        ViewInteraction appCompatSpinner14 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner14.perform(click());

        ViewInteraction appCompatSpinner15 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner15.perform(click());

        ViewInteraction appCompatSpinner16 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner16.perform(click());

        ViewInteraction appCompatSpinner17 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner17.perform(click());

        ViewInteraction appCompatSpinner18 = onView(
                allOf(withId(R.id.dynamic_spinner),
                        childAtPosition(
                                allOf(withId(R.id.coordinatorLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                27),
                        isDisplayed()));
        appCompatSpinner18.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
