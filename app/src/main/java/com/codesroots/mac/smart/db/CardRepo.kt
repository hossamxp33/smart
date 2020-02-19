package com.codesroots.mac.smart.db

//class CardRepo(private val cardDao: CardDao) {
//
//    // Room executes all queries on a separate thread.
//    // Observed LiveData will notify the observer when the data has changed.
//    val allsmart: LiveData<List<CardDB>> = cardDao.getAllNotes()
//
//    suspend fun insert(cardDB: CardDB) {
//        cardDao.insert(cardDB)
//    }
//}