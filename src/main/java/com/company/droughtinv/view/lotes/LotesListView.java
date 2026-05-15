package com.company.droughtinv.view.lotes;

import com.company.droughtinv.entity.Lotes;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "loteses", layout = MainView.class)
@ViewController(id = "Lotes.list")
@ViewDescriptor(path = "lotes-list-view.xml")
@LookupComponent("lotesesDataGrid")
@DialogMode(width = "64em")
public class LotesListView extends StandardListView<Lotes> {
}