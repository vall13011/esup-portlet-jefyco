package org.esupportail.jefyco.portlet.domain;
 
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
 
import org.esupportail.jefyco.portlet.domain.beans.Convention;
import org.esupportail.jefyco.portlet.domain.beans.DepenseDetails;
import org.esupportail.jefyco.portlet.domain.beans.DepenseSynthese;
import org.esupportail.jefyco.portlet.domain.beans.Exercice;

import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.ModelAttribute;
 
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="NSMutableArrays")
public class DepenseSyntheseList {
 
	@XmlElement(name = "NSDictionary")
	public List<DepenseSynthese> liste = new ArrayList<DepenseSynthese>();
	
	@XmlTransient
	public String exercice;
	
	@XmlTransient
	public String organigramme;
	
	@XmlTransient
	public String convention;
	
	@XmlTransient
	public Boolean sousniveaux;
	
	@XmlTransient
	public String numeropage;
	
	@ModelAttribute("searchForm")
	public List<DepenseSynthese> getDepenseSynthese() {
		return liste;
	}
	 
	public void setDepenseSynthese(List<DepenseSynthese> depensesynthese) {
		this.liste = depensesynthese;
	}
	
	public String getExercice(){
		return exercice;
	}
	 
	public void setExercice(String exercice){
		this.exercice = exercice;
	}

	public Boolean getSousniveaux() {
		return sousniveaux;
	}

	public void setSousniveaux(Boolean sousniveaux) {
		this.sousniveaux = sousniveaux;
	}

	public String getNumeropage() {
		return numeropage;
	}

	public void setNumeropage(String numeropage) {
		this.numeropage = numeropage;
	}
	
	
}