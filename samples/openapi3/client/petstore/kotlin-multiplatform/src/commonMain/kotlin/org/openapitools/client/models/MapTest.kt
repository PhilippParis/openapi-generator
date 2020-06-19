/**
* OpenAPI Petstore
* This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models


import kotlinx.serialization.*
import kotlinx.serialization.internal.CommonEnumSerializer

/**
 * 
 * @param mapMapOfString 
 * @param mapOfEnumString 
 * @param directMap 
 * @param indirectMap 
 */
@Serializable
data class MapTest (
    @SerialName(value = "map_map_of_string") val mapMapOfString: kotlin.collections.Map<kotlin.String, kotlin.collections.Map<kotlin.String, kotlin.String>>? = null,
    @SerialName(value = "map_of_enum_string") val mapOfEnumString: MapTest.MapOfEnumString? = null,
    @SerialName(value = "direct_map") val directMap: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null,
    @SerialName(value = "indirect_map") val indirectMap: kotlin.collections.Map<kotlin.String, kotlin.Boolean>? = null
) {

    /**
    * 
    * Values: uPPER,lower
    */
    @Serializable(with = MapOfEnumString.Serializer::class)
    enum class MapOfEnumString(val value: kotlin.String){
        uPPER("UPPER"),
        lower("lower");

        object Serializer : CommonEnumSerializer<MapOfEnumString>("MapOfEnumString", values(), values().map { it.value.toString() }.toTypedArray())
    }
}

