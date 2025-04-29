package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse27bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse27bTGrp extends Wse27bTGrpSerialized {
   
				@Getter @Setter private Wse27bT wse27bT = new Wse27bT();
	
	/**
	* Constructor for Wse27bTGrp
	**/
    public Wse27bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse27bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
