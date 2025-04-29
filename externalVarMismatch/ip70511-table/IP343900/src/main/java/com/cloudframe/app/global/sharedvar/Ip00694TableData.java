package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip00694TableData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Ip00694TableData extends Ip00694TableDataSerialized { 
   

								@Getter @Setter private int ip00694GlobalCurrCode;

								@Getter @Setter private int ip00694GlobalCurrExp;
	
	/**
	* Constructor for Ip00694TableData
	**/
    public Ip00694TableData() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip00694TableData. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00694TableData(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Ip00694TableData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setIp00694GlobalCurrCode(0);
                     setIp00694GlobalCurrExp(0);
   }


}
  
