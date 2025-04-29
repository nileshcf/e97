package com.cloudframe.app.o529351u.dto;

/**
*  The class DsmFormattedSqlErrMsg is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:30. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import java.util.List;
import com.cloudframe.app.data.Field;
import java.util.ArrayList;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class DsmFormattedSqlErrMsg extends DsmFormattedSqlErrMsgSerialized { 
   
      private List<char[]> dsmFrmtdSqlErrMsg; 

	
	/**
	* Constructor for DsmFormattedSqlErrMsg
	**/
    public DsmFormattedSqlErrMsg() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for DsmFormattedSqlErrMsg. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DsmFormattedSqlErrMsg(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 * 	initializes DsmFormattedSqlErrMsg
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         for (int index =0; index < DSM_FRMTD_SQL_ERR_MSG_SIZE;index++) {
             setDsmFrmtdSqlErrMsg(index, CONSTANTS.SPACE_78);
         }
   }


}
  
