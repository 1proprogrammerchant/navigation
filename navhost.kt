val navController = rememberSwipeDismissableNavController()
SwipeDismissableNavHost(
    navController = navController,
    startDestination = "message_list"
) {
    composable("message_list") {
        MessageList(onMessageClick = { id ->
            navController.navigate("message_detail/$id")
        })
    }
    composable("message_detail/{id}") {
        MessageDetail(id = it.arguments?.getString("id")!!)
    }
}
