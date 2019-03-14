package io.invertase.firebase.notifications;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class RNFirebaseNotificationTimeoutReceiver extends BroadcastReceiver {
  @Override
  public void onReceive(Context context, Intent intent) {
    String notificationId = intent.getStringExtra("notificationId");
    NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
    notificationManager.cancel(notificationId.hashCode());
  }
}
