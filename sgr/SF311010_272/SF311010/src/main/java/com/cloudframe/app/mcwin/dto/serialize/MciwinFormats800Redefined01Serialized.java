package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class MciwinFormats800Redefined01Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MciwinFormats800Redefined01Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormats800Redefined01Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_800_REDEFINED_01_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwinYymmddPacked800;
	
	/**
	* Constructor for MciwinFormats800Redefined01Serialized
	**/
    public MciwinFormats800Redefined01Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormats800Redefined01Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800Redefined01Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormats800Redefined01Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormats800Redefined01Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormats800Redefined01Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_800_REDEFINED_01_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwinYymmddPacked800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localMciwinYymmddPacked800Counter = -1;
        public boolean isMciwinYymmddPacked800Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMciwinYymmddPacked800Counter != sharedCounter;
           localMciwinYymmddPacked800Counter = sharedCounter; return hasModified; 
        }
	    public boolean mciwinYymmddPacked800IsNumeric() {
	      return decimalIsNumeric(beginMciwinYymmddPacked800,MCIWIN_YYMMDD_PACKED_800_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCIWIN_YYMMDD_PACKED_800_LEN = 4;
  	/**
	 * 	serializeMciwinYymmddPacked800
	 */
	protected void serializeMciwinYymmddPacked800(long mciwinYymmddPacked800) {
		   putDecimal(beginMciwinYymmddPacked800,mciwinYymmddPacked800,MCIWIN_YYMMDD_PACKED_800_LEN,false);
   }
   

   protected long checkMciwinYymmddPacked800MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshMciwinYymmddPacked800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMciwinYymmddPacked800() throws CFException {	
   	try { 
		 return (getLongDecimal(beginMciwinYymmddPacked800,MCIWIN_YYMMDD_PACKED_800_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mciwinYymmddPacked800", beginMciwinYymmddPacked800,MCIWIN_YYMMDD_PACKED_800_LEN);
     }
   	}




}
  
