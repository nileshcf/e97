package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip00901ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00901ParameterMasterData extends Ip00901ParameterMasterDataSerialized { 
   
				@Getter @Setter private Ip00901TableId ip00901TableId = new Ip00901TableId();
	
	/**
	* Constructor for Ip00901ParameterMasterData
	**/
    public Ip00901ParameterMasterData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00901ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp00901TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip00901ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp00901TableId().initialize();
     
   }


}
  
