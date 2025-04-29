package com.cloudframe.app.init1.dto;

/**
*  The class ErrAcctRecord is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:28. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class ErrAcctRecord extends ErrAcctRecordSerialized { 
   
				@Getter @Setter private ErrCustAcct errCustAcct = new ErrCustAcct();
				@Getter @Setter private ErrCodes errCodes = new ErrCodes();

						@Getter @Setter private char[] errRejectCd = new char[3];

						@Getter @Setter private char[] errRejectReason = new char[40];
	
	/**
	* Constructor for ErrAcctRecord
	**/
    public ErrAcctRecord() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for ErrAcctRecord. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ErrAcctRecord(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getErrCustAcct().setParent(this,getStartOffset() + 0);
					getErrCodes().setParent(this,getStartOffset() + 8);
								setErrRejectCd(fillSpace(3));
								setErrRejectReason(fillSpace(40));
    } 

	/**
	 * 	initializes ErrAcctRecord
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          getErrCustAcct().initialize();
     
          getErrCodes().initialize();
     
         setErrRejectCd(CONSTANTS.SPACE_3);
         setErrRejectReason(CONSTANTS.SPACE_40);
   }


}
  
