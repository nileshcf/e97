package com.cloudframe.app.sf326010.dto.serialize;

/**
*  The class Sf528ServiceDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf528ServiceDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf528ServiceDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_528_SERVICE_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf528ServiceCc;
            protected  int beginSf528ServiceYy;
            protected  int beginSf528ServiceMm;
            protected  int beginSf528ServiceDd;
	
	/**
	* Constructor for Sf528ServiceDateSerialized
	**/
    public Sf528ServiceDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf528ServiceDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf528ServiceDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf528ServiceDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23); // serialize this field at offset 23 by default 
    }
    
	/**
	* sets parent for this Sf528ServiceDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23 by default
    }    
	/**
	* initializes the field in Sf528ServiceDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_528_SERVICE_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf528ServiceCc = getStartOffset() + 0;	// set offset for serialization
  
             beginSf528ServiceYy = getStartOffset() + 2;	// set offset for serialization
  
             beginSf528ServiceMm = getStartOffset() + 4;	// set offset for serialization
  
             beginSf528ServiceDd = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf528ServiceCcCounter = -1;
     public boolean isSf528ServiceCcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceCcCounter != sharedCounter;
         localSf528ServiceCcCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_CC_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceCc
	 */
   protected void serializeSf528ServiceCc(char[] sf528ServiceCc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceCc,0,getStringValue(),beginSf528ServiceCc,SF_528_SERVICE_CC_LEN);
       localSf528ServiceCcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceCcConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceCc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceCc() {	 
   		return (substring(getStringValue(),beginSf528ServiceCc,beginSf528ServiceCc + SF_528_SERVICE_CC_LEN));
   	}
     int localSf528ServiceYyCounter = -1;
     public boolean isSf528ServiceYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceYyCounter != sharedCounter;
         localSf528ServiceYyCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_YY_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceYy
	 */
   protected void serializeSf528ServiceYy(char[] sf528ServiceYy) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceYy,0,getStringValue(),beginSf528ServiceYy,SF_528_SERVICE_YY_LEN);
       localSf528ServiceYyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceYyConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceYy() {	 
   		return (substring(getStringValue(),beginSf528ServiceYy,beginSf528ServiceYy + SF_528_SERVICE_YY_LEN));
   	}
     int localSf528ServiceMmCounter = -1;
     public boolean isSf528ServiceMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceMmCounter != sharedCounter;
         localSf528ServiceMmCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_MM_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceMm
	 */
   protected void serializeSf528ServiceMm(char[] sf528ServiceMm) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceMm,0,getStringValue(),beginSf528ServiceMm,SF_528_SERVICE_MM_LEN);
       localSf528ServiceMmCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceMmConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceMm() {	 
   		return (substring(getStringValue(),beginSf528ServiceMm,beginSf528ServiceMm + SF_528_SERVICE_MM_LEN));
   	}
     int localSf528ServiceDdCounter = -1;
     public boolean isSf528ServiceDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf528ServiceDdCounter != sharedCounter;
         localSf528ServiceDdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_528_SERVICE_DD_LEN = 2;
	/**
	 * 	serialize this Sf528ServiceDd
	 */
   protected void serializeSf528ServiceDd(char[] sf528ServiceDd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf528ServiceDd,0,getStringValue(),beginSf528ServiceDd,SF_528_SERVICE_DD_LEN);
       localSf528ServiceDdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf528ServiceDdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSf528ServiceDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf528ServiceDd() {	 
   		return (substring(getStringValue(),beginSf528ServiceDd,beginSf528ServiceDd + SF_528_SERVICE_DD_LEN));
   	}




}
  
