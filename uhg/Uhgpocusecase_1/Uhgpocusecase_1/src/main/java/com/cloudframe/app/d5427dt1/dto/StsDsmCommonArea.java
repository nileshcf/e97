package com.cloudframe.app.d5427dt1.dto;

/**
*  The class StsDsmCommonArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:37. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class StsDsmCommonArea extends StsDsmCommonAreaSerialized { 
   

								@Getter @Setter private int stsDsmFuncCd;

								@Getter @Setter private int stsDsmReturnCode;
				@Getter @Setter private StsDsmSqlErrorMsgArea stsDsmSqlErrorMsgArea = new StsDsmSqlErrorMsgArea();

						@Getter @Setter private char[] stsDsmSqlErrorMessage = Field.fillLowValue(120);
				@Getter @Setter private StsDsmFormattedSqlErrMsg stsDsmFormattedSqlErrMsg = new StsDsmFormattedSqlErrMsg();
	
	/**
	* Constructor for StsDsmCommonArea
	**/
    public StsDsmCommonArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for StsDsmCommonArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StsDsmCommonArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getStsDsmSqlErrorMsgArea().setParent(this,getStartOffset() + 5);
					getStsDsmFormattedSqlErrMsg().setParent(this,getStartOffset() + 245);
								setStsDsmReturnCode(0);
    } 

	/**
	 * 	initializes StsDsmCommonArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
                     setStsDsmFuncCd(0);
                     setStsDsmReturnCode(0);
          getStsDsmSqlErrorMsgArea().initialize();
     
         setStsDsmSqlErrorMessage(CONSTANTS.SPACE_120);
          getStsDsmFormattedSqlErrMsg().initialize();
     
   }


}
  
