package com.company.droughtinv.view.proveedor;

import com.company.droughtinv.entity.Proveedor;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "proveedors", layout = MainView.class)
@ViewController(id = "Proveedor.list")
@ViewDescriptor(path = "proveedor-list-view.xml")
@LookupComponent("proveedorsDataGrid")
@DialogMode(width = "64em")
public class ProveedorListView extends StandardListView<Proveedor> {
}