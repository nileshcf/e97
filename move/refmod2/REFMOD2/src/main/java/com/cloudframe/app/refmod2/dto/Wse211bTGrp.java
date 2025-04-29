package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse211bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse211bTGrp extends Wse211bTGrpSerialized {
   
				@Getter @Setter private Wse211bT wse211bT = new Wse211bT();
	
	/**
	* Constructor for Wse211bTGrp
	**/
    public Wse211bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse211bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
