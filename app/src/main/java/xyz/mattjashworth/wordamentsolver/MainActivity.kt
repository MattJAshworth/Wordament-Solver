package xyz.mattjashworth.wordamentsolver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var letterOne: EditText
    private lateinit var letterOneCard: CardView
    private lateinit var letterTwo: EditText
    private lateinit var letterTwoCard: CardView
    private lateinit var letterThree: EditText
    private lateinit var letterThreeCard: CardView
    private lateinit var letterFour: EditText
    private lateinit var letterFourCard: CardView
    private lateinit var letterFive: EditText
    private lateinit var letterFiveCard: CardView
    private lateinit var letterSix: EditText
    private lateinit var letterSixCard: CardView
    private lateinit var letterSeven: EditText
    private lateinit var letterSevenCard: CardView
    private lateinit var letterEight: EditText
    private lateinit var letterEightCard: CardView
    private lateinit var letterNine: EditText
    private lateinit var letterNineCard: CardView
    private lateinit var letterTen: EditText
    private lateinit var letterTenCard: CardView
    private lateinit var letterEleven: EditText
    private lateinit var letterElevenCard: CardView
    private lateinit var letterTwelve: EditText
    private lateinit var letterTwelveCard: CardView
    private lateinit var letterThirteen: EditText
    private lateinit var letterThirteenCard: CardView
    private lateinit var letterFourteen: EditText
    private lateinit var letterFourteenCard: CardView
    private lateinit var letterFifteen: EditText
    private lateinit var letterFifteenCard: CardView
    private lateinit var letterSixteen: EditText
    private lateinit var letterSixteenCard: CardView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        val file_name = "word_list.txt"
        val wordList = application.assets.open(file_name).bufferedReader().use{
            it.readLines()
        }
    }

    private fun initViews() {
        letterOne = findViewById(R.id.et_letter_one)
        letterTwo = findViewById(R.id.et_letter_two)
        letterThree = findViewById(R.id.et_letter_three)
        letterFour = findViewById(R.id.et_letter_four)
        letterFive = findViewById(R.id.et_letter_five)
        letterSix = findViewById(R.id.et_letter_six)
        letterSeven = findViewById(R.id.et_letter_seven)
        letterEight = findViewById(R.id.et_letter_eight)
        letterNine = findViewById(R.id.et_letter_nine)
        letterTen = findViewById(R.id.et_letter_ten)
        letterEleven = findViewById(R.id.et_letter_eleven)
        letterTwelve = findViewById(R.id.et_letter_twelve)
        letterThirteen = findViewById(R.id.et_letter_thirteen)
        letterFourteen = findViewById(R.id.et_letter_fourteen)
        letterFifteen = findViewById(R.id.et_letter_fifteen)
        letterSixteen = findViewById(R.id.et_letter_sixteen)

        letterOneCard = findViewById(R.id.letter_one)
        letterTwoCard = findViewById(R.id.letter_two)
        letterThreeCard = findViewById(R.id.letter_three)
        letterFourCard = findViewById(R.id.letter_four)
        letterFiveCard = findViewById(R.id.letter_five)
        letterSixCard = findViewById(R.id.letter_six)
        letterSevenCard = findViewById(R.id.letter_seven)
        letterEightCard = findViewById(R.id.letter_eight)
        letterNineCard = findViewById(R.id.letter_nine)
        letterTenCard = findViewById(R.id.letter_ten)
        letterElevenCard = findViewById(R.id.letter_eleven)
        letterTwelveCard = findViewById(R.id.letter_twelve)
        letterThirteenCard = findViewById(R.id.letter_thirteen)
        letterFourteenCard = findViewById(R.id.letter_fourteen)
        letterFifteenCard = findViewById(R.id.letter_fifteen)
        letterSixCard = findViewById(R.id.letter_sixteen)
    }

    private fun setupRelations() {

        val one = Neighbours(1, listOf(2, 5, 6))
        val two = Neighbours(2, listOf(1, 3, 5, 6, 7))
        val three = Neighbours(3, listOf(2, 4, 6, 7, 8))
        val four = Neighbours(4, listOf(3, 7, 8))
        val five = Neighbours(5, listOf(1, 2, 6, 9, 10))
        val six = Neighbours(6, listOf(5, 1, 2, 3, 7, 9, 10, 11))
        val seven = Neighbours(7, listOf(6, 8, 2, 3, 4, 10, 11, 12))
        val eight = Neighbours(8, listOf(7, 3, 4, 11, 12))
        val nine = Neighbours(9, listOf(5, 6, 10, 13, 14))
        val ten = Neighbours(10, listOf(9, 11, 5, 6, 7, 13, 14, 15))
        val eleven = Neighbours(11, listOf(10, 12, 6, 7, 8, 14, 15, 16))
        val twelve = Neighbours(12, listOf(7, 8, 11, 15, 16))
        val thirteen = Neighbours(13, listOf(9, 10, 14))
        val fourteen = Neighbours(14, listOf(9, 10, 11, 13, 15))
        val fifteen = Neighbours(15, listOf(14, 16, 10, 11, 12))
        val sixteen = Neighbours(16, listOf(15, 11, 12))
    }

    private fun solve() {

        val one = letterOne.text
        val two = letterTwo.text
        val three = letterThree.text
        val four = letterFour.text
        val five = letterFive.text
        val six = letterSix.text
        val seven = letterSeven.text
        val eight = letterEight.text
        val nine = letterNine.text
        val ten = letterTen.text
        val eleven = letterEleven.text
        val twelve = letterTwelve.text
        val thirteen = letterThirteen.text
        val fourteen = letterFourteen.text
        val fifteen = letterFifteen.text
        val sixteen = letterSixteen.text

        
    }
}