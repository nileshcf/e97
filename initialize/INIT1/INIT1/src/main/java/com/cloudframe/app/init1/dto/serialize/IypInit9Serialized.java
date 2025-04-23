package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypInit9Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypInit9Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypInit9Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_INIT_9_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller4;
            protected  int beginFiller5;
	
	/**
	* Constructor for IypInit9Serialized
	**/
    public IypInit9Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IypInit9Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IypInit9Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IypInit9Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this IypInit9Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in IypInit9Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_INIT_9_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFiller4 = getStartOffset() + 0;	// set offset for serialization
  
             beginFiller5 = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localFiller4Counter = -1;
     public boolean isFiller4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller4Counter != sharedCounter;
         localFiller4Counter = sharedCounter; return hasModified; 
     }
   protected static final int FILLER_4_LEN = 4;
  	/**
	 * serializeFiller4
	 */
	protected void serializeFiller4(int filler4) {
           replaceValue( //  save the value as string
                   getBinaryString( filler4,FILLER_4_LEN)
                  ,beginFiller4
                  ,FILLER_4_LEN
                 );
            localFiller4Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFiller4MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFiller4 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFiller4() {	 
			return (getInt(beginFiller4));
   	}
     int localFiller5Counter = -1;
     public boolean isFiller5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller5Counter != sharedCounter;
         localFiller5Counter = sharedCounter; return hasModified; 
     }
   protected static final int FILLER_5_LEN = 4;
  	/**
	 * serializeFiller5
	 */
	protected void serializeFiller5(int filler5) {
           replaceValue( //  save the value as string
                   getBinaryString( filler5,FILLER_5_LEN)
                  ,beginFiller5
                  ,FILLER_5_LEN
                 );
            localFiller5Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFiller5MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFiller5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFiller5() {	 
			return (getInt(beginFiller5));
   	}




}
  
