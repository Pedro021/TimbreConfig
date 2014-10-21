import android.content.Context;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.widget.SeekBar;

/**
 * Created by Pedro on 19/10/2014.
 */
public class SlideDialog extends DialogPreference implements SeekBar.OnSeekBarChangeListener {

    public SlideDialog(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {}

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}
}
