package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004TableKeySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004TableKeySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004TableKeySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_TABLE_KEY_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf20004EffectiveDate;
	
	/**
	* Constructor for Cf20004TableKeySerialized
	**/
    public Cf20004TableKeySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004TableKeySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004TableKeySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004TableKeySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Cf20004TableKeySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Cf20004TableKeySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_TABLE_KEY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCf20004EffectiveDate = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCf20004EffectiveDateCounter = -1;
     public boolean isCf20004EffectiveDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004EffectiveDateCounter != sharedCounter;
         localCf20004EffectiveDateCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_EFFECTIVE_DATE_LEN = 10;
	/**
	 * 	serialize this Cf20004EffectiveDate
	 */
   protected void serializeCf20004EffectiveDate(char[] cf20004EffectiveDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004EffectiveDate,0,getStringValue(),beginCf20004EffectiveDate,CF_20004_EFFECTIVE_DATE_LEN);
       localCf20004EffectiveDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004EffectiveDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCf20004EffectiveDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004EffectiveDate() {	 
   		return (substring(getStringValue(),beginCf20004EffectiveDate,beginCf20004EffectiveDate + CF_20004_EFFECTIVE_DATE_LEN));
   	}




}
  
