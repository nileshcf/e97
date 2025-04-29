package com.cloudframe.app.refmod2.dto;

/**
*  The class Wse220bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:34. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse220bTGrp extends Wse220bTGrpSerialized {
   
				@Getter @Setter private Wse220bT wse220bT = new Wse220bT();
	
	/**
	* Constructor for Wse220bTGrp
	**/
    public Wse220bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse220bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
