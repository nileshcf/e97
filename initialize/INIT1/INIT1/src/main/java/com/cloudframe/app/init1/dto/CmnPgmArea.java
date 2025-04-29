package com.cloudframe.app.init1.dto;

/**
*  The class CmnPgmArea is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class CmnPgmArea extends CmnPgmAreaSerialized { 
   

						@Getter @Setter private char[] cmnErrorType = Field.fillLowValue(4);

						@Getter @Setter private char[] cmnUserid = Field.fillLowValue(8);


								@Getter @Setter private int cmnErrMsgNo;


						@Getter @Setter private char[] cmnErrApplId = Field.fillLowValue(5);

						@Getter @Setter private char[] cmnErrPgmName = Field.fillLowValue(8);

						@Getter @Setter private char[] cmnErrPgmParanum = Field.fillLowValue(4);

						@Getter @Setter private char[] cmnErrPgmAction = Field.fillLowValue(12);

								@Getter @Setter private int cmnErrSqlcode;

						@Getter @Setter private char[] cmnErrField = Field.fillLowValue(18);
				@Getter @Setter private CmnErrMsgArea cmnErrMsgArea = new CmnErrMsgArea();
				@Getter @Setter private CmnErrMsgBytes cmnErrMsgBytes = new CmnErrMsgBytes();
				@Getter @Setter private CmnApplMsgArea cmnApplMsgArea = new CmnApplMsgArea();
				@Getter @Setter private CmnSqlca cmnSqlca = new CmnSqlca();


						@Getter @Setter private char[] cmnApplName = Field.fillLowValue(38);

						@Getter @Setter private char[] cmnFiller = Field.fillLowValue(242);

								@Getter @Setter private short cmnUserAbendCd;

						@Getter @Setter private char[] cmnAbendInd = Field.fillLowValue(1);
	
	/**
	* Constructor for CmnPgmArea
	**/
    public CmnPgmArea() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for CmnPgmArea. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnPgmArea(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getCmnErrMsgArea().setParent(this,getStartOffset() + 91);
					getCmnErrMsgBytes().setParent(this,getStartOffset() + 91);
					getCmnApplMsgArea().setParent(this,getStartOffset() + 91);
					getCmnSqlca().setParent(this,getStartOffset() + 603);
    } 

	/**
	 * 	initializes CmnPgmArea
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setCmnErrorType(CONSTANTS.SPACE_4);
         setCmnUserid(CONSTANTS.SPACE_8);
                     setCmnErrMsgNo(0);
         setCmnErrApplId(CONSTANTS.SPACE_5);
         setCmnErrPgmName(CONSTANTS.SPACE_8);
         setCmnErrPgmParanum(CONSTANTS.SPACE_4);
         setCmnErrPgmAction(CONSTANTS.SPACE_12);
                     setCmnErrSqlcode(0);
         setCmnErrField(CONSTANTS.SPACE_18);
          getCmnErrMsgArea().initialize();
     
          getCmnSqlca().initialize();
     
         setCmnApplName(CONSTANTS.SPACE_38);
         setCmnFiller(CONSTANTS.SPACE_242);
         	setCmnUserAbendCd((short)0);
         setCmnAbendInd(CONSTANTS.SPACE);
   }


}
  
