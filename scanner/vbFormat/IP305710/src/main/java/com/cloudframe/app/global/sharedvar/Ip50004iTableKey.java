package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip50004iTableKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:46. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip50004iTableKey extends Ip50004iTableKeySerialized { 
   
				@Getter @Setter private Ip50004iTableId ip50004iTableId = new Ip50004iTableId();

						@Getter @Setter private char[] ip50004iEffDate = Field.fillLowValue(10);
	
	/**
	* Constructor for Ip50004iTableKey
	**/
    public Ip50004iTableKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip50004iTableKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip50004iTableKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp50004iTableId().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip50004iTableKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp50004iTableId().initialize();
     
         setIp50004iEffDate(CONSTANTS.SPACE_10);
   }


}
  
