package com.cloudframe.app.refmod3.dto;

/**
*  The class Wse218bTGrp is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Wse218bTGrp extends Wse218bTGrpSerialized {
   
				@Getter @Setter private Wse218bT wse218bT = new Wse218bT();
	
	/**
	* Constructor for Wse218bTGrp
	**/
    public Wse218bTGrp() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getWse218bT().setParent(this,getStartOffset() + 5);
	   	/*  end of offset */
    }





}
  
