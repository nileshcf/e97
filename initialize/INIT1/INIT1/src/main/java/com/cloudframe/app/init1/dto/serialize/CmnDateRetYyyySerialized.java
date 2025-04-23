package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateRetYyyySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateRetYyyySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateRetYyyySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_RET_YYYY_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateRetCc;
            protected  int beginCmnDateRetYy;
	
	/**
	* Constructor for CmnDateRetYyyySerialized
	**/
    public CmnDateRetYyyySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateRetYyyySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateRetYyyySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateRetYyyySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1031); // serialize this field at offset 1031 by default 
    }
    
	/**
	* sets parent for this CmnDateRetYyyySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1031 by default
    }    
	/**
	* initializes the field in CmnDateRetYyyySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_RET_YYYY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateRetCc = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateRetYy = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateRetCcCounter = -1;
     public boolean isCmnDateRetCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetCcCounter != sharedCounter;
         localCmnDateRetCcCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RET_CC_LEN = 2;
	/**
	 * 	serialize this CmnDateRetCc
	 */
   protected void serializeCmnDateRetCc(char[] cmnDateRetCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetCc,0,getStringValue(),beginCmnDateRetCc,CMN_DATE_RET_CC_LEN);
       localCmnDateRetCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnDateRetCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetCc() {	 
   		return (substring(getStringValue(),beginCmnDateRetCc,beginCmnDateRetCc + CMN_DATE_RET_CC_LEN));
   	}
     int localCmnDateRetYyCounter = -1;
     public boolean isCmnDateRetYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetYyCounter != sharedCounter;
         localCmnDateRetYyCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RET_YY_LEN = 2;
	/**
	 * 	serialize this CmnDateRetYy
	 */
   protected void serializeCmnDateRetYy(char[] cmnDateRetYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetYy,0,getStringValue(),beginCmnDateRetYy,CMN_DATE_RET_YY_LEN);
       localCmnDateRetYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnDateRetYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetYy() {	 
   		return (substring(getStringValue(),beginCmnDateRetYy,beginCmnDateRetYy + CMN_DATE_RET_YY_LEN));
   	}




}
  
