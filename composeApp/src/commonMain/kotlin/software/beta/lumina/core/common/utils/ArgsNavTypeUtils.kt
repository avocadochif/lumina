package software.beta.lumina.core.common.utils

import androidx.navigation.NavType
import androidx.savedstate.SavedState
import androidx.savedstate.read
import androidx.savedstate.write
import kotlinx.serialization.json.Json

inline fun <reified T : Any?> createArgNavType(
    isNullableAllowed: Boolean,
) = object : NavType<T>(isNullableAllowed) {

    override fun put(bundle: SavedState, key: String, value: T) {
        bundle.write { putString(key, Json.encodeToString(value)) }
    }

    override fun get(bundle: SavedState, key: String): T? {
        return bundle.read { Json.decodeFromString(getString(key)) }
    }

    override fun parseValue(value: String): T {
        return Json.decodeFromString(value)
    }

    override fun serializeAsValue(value: T): String {
        return Json.encodeToString(value)
    }

}
