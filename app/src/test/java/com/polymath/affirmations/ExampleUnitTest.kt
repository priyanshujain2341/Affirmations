package com.polymath.affirmations

import android.content.Context
import com.polymath.affirmations.adapter.ItemAdapter
import com.polymath.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val context = mock(Context::class.java)

    fun adapter_size()
    {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = ItemAdapter(context, data)

        /**
         * Return the size of your dataset (invoked by the layout manager)
         */

        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}