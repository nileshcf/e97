package com.cloudframe.app.db2func.dto;

/**
*  The class Bdms01CallParameters is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class Bdms01CallParameters extends Bdms01CallParametersSerialized {
   
				@Getter @Setter private Bdms01InputData bdms01InputData = new Bdms01InputData();
				@Getter @Setter private Bdms01ReturnData bdms01ReturnData = new Bdms01ReturnData();
	
	/**
	* Constructor for Bdms01CallParameters
	**/
    public Bdms01CallParameters() {
		super();
		/*  set the parent of each child as this which are a group variable */
					getBdms01InputData().setParent(this,getStartOffset() + 0);
					getBdms01ReturnData().setParent(this,getStartOffset() + 100);
	   	/*  end of offset */
    }



	/**
	 * 	initializes Bdms01CallParameters
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getBdms01InputData().initialize();
     
          getBdms01ReturnData().initialize();
     
   }


}
  
