package heymath.com.heymathlibrary;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ToasterMessage extends AppCompatActivity {
    public static void s(Context c, String message) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show();
    }

    public static void customSnakbar(final Context c, View v, String msg, String action) {
        final Snackbar snackbar = Snackbar
                .make(v, msg, Snackbar.LENGTH_LONG)
                .setAction(action, new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        s(c,"Ok");
                    }
                });

// Changing message text color
        snackbar.setActionTextColor(Color.RED);

// Changing action button text color
        View sbView = snackbar.getView();
        TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
        textView.setTextColor(Color.YELLOW);
        snackbar.show();
    }

}
