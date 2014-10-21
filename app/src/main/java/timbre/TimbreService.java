package timbre;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;
import java.util.Timer;


/**
 * Created by Pedro on 18/10/2014.
 */
public class TimbreService extends Service {
    Timer timer;
    ChequeoDeVariable check;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    @Override
    public void onCreate() {

        timer=new Timer();
        check=new ChequeoDeVariable(getApplicationContext());
    }

    @Override
    public int onStartCommand(Intent intenc, int flags, int idArranque) {
        Toast.makeText(getApplicationContext(),"Servicio Iniciado",Toast.LENGTH_SHORT).show();
        check=new ChequeoDeVariable(getApplicationContext());
        timer=new Timer();
        timer.schedule(check,0,2000);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(),"Servicio Finalizado",Toast.LENGTH_SHORT).show();
        if(timer!=null)
        {
            timer.cancel();
         //   timer=null;
        }
    }
}
