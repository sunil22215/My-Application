package com.example.QuizApp

object Constatnts {
    fun getQuestions():ArrayList<MyQuestion>{
        val questionsList=ArrayList<MyQuestion>()
        val que1=MyQuestion(1,
            "what country belongs to this flag?",
            R.drawable.india_flag,
            "Brazil",
            "India",
            "China",
            "Belgium",
            2)
        questionsList.add(que1)

        val que2=MyQuestion(2,
            "what country belongs to this flag?",
            R.drawable.australiya_flag,
            "Austreliya",
            "India",
            "China",
            "Belgium",
            1)
        questionsList.add(que2)

        val que3=MyQuestion(3,
            "what country belongs to this flag?",
            R.drawable.austriya_flag,
            "Brazil",
            "India",
            "Austriya",
            "Belgium",
            3)
        questionsList.add(que3)

        val que4=MyQuestion(4,
            "what country belongs to this flag?",
            R.drawable.belgium_flag,
            "Brazil",
            "India",
            "China",
            "Belgium",
            4)
        questionsList.add(que4)

        val que5=MyQuestion(5,
            "what country belongs to this flag?",
            R.drawable.brazil_flag,
            "Brazil",
            "India",
            "China",
            "Belgium",
            1)
        questionsList.add(que5)

        val que6=MyQuestion(6,
            "what country belongs to this flag?",
            R.drawable.china_flag,
            "Brazil",
            "India",
            "China",
            "Belgium",
            3)
        questionsList.add(que6)

        val que7=MyQuestion(7,
            "what country belongs to this flag?",
            R.drawable.france_flag,
            "France",
            "India",
            "China",
            "Belgium",
            1)
        questionsList.add(que7)

        val que8=MyQuestion(8,
            "what country belongs to this flag?",
            R.drawable.germany_flag,
            "Brazil",
            "India",
            "Germany",
            "Belgium",
            3)
        questionsList.add(que8)

        val que9=MyQuestion(9,
            "what country belongs to this flag?",
            R.drawable.ghana_flag,
            "Brazil",
            "India",
            "Ghana",
            "Belgium",
            3)
        questionsList.add(que9)

        val que10=MyQuestion(10,
            "what country belongs to this flag?",
            R.drawable.israel_flag,
            "Austriya",
            "India",
            "China",
            "Iserael",
            4)
        questionsList.add(que10)

        val que11=MyQuestion(11,
            "what country belongs to this flag?",
            R.drawable.itely_flag,
            "Austriya",
            "Itely",
            "China",
            "Belgium",
            2)
        questionsList.add(que11)
        return questionsList
    }

}