package com.company.droughtinv.view.cliente;

import com.company.droughtinv.entity.Cliente;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "clientes/:id", layout = MainView.class)
@ViewController(id = "Cliente.detail")
@ViewDescriptor(path = "cliente-detail-view.xml")
@EditedEntityContainer("clienteDc")
public class ClienteDetailView extends StandardDetailView<Cliente> {
}