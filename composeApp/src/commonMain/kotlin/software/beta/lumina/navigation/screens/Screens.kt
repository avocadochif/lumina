package software.beta.lumina.navigation.screens

import kotlinx.serialization.Serializable
import software.beta.lumina.navigation.args.PlaygroundArgs

@Serializable
sealed class Screens {

    @Serializable
    data object Gallery : Screens()

    @Serializable
    data class Playground(val args: PlaygroundArgs) : Screens()

}
