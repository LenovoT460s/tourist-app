package edu.eiu.recyclerviewdemo;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;

import java.util.Arrays;
import java.util.List;

import edu.eiu.recyclerviewdemo.datamodel.WikipediaPage;

public class PlacesViewModel extends ViewModel {

    //List<String> touristSites = Arrays.asList("bart","homer","nothing","something");

    private LiveData<List<WikipediaPage>> touristSitesData;

    private PlacesRepository placesRepository;

    public PlacesViewModel() {

        placesRepository = new PlacesRepository();

        touristSitesData = placesRepository.getTouristSites();
    }

    public LiveData<List<WikipediaPage>> getTouristSitesData() {

        return touristSitesData;

    }
}
