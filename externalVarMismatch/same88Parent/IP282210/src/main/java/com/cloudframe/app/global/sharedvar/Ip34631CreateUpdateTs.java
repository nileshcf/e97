package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip34631CreateUpdateTs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip34631CreateUpdateTs extends Ip34631CreateUpdateTsSerialized { 
   
				@Getter @Setter private Ip34631CreateDate ip34631CreateDate = new Ip34631CreateDate();

						@Getter @Setter private char[] ip34631CreateTime = Field.fillLowValue(16);
	
	/**
	* Constructor for Ip34631CreateUpdateTs
	**/
    public Ip34631CreateUpdateTs() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip34631CreateUpdateTs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip34631CreateUpdateTs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp34631CreateDate().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip34631CreateUpdateTs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp34631CreateDate().initialize();
     
         setIp34631CreateTime(CONSTANTS.SPACE_16);
   }


}
  
