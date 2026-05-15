package com.company.droughtinv.services;


import com.company.droughtinv.entity.Lotes;
import com.company.droughtinv.entity.Productos;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


@Service
public class AlertService {

    @Autowired
    private DataManager dataManager;



    public void Alert(){
        List<Lotes> lotes = dataManager.load(Lotes.class).query("select lo from Lotes lo").list();
        for(Lotes lote:lotes){

            long diasParaCaducar = (long) (ChronoUnit.DAYS.between(lote.getFechaCaducidad().toInstant(), lote.getFechaElaboracion().toInstant()) * 0.8);
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DAY_OF_YEAR,(int)diasParaCaducar);
        }


    }
}
