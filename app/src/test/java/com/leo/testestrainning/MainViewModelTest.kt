package com.leo.testestrainning

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainViewModelTest() {

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    private val viewModel = MainViewModel()

    @Test
    fun `It certifies that the number received will be one`() {
        // when
        viewModel.increase()
        // then
        val value = viewModel.valueLiveData.getOrAwaitValue()

        assertThat(1, `is`(value))
    }

}