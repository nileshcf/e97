package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class MciwinFormatsRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MciwinFormatsRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormatsRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_REDEFINED_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwin2DigitYearPd;
	
	/**
	* Constructor for MciwinFormatsRedefinedSerialized
	**/
    public MciwinFormatsRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormatsRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormatsRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormatsRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormatsRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormatsRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwin2DigitYearPd = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localMciwin2DigitYearPdCounter = -1;
        public boolean isMciwin2DigitYearPdModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMciwin2DigitYearPdCounter != sharedCounter;
           localMciwin2DigitYearPdCounter = sharedCounter; return hasModified; 
        }
	    public boolean mciwin2DigitYearPdIsNumeric() {
	      return decimalIsNumeric(beginMciwin2DigitYearPd,MCIWIN_2_DIGIT_YEAR_PD_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCIWIN_2_DIGIT_YEAR_PD_LEN = 2;
  	/**
	 * 	serializeMciwin2DigitYearPd
	 */
	protected void serializeMciwin2DigitYearPd(int mciwin2DigitYearPd) {
		   putDecimal(beginMciwin2DigitYearPd,mciwin2DigitYearPd,MCIWIN_2_DIGIT_YEAR_PD_LEN,false);
   }
   

   protected int checkMciwin2DigitYearPdMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshMciwin2DigitYearPd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwin2DigitYearPd() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMciwin2DigitYearPd,MCIWIN_2_DIGIT_YEAR_PD_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mciwin2DigitYearPd", beginMciwin2DigitYearPd,MCIWIN_2_DIGIT_YEAR_PD_LEN);
     }
   	}




}
  
