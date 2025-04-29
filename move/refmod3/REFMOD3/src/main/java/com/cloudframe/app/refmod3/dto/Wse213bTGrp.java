package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse213bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse213bTGrp extends Wse213bTGrpSerialized {
   
				@Getter @Setter private Wse213bT wse213bT = new Wse213bT();
	
	/**
	* Constructor for Wse213bTGrp
	**/
    public Wse213bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse213bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
