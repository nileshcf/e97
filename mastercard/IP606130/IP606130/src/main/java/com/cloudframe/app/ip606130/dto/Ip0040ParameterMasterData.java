package com.cloudframe.app.ip606130.dto;

/**
*  The class Ip0040ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip0040ParameterMasterData extends Ip0040ParameterMasterDataSerialized { 
   
				@Getter @Setter private Ip0040TableId ip0040TableId = new Ip0040TableId();
	
	/**
	* Constructor for Ip0040ParameterMasterData
	**/
    public Ip0040ParameterMasterData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip0040ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0040ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp0040TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip0040ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp0040TableId().initialize();
     
   }


}
  
