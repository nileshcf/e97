package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip66601UserTagId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip66601UserTagId extends Ip66601UserTagIdSerialized { 
   
				@Getter @Setter private Ip66601UserElementId ip66601UserElementId = new Ip66601UserElementId();

								@Getter @Setter private short ip66601UserTagOccurrence;

								@Getter @Setter private short ip66601UserTagSubfldNo;
	
	/**
	* Constructor for Ip66601UserTagId
	**/
    public Ip66601UserTagId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip66601UserTagId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip66601UserTagId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp66601UserElementId().setParent(this,getStartOffset() + 0);
    } 



}
  
