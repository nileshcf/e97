package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdOidDateCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdOidDateCcyymmdd extends MsdOidDateCcyymmddSerialized { 
   

								@Getter @Setter private int msdOidDateCc;

								@Getter @Setter private long msdOidDate;
	
	/**
	* Constructor for MsdOidDateCcyymmdd
	**/
    public MsdOidDateCcyymmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdOidDateCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOidDateCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdOidDateCcyymmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdOidDateCc(0);
                     setMsdOidDate(0);
   }


}
  
