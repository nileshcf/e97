package com.cloudframe.app.db2funci.dto;

/**
*  The class MsdRecordKey is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:38. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.common.CONSTANTS;


@Data
public class MsdRecordKey extends MsdRecordKeySerialized { 
   

						@Getter @Setter private char[] msdSecurityNo = Field.fillLowValue(7);
				@Getter @Setter private MsdSecurityNoRedefined msdSecurityNoRedefined = new MsdSecurityNoRedefined();

						@Getter @Setter private char[] msdWhenIssuedCode = Field.fillLowValue(1);
	
	/**
	* Constructor for MsdRecordKey
	**/
    public MsdRecordKey() {
	// TO-DO auto generated code
    }


	/**
	* Constructor for MsdRecordKey. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdRecordKey(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
					getMsdSecurityNoRedefined().setParent(this,getStartOffset() + 0);
    } 

	/**
	 * 	initializes MsdRecordKey
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
         setMsdSecurityNo(CONSTANTS.SPACE_7);
         setMsdWhenIssuedCode(CONSTANTS.SPACE);
   }


}
  
