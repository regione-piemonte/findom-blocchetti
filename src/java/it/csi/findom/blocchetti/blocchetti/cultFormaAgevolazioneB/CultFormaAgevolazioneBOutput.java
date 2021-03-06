/*******************************************************************************
 * Copyright Regione Piemonte - 2020
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************************************/
package it.csi.findom.blocchetti.blocchetti.cultFormaAgevolazioneB;

import static it.csi.melograno.aggregatore.business.javaengine.commonality.MapTarget.NAMESPACE;
import it.csi.melograno.aggregatore.business.javaengine.commonality.CommonalityOutput;
import it.csi.melograno.aggregatore.business.javaengine.commonality.MapTo;

public class CultFormaAgevolazioneBOutput extends CommonalityOutput {
	
	/** jira 2040 - */
	@MapTo(target=NAMESPACE)
	String viewInfoSaldoContabile;
	
	@MapTo(target=NAMESPACE)
	String percQuotaParteSpeseGenFunz; 

	@MapTo(target=NAMESPACE)
	String percMassimaContributoErogabile;

	@MapTo(target=NAMESPACE)
	String importoMinimoErogabile;  

	@MapTo(target=NAMESPACE)
	String importoMassimoErogabile; 

	@MapTo(target=NAMESPACE)
	String totaleSpeseEffettive;

	@MapTo(target=NAMESPACE)
	String totaleEntrate; 

	@MapTo(target=NAMESPACE)
	String differenzaEU;	

	@MapTo(target=NAMESPACE)
	String importoErogabile; 

	@MapTo(target=NAMESPACE)
	String importoRichiesto;	
	
	@MapTo(target=NAMESPACE)
	String viewWarningAgevolazioni;
	
	@MapTo(target=NAMESPACE)
	String speseConnesseAttivita;
	
	@MapTo(target=NAMESPACE)
	String speseGeneraliEFunz;
	
	@MapTo(target=NAMESPACE)
	String speseGeneraliEFunzQP;
	
	@MapTo(target=NAMESPACE)
	String percentualeContributoErogabile;
	
	@MapTo(target=NAMESPACE)
	String campiNascosti;
	
	@MapTo(target=NAMESPACE)
	String campoNascostoTotaleEntrate;
	
	/** jira 2009 */
	@MapTo(target=NAMESPACE)
	String contributoMaxUltimiTreAnni;
	
	@MapTo(target=NAMESPACE)
	String saldoContabilePrevisto;
	
	/**
	 * Jira: 1337:
	 * Visualizzazione msg in caso di assenza importi
	 * presenti a database.
	 */
	@MapTo(target=NAMESPACE)
	String viewWarningImportiAgevolazioni;

	public String getViewWarningImportiAgevolazioni() {
		return viewWarningImportiAgevolazioni;
	}

	public void setViewWarningImportiAgevolazioni(
			String viewWarningImportiAgevolazioni) {
		this.viewWarningImportiAgevolazioni = viewWarningImportiAgevolazioni;
	}

	public String getPercQuotaParteSpeseGenFunz() {
		return percQuotaParteSpeseGenFunz;
	}

	public String getPercMassimaContributoErogabile() {
		return percMassimaContributoErogabile;
	}

	public String getImportoMinimoErogabile() {
		return importoMinimoErogabile;
	}

	public String getImportoMassimoErogabile() {
		return importoMassimoErogabile;
	}

	public String getTotaleSpeseEffettive() {
		return totaleSpeseEffettive;
	}

	public String getTotaleEntrate() {
		return totaleEntrate;
	}

	public String getDifferenzaEU() {
		return differenzaEU;
	}

	public String getImportoErogabile() {
		return importoErogabile;
	}

	public String getImportoRichiesto() {
		return importoRichiesto;
	}

	public String getViewWarningAgevolazioni() {
		return viewWarningAgevolazioni;
	}

	public String getSpeseConnesseAttivita() {
		return speseConnesseAttivita;
	}

	public String getSpeseGeneraliEFunz() {
		return speseGeneraliEFunz;
	}

	public String getSpeseGeneraliEFunzQP() {
		return speseGeneraliEFunzQP;
	}

	public void setPercQuotaParteSpeseGenFunz(String percQuotaParteSpeseGenFunz) {
		this.percQuotaParteSpeseGenFunz = percQuotaParteSpeseGenFunz;
	}

	public void setPercMassimaContributoErogabile(
			String percMassimaContributoErogabile) {
		this.percMassimaContributoErogabile = percMassimaContributoErogabile;
	}

	public void setImportoMinimoErogabile(String importoMinimoErogabile) {
		this.importoMinimoErogabile = importoMinimoErogabile;
	}

	public void setImportoMassimoErogabile(String importoMassimoErogabile) {
		this.importoMassimoErogabile = importoMassimoErogabile;
	}

	public void setTotaleSpeseEffettive(String totaleSpeseEffettive) {
		this.totaleSpeseEffettive = totaleSpeseEffettive;
	}

	public void setTotaleEntrate(String totaleEntrate) {
		this.totaleEntrate = totaleEntrate;
	}

	public void setDifferenzaEU(String differenzaEU) {
		this.differenzaEU = differenzaEU;
	}

	public void setImportoErogabile(String importoErogabile) {
		this.importoErogabile = importoErogabile;
	}

	public void setImportoRichiesto(String importoRichiesto) {
		this.importoRichiesto = importoRichiesto;
	}

	public void setViewWarningAgevolazioni(String viewWarningAgevolazioni) {
		this.viewWarningAgevolazioni = viewWarningAgevolazioni;
	}

	public void setSpeseConnesseAttivita(String speseConnesseAttivita) {
		this.speseConnesseAttivita = speseConnesseAttivita;
	}

	public void setSpeseGeneraliEFunz(String speseGeneraliEFunz) {
		this.speseGeneraliEFunz = speseGeneraliEFunz;
	}

	public void setSpeseGeneraliEFunzQP(String speseGeneraliEFunzQP) {
		this.speseGeneraliEFunzQP = speseGeneraliEFunzQP;
	}

	public String getCampiNascosti() {
		return campiNascosti;
	}

	public void setCampiNascosti(String campiNascosti) {
		this.campiNascosti = campiNascosti;
	}

	public String getCampoNascostoTotaleEntrate() {
		return campoNascostoTotaleEntrate;
	}

	public void setCampoNascostoTotaleEntrate(String campoNascostoTotaleEntrate) {
		this.campoNascostoTotaleEntrate = campoNascostoTotaleEntrate;
	}

	public String getPercentualeContributoErogabile() {
		return percentualeContributoErogabile;
	}

	public void setPercentualeContributoErogabile(
			String percentualeContributoErogabile) {
		this.percentualeContributoErogabile = percentualeContributoErogabile;
	}

	public String getContributoMaxUltimiTreAnni() {
		return contributoMaxUltimiTreAnni;
	}

	public void setContributoMaxUltimiTreAnni(String contributoMaxUltimiTreAnni) {
		this.contributoMaxUltimiTreAnni = contributoMaxUltimiTreAnni;
	}

	public String getSaldoContabilePrevisto() {
		return saldoContabilePrevisto;
	}

	public void setSaldoContabilePrevisto(String saldoContabilePrevisto) {
		this.saldoContabilePrevisto = saldoContabilePrevisto;
	}

	public String getViewInfoSaldoContabile() {
		return viewInfoSaldoContabile;
	}

	public void setViewInfoSaldoContabile(String viewInfoSaldoContabile) {
		this.viewInfoSaldoContabile = viewInfoSaldoContabile;
	}
	
}
