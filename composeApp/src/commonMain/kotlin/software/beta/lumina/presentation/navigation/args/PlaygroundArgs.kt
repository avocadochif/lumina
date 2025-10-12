package software.beta.lumina.presentation.navigation.args

import kotlinx.serialization.Serializable
import software.beta.lumina.core.common.utils.createArgNavType

@Serializable
data class PlaygroundArgs(
    val shader: String,
)

val playgroundArgsNavType = createArgNavType<PlaygroundArgs>(isNullableAllowed = false)
