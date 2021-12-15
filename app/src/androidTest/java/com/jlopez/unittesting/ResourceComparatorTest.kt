package com.jlopez.unittesting

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class ResourceComparatorTest {

    private lateinit var resourceComparator: ResourceComparator

    //Junit has a set up function that we can run before every test is executed
    // Makes sure things stay independent
    @Before
    fun setup() {
        resourceComparator = ResourceComparator()
    }

    // Used to destroy objects, such as closing a room database.
    @After
    fun teardown() {

    }

    @Test
    fun stringResourceSameAsGivenString_returnsTrue() {
        resourceComparator = ResourceComparator()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context, R.string.app_name, "UnitTesting")
        assertThat(result).isTrue()
    }

    @Test
    fun stringResourceDifferentAsGivenString_returnsFalse() {
        resourceComparator = ResourceComparator()
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context, R.string.app_name, "Different")
        assertThat(result).isFalse()
    }
}