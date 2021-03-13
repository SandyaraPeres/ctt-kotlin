package com.sandy.buscarcep

import com.sandy.buscarcep.model.StateSuccess
import com.sandy.buscarcep.ui.MainActivityViewModel
import org.hamcrest.core.IsInstanceOf.instanceOf
import org.junit.Assert.assertThat
import org.junit.Test

class MainActivityViewModelTest {

    private val viewModel = MainActivityViewModel()

    @Test
    fun whenExecuteShouldReturnScucess(){
        val liveData = viewModel.buscarCEP("11060002")
        assertThat(liveData.value, instanceOf(StateSuccess::class.java))
    }

}