package com.company.droughtinv.view.movimientos;

import com.company.droughtinv.entity.Movimientos;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "movimientoses/:id", layout = MainView.class)
@ViewController(id = "Movimientos.detail")
@ViewDescriptor(path = "movimientos-detail-view.xml")
@EditedEntityContainer("movimientosDc")
public class MovimientosDetailView extends StandardDetailView<Movimientos> {
}