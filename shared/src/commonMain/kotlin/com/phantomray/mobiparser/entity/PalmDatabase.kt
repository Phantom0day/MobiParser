package com.phantomray.mobiparser.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PalmDatabase(
    @SerialName("name") val name: String,
    @SerialName("attributes") val attributes: UShort,
    @SerialName("version") val version: UShort,
    @SerialName("creationDate") val creationDate: UInt,
    @SerialName("modificationDate") val modificationDate: UInt,
    @SerialName("lastBackupDate") val lastBackupDate: UInt,
    @SerialName("modificationNumber") val modificationNumber: UInt,
    @SerialName("appInfoID") val appInfoID: UInt,
    @SerialName("sortInfoID") val sortInfoID: UInt,
    @SerialName("type") val type: String,
    @SerialName("creator") val creator: String,
    @SerialName("uniqueIDSeed") val uniqueIDSeed: UInt,
    @SerialName("nextRecordListID") val nextRecordListID: UInt,
    @SerialName("numberOfRecords") val numberOfRecords: UShort,
    @SerialName("recordInfoList") val recordInfoList: ArrayList<Record>,
) {
    @Serializable
    data class Record(
        @SerialName("recordDataOffset") val recordDataOffset: UInt,
        @SerialName("recordAttributes") val recordAttributes: UByte,
        @SerialName("uniqueID") val uniqueID: Int,
    )
}
