package com.tencent.matrix.memory.canary.monitor

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.OnLifecycleEvent
import com.tencent.matrix.memory.canary.lifecycle.IStateObserver
import com.tencent.matrix.memory.canary.lifecycle.owners.CombinedProcessForegroundStatefulOwner

/**
 * Created by Yves on 2021/9/22
 */
class MemoryBackgroundMonitor private constructor(): IStateObserver {

    companion object {
        private val sInstance = MemoryBackgroundMonitor()

        @JvmStatic
        fun get() = sInstance
    }

    init {
        CombinedProcessForegroundStatefulOwner.observeForever(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    internal fun onProcessForeground() {

    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    internal fun onProcessBackground() {

    }

    override fun on() {
        TODO("Not yet implemented")
    }

    override fun off() {
        TODO("Not yet implemented")
    }
}