package com.cloudframe.app.edjaddrs.dto;

/**
*  The class RctHdrOrTrlAkaHotInfo is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:32. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class RctHdrOrTrlAkaHotInfo extends RctHdrOrTrlAkaHotInfoSerialized { 
   
				@Getter @Setter private RctMinComp3Group rctMinComp3Group = new RctMinComp3Group();
	
	/**
	* Constructor for RctHdrOrTrlAkaHotInfo
	**/
    public RctHdrOrTrlAkaHotInfo() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for RctHdrOrTrlAkaHotInfo. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RctHdrOrTrlAkaHotInfo(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getRctMinComp3Group().setParent(this,getStartOffset() + 208);
    } 



}
  
