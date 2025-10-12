package software.beta.lumina.presentation.navigation

import kotlinx.serialization.Serializable
import software.beta.lumina.presentation.navigation.args.PlaygroundArgs

@Serializable
sealed class Screens {

    @Serializable
    data object Gallery : Screens()

    @Serializable
    data class Playground(val args: PlaygroundArgs) : Screens()

}
