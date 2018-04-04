package br.ufmg.coltec.tp.e03_adapters;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Place> all = new ArrayList<>();

        all.add(new Place("Lugar 1",
                "Um lugar muito bonito para levar sua família",
                R.drawable.ic_launcher_background,
                20.0,
                2.0));
        all.add(new Place("Lugar 2",
                "Venha conhecer o COLTEC e se maravilhar com as roletas na entrada",
                R.drawable.ic_launcher_background,
                27.0,
                3.5));
        all.add(new Place("Lugar 3",
                "Nada como sair do sol quente e entrar na sala da informatica com o ar-condicionado ligado",
                R.drawable.ic_launcher_background,
                5.8,
                5.0));
        all.add(new Place("Lugar 4",
                "maravilhoso almoço, melhor setor da ufmg",
                R.drawable.ic_launcher_background,
                16.4,
                4.6));
        all.add(new Place("Lugar 5",
                "criado especialmente pra você que gosta de dormir, Hotel California",
                R.drawable.ic_launcher_background,
                82.7,
                4.0));
        all.add(new Place("Lugar 6",
                "Navegar nunca foi tão bom antes de você conhecer este maravilhoso mundo web",
                R.drawable.ic_launcher_background,
                0.3,
                1.0));

        ListView myPlacesList = findViewById(R.id.places_list);
        myPlacesList.setAdapter(new MyPlaces(this, all));

    }
}
