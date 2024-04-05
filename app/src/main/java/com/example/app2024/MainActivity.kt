package com.example.app2024

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

private var String.text: String
    get() = Unit.toString()
    set(value) {}

class MainActivity : AppCompatActivity() {

    private lateinit var generateButton: Button
    private lateinit var resultText: TextView
    private lateinit var enterNumber: EditText
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        // Initialize the codes
        val generateButton = findViewById<Button>(R.id.generateButton)
        val clearButton: Button = findViewById(R.id.clearButton)
        val enterNumber: TextView = findViewById(R.id.enterNumber)
        val resultText: TextView = findViewById(R.id.resultText)


        clearButton.setOnClickListener {
            // Clear the text of enterNumber and resultText TextViews
            enterNumber.text = ""
            resultText.text = ""

        generateButton.setOnClickListener { it: View? ->
            // Get the entered number as a string
            val enteredNumberStr = enterNumber.text.toString()




                // Check if the entered number is not empty
            if (enteredNumberStr.isNotEmpty()) {
                // Convert the entered number to an integer
                val enteredNumber = enteredNumberStr.toInt()

                // Check if the entered number falls within the range of 20-30
                if (enteredNumber in 20..30) {
                    // Display a message for Pocahontas
                    resultText.text =
                        " $enteredNumber: Amonute Matoaka, known as Pocahontas  "
                }
                // Check if the entered number falls within the range of 31-40
                else if (enteredNumber in 31..40) {
                    // Display a message 
                    resultText.text =
                        " $enteredNumber:Alexander the Great. Alexander the Great’s was great conqueror and explorer in he's 30s." +
                                "His military tactics and strategies are still studied in military academies today." +
                                "From his first victory he gained a reputation of leading his men to battle with " +
                                "impressive speed, allowing smaller forces to reach and break the enemy lines before his foes were ready. "
                }
                // Check if the entered number falls within other specified ranges
                else if (enteredNumber in 41..50) {
                    resultText.text =
                        " $enteredNumber :belongs to Frida Kahlo . Frida Kahlo de Rivera was a talented Mexican Painter known for her vivid " +
                                "coloured self-portraits that touches on themes like the human body, death, identity, pain and suffering. " +
                                "Frida was always pictured in her traditional Mexican attire. Frida is considered an artist before her time," +
                                " a creative who reshaped Mexican culture not just though her paintings but also through her participation" +
                                " in politics and sexual freedom, and being able to depict her hardships through her art. "
                    //Check if the entered number falls within the range of 51-60
                } else if (enteredNumber in 51..60) {
                    resultText.text =
                        " $enteredNumber: Ludwig Beethoven . Ludwig Beethoven is considered to be the greatest composer who ever lived" +
                                " to be able to translate a feeling into music. In his early age his father tried to make him into a child prodigy, to be the next Mozart, " +
                                "which was unsuccessful. But then composer Joseph Haydn scouted him and took him under his wing to play in the Bonn Orchestra. " +
                                "Beethoven faced an issue of losing hearing from his mid- 30’s and went deaf in his 40s. " +
                                "Yet that didn’t stop him from composing his best work Symphony 9 and Für Elise." +
                                " He is an inspiration for deaf composers as proof that no disability can stop the greatness one has."
                    //Check if the entered number falls within the range of 61-70
                } else if (enteredNumber in 61..70) {
                    resultText.text =
                        " $enteredNumber : Leonardo Da Vinci. Leonardo Da Vinci was man of many skills an artist, engineer, " +
                                "architect and scientist" +
                                "He created the Mona Lisa as well as exploring the wonder" +
                                " of nature creating blueprints of varies aircrafts and war machines which have been used today in the forms of Helicopters " +
                                "and bridges. During his second period in Florence, Da Vinci delved into studying human anatomy through dissections, " +
                                "compiling reports for personal research. His work continues to influence both art and science today. " +
                                "Today his research on anatomy is being used in the medical field, his blueprints in aviation and art as inspiration to modern renaissance art."
                } else if (enteredNumber in 71..80) {
                    resultText.text =
                        " $enteredNumber:Mahatma Gandhi. Mahatma Gandhi was a leader of India’s Non-violent independence movement " +
                                "against British rule.+"
                                "Gandhi followed the concept of Satyagraha which is a Sanskrit translated to “holding firmly to the truth”, that was a force for" +
                                " his nonviolent civil disobedience campaigns.In India, he led the Indian National Congress. " +
                                " Mahatma Gandhi is an inspiration to many non-violent campaigns that take place even today. " +
                                "South Africa’s Apartheid non-violence campaigns and Black Lives Matter marches too."
                } else if (enteredNumber in 81..90) {
                    resultText.text =
                        " $enteredNumber: Florence Nightingale. Florence Nightingale, born in 1820 to an affluent British family in Italy, " +
                                "she believed to have a calling to nursing from a young age. During the Crimean War, she reformed hospital care, " +
                                "earning the nickname \"the Lady with the Lamp\" for her tireless work. Her statistical analysis of army mortality led to widespread reforms," +
                                " and she founded the Nightingale Training School for Nurses." +
                                " Despite her own health struggles, she continued advocating for healthcare reform until her death in 1910," +
                                " leaving behind a lasting legacy in modern nursing."
                } else if (enteredNumber in 91..100) {
                    resultText.text =
                        " $enteredNumber: Araminta Ross famously known as Harriet Tubman, " +
                                "she was an enslaved women who escaped slavery and lead the underground railroad which freed 700 slaves," +
                                " she also lead a military raid and fought for women’s rights." +
                                " During the Civil War Harriet Tubman worked for the Union as a cook, a nurse, and even a spy."
                }
                // If the entered number does not fall within any specified range
                else {
                    resultText.text =
                        "The entered number $enteredNumber is not between 20-100." +
                                "Try Again:/"
                }
            } else {
                // Display a message indicating that the user has not entered a number
                resultText.text =
                    "Invalid choice. Please enter a number between 20 and 100."


                }
            }
        }
    }
}























