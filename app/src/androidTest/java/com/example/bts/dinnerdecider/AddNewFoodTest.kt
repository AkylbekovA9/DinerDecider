package com.example.bts.dinnerdecider

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.runner.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)

class AddNewFoodTest {

    @Rule
    var mActivityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun addNewFoodTest() {

        onView(withId(R.id.addFoodTxt)).perform(typeText("TEST"))
        onView(withId(R.id.addFoodBtn)).perform(click())
    }
}