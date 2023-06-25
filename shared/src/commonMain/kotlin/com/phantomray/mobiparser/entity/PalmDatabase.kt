package com.phantomray.mobiparser.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PalmDatabase(
    @SerialName("name") val name: String,
    @SerialName("attributes") val attributes: Int,
    @SerialName("version") val version: Int,
    @SerialName("creationDate") val creationDate: Long,
    @SerialName("modificationDate") val modificationDate: Long,
    @SerialName("lastBackupDate") val lastBackupDate: Long,
    @SerialName("modificationNumber") val modificationNumber: Long,
    @SerialName("appInfoID") val appInfoID: Long,
    @SerialName("sortInfoID") val sortInfoID: Long,
    @SerialName("type") val type: String,
    @SerialName("creator") val creator: String,
    @SerialName("uniqueIDSeed") val uniqueIDSeed: Long,
    @SerialName("nextRecordListID") val nextRecordListID: Long,
    @SerialName("numberOfRecords") val numberOfRecords: Int,
    @SerialName("recordInfoList") val recordInfoList: ArrayList<Record>,
) {
    @Serializable
    data class Record(
        @SerialName("recordDataOffset") val recordDataOffset: Long,
        @SerialName("recordAttributes") val recordAttributes: Byte,
        @SerialName("uniqueID") val uniqueID: Long,
    )
}
