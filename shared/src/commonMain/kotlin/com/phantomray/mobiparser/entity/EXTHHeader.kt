package com.phantomray.mobiparser.entity

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class EXTHHeader(
    @SerialName("identifier") val identifier: String,
    @SerialName("headerLength") val headerLength: Int,
    @SerialName("recordCount") val recordCount: Int,
    @SerialName("recordList") val recordList: ArrayList<Record>?,
) {
    @Serializable
    data class Record(
        @SerialName("recordType") val recordType: Int,
        @SerialName("recordLength") val recordLength: Int,
        @SerialName("recordData") val recordData: ByteArray?,
    ) {
        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            if (other == null || this::class != other::class) return false

            other as Record

            if (recordType != other.recordType) return false
            if (recordLength != other.recordLength) return false
            if (recordData != null) {
                if (other.recordData == null) return false
                if (!recordData.contentEquals(other.recordData)) return false
            } else if (other.recordData != null) return false

            return true
        }

        override fun hashCode(): Int {
            var result = recordType
            result = 31 * result + recordLength
            result = 31 * result + (recordData?.contentHashCode() ?: 0)
            return result
        }
    }
}
