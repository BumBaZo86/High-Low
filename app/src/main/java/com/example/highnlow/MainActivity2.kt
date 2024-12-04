package com.example.highnlow

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)  // Sätter layouten för MainActivity2

        // Hitta knappar och textvyer
        val backButton: Button = findViewById(R.id.back_button)
        val rulesText: TextView = findViewById(R.id.rules_text)

        // Dynamisk text som förklarar reglerna
        val rulesContent = """
            The player must guess whether the next card drawn will be higher or lower than the current card.

            If the card is an Ace, it is typically considered high.
            Cards are ranked as follows:
            2 to 10 are valued at their face value.
            Jacks are 11, Queens are 12, and Kings are 13.

            Next Card: The dealer reveals the next card from the deck.

            If the player's guess was correct, they continue, and the new card becomes the current card.
            If the guess was wrong, the game ends for that round.

            Winning:
            The player can continue guessing for as long as they keep guessing correctly.
            The game continues until a wrong guess is made.
            Some variations allow players to keep playing multiple rounds, with each correct guess earning points.
        """.trimIndent()

        // Uppdatera textvyn med reglerna
        rulesText.text = rulesContent

        // Klicklyssnare för att hantera "Back"-knappen
        backButton.setOnClickListener {
            finish()  // Avsluta MainActivity2 och gå tillbaka till föregående aktivitet
        }
    }
}
