package com.cloudframe.app.o529351u.dto.serialize;

/**
*  The class FesrDateTimestampSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class FesrDateTimestampSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FesrDateTimestampSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FESR_DATE_TIMESTAMP_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFesrDatestamp;
            protected  int beginFesrTimestamp;
	
	/**
	* Constructor for FesrDateTimestampSerialized
	**/
    public FesrDateTimestampSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for FesrDateTimestampSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public FesrDateTimestampSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this FesrDateTimestampSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,13); // serialize this field at offset 13 by default 
    }
    
	/**
	* sets parent for this FesrDateTimestampSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 13 by default
    }    
	/**
	* initializes the field in FesrDateTimestampSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FESR_DATE_TIMESTAMP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFesrDatestamp = getStartOffset() + 0;	// set offset for serialization
  
             beginFesrTimestamp = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localFesrDatestampCounter = -1;
        public boolean isFesrDatestampModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesrDatestampCounter != sharedCounter;
           localFesrDatestampCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesrDatestampIsNumeric() {
	      return decimalIsNumeric(beginFesrDatestamp,FESR_DATESTAMP_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESR_DATESTAMP_LEN = 4;
  	/**
	 * 	serializeFesrDatestamp
	 */
	protected void serializeFesrDatestamp(int fesrDatestamp) {
		   putDecimal(beginFesrDatestamp,fesrDatestamp,FESR_DATESTAMP_LEN,true);
   }
   

   protected int checkFesrDatestampMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesrDatestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesrDatestamp() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesrDatestamp,FESR_DATESTAMP_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesrDatestamp", beginFesrDatestamp,FESR_DATESTAMP_LEN);
     }
   	}
        int localFesrTimestampCounter = -1;
        public boolean isFesrTimestampModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localFesrTimestampCounter != sharedCounter;
           localFesrTimestampCounter = sharedCounter; return hasModified; 
        }
	    public boolean fesrTimestampIsNumeric() {
	      return decimalIsNumeric(beginFesrTimestamp,FESR_TIMESTAMP_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int FESR_TIMESTAMP_LEN = 5;
  	/**
	 * 	serializeFesrTimestamp
	 */
	protected void serializeFesrTimestamp(int fesrTimestamp) {
		   putDecimal(beginFesrTimestamp,fesrTimestamp,FESR_TIMESTAMP_LEN,true);
   }
   

   protected int checkFesrTimestampMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshFesrTimestamp is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFesrTimestamp() throws CFException {	
   	try { 
		 return (getIntDecimal(beginFesrTimestamp,FESR_TIMESTAMP_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("fesrTimestamp", beginFesrTimestamp,FESR_TIMESTAMP_LEN);
     }
   	}




}
  
