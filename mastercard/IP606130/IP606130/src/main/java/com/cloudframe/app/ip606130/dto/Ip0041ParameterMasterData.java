package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0041ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0041ParameterMasterData extends Ip0041ParameterMasterDataSerialized { 
   
				@Getter @Setter private Ip0041TableId ip0041TableId = new Ip0041TableId();
	
	/**
	* Constructor for Ip0041ParameterMasterData
	**/
    public Ip0041ParameterMasterData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0041ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0041ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0041TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip0041ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp0041TableId().initialize();
     
   }


}
  
