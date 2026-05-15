package com.company.droughtinv.view.lotes;

import com.company.droughtinv.entity.Lotes;
import com.company.droughtinv.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;

@Route(value = "loteses/:id", layout = MainView.class)
@ViewController(id = "Lotes.detail")
@ViewDescriptor(path = "lotes-detail-view.xml")
@EditedEntityContainer("lotesDc")
public class LotesDetailView extends StandardDetailView<Lotes> {
}