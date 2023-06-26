package com.phantomray.mobiparser.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MOBIContentHeader(
    @SerialName("palmDatabase") val palmDatabase: PalmDatabase,
    @SerialName("palmDOCHeader") val palmDOCHeader: PalmDOCHeader,
    @SerialName("mobiHeader") val mobiHeader: MOBIHeader,
    @SerialName("exthHeader") val exthHeader: EXTHHeader?,
    @SerialName("reminder") val reminder: String,
)
