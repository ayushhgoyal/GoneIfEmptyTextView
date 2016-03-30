package com.ayushhgoyal.goneifemptytextview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by ayush on 8/3/16.
 */
public class GoneIfEmptyTextView extends TextView {
    public GoneIfEmptyTextView(Context context) {
        super(context);
    }

    public GoneIfEmptyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public GoneIfEmptyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        super.setText(text, type);
        if (TextUtils.isEmpty(text.toString().trim())) {
            setVisibility(GONE);
        }
    }


}
