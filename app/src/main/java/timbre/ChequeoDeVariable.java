package timbre;

import java.util.TimerTask;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

import timbre.com.timbreconfig.Llamada;


/**
 * Created by Pedro on 19/10/2014.
 */
public class ChequeoDeVariable extends TimerTask {
    boolean timbrando=true;
    Context contexto;
    Intent intento;
    ChequeoDeVariable(Context _contexto)
    {
        contexto=_contexto;
    }

    @Override
    public void run() {
        if(timbrando)
        {
            intento=new Intent(contexto,Llamada.class);
            contexto.startActivity(intento);
            timbrando=false;
        }

    Log.d("Chequando variable","El metodo run de la clase se ejecuto");

    }
}
