package com.msgilligan.bitcoinj.rpc

import com.msgilligan.bitcoinj.rpc.bitcoind.BitcoinConfFile
import com.msgilligan.jsonrpc.DynamicRPCFallback

/**
 * Bitcoin RPC client for scripting
 * No args constructor reads bitcoin.conf
 * Allows dynamic methods to access new RPCs or RPCs not implemented in Java client
 */
class BitcoinScriptingClient extends BitcoinExtendedClient implements DynamicRPCFallback {

    BitcoinScriptingClient() {
        super(BitcoinConfFile.readDefaultConfig().getRPCConfig())
    }
}
