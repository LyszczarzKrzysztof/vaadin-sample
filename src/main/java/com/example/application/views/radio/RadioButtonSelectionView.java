package com.example.application.views.radio;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value = "radio-button-selection-view",layout = MainView.class)
@PageTitle("RadioButtonSelectionView")
@CssImport("./styles/views/helloworld/hello-world-view.css")
@RouteAlias(value = "radio", layout = MainView.class)
public class RadioButtonSelectionView extends VerticalLayout {

    private RadioButtonGroup<String> radioButtonGroup;

    public RadioButtonSelectionView(){
        setId("radio-button-selection-view");
        radioButtonGroup = new RadioButtonGroup<>();
        radioButtonGroup.setItems("Choice1", "Choise2","Choise3");
        radioButtonGroup.setLabel("Label1");
        add(radioButtonGroup);
    }
}
