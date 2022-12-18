package com.verifier.transfer.message

abstract class IMessage(val msgType: TransferMessageTypes) {
  enum class TransferMessageTypes {
    INIT_REQUEST_TRANSFER,
    REQUEST_SIZE_WRITE_PENDING,
    REQUEST_SIZE_WRITE_SUCCESS,
    REQUEST_SIZE_WRITE_FAILED,
    INIT_REQUEST_CHUNK_TRANSFER,
    CHUNK_READ_BY_REMOTE_STATUS_UPDATED,
    UPDATE_CHUNK_READ_STATUS_TO_REMOTE,
    REQUEST_CHUNK_WRITE_SUCCESS,
    REQUEST_CHUNK_WRITE_FAILED,
    REQUEST_TRANSFER_COMPLETE,
    RESPONSE_SIZE_READ,
    RESPONSE_CHUNK_READ,
    RESPONSE_TRANSFER_COMPLETE,
    RESPONSE_TRANSFER_FAILED,
  }
}
