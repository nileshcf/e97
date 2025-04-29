package com.cloudframe.app.sup01780.dto;

/**
*  The class WorkAreas is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class WorkAreas extends WorkAreasSerialized {
   

						@Getter @Setter private char[] panStatus1 = new char[2];

						@Getter @Setter private char[] panStatus10 = new char[2];
	
	/**
	* Constructor for WorkAreas
	**/
    public WorkAreas() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setPanStatus1(fillSpace(2));
								setPanStatus10(fillSpace(2));
    }



	/**
	 * 	initializes WorkAreas
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setPanStatus1(CONSTANTS.SPACE_2);
         setPanStatus10(CONSTANTS.SPACE_2);
   }


}
  
