package com.cloudframe.app.d529351u.dto;

/**
*  The class LstIcdKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class LstIcdKey extends LstIcdKeySerialized {
   

						@Getter @Setter private char[] lstClmIcdInd = Field.fillLowValue(1);

						@Getter @Setter private char[] lstClmIcdPos = Field.fillLowValue(2);

						@Getter @Setter private char[] lstClmIcdSvc = Field.fillLowValue(6);

						@Getter @Setter private char[] lstClmIcdCau = Field.fillLowValue(1);
	
	/**
	* Constructor for LstIcdKey
	**/
    public LstIcdKey() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }



	/**
	 * 	initializes LstIcdKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setLstClmIcdInd(CONSTANTS.SPACE);
         setLstClmIcdPos(CONSTANTS.SPACE_2);
         setLstClmIcdSvc(CONSTANTS.SPACE_6);
         setLstClmIcdCau(CONSTANTS.SPACE);
   }


}
  
