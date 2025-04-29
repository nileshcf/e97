package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class OutputSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:14. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class OutputSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutputSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUTPUT_LENGTH = 31;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOutCardNumber;
            protected  int beginOutServiceMm;
            protected  int beginOutTotal;
	
	/**
	* Constructor for OutputSerialized
	**/
    public OutputSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in OutputSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUTPUT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOutCardNumber = getStartOffset() + 0;	// set offset for serialization
  
             beginOutServiceMm = getStartOffset() + 16;	// set offset for serialization
  
             beginOutTotal = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOutCardNumberCounter = -1;
     public boolean isOutCardNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutCardNumberCounter != sharedCounter;
         localOutCardNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int OUT_CARD_NUMBER_LEN = 16;
	/**
	 * 	serialize this OutCardNumber
	 */
   protected void serializeOutCardNumber(char[] outCardNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(outCardNumber,0,getStringValue(),beginOutCardNumber,OUT_CARD_NUMBER_LEN);
       localOutCardNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOutCardNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshOutCardNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOutCardNumber() {	 
   		return (substring(getStringValue(),beginOutCardNumber,beginOutCardNumber + OUT_CARD_NUMBER_LEN));
   	}
     int localOutServiceMmCounter = -1;
     public boolean isOutServiceMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutServiceMmCounter != sharedCounter;
         localOutServiceMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of outServiceMm
	 *	@return outServiceMm
	 */
	public char[]  getOutServiceMmString() {
	     return getCharArray(beginOutServiceMm,OUT_SERVICE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outServiceMmIsNumeric() {
	    return isNumeric(beginOutServiceMm
	                    ,beginOutServiceMm + OUT_SERVICE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OUT_SERVICE_MM_LEN = 2;
  	/**
	 * serializeOutServiceMm
	 */
	protected void serializeOutServiceMm(int outServiceMm) {
		 putNumber(beginOutServiceMm,outServiceMm,OUT_SERVICE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutServiceMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOutServiceMm
	 */
   	protected  int serializeOutServiceMm(char[] value) {
	    int  outServiceMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    outServiceMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginOutServiceMm
		       ,2
		      );
		 localOutServiceMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  outServiceMm;
    }

   protected int checkOutServiceMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOutServiceMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshOutServiceMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginOutServiceMm
			                 ,OUT_SERVICE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("outServiceMm", beginOutServiceMm,OUT_SERVICE_MM_LEN);
    }
   	}
     int localOutTotalCounter = -1;
     
     public boolean isOutTotalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOutTotalCounter != sharedCounter;
         localOutTotalCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of outTotal
	 *	@return outTotal
	 */
	public char[]  getOutTotalString() {
	    return getCharArray(beginOutTotal,OUT_TOTAL_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean outTotalIsNumeric() {
		    return isNumeric(beginOutTotal
	                    ,beginOutTotal + OUT_TOTAL_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OUT_TOTAL_LEN = 13;
  protected  static final int OUT_TOTAL_SCALE = 3;

   protected BigDecimal checkOutTotalMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,3/*scale*/,13/*precision*/);
   }

  	/**
	 * serializeOutTotal
	 */
	protected void serializeOutTotal(BigDecimal outTotal) {
	       putNumber(beginOutTotal,outTotal,OUT_TOTAL_LEN,OUT_TOTAL_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOutTotalCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOutTotal
	 */
   	protected  BigDecimal serializeOutTotal(char[] value) throws CFException {
        if (value.length < 13) value = pad(13, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(13,value,false/*isSigned?*/)
		       ,beginOutTotal
		       ,13
		      );		 localOutTotalCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OUT_TOTAL_LEN,OUT_TOTAL_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("outTotal", beginOutTotal,OUT_TOTAL_LEN);
    	}
    }
    /**
	 *	refreshOutTotal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOutTotal() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOutTotal
			            ,OUT_TOTAL_LEN
			            ,OUT_TOTAL_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("outTotal", beginOutTotal,OUT_TOTAL_LEN);
    }
   	}




}
  
