package com.company.droughtinv.view.proveedor;

import com.company.droughtinv.entity.Proveedor;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "proveedors/:id", layout = MainView.class)
@ViewController(id = "Proveedor.detail")
@ViewDescriptor(path = "proveedor-detail-view.xml")
@EditedEntityContainer("proveedorDc")
public class ProveedorDetailView extends StandardDetailView<Proveedor> {
}