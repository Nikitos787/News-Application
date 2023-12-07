# News Application

A simple Android application for viewing news from https://newsapi.org/. The application follows the MVVM architectural pattern and incorporates the following key technologies:

## Features

- RecyclerView: Uses RecyclerView for displaying a list of news with scrollable functionality.
- Retrofit: Library for handling network requests, making it easy to fetch data from external API sources.
- Navigation: Utilizes the Android Navigation component for managing fragments and transitions between screens.
- Room: Library for working with SQLite database at the application level, simplifying the handling of local data.
- Pagination support for efficiently loading large volumes of data.
- ViewModel: represent a bridge between ui and data class and holding state for data
- Fragment: represent screen that show different logic base on navigation action

## Architecture

The application is developed following the MVVM (Model-View-ViewModel) architectural pattern. Each screen in the application is represented as a fragment, interacting with respective ViewModels to manage business logic and data presentation.

## Technologies

- Kotlin;
- AndroidX;
- Retrofit;
- Room;
- Navigation;
- Glide;

## Installation

To build and run the application, follow these steps:

1. Clone the repository to your computer.
2. Open the project in your preferred development environment (e.g., Android Studio).
3. Run the project on your emulator or physical device.
