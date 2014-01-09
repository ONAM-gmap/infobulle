package com.example.mapexemple;

import java.util.ArrayList;
import java.util.List;

import com.google.android.gms.maps.model.LatLng;

public class Stations {
	List<Station> Sts = new ArrayList<Station>();
	public Stations() {
		Init();
	}
	public void Init()
	{
		Sts.add(new Station(new LatLng(33.586899,-7.501611), "Terminus : sidi moumen"));
		Sts.add(new Station(new LatLng(33.584703,-7.505052), "Station : ennasim"));
		Sts.add(new Station(new LatLng(33.582278,-7.508735), "Station : Mohammed zafzaf"));
		Sts.add(new Station(new LatLng(33.579302,-7.513482), "Station : centre de maintenance"));
		Sts.add(new Station(new LatLng(33.576558,-7.517787), "Station : hopital sidi moumen"));
		Sts.add(new Station(new LatLng(33.574097,-7.524423), "Station : okba ibn nafii"));
		Sts.add(new Station(new LatLng(33.572933,-7.532582), "Station : forces auxiliaires"));
		Sts.add(new Station(new LatLng(33.574728,-7.53939), "Station : hay raja"));
		Sts.add(new Station(new LatLng(33.57652,-7.547916), "Station : Ibn tachfine"));
		Sts.add(new Station(new LatLng(33.580629,-7.562754), "Station : hay mohammadi"));
		Sts.add(new Station(new LatLng(33.585532,-7.566791), "Station : achouhada"));
		Sts.add(new Station(new LatLng(33.589053,-7.56795), "Station : ali yaata"));
		Sts.add(new Station(new LatLng(33.591504,-7.569749), "Station : grande ceinture"));
		Sts.add(new Station(new LatLng(33.590499,-7.573615), "Station : Les anciens abattoirs"));
		Sts.add(new Station(new LatLng(33.590981,-7.578646), "Station : bd bahmad"));
		Sts.add(new Station(new LatLng(33.594668,-7.586666), "Station : Casa Voyageur"));
		Sts.add(new Station(new LatLng(33.590561,-7.592251), "Station : Place Al Yassir"));
		Sts.add(new Station(new LatLng(33.592994,-7.597017), "Station : Résistance"));
		Sts.add(new Station(new LatLng(33.593455,-7.603079), "Station : Diouri"));
		Sts.add(new Station(new LatLng(33.593671,-7.60836), "Station : Marché Central"));
		Sts.add(new Station(new LatLng(33.594518,-7.612305), "Station : Places Unies"));
		Sts.add(new Station(new LatLng(33.595309,-7.617973), "Station : Place Mohammed 5"));
		Sts.add(new Station(new LatLng(33.589511,-7.620025), "Station : Hassan 2"));
		Sts.add(new Station(new LatLng(33.583889,-7.623128), "Station : Des hopitaux"));
		Sts.add(new Station(new LatLng(33.579943,-7.624869), "Station : Bausejour"));
		Sts.add(new Station(new LatLng(33.574821,-7.625802), "Station : Faculté Medecine"));
		Sts.add(new Station(new LatLng(33.570812,-7.625969), "Station : Abd Moumen"));
		Sts.add(new Station(new LatLng(33.570061,-7.631722), "Station : Derb Ghallef V"));
		Sts.add(new Station(new LatLng(33.57094,-7.636292), "Station : Riviera V"));
		Sts.add(new Station(new LatLng(33.568537,-7.644859), "Station : Ghandi"));
		Sts.add(new Station(new LatLng(33.564512,-7.64781), "Station : Bausejour"));
		Sts.add(new Station(new LatLng(33.561365,-7.652936), "Station : Cité de l'Air  1"));
		Sts.add(new Station(new LatLng(33.559789,-7.657533), "Station : Cité de l'Air  2"));
		Sts.add(new Station(new LatLng(33.562165,-7.660958), "Station : Cité de l'Air  3"));
		Sts.add(new Station(new LatLng(33.565786,-7.660151), "Station : Cité de l'Air  4"));
		Sts.add(new Station(new LatLng(33.568182,-7.664225), "Station : Cité de l'Air "));
		Sts.add(new Station(new LatLng(33.57193,-7.669402), "Station : Sidi Abderahmane"));
		Sts.add(new Station(new LatLng(33.576681,-7.673055), "Station : hay hassani"));
		Sts.add(new Station(new LatLng(33.58094,-7.674836), "Station : le Littoral"));
		Sts.add(new Station(new LatLng(33.587478,-7.680855), "Terminus : Ain Diab"));
	}

}
