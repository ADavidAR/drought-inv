package com.company.droughtinv.view.fichasregistroinventarios;

import com.company.droughtinv.entity.FichasRegistroInventarios;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "fichas-registro-inventarioses/:id", layout = MainView.class)
@ViewController(id = "FichasRegistroInventarios.detail")
@ViewDescriptor(path = "fichas-registro-inventarios-detail-view.xml")
@EditedEntityContainer("fichasRegistroInventariosDc")
public class FichasRegistroInventariosDetailView extends StandardDetailView<FichasRegistroInventarios> {
}