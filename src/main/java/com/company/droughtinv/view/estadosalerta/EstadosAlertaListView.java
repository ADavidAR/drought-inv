package com.company.droughtinv.view.estadosalerta;

import com.company.droughtinv.entity.EstadosAlerta;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "estados-alertas", layout = MainView.class)
@ViewController(id = "EstadosAlerta.list")
@ViewDescriptor(path = "estados-alerta-list-view.xml")
@LookupComponent("estadosAlertasDataGrid")
@DialogMode(width = "64em")
public class EstadosAlertaListView extends StandardListView<EstadosAlerta> {
}