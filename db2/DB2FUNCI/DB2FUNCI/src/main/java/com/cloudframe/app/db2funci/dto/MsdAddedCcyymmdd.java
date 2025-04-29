package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdAddedCcyymmdd is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class MsdAddedCcyymmdd extends MsdAddedCcyymmddSerialized { 
   

								@Getter @Setter private int msdAddedCc;

								@Getter @Setter private long msdAddedYymmdd;
	
	/**
	* Constructor for MsdAddedCcyymmdd
	**/
    public MsdAddedCcyymmdd() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdAddedCcyymmdd. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdAddedCcyymmdd(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes MsdAddedCcyymmdd
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setMsdAddedCc(0);
                     setMsdAddedYymmdd(0);
   }


}
  
