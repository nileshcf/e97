package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResponseMessage1000RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class ResponseMessage1000RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResponseMessage1000RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESPONSE_MESSAGE_1000_REDEFINED_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResponseEndptId1000;
            protected  int beginResponseCyclNum1000;
            protected  int beginResponseGftDsn1000;
	
	/**
	* Constructor for ResponseMessage1000RedefinedSerialized
	**/
    public ResponseMessage1000RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ResponseMessage1000RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResponseMessage1000RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ResponseMessage1000RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,85); // serialize this field at offset 85 by default 
    }
    
	/**
	* sets parent for this ResponseMessage1000RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 85 by default
    }    
	/**
	* initializes the field in ResponseMessage1000RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESPONSE_MESSAGE_1000_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginResponseEndptId1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginResponseCyclNum1000 = getStartOffset() + 4;	// set offset for serialization
  
             beginResponseGftDsn1000 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localResponseEndptId1000Counter = -1;
        public boolean isResponseEndptId1000Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localResponseEndptId1000Counter != sharedCounter;
           localResponseEndptId1000Counter = sharedCounter; return hasModified; 
        }
	    public boolean responseEndptId1000IsNumeric() {
	      return decimalIsNumeric(beginResponseEndptId1000,RESPONSE_ENDPT_ID_1000_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RESPONSE_ENDPT_ID_1000_LEN = 4;
  	/**
	 * 	serializeResponseEndptId1000
	 */
	protected void serializeResponseEndptId1000(int responseEndptId1000) {
		   putDecimal(beginResponseEndptId1000,responseEndptId1000,RESPONSE_ENDPT_ID_1000_LEN,true);
   }
   

   protected int checkResponseEndptId1000MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshResponseEndptId1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshResponseEndptId1000() throws CFException {	
   	try { 
		 return (getIntDecimal(beginResponseEndptId1000,RESPONSE_ENDPT_ID_1000_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("responseEndptId1000", beginResponseEndptId1000,RESPONSE_ENDPT_ID_1000_LEN);
     }
   	}
        int localResponseCyclNum1000Counter = -1;
        public boolean isResponseCyclNum1000Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localResponseCyclNum1000Counter != sharedCounter;
           localResponseCyclNum1000Counter = sharedCounter; return hasModified; 
        }
	    public boolean responseCyclNum1000IsNumeric() {
	      return decimalIsNumeric(beginResponseCyclNum1000,RESPONSE_CYCL_NUM_1000_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int RESPONSE_CYCL_NUM_1000_LEN = 2;
  	/**
	 * 	serializeResponseCyclNum1000
	 */
	protected void serializeResponseCyclNum1000(short responseCyclNum1000) {
		   putDecimal(beginResponseCyclNum1000,responseCyclNum1000,RESPONSE_CYCL_NUM_1000_LEN,true);
   }
   

   protected short checkResponseCyclNum1000MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshResponseCyclNum1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshResponseCyclNum1000() throws CFException {	
   	try { 
		 return (getShortDecimal(beginResponseCyclNum1000,RESPONSE_CYCL_NUM_1000_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("responseCyclNum1000", beginResponseCyclNum1000,RESPONSE_CYCL_NUM_1000_LEN);
     }
   	}
     int localResponseGftDsn1000Counter = -1;
     public boolean isResponseGftDsn1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResponseGftDsn1000Counter != sharedCounter;
         localResponseGftDsn1000Counter = sharedCounter; return hasModified;
     }
	protected static final int RESPONSE_GFT_DSN_1000_LEN = 44;
	/**
	 * 	serialize this ResponseGftDsn1000
	 */
   protected void serializeResponseGftDsn1000(char[] responseGftDsn1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(responseGftDsn1000,0,getStringValue(),beginResponseGftDsn1000,RESPONSE_GFT_DSN_1000_LEN);
       localResponseGftDsn1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkResponseGftDsn1000Constraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshResponseGftDsn1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshResponseGftDsn1000() {	 
   		return (substring(getStringValue(),beginResponseGftDsn1000,beginResponseGftDsn1000 + RESPONSE_GFT_DSN_1000_LEN));
   	}




}
  
