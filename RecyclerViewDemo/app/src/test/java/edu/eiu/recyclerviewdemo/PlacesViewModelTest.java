package edu.eiu.recyclerviewdemo;

import android.arch.core.executor.testing.InstantTaskExecutorRule;
import android.arch.lifecycle.LiveData;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;

import java.util.ArrayList;

public class PlacesViewModelTest {

    @Rule
    public TestRule rule = new InstantTaskExecutorRule();

    @Test
    public void testGetShopData() {

        PlacesViewModel placesViewModel = new PlacesViewModel();

        //LiveData<ArrayList<String>> listLiveData = placesViewModel.getTouristSitesData();

        //Assert.assertEquals("bart",listLiveData.getValue().get(0));
    }
}
