NavHost(navController, startDestination = "home") {
    ...
    // Navigating to the graph via its route ('login') automatically
    // navigates to the graph's start destination - 'username'
    // therefore encapsulating the graph's internal routing logic
    navigation(startDestination = "username", route = "login") {
        composable("username") { ... }
        composable("password") { ... }
        composable("registration") { ... }
    }
    ...
}
