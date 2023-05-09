@Test
fun appNavHost_clickAllProfiles_navigateToProfiles() {
    composeTestRule.onNodeWithContentDescription("All Profiles")
        .performScrollTo()
        .performClick()

    val route = navController.currentBackStackEntry?.destination?.route
    assertEquals(route, "profiles")
}
