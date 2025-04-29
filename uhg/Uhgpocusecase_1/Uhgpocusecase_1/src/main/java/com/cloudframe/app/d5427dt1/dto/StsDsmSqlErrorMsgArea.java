package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsDsmSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsDsmSqlErrorMsgArea extends StsDsmSqlErrorMsgAreaSerialized { 
   

						@Getter @Setter private char[] stsDsmErrTblName = Field.fillLowValue(25);

						@Getter @Setter private char[] stsDsmErrSectnName = Field.fillLowValue(34);

						@Getter @Setter private char[] stsDsmErrPgmName = Field.fillLowValue(8);

						@Getter @Setter private char[] stsDsmErrClngPgmName = Field.fillLowValue(8);

						@Getter @Setter private char[] stsDsmErrTblAction = Field.fillLowValue(10);

						@Getter @Setter private char[] stsDsmErrTxt = Field.fillLowValue(35);
	
	/**
	* Constructor for StsDsmSqlErrorMsgArea
	**/
    public StsDsmSqlErrorMsgArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsDsmSqlErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmSqlErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes StsDsmSqlErrorMsgArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setStsDsmErrTblName(CONSTANTS.SPACE_25);
         setStsDsmErrSectnName(CONSTANTS.SPACE_34);
         setStsDsmErrPgmName(CONSTANTS.SPACE_8);
         setStsDsmErrClngPgmName(CONSTANTS.SPACE_8);
         setStsDsmErrTblAction(CONSTANTS.SPACE_10);
         setStsDsmErrTxt(CONSTANTS.SPACE_35);
   }


}
  
