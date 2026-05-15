package com.company.droughtinv.view.cliente;

import com.company.droughtinv.entity.Cliente;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "clientes", layout = MainView.class)
@ViewController(id = "Cliente.list")
@ViewDescriptor(path = "cliente-list-view.xml")
@LookupComponent("clientesDataGrid")
@DialogMode(width = "64em")
public class ClienteListView extends StandardListView<Cliente> {
}