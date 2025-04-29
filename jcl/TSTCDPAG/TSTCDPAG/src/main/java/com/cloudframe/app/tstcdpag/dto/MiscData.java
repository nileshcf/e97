package com.cloudframe.app.tstcdpag.dto;

/**
*  The class MiscData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;


@Data
public class MiscData extends MiscDataSerialized {
   

								@Getter @Setter private int inputStatus;

								@Getter @Setter private int outputStatus;

								@Getter @Setter private long recLenIn;

								@Getter @Setter private short eofFlag;
	
	/**
	* Constructor for MiscData
	**/
    public MiscData() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes MiscData
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setInputStatus(0);
                     setOutputStatus(0);
                     setRecLenIn(0);
         	setEofFlag((short)0);
   }


}
  
