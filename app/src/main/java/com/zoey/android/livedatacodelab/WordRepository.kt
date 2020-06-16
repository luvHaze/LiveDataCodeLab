package com.zoey.android.livedatacodelab

import androidx.lifecycle.LiveData
import com.zoey.android.livedatacodelab.data.Word
import com.zoey.android.livedatacodelab.data.WordDao

// Repository의 기능은 API나 로컬DB 에서 데이터를 가져와주는 역할
// * DB를 컨트롤하는 Dao가 들어가야 한다.
// * Repository 안의 메소드들은 dao객체로 데이터를 가져온다.
class WordRepository(private val wordDao: WordDao) {


    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()

    suspend fun insert(word: Word){
        wordDao.insert(word)
    }


}