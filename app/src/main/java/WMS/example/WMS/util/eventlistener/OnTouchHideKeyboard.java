package WMS.example.WMS.util.eventlistener;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class OnTouchHideKeyboard implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        InputMethodManager inputMethodManager = (InputMethodManager) v.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
