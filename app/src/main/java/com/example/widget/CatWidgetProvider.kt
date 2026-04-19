package com.example.widget

import android.appwidget.AppWidgetProvider
import android.appwidget.AppWidgetManager
import android.content.Context
import android.widget.RemoteViews

class CatWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(
        context: Context,
        appWidgetManager: AppWidgetManager,
        appWidgetIds: IntArray
    ) {
        for (id in appWidgetIds) {
            val views = RemoteViews(context.packageName, R.layout.widget_cat)
            views.setImageViewResource(R.id.catImage, R.drawable.ic_cat_paw)
            appWidgetManager.updateAppWidget(id, views)
        }
    }
}