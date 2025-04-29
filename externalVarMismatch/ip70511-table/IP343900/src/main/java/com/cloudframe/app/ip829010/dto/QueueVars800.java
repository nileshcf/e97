package com.cloudframe.app.ip829010.dto;

/**
*  The class QueueVars800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class QueueVars800 extends QueueVars800Serialized {
   

						@Getter @Setter private char[] reqQmgrName800 = Field.fillLowValue(48);

						@Getter @Setter private char[] reqQName800 = Field.fillLowValue(48);

								@Getter @Setter private int reqHconn800;

								@Getter @Setter private int reqHobj800;

						@Getter @Setter private char[] resQmgrName800 = Field.fillLowValue(48);

						@Getter @Setter private char[] resQName800 = Field.fillLowValue(48);

								@Getter @Setter private int resHconn800;

								@Getter @Setter private int resHobj800;
	
	/**
	* Constructor for QueueVars800
	**/
    public QueueVars800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes QueueVars800
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setReqQmgrName800(CONSTANTS.SPACE_48);
         setReqQName800(CONSTANTS.SPACE_48);
                     setReqHconn800(0);
                     setReqHobj800(0);
         setResQmgrName800(CONSTANTS.SPACE_48);
         setResQName800(CONSTANTS.SPACE_48);
                     setResHconn800(0);
                     setResHobj800(0);
   }


}
  
