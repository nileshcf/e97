package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class MciwinFormatsRedefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MciwinFormatsRedefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormatsRedefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_REDEFINED_01_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinYymmddPacked;
	
	/**
	* Constructor for MciwinFormatsRedefined01Serialized
	**/
    public MciwinFormatsRedefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormatsRedefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormatsRedefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormatsRedefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormatsRedefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinYymmddPacked = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localMciwinYymmddPackedCounter = -1;
        public boolean isMciwinYymmddPackedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMciwinYymmddPackedCounter != sharedCounter;
           localMciwinYymmddPackedCounter = sharedCounter; return hasModified; 
        }
	    public boolean mciwinYymmddPackedIsNumeric() {
	      return decimalIsNumeric(beginMciwinYymmddPacked,MCIWIN_YYMMDD_PACKED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCIWIN_YYMMDD_PACKED_LEN = 4;
  	/**
	 * 	serializeMciwinYymmddPacked
	 */
	protected void serializeMciwinYymmddPacked(long mciwinYymmddPacked) {
		   putDecimal(beginMciwinYymmddPacked,mciwinYymmddPacked,MCIWIN_YYMMDD_PACKED_LEN,false);
   }
   

   protected long checkMciwinYymmddPackedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshMciwinYymmddPacked is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMciwinYymmddPacked() throws CFException {	
   	try { 
		 return (getLongDecimal(beginMciwinYymmddPacked,MCIWIN_YYMMDD_PACKED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mciwinYymmddPacked", beginMciwinYymmddPacked,MCIWIN_YYMMDD_PACKED_LEN);
     }
   	}




}
  
