package me.sherbaev.espresso

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withTagKey
import androidx.test.espresso.matcher.ViewMatchers.withTagValue
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun isTextVisible() {
        onView(allOf(withId(R.id.titleTextView), withText(R.string.app_name))).check(matches(isDisplayed()))
    }

    @Test
    fun tapOnIncludedLayout() {
        onView(withId(R.id.deviceList))
            .check(matches(isDisplayed()))
            .perform(click())
    }

    @Test
    fun tapOnIncludedLayoutWithParent() {
        onView(allOf(withId(R.id.deviceList), isDisplayed())).perform(click())
    }

    @Test
    fun tapOnIncludedLayoutWithTag() {
        onView(allOf(withTagValue(`is`("espresso")), isDisplayed())).perform(click())
    }
}