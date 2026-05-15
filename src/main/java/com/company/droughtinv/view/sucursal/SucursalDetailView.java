package com.company.droughtinv.view.sucursal;

import com.company.droughtinv.entity.Sucursal;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "sucursals/:id", layout = MainView.class)
@ViewController(id = "Sucursal.detail")
@ViewDescriptor(path = "sucursal-detail-view.xml")
@EditedEntityContainer("sucursalDc")
public class SucursalDetailView extends StandardDetailView<Sucursal> {
}