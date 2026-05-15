package com.company.droughtinv.view.productos;

import com.company.droughtinv.entity.Productos;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "productoses", layout = MainView.class)
@ViewController(id = "Productos.list")
@ViewDescriptor(path = "productos-list-view.xml")
@LookupComponent("productosesDataGrid")
@DialogMode(width = "64em")
public class ProductosListView extends StandardListView<Productos> {
}