package com.example.a101_a3

fun main() {
    println("======= LIST EXAMPLE ========")
    val fruits = listOf("Apple", "Banana", "Orange", "Banana", "Pear")

    println(fruits)
    println("First fruit: ${fruits[0]}")
    println("Third fruit: ${fruits[2]}")

    println("====== SET EXAMPLE =======")
    val subjects = setOf("Kotlin", "Jetpack Compose", "Kotlin", "Django", "UI/UX")
    println(subjects)

    val colors = setOf("Red", "Orange", "Yellow", "Yellow", "Green","Blue", "Blue")
    println("Colors: $colors")
    println("Size: ${colors.size}")


    // Challenge 1
    val hobbies = setOf("Listen to music", "Exercise", "Videogames", "Videogames", "Make Coffee", "Make Coffee")
    println("Hobbies: $hobbies")
    println("Size: ${hobbies.size}")

    // Set is useful here because it doesn't count repeated ones


    println("======= MAP EXAMPLE ========")
    val student = mapOf(
        "name" to "Claudia",
        "school" to "SDGKU",
        "program" to "MDI2",
    )

    println(student)
    println("Name: ${student["name"]}")
    println("Program: ${student["program"]}")


    // CHALLENGE 2

    val countries = mapOf(
        "Mexico" to "Mexico City",
        "France" to "Paris",
        "Japan" to "Tokyo",
        "Brazil" to "Brasilia"
    )

    println(countries)
    val country = "Mexico"
    println("The capital of $country is: ${countries[country]}")

    for ((country, capital) in countries) {
        println("Country: $country - Capital: $capital")
    }


    // CHALLENGE 3
    val favoriteApps = listOf("WhatsApp", "Spotify", "Instagram", "YouTube", "Amazon")

    val favoriteMovies = setOf("La La Land", "The Dark Knight", "Good Will Hunting", "The Truman Show", "La La Land", "Good Will Hunting")

    val personalProfile = mapOf(
        "name" to "Oscar",
        "age" to "21",
        "city" to "Tecate",
        "program" to "MDI2"
    )

    println("=== MOBILE APPS ===")
    println(favoriteApps)

    println("\n=== MOVIES ===")
    println(favoriteMovies)

    println("\n=== PERSONAL PROFILE ===")
    for ((key, value) in personalProfile) {
        println("$key: $value")
    }


    println("\n========= IMMUTABLE LIST EXAMPLE =========")
    val cars = listOf("Honda", "Kia", "BMW", "Mazda", "Chevrolet", "Toyota", "Ford")

    println(cars)
    println("First car: ${cars[0]}")
    println("Second car: ${cars[1]}")

    for(car in cars) {
        print(car)
    }


    // CHALLENGE 4

    val videoGames = listOf("Elden Ring", "Hotline Miami", "Red Dead Redemption 2", "Stardew Valley", "Hollow Knight")

    for (game in videoGames) {
        println(game)
    }

    println("First: ${videoGames[0]}")
    println("Last: ${videoGames[videoGames.size - 1]}")

    println("===== MUTABLE LIST EXAMPLE")
    val vegetables = mutableListOf("Carrot", "Tomato", "Broccoli", "Cucumber", "Celery")
    println("\n===== ORIGINAL LIST =======")
    println(vegetables)

    // ADD A VALUE
    println("\n====== ADD A VALUE")
    vegetables.add("Corn")
    println(vegetables)

    // REMOVE A VALUE
    println("===== REMOVE A VALUE =====")
    vegetables.remove("Broccoli")
    println(vegetables)

    // UPDATE A VALUE
    println("\n====== UPDATE A VALUE=======")
    vegetables[4] = "Onion"
    println(vegetables)


    // CHALLENGE 5

    val favorite_foods = mutableListOf("Pizza", "Chilaquiles", "Burritos")
    println("Original list: $favorite_foods")

    favorite_foods.add("Tacos")
    println("List after adding: $favorite_foods")

    favorite_foods.remove("Pizza")
    println("List after removing: $favorite_foods")

    favorite_foods[2] = "Pasta"
    println("List after replacing: $favorite_foods")


    println("====== FUNCTIONS ======")
    sayHello()
    sayHello()
    greetUser("Oscar")

    var result = addNumbers(18, 9)
    println(result)
    println(addNumbers(2,4))


    printFavoriteMovie("La La Land")

    result = multiplyNumbers(3,5,6)
    print(result)
}
// Basic Function Syntax

fun sayHello() {
    println("Hello from a function")
}

// Functions with parameters

fun greetUser(name: String) {
    println("Hello, $name")
}

// FUNCTION WITH RETURN VALUE

fun addNumbers(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun printFavoriteMovie(movie: String){
    println("My favorite movie is $movie")
}
fun multiplyNumbers(num1: Int, num2: Int, num3: Int): Int {
    return num1 * num2 * num3
}