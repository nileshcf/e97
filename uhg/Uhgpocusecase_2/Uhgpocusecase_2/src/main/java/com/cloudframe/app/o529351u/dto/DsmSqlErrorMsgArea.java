package com.cloudframe.app.o529351u.dto;

/**
*  The class DsmSqlErrorMsgArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DsmSqlErrorMsgArea extends DsmSqlErrorMsgAreaSerialized { 
   

						@Getter @Setter private char[] dsmErrTblName = Field.fillLowValue(25);

						@Getter @Setter private char[] dsmErrSectnName = Field.fillLowValue(34);

						@Getter @Setter private char[] dsmErrPgmName = Field.fillLowValue(8);

						@Getter @Setter private char[] dsmErrClngPgmName = Field.fillLowValue(8);

						@Getter @Setter private char[] dsmErrTblAction = Field.fillLowValue(10);

						@Getter @Setter private char[] dsmErrTxt = Field.fillLowValue(35);
	
	/**
	* Constructor for DsmSqlErrorMsgArea
	**/
    public DsmSqlErrorMsgArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmSqlErrorMsgArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmSqlErrorMsgArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes DsmSqlErrorMsgArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setDsmErrTblName(CONSTANTS.SPACE_25);
         setDsmErrSectnName(CONSTANTS.SPACE_34);
         setDsmErrPgmName(CONSTANTS.SPACE_8);
         setDsmErrClngPgmName(CONSTANTS.SPACE_8);
         setDsmErrTblAction(CONSTANTS.SPACE_10);
         setDsmErrTxt(CONSTANTS.SPACE_35);
   }


}
  
