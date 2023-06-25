package com.phantomray.mobiparser.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PalmDOCHeader(
    @SerialName("compression") val compression: UShort,
    @SerialName("unused") val unused: UShort,
    @SerialName("textLength") val textLength: UInt,
    @SerialName("recordCount") val recordCount: UShort,
    @SerialName("recordSize") val recordSize: UShort,
    @SerialName("currentPosition") val currentPosition: UInt,
    @SerialName("encryptionType") val encryptionType: UShort,
    @SerialName("unknown") val unknown: UShort,
)
