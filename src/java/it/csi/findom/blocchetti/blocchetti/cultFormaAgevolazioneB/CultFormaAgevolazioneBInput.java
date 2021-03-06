/*******************************************************************************
 * Copyright Regione Piemonte - 2020
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************************************/
package it.csi.findom.blocchetti.blocchetti.cultFormaAgevolazioneB;

import static it.csi.melograno.aggregatore.business.javaengine.commonality.MapTarget.CONF;
import static it.csi.melograno.aggregatore.business.javaengine.commonality.MapTarget.MODEL;
import it.csi.findom.blocchetti.blocchetti.cultVociEntrata.CultVociEntrataVO;
import it.csi.findom.blocchetti.common.vo.cultPianospese.CultPianoSpeseVO;
import it.csi.findom.blocchetti.common.vo.domandaNG.DomandaNGVO;
import it.csi.findom.blocchetti.common.vo.operatorepresentatore.OperatorePresentatoreVo;
import it.csi.melograno.aggregatore.business.javaengine.commonality.CommonalityInput;
import it.csi.melograno.aggregatore.business.javaengine.commonality.MapTo;

public class CultFormaAgevolazioneBInput extends CommonalityInput {
	
    @MapTo(target=MODEL,name="_formaAgevolazioneB")
	CultFormaAgevolazioneBVO _formaAgevolazioneB;

    @MapTo(target=MODEL,name="_pianoSpese")
	CultPianoSpeseVO _pianoSpese;
    
    @MapTo(target=MODEL,name="_domanda")
	DomandaNGVO _domanda;

    @MapTo(target=MODEL,name="_vociEntrata")
   	CultVociEntrataVO _vociEntrata;
    
    @MapTo(target=MODEL,name="_operatorePresentatore")
	OperatorePresentatoreVo operatorePresentatoreVO;
    
    @MapTo(target=CONF,name="_progetto_spese_quota_inseribile")
	String _progetto_spese_quota_inseribile;
	
	@MapTo(target=CONF)
	String _importo_minimo_specifico;
	
	@MapTo(target=CONF)
	public String _cult_forma_agv_cfg_da_sportello;
	
	@MapTo(target=CONF,name="_cultFormaAgvB_cntb_max_ultimi_tre_anni")
	String _cultFormaAgvB_cntb_max_ultimi_tre_anni;

	
}
