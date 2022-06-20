package com.example.githubtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
data class User(
        val name: String,
        val age: Int,
        val nickName: List<User1>
)

data class Chapters(
        val chapterId: Int = -1,
        val chapterName: String = ""
)

data class Subject(
        val subjectId: Int = -1,
        val subjectName: String = "",
        val chapterList: List<Chapters> = emptyList()
) {
    companion object {
        var previousSubjId = -1
        val chaptersList = ArrayList<Chapters>()
        fun fromSubject(revision: Revision) {
            if (previousSubjId != revision.subjectId) {
                chaptersList.add(
                        Chapters(
                                chapterId = revision.chapterId,
                                chapterName = revision.chapterName
                        )
                )
                previousSubjId = revision.subjectId
            } else {
                chaptersList.add(
                        Chapters(
                                chapterId = revision.chapterId,
                                chapterName = revision.chapterName
                        )
                )
            }
            val subject = Subject()

            Subject(
                    subjectId = revision.subjectId,
                    subjectName = revision.subjectName,
            )

        }

    }
}

data class User1(
        val name: String
)

data class Revision(
        var subjectId: Int = -1,
        var subjectName: String = "",
        var chapterId: Int = -1,
        var chapterName: String = ""
)

fun main() {
    val revision1 = Revision(subjectId = 100, subjectName = "Hindi", chapterId = 1, chapterName = "Kavi kalidas")
    val revision2 = Revision(subjectId = 100, subjectName = "Hindi", chapterId = 2, chapterName = "Guru kalidas")
    val revision3 = Revision(subjectId = 100, subjectName = "Hindi", chapterId = 3, chapterName = "dev kalidas")
    val revision4 = Revision(subjectId = 200, subjectName = "English", chapterId = 11, chapterName = "Story")
    val revision5 = Revision(subjectId = 200, subjectName = "English", chapterId = 12, chapterName = "Poem")
    val revision6 = Revision(subjectId = 200, subjectName = "English", chapterId = 13, chapterName = "Poetry")
    val revision7 = Revision(subjectId = 300, subjectName = "Math", chapterId = 21, chapterName = "Addition")
    val revision8 = Revision(subjectId = 300, subjectName = "Math", chapterId = 22, chapterName = "substraction")
    val revision9 = Revision(subjectId = 300, subjectName = "Math", chapterId = 23, chapterName = "Division")

    val newResponse = listOf(revision1, revision2, revision3, revision4, revision5, revision6, revision7, revision8, revision9)

    val subject = newResponse.map {
        Subject.fromSubject(it)
    }
    print("Subject $subject")

    //hindi chapter
    val chapterh1 = Chapters(chapterId = 1, chapterName = "Kavi Kalidas")
    val chapterh2 = Chapters(chapterId = 2, chapterName = "Guru Kalidas")
    val chapterh3 = Chapters(chapterId = 3, chapterName = "Dev Kalidas")
    val hindchapterList = listOf(chapterh1, chapterh2, chapterh3)

    //english chapter
    val chaptere1 = Chapters(chapterId = 11, chapterName = "Poem")
    val chaptere2 = Chapters(chapterId = 12, chapterName = "Poetry")
    val chaptere3 = Chapters(chapterId = 13, chapterName = "Story")
    val engchapterList = listOf(chaptere1, chaptere2, chaptere3)

    //social chapter
    val chapters1 = Chapters(chapterId = 21, chapterName = "History")
    val chapters2 = Chapters(chapterId = 22, chapterName = "Plistiics")
    val chapters3 = Chapters(chapterId = 23, chapterName = "Cricket")
    val socialchapterList = listOf(chapters1, chapters2, chapters3)

    val subject1 = Subject(subjectId = 100, subjectName = "Hindi", chapterList = hindchapterList)
    val subject2 = Subject(subjectId = 200, subjectName = "English", chapterList = engchapterList)
    val subject3 = Subject(subjectId = 300, subjectName = "Social", chapterList = socialchapterList)

    val responseList = listOf(subject1, subject2, subject3)

    /* val user111 = User1("vikas")
     val user122 = User1("vikas")
     val user133 = User1("vikas")
     val myList1 = listOf(user111, user122, user133)

     val user0 = User("John", 1, myList1)
     val user1 = User("John", 1, myList1)
     val user2 = User("Sara", 1, myList1)
     val user3 = User("Dave", 1, myList1)
     val user4 = User("Dave", 2, myList1)
     val user5 = User("Dave", 2, myList1)
     val user6 = User("Dave", 2, myList1)
     val user7 = User("Dave", 2, myList1)
     val user8 = User("Dave", 3, myList1)
     val user9 = User("Dave", 3, myList1)
     val user10 = User("Dave", 3, myList1)
     val user11 = User("Dave", 3, myList1)
     val myList = listOf(user0, user1, user2, user3, user4,user5,user6,user7,user8,user9,user10,user11)
     val chapterCount = myList.distinctBy {
         it.age
     }
     println("sublist $chapterCount" )
     println("count ${myList.count()}" )*/
}

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        method()

        printMessage()

        printSum()

        worldType()
    }

    private fun printSum() {
        println("2+2=4")
    }

    private fun worldType() {
        println("Hey this is new method")
    }

    private fun printMessage() {
        println("Hello World")
    }

    private fun method() {
        println("Vikas Suthar")
    }
    
    private newMethod()
    {
         println("Vikas Suthar")
    }
