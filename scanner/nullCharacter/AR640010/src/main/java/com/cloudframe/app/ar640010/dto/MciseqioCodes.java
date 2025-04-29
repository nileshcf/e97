package com.cloudframe.app.ar640010.dto;

/**
*  The class MciseqioCodes is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:47. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MciseqioCodes extends MciseqioCodesSerialized { 
   
				@Getter @Setter private MciseqioRequestCodes mciseqioRequestCodes = new MciseqioRequestCodes();
				@Getter @Setter private MciseqioLabelCodes mciseqioLabelCodes = new MciseqioLabelCodes();
				@Getter @Setter private MciseqioRecfmCodes mciseqioRecfmCodes = new MciseqioRecfmCodes();
	
	/**
	* Constructor for MciseqioCodes
	**/
    public MciseqioCodes() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MciseqioCodes. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciseqioCodes(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMciseqioRequestCodes().setParent(this,getStartOffset() + 0);
					getMciseqioLabelCodes().setParent(this,getStartOffset() + 16);
					getMciseqioRecfmCodes().setParent(this,getStartOffset() + 22);
    } 



}
  
