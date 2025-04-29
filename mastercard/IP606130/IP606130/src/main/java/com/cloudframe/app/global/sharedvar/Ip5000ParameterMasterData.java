package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip5000ParameterMasterData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:29. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip5000ParameterMasterData extends Ip5000ParameterMasterDataSerialized { 
   
				@Getter @Setter private Ip5000TableId ip5000TableId = new Ip5000TableId();

						@Getter @Setter private char[] ip5000TableData = Field.fillLowValue(32737);
	
	/**
	* Constructor for Ip5000ParameterMasterData
	**/
    public Ip5000ParameterMasterData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip5000ParameterMasterData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip5000ParameterMasterData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp5000TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip5000ParameterMasterData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp5000TableId().initialize();
     
         setIp5000TableData(CONSTANTS.SPACE_32737);
   }


}
  
