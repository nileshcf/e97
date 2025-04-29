package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsDsmFormattedSqlErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsDsmFormattedSqlErrMsg extends StsDsmFormattedSqlErrMsgSerialized { 
   
      private List<char[]> stsDsmFrmtdSqlErrMsg; 

	
	/**
	* Constructor for StsDsmFormattedSqlErrMsg
	**/
    public StsDsmFormattedSqlErrMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsDsmFormattedSqlErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmFormattedSqlErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes StsDsmFormattedSqlErrMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < STS_DSM_FRMTD_SQL_ERR_MSG_SIZE;index++) {
             setStsDsmFrmtdSqlErrMsg(index, CONSTANTS.SPACE_78);
         }
   }


}
  
