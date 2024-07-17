package com.ad_player_react_native

import android.content.Context
import android.graphics.Color
import com.adservrs.adplayer.placements.AdPlayerPlacementView
import com.facebook.react.uimanager.SimpleViewManager
import com.facebook.react.uimanager.ThemedReactContext

object AdPlayerPlacementViewManager : SimpleViewManager<AdPlayerPlacementView>() {
    override fun getName() = "AdPlayerPlacementView"

    override fun createViewInstance(context: ThemedReactContext): AdPlayerPlacementView {
        val view = DynamicAdPlayerPlacementView(context)
        view.attachPlayerTag(BuildConfig.AV_TAG_ID)
        view.setBackgroundColor(Color.BLACK)
        return view
    }

    // FIXME https://github.com/facebook/react-native/issues/17968
    private class DynamicAdPlayerPlacementView(context: Context) : AdPlayerPlacementView(context) {
        private val measureAndLayout = Runnable {
            val widthMS = MeasureSpec.makeMeasureSpec(width, MeasureSpec.EXACTLY)
            val heightMS = MeasureSpec.makeMeasureSpec(height, MeasureSpec.EXACTLY)
            measure(widthMS, heightMS)
            layout(left, top, right, bottom)
        }

        override fun requestLayout() {
            super.requestLayout()
            post(measureAndLayout)
        }
    }
}
