package com.example.movierecom_rsl

import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MovieDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        // Get the data from the intent
        val movieTitle = intent.getStringExtra("MOVIE_TITLE")
        val moviePoster = intent.getStringExtra("MOVIE_POSTER")
        val movieDescription = intent.getStringExtra("MOVIE_DESCRIPTION")
        val movieReviews = intent.getStringExtra("MOVIE_REVIEWS")

        // Find views in the layout
        val moviePosterImageView = findViewById<ImageView>(R.id.moviePosterImageView)
        val movieTitleTextView = findViewById<TextView>(R.id.movieTitleTextView)
        val movieDescriptionTextView = findViewById<TextView>(R.id.movieDescriptionTextView)
        val movieReviewsTextView = findViewById<TextView>(R.id.movieReviewsTextView)

        // Set the data
        movieTitleTextView.text = movieTitle
        movieDescriptionTextView.text = movieDescription
        movieReviewsTextView.text = movieReviews

        // Load the movie poster using Glide (or any other image loading library)
        Glide.with(this).load(moviePoster).into(moviePosterImageView)
        // Set onClickListener for the back button
        // Initialize views
        val backButton: ImageButton = findViewById(R.id.backButton)

        // Set OnClickListener
        backButton.setOnClickListener {
            finish() // This will close the current activity and return to the previous on
        }
    }
}
