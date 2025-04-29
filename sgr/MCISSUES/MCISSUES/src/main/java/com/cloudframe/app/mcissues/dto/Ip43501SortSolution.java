package com.cloudframe.app.mcissues.dto;

/**
*  The class Ip43501SortSolution is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.List;
import com.cloudframe.app.common.CONSTANTS;
import java.util.ArrayList;


@Data
public class Ip43501SortSolution extends Ip43501SortSolutionSerialized { 
   

						@Getter @Setter private char[] ip43501EiRecType = Field.fillLowValue(2);

						@Getter @Setter private char[] ip43501EiTransmissionId = Field.fillLowValue(25);

						@Getter @Setter private char[] ip43501EiFileId = Field.fillLowValue(25);

								@Getter @Setter private int ip43501EiFileSeqNbr;

								@Getter @Setter private long ip43501EiInstitutionId;

								@Getter @Setter private long ip43501EiBin;

						@Getter @Setter private char[] ip43501EiCardAcceptor = Field.fillLowValue(15);

								@Getter @Setter private long ip43501EiSourceMsgNum;

						@Getter @Setter private char[] ip43501EiErrorType = Field.fillLowValue(1);

						@Getter @Setter private char[] ip43501EiErrorCode = Field.fillLowValue(4);

						@Getter @Setter private char[] ip43501EiErrorMsgNbr = Field.fillLowValue(4);
      private List<char[]> ip43501EiReplText; 

				@Getter @Setter private Ip43501EiErrorInfo ip43501EiErrorInfo = new Ip43501EiErrorInfo();

						@Getter @Setter private char[] ip43501EiFieldErrorInd = Field.fillLowValue(1);

						@Getter @Setter private char[] ip43501EiAmtCntAccumInd = Field.fillLowValue(1);


								@Getter @Setter private int ip43501EiDataLength;
	
	/**
	* Constructor for Ip43501SortSolution
	**/
    public Ip43501SortSolution() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip43501SortSolution. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip43501SortSolution(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp43501EiErrorInfo().setParent(this,getStartOffset() + 256);
    } 

	/**
	 * 	initializes Ip43501SortSolution
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp43501EiRecType(CONSTANTS.SPACE_2);
         setIp43501EiTransmissionId(CONSTANTS.SPACE_25);
         setIp43501EiFileId(CONSTANTS.SPACE_25);
                     setIp43501EiFileSeqNbr(0);
                     setIp43501EiInstitutionId(0);
                     setIp43501EiBin(0);
         setIp43501EiCardAcceptor(CONSTANTS.SPACE_15);
                     setIp43501EiSourceMsgNum(0);
         setIp43501EiErrorType(CONSTANTS.SPACE);
         setIp43501EiErrorCode(CONSTANTS.SPACE_4);
         setIp43501EiErrorMsgNbr(CONSTANTS.SPACE_4);
         for (int index =0; index < IP_43501_EI_REPL_TEXT_SIZE;index++) {
             setIp43501EiReplText(index, CONSTANTS.SPACE_50);
         }
          getIp43501EiErrorInfo().initialize();
     
         setIp43501EiFieldErrorInd(CONSTANTS.SPACE);
         setIp43501EiAmtCntAccumInd(CONSTANTS.SPACE);
                     setIp43501EiDataLength(0);
   }


}
  
