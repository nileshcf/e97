package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip58041CreateUpdateTs is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class Ip58041CreateUpdateTs extends Ip58041CreateUpdateTsSerialized { 
   
				@Getter @Setter private Ip58041CreateDate ip58041CreateDate = new Ip58041CreateDate();

						@Getter @Setter private char[] ip58041CreateTime = Field.fillLowValue(16);
	
	/**
	* Constructor for Ip58041CreateUpdateTs
	**/
    public Ip58041CreateUpdateTs() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip58041CreateUpdateTs. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip58041CreateUpdateTs(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp58041CreateDate().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes Ip58041CreateUpdateTs
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getIp58041CreateDate().initialize();
     
         setIp58041CreateTime(CONSTANTS.SPACE_16);
   }


}
  
