package com.cloudframe.app.o529351u.dto.serialize;

/**
*  The class FesaDateTimestampSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FesaDateTimestampSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesaDateTimestampSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESA_DATE_TIMESTAMP_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesaDatestamp;
            protected  int beginFesaTimestamp;
	
	/**
	* Constructor for FesaDateTimestampSerialized
	**/
    public FesaDateTimestampSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesaDateTimestampSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesaDateTimestampSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesaDateTimestampSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this FesaDateTimestampSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in FesaDateTimestampSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESA_DATE_TIMESTAMP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesaDatestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginFesaTimestamp = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localFesaDatestampCounter = -1;
        public boolean isFesaDatestampModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaDatestampCounter != sharedCounter;
           localFesaDatestampCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesaDatestampIsNumeric() {
	      return decimalIsNumeric(beginFesaDatestamp,FESA_DATESTAMP_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_DATESTAMP_LEN = 4;
  	/**
	 * 	serializeFesaDatestamp
	 */
	protected void serializeFesaDatestamp(int fesaDatestamp) {
		   putDecimal(beginFesaDatestamp,fesaDatestamp,FESA_DATESTAMP_LEN,true);
   }
   

   protected int checkFesaDatestampMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaDatestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaDatestamp() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaDatestamp,FESA_DATESTAMP_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaDatestamp", beginFesaDatestamp,FESA_DATESTAMP_LEN);
     }
   	}
        int localFesaTimestampCounter = -1;
        public boolean isFesaTimestampModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesaTimestampCounter != sharedCounter;
           localFesaTimestampCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesaTimestampIsNumeric() {
	      return decimalIsNumeric(beginFesaTimestamp,FESA_TIMESTAMP_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESA_TIMESTAMP_LEN = 5;
  	/**
	 * 	serializeFesaTimestamp
	 */
	protected void serializeFesaTimestamp(int fesaTimestamp) {
		   putDecimal(beginFesaTimestamp,fesaTimestamp,FESA_TIMESTAMP_LEN,true);
   }
   

   protected int checkFesaTimestampMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesaTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesaTimestamp() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesaTimestamp,FESA_TIMESTAMP_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesaTimestamp", beginFesaTimestamp,FESA_TIMESTAMP_LEN);
     }
   	}




}
  
