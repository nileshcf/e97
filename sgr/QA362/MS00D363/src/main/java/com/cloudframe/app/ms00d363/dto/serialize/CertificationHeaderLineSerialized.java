package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class CertificationHeaderLineSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CertificationHeaderLineSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CertificationHeaderLineSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CERTIFICATION_HEADER_LINE_LENGTH = 90;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginChlTitle1;
	
	/**
	* Constructor for CertificationHeaderLineSerialized
	**/
    public CertificationHeaderLineSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CertificationHeaderLineSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CertificationHeaderLineSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CertificationHeaderLineSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CertificationHeaderLineSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CertificationHeaderLineSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CERTIFICATION_HEADER_LINE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginChlTitle1 = getStartOffset() + 13;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localChlTitle1Counter = -1;
     public boolean isChlTitle1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChlTitle1Counter != sharedCounter;
         localChlTitle1Counter = sharedCounter; return hasModified;
     }
	protected static final int CHL_TITLE_1_LEN = 28;
	/**
	 * 	serialize this ChlTitle1
	 */
   protected void serializeChlTitle1(char[] chlTitle1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(chlTitle1,0,getStringValue(),beginChlTitle1,CHL_TITLE_1_LEN);
       localChlTitle1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChlTitle1Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshChlTitle1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChlTitle1() {	 
   		return (substring(getStringValue(),beginChlTitle1,beginChlTitle1 + CHL_TITLE_1_LEN));
   	}




}
  
