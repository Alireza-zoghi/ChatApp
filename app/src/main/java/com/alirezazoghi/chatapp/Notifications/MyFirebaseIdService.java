package com.alirezazoghi.chatapp.Notifications;

import android.util.Log;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MyFirebaseIdService extends FirebaseMessagingService {

    private static final String TAG = "MyFirebaseIdService";

    @Override
    public void onNewToken(String t) {
        super.onNewToken(t);
        Log.e(TAG, "onNewToken: " + t);

        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        if (firebaseUser != null) {
            updateToken(t);
        }
    }

    private void updateToken(String t) {
        FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
        DatabaseReference reference = FirebaseDatabase.getInstance().getReference("Token");
        Token token = new Token(t);
        reference.child(firebaseUser.getUid()).setValue(token);
    }
}
