package com.example.roomwordssample

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

//class WordRepository {
//
//    fun insert(word: Word) {
//
//    }

    class WordRepository(private val wordDao: WordDao) {


        val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

        @Suppress("RedundantSuspendModifier")
        @WorkerThread
        suspend fun insert(word: Word) {
            wordDao.insert(word)
        }
    }


//}