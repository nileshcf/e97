package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class SamapcTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class SamapcTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SamapcTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SAMAPC_TABLE_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApcIca;
            protected  int beginApcAmt;
            protected  int beginDbCrInd;
	
	/**
	* Constructor for SamapcTableSerialized
	**/
    public SamapcTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SamapcTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SamapcTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SamapcTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SamapcTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SamapcTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SAMAPC_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApcIca = getStartOffset() + 0;	// set offset for serialization
  
             beginApcAmt = getStartOffset() + 6;	// set offset for serialization
  
             beginDbCrInd = getStartOffset() + 26;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localApcIcaCounter = -1;
     public boolean isApcIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApcIcaCounter != sharedCounter;
         localApcIcaCounter = sharedCounter; return hasModified;
     }
	protected static final int APC_ICA_LEN = 6;
	/**
	 * 	serialize this ApcIca
	 */
   protected void serializeApcIca(char[] apcIca) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(apcIca,0,getStringValue(),beginApcIca,APC_ICA_LEN);
       localApcIcaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApcIcaConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshApcIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApcIca() {	 
   		return (substring(getStringValue(),beginApcIca,beginApcIca + APC_ICA_LEN));
   	}
     int localApcAmtCounter = -1;
     
     public boolean isApcAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApcAmtCounter != sharedCounter;
         localApcAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of apcAmt
	 *	@return apcAmt
	 */
	public char[]  getApcAmtString() {
	    return getCharArray(beginApcAmt,APC_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean apcAmtIsNumeric() {
		    return isNumeric(beginApcAmt
	                    ,beginApcAmt + APC_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int APC_AMT_LEN = 20;
  protected  static final int APC_AMT_SCALE = 5;

   protected BigDecimal checkApcAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,5/*scale*/,20/*precision*/);
   }

  	/**
	 * serializeApcAmt
	 */
	protected void serializeApcAmt(BigDecimal apcAmt) {
	       putNumber(beginApcAmt,apcAmt,APC_AMT_LEN,APC_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localApcAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeApcAmt
	 */
   	protected  BigDecimal serializeApcAmt(char[] value) throws CFException {
        if (value.length < 20) value = pad(20, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(20,value,false/*isSigned?*/)
		       ,beginApcAmt
		       ,20
		      );		 localApcAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,APC_AMT_LEN,APC_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("apcAmt", beginApcAmt,APC_AMT_LEN);
    	}
    }
    /**
	 *	refreshApcAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshApcAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginApcAmt
			            ,APC_AMT_LEN
			            ,APC_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("apcAmt", beginApcAmt,APC_AMT_LEN);
    }
   	}
     int localDbCrIndCounter = -1;
     public boolean isDbCrIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDbCrIndCounter != sharedCounter;
         localDbCrIndCounter = sharedCounter; return hasModified;
     }
	protected static final int DB_CR_IND_LEN = 1;
	/**
	 * 	serialize this DbCrInd
	 */
   protected void serializeDbCrInd(char[] dbCrInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dbCrInd,0,getStringValue(),beginDbCrInd,DB_CR_IND_LEN);
       localDbCrIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDbCrIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshDbCrInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDbCrInd() {	 
   		return (substring(getStringValue(),beginDbCrInd,beginDbCrInd + DB_CR_IND_LEN));
   	}




}
  
