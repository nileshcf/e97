package com.cloudframe.app.mcwin.dto.serialize;

/**
*  The class MciwinFormats800RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class MciwinFormats800RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciwinFormats800RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIWIN_FORMATS_800_REDEFINED_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciwin2DigitYearPd800;
	
	/**
	* Constructor for MciwinFormats800RedefinedSerialized
	**/
    public MciwinFormats800RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MciwinFormats800RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MciwinFormats800RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MciwinFormats800RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this MciwinFormats800RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in MciwinFormats800RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIWIN_FORMATS_800_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciwin2DigitYearPd800 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localMciwin2DigitYearPd800Counter = -1;
        public boolean isMciwin2DigitYearPd800Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localMciwin2DigitYearPd800Counter != sharedCounter;
           localMciwin2DigitYearPd800Counter = sharedCounter; return hasModified; 
        }
	    public boolean mciwin2DigitYearPd800IsNumeric() {
	      return decimalIsNumeric(beginMciwin2DigitYearPd800,MCIWIN_2_DIGIT_YEAR_PD_800_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int MCIWIN_2_DIGIT_YEAR_PD_800_LEN = 2;
  	/**
	 * 	serializeMciwin2DigitYearPd800
	 */
	protected void serializeMciwin2DigitYearPd800(int mciwin2DigitYearPd800) {
		   putDecimal(beginMciwin2DigitYearPd800,mciwin2DigitYearPd800,MCIWIN_2_DIGIT_YEAR_PD_800_LEN,false);
   }
   

   protected int checkMciwin2DigitYearPd800MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100 /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshMciwin2DigitYearPd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMciwin2DigitYearPd800() throws CFException {	
   	try { 
		 return (getIntDecimal(beginMciwin2DigitYearPd800,MCIWIN_2_DIGIT_YEAR_PD_800_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("mciwin2DigitYearPd800", beginMciwin2DigitYearPd800,MCIWIN_2_DIGIT_YEAR_PD_800_LEN);
     }
   	}




}
  
