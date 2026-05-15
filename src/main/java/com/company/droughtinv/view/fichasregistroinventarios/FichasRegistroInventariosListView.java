package com.company.droughtinv.view.fichasregistroinventarios;

import com.company.droughtinv.entity.FichasRegistroInventarios;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "fichas-registro-inventarioses", layout = MainView.class)
@ViewController(id = "FichasRegistroInventarios.list")
@ViewDescriptor(path = "fichas-registro-inventarios-list-view.xml")
@LookupComponent("fichasRegistroInventariosesDataGrid")
@DialogMode(width = "64em")
public class FichasRegistroInventariosListView extends StandardListView<FichasRegistroInventarios> {
}