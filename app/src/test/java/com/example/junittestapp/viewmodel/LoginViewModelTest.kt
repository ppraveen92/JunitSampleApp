package com.example.junittestapp.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import junit.framework.TestCase.assertEquals
import org.junit.Assert
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock


@RunWith(JUnit4::class)
class LoginViewModelTest{

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Mock
    lateinit var mLoginViewModel: LoginViewModel


    @Before
     fun setUp(){
        mLoginViewModel = LoginViewModel()
    }


    @Test
    fun `test for empty case`(){
        val status=mLoginViewModel.logUser("","");
        assertEquals(status,false)
    }

    @Test
    fun `test for login case`(){
        val status=mLoginViewModel.logUser("pra","arp");
        assertEquals(status,true)
    }

}