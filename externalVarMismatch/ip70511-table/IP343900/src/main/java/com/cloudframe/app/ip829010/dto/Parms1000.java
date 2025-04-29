package com.cloudframe.app.ip829010.dto;

/**
*  The class Parms1000 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;


@Data
public class Parms1000 extends Parms1000Serialized {
   


						@Getter @Setter private char[] lnFacreqJobgrpName1000 = Field.fillLowValue(6);

								@Getter @Setter private int lnFacreqJobgrpNum1000;


						@Getter @Setter private char[] lnCloneOwnerId1000 = Field.fillLowValue(3);


								@Getter @Setter private int lnParm911Retry1000;


						@Getter @Setter private char[] lnMqDebugSw1000 = Field.fillLowValue(1);

	
	/**
	* Constructor for Parms1000
	**/
    public Parms1000() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }





}
  
