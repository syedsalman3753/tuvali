package com.verifier.transfer.message

class ChunkReadByRemoteStatusUpdatedMessage(val semaphoreCharValue: Int): IMessage(TransferMessageTypes.CHUNK_READ_BY_REMOTE_STATUS_UPDATED) {}
