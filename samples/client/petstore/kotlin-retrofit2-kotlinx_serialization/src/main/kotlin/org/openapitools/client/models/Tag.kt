/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import kotlinx.serialization.Serializable as KSerializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual
import java.io.Serializable

/**
 * A tag for a pet
 *
 * @param id 
 * @param name 
 */
@KSerializable
data class Tag (

    @SerialName(value = "id")
    val id: kotlin.Long? = null,

    @SerialName(value = "name")
    val name: kotlin.String? = null

) : Serializable {
    companion object {
        private const val serialVersionUID: Long = 123
    }

}

