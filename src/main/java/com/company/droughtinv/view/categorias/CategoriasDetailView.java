package com.company.droughtinv.view.categorias;

import com.company.droughtinv.entity.Categorias;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "categoriases/:id", layout = MainView.class)
@ViewController(id = "Categorias.detail")
@ViewDescriptor(path = "categorias-detail-view.xml")
@EditedEntityContainer("categoriasDc")
public class CategoriasDetailView extends StandardDetailView<Categorias> {
}