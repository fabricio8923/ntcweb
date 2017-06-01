/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.omega.controlador;

import org.primefaces.omega.modelo.Dao.*;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.omega.modelo.Dao.Implements.LogisticaRutaDaoImplements;
import org.primefaces.omega.modelo.LogisticaRuta;

/**
 *
 * @author fabricio
 */
@ManagedBean(name = "")
@ViewScoped
public class LogisticaRutaControlador {

    private List<LogisticaRuta> logisticaruta = null;
    private LogisticaRuta selectedlogisticaruta;
    private LogisticaRutaDao objLogisticaRutaDao = new LogisticaRutaDaoImplements();

    public LogisticaRutaControlador() {
    }

    public List<LogisticaRuta> getLogisticaruta() {
        return logisticaruta = objLogisticaRutaDao.LoadTablaLogisticaRutas();
    }

    public LogisticaRuta getSelectedlogisticaruta() {
        return selectedlogisticaruta;
    }

    public void setSelectedlogisticaruta(LogisticaRuta selectedlogisticaruta) {
        this.selectedlogisticaruta = selectedlogisticaruta;
    }

    public void InsertarLogisticaRuta() {
        objLogisticaRutaDao.InsertarLogisticaRuta(selectedlogisticaruta);
    }

    public void ActualizarLogisticaRuta() {
        objLogisticaRutaDao.ActualizarLogisticaRuta(selectedlogisticaruta);
    }

    public void EliminarLogisticaRuta() {
        objLogisticaRutaDao.EliminarLogisticaRuta(selectedlogisticaruta);
    }

}
