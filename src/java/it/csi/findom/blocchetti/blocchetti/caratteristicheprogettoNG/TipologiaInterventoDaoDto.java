/*******************************************************************************
 * Copyright Regione Piemonte - 2020
 * SPDX-License-Identifier: EUPL-1.2-or-later
 ******************************************************************************/
package it.csi.findom.blocchetti.blocchetti.caratteristicheprogettoNG;

public class TipologiaInterventoDaoDto {

	
	private Integer idTipoIntervento;
	private String codTipoIntervento;
	private String descrTipoIntervento;
	private String tipologiaIntervento;
	private Integer idCampoTipoIntervento;
	private String codCampoTipoIntervento;
	private String descrCampoTipoIntervento;
	private String flagObbligatorio;
	private String disabilitato;
	
	public Integer getIdTipoIntervento() {
		return idTipoIntervento;
	}
	public void setIdTipoIntervento(Integer idTipoIntervento) {
		this.idTipoIntervento = idTipoIntervento;
	}
	public String getCodTipoIntervento() {
		return codTipoIntervento;
	}
	public void setCodTipoIntervento(String codTipoIntervento) {
		this.codTipoIntervento = codTipoIntervento;
	}
	public String getDescrTipoIntervento() {
		return descrTipoIntervento;
	}
	public void setDescrTipoIntervento(String descrTipoIntervento) {
		this.descrTipoIntervento = descrTipoIntervento;
	}
	public String getTipologiaIntervento() {
		return tipologiaIntervento;
	}
	public void setTipologiaIntervento(String tipologiaIntervento) {
		this.tipologiaIntervento = tipologiaIntervento;
	}
	public Integer getIdCampoTipoIntervento() {
		return idCampoTipoIntervento;
	}
	public void setIdCampoTipoIntervento(Integer idCampoTipoIntervento) {
		this.idCampoTipoIntervento = idCampoTipoIntervento;
	}
	public String getCodCampoTipoIntervento() {
		return codCampoTipoIntervento;
	}
	public void setCodCampoTipoIntervento(String codCampoTipoIntervento) {
		this.codCampoTipoIntervento = codCampoTipoIntervento;
	}
	public String getDescrCampoTipoIntervento() {
		return descrCampoTipoIntervento;
	}
	public void setDescrCampoTipoIntervento(String descrCampoTipoIntervento) {
		this.descrCampoTipoIntervento = descrCampoTipoIntervento;
	}
	public String getFlagObbligatorio() {
		return flagObbligatorio;
	}
	public void setFlagObbligatorio(String flagObbligatorio) {
		this.flagObbligatorio = flagObbligatorio;
	}
	public String getDisabilitato() {
		return disabilitato;
	}
	public void setDisabilitato(String disabilitato) {
		this.disabilitato = disabilitato;
	}
}
