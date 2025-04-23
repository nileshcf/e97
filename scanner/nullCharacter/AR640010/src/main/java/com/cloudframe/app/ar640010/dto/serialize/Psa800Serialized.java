package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Psa800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Psa800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Psa800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PSA_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPsaAddr800;
            protected  int beginPsaPtr800;
	
	/**
	* Constructor for Psa800Serialized
	**/
    public Psa800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Psa800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Psa800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Psa800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Psa800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Psa800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PSA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPsaAddr800 = getStartOffset() + 0;	// set offset for serialization
  
             beginPsaPtr800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localPsaAddr800Counter = -1;
         public boolean isPsaAddr800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPsaAddr800Counter != sharedCounter;
            localPsaAddr800Counter = sharedCounter; return hasModified; 
         }
   protected static final int PSA_ADDR_800_LEN = 4;
  	/**
	 * serializePsaAddr800
	 */
	protected void serializePsaAddr800(int psaAddr800) {
           replaceValue( //  save the value as string
                   getBinaryString( psaAddr800,PSA_ADDR_800_LEN)
                  ,beginPsaAddr800
                  ,PSA_ADDR_800_LEN
                 );
            localPsaAddr800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPsaAddr800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPsaAddr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPsaAddr800() {	 
			return (getInt(beginPsaAddr800));
   	}
     int localPsaPtr800Counter = -1;
     public boolean isPsaPtr800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPsaPtr800Counter != sharedCounter;
         localPsaPtr800Counter = sharedCounter; return hasModified; 
     }
   protected static final int PSA_PTR_800_LEN = 4;
  	/**
	 * serializePsaPtr800
	 */
	protected void serializePsaPtr800(int psaPtr800) {
           replaceValue( //  save the value as string
                   getBinaryString( psaPtr800,PSA_PTR_800_LEN)
                  ,beginPsaPtr800
                  ,PSA_PTR_800_LEN
                 );
            localPsaPtr800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPsaPtr800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPsaPtr800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPsaPtr800() {	 
			return (getInt(beginPsaPtr800));
   	}




}
  
