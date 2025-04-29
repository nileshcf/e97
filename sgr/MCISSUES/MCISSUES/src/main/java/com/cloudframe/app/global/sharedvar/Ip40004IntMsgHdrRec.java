package com.cloudframe.app.global.sharedvar;

/**
*  The class Ip40004IntMsgHdrRec is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:42. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;
import com.cloudframe.app.common.CONSTANTS;
import java.util.List;
import java.util.ArrayList;


@Data
public class Ip40004IntMsgHdrRec extends Ip40004IntMsgHdrRecSerialized { 
   

						@Getter @Setter private char[] ip40004FileRecType = Field.fillLowValue(1);

								@Getter @Setter private int ip40004FileSeqNbr;
				@Getter @Setter private Ip40004FileId ip40004FileId = new Ip40004FileId();
				@Getter @Setter private Ip40004TransId ip40004TransId = new Ip40004TransId();

						@Getter @Setter private char[] ip40004FileStatus = Field.fillLowValue(1);

						@Getter @Setter private char[] ip40004RejectStatus = Field.fillLowValue(1);

								@Getter @Setter private long ip40004ActualCount;

								@Getter @Setter private long ip40004ActualAmount;

								@Getter @Setter private long ip40004TrailerCount;

								@Getter @Setter private long ip40004TrailerAmount;
			@Getter @Setter private List<Ip40004FileErrors> ip40004FileErrors = new ArrayList<>();
    	

						@Getter @Setter private char[] ip40004FileData = Field.fillLowValue(200);

						@Getter @Setter private char[] ip40004TrlrData = Field.fillLowValue(300);

								@Getter @Setter private long ip40004TrlrDataLen;

								@Getter @Setter private long ip40004SourceMsgNbr;

	
	/**
	* Constructor for Ip40004IntMsgHdrRec
	**/
    public Ip40004IntMsgHdrRec() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for Ip40004IntMsgHdrRec. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip40004IntMsgHdrRec(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getIp40004FileId().setParent(this,getStartOffset() + 4);
					getIp40004TransId().setParent(this,getStartOffset() + 29);
				for (int arrayIndex = 0; arrayIndex < IP_40004_FILE_ERRORS_SIZE;arrayIndex++) {
						getIp40004FileErrors().add(new Ip40004FileErrors(this, beginIp40004FileErrors + 
						arrayIndex * Ip40004FileErrors.getIp40004FileErrorsFieldLength()));
				}
    } 

	/**
	 * 	initializes Ip40004IntMsgHdrRec
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setIp40004FileRecType(CONSTANTS.SPACE);
                     setIp40004FileSeqNbr(0);
          getIp40004FileId().initialize();
     
          getIp40004TransId().initialize();
     
         setIp40004FileStatus(CONSTANTS.SPACE);
         setIp40004RejectStatus(CONSTANTS.SPACE);
                     setIp40004ActualCount(0);
                     setIp40004ActualAmount(0);
                     setIp40004TrailerCount(0);
                     setIp40004TrailerAmount(0);
     if (ip40004FileErrors.isEmpty()) { 
          // fill the Array to the full capacity 
          for (int index = 0;index <  IP_40004_FILE_ERRORS_SIZE;index++) {
              Ip40004FileErrors  newElement = new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength());
              newElement.initialize();
              getIp40004FileErrors().add(newElement);
          }
     } else {
        if (ip40004FileErrors.size() < IP_40004_FILE_ERRORS_SIZE) {
          // prefill it first
          for (int index = ip40004FileErrors.size();index <  IP_40004_FILE_ERRORS_SIZE;index++) {
              Ip40004FileErrors  newElement = new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength());
              getIp40004FileErrors().add(newElement);
          }
        }
        
     	for (int index = 0;index <  IP_40004_FILE_ERRORS_SIZE;index++) {
     		Ip40004FileErrors ip40004FileErrorsVar = ip40004FileErrors.get(index);
 			if (ip40004FileErrorsVar == null) {
                ip40004FileErrorsVar = new Ip40004FileErrors(this,beginIp40004FileErrors + index * Ip40004FileErrors.getIp40004FileErrorsFieldLength());
                  getIp40004FileErrors().set(index, ip40004FileErrorsVar);
			} 
			ip40004FileErrorsVar.initialize();
		}
     }
         setIp40004FileData(CONSTANTS.SPACE_200);
         setIp40004TrlrData(CONSTANTS.SPACE_300);
                     setIp40004TrlrDataLen(0);
                     setIp40004SourceMsgNbr(0);
   }


}
  
