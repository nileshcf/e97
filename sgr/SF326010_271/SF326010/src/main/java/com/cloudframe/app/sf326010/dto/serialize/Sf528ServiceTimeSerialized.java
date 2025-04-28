package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sf528ServiceTimeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf528ServiceTimeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf528ServiceTimeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_528_SERVICE_TIME_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf528ServiceHr;
            protected  int beginSf528ServiceMn;
            protected  int beginSf528ServiceSc;
	
	/**
	* Constructor for Sf528ServiceTimeSerialized
	**/
    public Sf528ServiceTimeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf528ServiceTimeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceTimeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf528ServiceTimeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,31); // serialize this field at offset 31 by default 
    }
    
	/**
	* sets parent for this Sf528ServiceTimeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 31 by default
    }    
	/**
	* initializes the field in Sf528ServiceTimeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_528_SERVICE_TIME_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf528ServiceHr = getStartOffset() + 0;	// set offset for serialization
  
             beginSf528ServiceMn = getStartOffset() + 2;	// set offset for serialization
  
             beginSf528ServiceSc = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf528ServiceHrCounter = -1;
     public boolean isSf528ServiceHrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceHrCounter != sharedCounter;
         localSf528ServiceHrCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_HR_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceHr
	 */
   protected void serializeSf528ServiceHr(char[] sf528ServiceHr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceHr,0,getStringValue(),beginSf528ServiceHr,SF_528_SERVICE_HR_LEN);
       localSf528ServiceHrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceHrConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceHr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceHr() {	 
   		return (substring(getStringValue(),beginSf528ServiceHr,beginSf528ServiceHr + SF_528_SERVICE_HR_LEN));
   	}
     int localSf528ServiceMnCounter = -1;
     public boolean isSf528ServiceMnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceMnCounter != sharedCounter;
         localSf528ServiceMnCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_MN_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceMn
	 */
   protected void serializeSf528ServiceMn(char[] sf528ServiceMn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceMn,0,getStringValue(),beginSf528ServiceMn,SF_528_SERVICE_MN_LEN);
       localSf528ServiceMnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceMnConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceMn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceMn() {	 
   		return (substring(getStringValue(),beginSf528ServiceMn,beginSf528ServiceMn + SF_528_SERVICE_MN_LEN));
   	}
     int localSf528ServiceScCounter = -1;
     public boolean isSf528ServiceScModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceScCounter != sharedCounter;
         localSf528ServiceScCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_SC_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceSc
	 */
   protected void serializeSf528ServiceSc(char[] sf528ServiceSc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceSc,0,getStringValue(),beginSf528ServiceSc,SF_528_SERVICE_SC_LEN);
       localSf528ServiceScCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceScConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceSc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceSc() {	 
   		return (substring(getStringValue(),beginSf528ServiceSc,beginSf528ServiceSc + SF_528_SERVICE_SC_LEN));
   	}




}
  
