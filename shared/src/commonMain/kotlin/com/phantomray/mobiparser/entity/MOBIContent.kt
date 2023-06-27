package com.phantomray.mobiparser.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
open class MOBIContent(
    @SerialName("content") open val content: ByteArray,
    @SerialName("type") val type: Type,
) {
    enum class Type {
        HEADER, CONTENT, INDEX, TAGX, TAG, IDXT, FLIS, FCIS, FDST, DATP, SRCS, CMET, AUDI, VIDE,
        END_OF_TEXT, COVER, THUMBNAIL, IMAGE, UNKNOWN,
    }
}

data class MOBIContentIndex(
    override val content: ByteArray,
    @SerialName("identifier") val identifier:String,
    @SerialName("headerLength") val headerLength:Int,
    @SerialName("indexType") val indexType:Int,
    @SerialName("unknown0") val unknown0:Int,
    @SerialName("unknown1") val unknown1:Int,
    @SerialName("idxtIndex") val idxtIndex:Int,
    @SerialName("idxtCount") val idxtCount:Int,
    @SerialName("idxtEncoding") val idxtEncoding:Int,
    @SerialName("idxtLanguage") val idxtLanguage:Int,
    @SerialName("totalIndexCount") val totalIndexCount:Int,
    @SerialName("ordtIndex") val ordtIndex:Int,
    @SerialName("ligtIndex") val ligtIndex:Int,
    @SerialName("ordtLigtEntriesCount") val ordtLigtEntriesCount:Int,
    @SerialName("cncxRecordCount") val cncxRecordCount:Int,
    @SerialName("unknownIndexHeaderBlock") val unknownIndexHeaderBlock:ByteArray,
    @SerialName("rest") val rest:ByteArray,
) : MOBIContent(content, Type.INDEX)