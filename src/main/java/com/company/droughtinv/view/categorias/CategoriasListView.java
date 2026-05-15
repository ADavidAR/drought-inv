package com.company.droughtinv.view.categorias;

import com.company.droughtinv.entity.Categorias;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "categoriases", layout = MainView.class)
@ViewController(id = "Categorias.list")
@ViewDescriptor(path = "categorias-list-view.xml")
@LookupComponent("categoriasesDataGrid")
@DialogMode(width = "64em")
public class CategoriasListView extends StandardListView<Categorias> {
}