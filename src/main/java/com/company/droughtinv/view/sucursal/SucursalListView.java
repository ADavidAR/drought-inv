package com.company.droughtinv.view.sucursal;

import com.company.droughtinv.entity.Sucursal;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "sucursals", layout = MainView.class)
@ViewController(id = "Sucursal.list")
@ViewDescriptor(path = "sucursal-list-view.xml")
@LookupComponent("sucursalsDataGrid")
@DialogMode(width = "64em")
public class SucursalListView extends StandardListView<Sucursal> {
}