package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip500041TableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:35. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip500041TableKey extends Ip500041TableKeySerialized { 
   
				@Getter @Setter private Ip500041TableId ip500041TableId = new Ip500041TableId();

						@Getter @Setter private char[] ip500041EffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip500041TableKey
	**/
    public Ip500041TableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip500041TableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip500041TableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp500041TableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip500041TableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp500041TableId().initialize();
     
         setIp500041EffDate(CONSTANTS.SPACE_10);
   }


}
  
