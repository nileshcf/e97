package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004ItemDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004ItemDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004ItemDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_ITEM_DATA_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf20004ItemCount;
            protected  int beginCf20004SearchStringSt;
            protected  int beginCf20004ItemLength;
            protected  int beginCf20004SearchStringLt;
            protected  int beginCf20004ItemType;
	
	/**
	* Constructor for Cf20004ItemDataSerialized
	**/
    public Cf20004ItemDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004ItemDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004ItemDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004ItemDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,28); // serialize this field at offset 28 by default 
    }
    
	/**
	* sets parent for this Cf20004ItemDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 28 by default
    }    
	/**
	* initializes the field in Cf20004ItemDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_ITEM_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCf20004ItemCount = getStartOffset() + 0;	// set offset for serialization
  
             beginCf20004SearchStringSt = getStartOffset() + 0;	// set offset for serialization
  
             beginCf20004ItemLength = getStartOffset() + 2;	// set offset for serialization
  
             beginCf20004SearchStringLt = getStartOffset() + 2;	// set offset for serialization
  
             beginCf20004ItemType = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCf20004ItemCountCounter = -1;
         public boolean isCf20004ItemCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCf20004ItemCountCounter != sharedCounter;
            localCf20004ItemCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int CF_20004_ITEM_COUNT_LEN = 2;
  	/**
	 * serializeCf20004ItemCount
	 */
	protected void serializeCf20004ItemCount(int cf20004ItemCount) {
           replaceValue( //  save the value as string
                   getBinaryString( cf20004ItemCount,CF_20004_ITEM_COUNT_LEN)
                  ,beginCf20004ItemCount
                  ,CF_20004_ITEM_COUNT_LEN
                 );
            localCf20004ItemCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCf20004ItemCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCf20004ItemCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCf20004ItemCount() {	 
			return (getUnsignedShort(beginCf20004ItemCount));
   	}
         int localCf20004SearchStringStCounter = -1;
         public boolean isCf20004SearchStringStModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCf20004SearchStringStCounter != sharedCounter;
            localCf20004SearchStringStCounter = sharedCounter; return hasModified; 
         }
   protected static final int CF_20004_SEARCH_STRING_ST_LEN = 2;
  	/**
	 * serializeCf20004SearchStringSt
	 */
	protected void serializeCf20004SearchStringSt(int cf20004SearchStringSt) {
           replaceValue( //  save the value as string
                   getBinaryString( cf20004SearchStringSt,CF_20004_SEARCH_STRING_ST_LEN)
                  ,beginCf20004SearchStringSt
                  ,CF_20004_SEARCH_STRING_ST_LEN
                 );
            localCf20004SearchStringStCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCf20004SearchStringStMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCf20004SearchStringSt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCf20004SearchStringSt() {	 
			return (getUnsignedShort(beginCf20004SearchStringSt));
   	}
         int localCf20004ItemLengthCounter = -1;
         public boolean isCf20004ItemLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCf20004ItemLengthCounter != sharedCounter;
            localCf20004ItemLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int CF_20004_ITEM_LENGTH_LEN = 2;
  	/**
	 * serializeCf20004ItemLength
	 */
	protected void serializeCf20004ItemLength(int cf20004ItemLength) {
           replaceValue( //  save the value as string
                   getBinaryString( cf20004ItemLength,CF_20004_ITEM_LENGTH_LEN)
                  ,beginCf20004ItemLength
                  ,CF_20004_ITEM_LENGTH_LEN
                 );
            localCf20004ItemLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCf20004ItemLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCf20004ItemLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCf20004ItemLength() {	 
			return (getUnsignedShort(beginCf20004ItemLength));
   	}
         int localCf20004SearchStringLtCounter = -1;
         public boolean isCf20004SearchStringLtModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCf20004SearchStringLtCounter != sharedCounter;
            localCf20004SearchStringLtCounter = sharedCounter; return hasModified; 
         }
   protected static final int CF_20004_SEARCH_STRING_LT_LEN = 2;
  	/**
	 * serializeCf20004SearchStringLt
	 */
	protected void serializeCf20004SearchStringLt(int cf20004SearchStringLt) {
           replaceValue( //  save the value as string
                   getBinaryString( cf20004SearchStringLt,CF_20004_SEARCH_STRING_LT_LEN)
                  ,beginCf20004SearchStringLt
                  ,CF_20004_SEARCH_STRING_LT_LEN
                 );
            localCf20004SearchStringLtCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkCf20004SearchStringLtMaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCf20004SearchStringLt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCf20004SearchStringLt() {	 
			return (getUnsignedShort(beginCf20004SearchStringLt));
   	}
     int localCf20004ItemTypeCounter = -1;
     public boolean isCf20004ItemTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004ItemTypeCounter != sharedCounter;
         localCf20004ItemTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_ITEM_TYPE_LEN = 1;
	/**
	 * 	serialize this Cf20004ItemType
	 */
   protected void serializeCf20004ItemType(char[] cf20004ItemType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004ItemType,0,getStringValue(),beginCf20004ItemType,CF_20004_ITEM_TYPE_LEN);
       localCf20004ItemTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004ItemTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCf20004ItemType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004ItemType() {	 
   		return (substring(getStringValue(),beginCf20004ItemType,beginCf20004ItemType + CF_20004_ITEM_TYPE_LEN));
   	}




}
  
