package com.cloudframe.app.d5427dt1.dto;

/**
*  The class Dt1ClmProviderId is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Dt1ClmProviderId extends Dt1ClmProviderIdSerialized { 
   

								@Getter @Setter private int dt1ClmProviderPrefix;

								@Getter @Setter private long dt1ClmProviderTin;

								@Getter @Setter private long dt1ClmProviderSuffix;
	
	/**
	* Constructor for Dt1ClmProviderId
	**/
    public Dt1ClmProviderId() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Dt1ClmProviderId. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Dt1ClmProviderId(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes Dt1ClmProviderId
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setDt1ClmProviderPrefix(0);
                     setDt1ClmProviderTin(0);
                     setDt1ClmProviderSuffix(0);
   }


}
  
