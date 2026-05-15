package com.company.droughtinv.view.productos;

import com.company.droughtinv.entity.Productos;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "productoses/:id", layout = MainView.class)
@ViewController(id = "Productos.detail")
@ViewDescriptor(path = "productos-detail-view.xml")
@EditedEntityContainer("productosDc")
public class ProductosDetailView extends StandardDetailView<Productos> {
}