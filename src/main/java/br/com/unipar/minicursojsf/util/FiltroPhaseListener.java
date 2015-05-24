package br.com.unipar.minicursojsf.util;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class FiltroPhaseListener implements PhaseListener {

    @Override
    public void afterPhase(PhaseEvent pe) {
        // Executa depois de renderizar a tela 
    }

    @Override
    public void beforePhase(PhaseEvent pe) {
       // Executa antes de renderizar a tela 
    }

    @Override
    public PhaseId getPhaseId() {
        // Configura para ser executado no fase Restore View do ciclo de vida do JSF
        return PhaseId.RESTORE_VIEW; 
    }
    
}
