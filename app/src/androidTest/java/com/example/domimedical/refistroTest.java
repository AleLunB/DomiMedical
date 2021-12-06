package com.example.domimedical;


import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class refistroTest {

    @Rule
    public ActivityScenarioRule<refistro> mActivityTestRule = new ActivityScenarioRule<>(refistro.class);

    @Test
    public void refistroTest() {
        ViewInteraction relativeLayout = onView(
                allOf(withParent(allOf(withId(android.R.id.content),
                        withParent(withId(R.id.decor_content_parent)))),
                        isDisplayed()));
        relativeLayout.check(matches(isDisplayed()));
    }
}
