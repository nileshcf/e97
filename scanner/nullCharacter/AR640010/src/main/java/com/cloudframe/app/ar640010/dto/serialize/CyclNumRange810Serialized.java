package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CyclNumRange810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class CyclNumRange810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CyclNumRange810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CYCL_NUM_RANGE_810_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCyclNumLo810;
            protected  int beginCyclNumHi810;
	
	/**
	* Constructor for CyclNumRange810Serialized
	**/
    public CyclNumRange810Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CyclNumRange810Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CyclNumRange810Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CyclNumRange810Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,180); // serialize this field at offset 180 by default 
    }
    
	/**
	* sets parent for this CyclNumRange810Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 180 by default
    }    
	/**
	* initializes the field in CyclNumRange810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CYCL_NUM_RANGE_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCyclNumLo810 = getStartOffset() + 0;	// set offset for serialization
  
             beginCyclNumHi810 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localCyclNumLo810Counter = -1;
        public boolean isCyclNumLo810Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCyclNumLo810Counter != sharedCounter;
           localCyclNumLo810Counter = sharedCounter; return hasModified; 
        }
	    public boolean cyclNumLo810IsNumeric() {
	      return decimalIsNumeric(beginCyclNumLo810,CYCL_NUM_LO_810_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int CYCL_NUM_LO_810_LEN = 2;
  	/**
	 * 	serializeCyclNumLo810
	 */
	protected void serializeCyclNumLo810(short cyclNumLo810) {
		   putDecimal(beginCyclNumLo810,cyclNumLo810,CYCL_NUM_LO_810_LEN,true);
   }
   

   protected short checkCyclNumLo810MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshCyclNumLo810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCyclNumLo810() throws CFException {	
   	try { 
		 return (getShortDecimal(beginCyclNumLo810,CYCL_NUM_LO_810_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("cyclNumLo810", beginCyclNumLo810,CYCL_NUM_LO_810_LEN);
     }
   	}
        int localCyclNumHi810Counter = -1;
        public boolean isCyclNumHi810Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localCyclNumHi810Counter != sharedCounter;
           localCyclNumHi810Counter = sharedCounter; return hasModified; 
        }
	    public boolean cyclNumHi810IsNumeric() {
	      return decimalIsNumeric(beginCyclNumHi810,CYCL_NUM_HI_810_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int CYCL_NUM_HI_810_LEN = 2;
  	/**
	 * 	serializeCyclNumHi810
	 */
	protected void serializeCyclNumHi810(short cyclNumHi810) {
		   putDecimal(beginCyclNumHi810,cyclNumHi810,CYCL_NUM_HI_810_LEN,true);
   }
   

   protected short checkCyclNumHi810MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshCyclNumHi810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCyclNumHi810() throws CFException {	
   	try { 
		 return (getShortDecimal(beginCyclNumHi810,CYCL_NUM_HI_810_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("cyclNumHi810", beginCyclNumHi810,CYCL_NUM_HI_810_LEN);
     }
   	}




}
  
