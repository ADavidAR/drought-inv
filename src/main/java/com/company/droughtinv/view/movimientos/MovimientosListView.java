package com.company.droughtinv.view.movimientos;

import com.company.droughtinv.entity.Movimientos;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "movimientoses", layout = MainView.class)
@ViewController(id = "Movimientos.list")
@ViewDescriptor(path = "movimientos-list-view.xml")
@LookupComponent("movimientosesDataGrid")
@DialogMode(width = "64em")
public class MovimientosListView extends StandardListView<Movimientos> {
}