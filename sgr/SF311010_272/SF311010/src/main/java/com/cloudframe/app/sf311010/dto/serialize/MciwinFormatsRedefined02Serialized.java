package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class MciwinFormatsRedefined02Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MciwinFormatsRedefined02Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormatsRedefined02Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_REDEFINED_02_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinYydddPacked;
	
	/**
	* Constructor for MciwinFormatsRedefined02Serialized
	**/
    public MciwinFormatsRedefined02Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormatsRedefined02Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined02Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormatsRedefined02Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormatsRedefined02Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormatsRedefined02Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_REDEFINED_02_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinYydddPacked = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localMciwinYydddPackedCounter = -1;
        public boolean isMciwinYydddPackedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMciwinYydddPackedCounter != sharedCounter;
           localMciwinYydddPackedCounter = sharedCounter; return hasModified; 
        }
	    public boolean mciwinYydddPackedIsNumeric() {
	      return decimalIsNumeric(beginMciwinYydddPacked,MCIWIN_YYDDD_PACKED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCIWIN_YYDDD_PACKED_LEN = 3;
  	/**
	 * 	serializeMciwinYydddPacked
	 */
	protected void serializeMciwinYydddPacked(long mciwinYydddPacked) {
		   putDecimal(beginMciwinYydddPacked,mciwinYydddPacked,MCIWIN_YYDDD_PACKED_LEN,false);
   }
   

   protected long checkMciwinYydddPackedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshMciwinYydddPacked is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMciwinYydddPacked() throws CFException {	
   	try { 
		 return (getLongDecimal(beginMciwinYydddPacked,MCIWIN_YYDDD_PACKED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mciwinYydddPacked", beginMciwinYydddPacked,MCIWIN_YYDDD_PACKED_LEN);
     }
   	}




}
  
