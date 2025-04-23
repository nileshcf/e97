package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip002102TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip002102TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip002102TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_002102_TABLE_DATA_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp002102OldSubfldNo;
            protected  int beginIp002102NewSubfldNo;
            protected  int beginIp002102Justified;
            protected  int beginIp002102FirstDefaultPtr;
            protected  int beginIp002102FirstDefaultPtrRedefined;
            protected  int beginIp002102LastDefaultPtr;
	
	/**
	* Constructor for Ip002102TableDataSerialized
	**/
    public Ip002102TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip002102TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip002102TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip002102TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip002102TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip002102TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_002102_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginIp002102OldSubfldNo = getStartOffset() + 4;	// set offset for serialization
  
  
             beginIp002102NewSubfldNo = getStartOffset() + 10;	// set offset for serialization
  
             beginIp002102Justified = getStartOffset() + 12;	// set offset for serialization
  
             beginIp002102FirstDefaultPtr = getStartOffset() + 13;	// set offset for serialization
  
             beginIp002102FirstDefaultPtrRedefined = getStartOffset() + 13;	// set offset for serialization
  
             beginIp002102LastDefaultPtr = getStartOffset() + 17;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp002102OldSubfldNoCounter = -1;
         public boolean isIp002102OldSubfldNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102OldSubfldNoCounter != sharedCounter;
            localIp002102OldSubfldNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_OLD_SUBFLD_NO_LEN = 2;
  	/**
	 * serializeIp002102OldSubfldNo
	 */
	protected void serializeIp002102OldSubfldNo(short ip002102OldSubfldNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102OldSubfldNo,IP_002102_OLD_SUBFLD_NO_LEN)
                  ,beginIp002102OldSubfldNo
                  ,IP_002102_OLD_SUBFLD_NO_LEN
                 );
            localIp002102OldSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp002102OldSubfldNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp002102OldSubfldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp002102OldSubfldNo() {	 
			return (getShort(beginIp002102OldSubfldNo));
   	}
         int localIp002102NewSubfldNoCounter = -1;
         public boolean isIp002102NewSubfldNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102NewSubfldNoCounter != sharedCounter;
            localIp002102NewSubfldNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_NEW_SUBFLD_NO_LEN = 2;
  	/**
	 * serializeIp002102NewSubfldNo
	 */
	protected void serializeIp002102NewSubfldNo(short ip002102NewSubfldNo) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102NewSubfldNo,IP_002102_NEW_SUBFLD_NO_LEN)
                  ,beginIp002102NewSubfldNo
                  ,IP_002102_NEW_SUBFLD_NO_LEN
                 );
            localIp002102NewSubfldNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp002102NewSubfldNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp002102NewSubfldNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp002102NewSubfldNo() {	 
			return (getShort(beginIp002102NewSubfldNo));
   	}
     int localIp002102JustifiedCounter = -1;
     public boolean isIp002102JustifiedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002102JustifiedCounter != sharedCounter;
         localIp002102JustifiedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_002102_JUSTIFIED_LEN = 1;
	/**
	 * 	serialize this Ip002102Justified
	 */
   protected void serializeIp002102Justified(char[] ip002102Justified) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip002102Justified,0,getStringValue(),beginIp002102Justified,IP_002102_JUSTIFIED_LEN);
       localIp002102JustifiedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp002102JustifiedConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp002102Justified is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp002102Justified() {	 
   		return (substring(getStringValue(),beginIp002102Justified,beginIp002102Justified + IP_002102_JUSTIFIED_LEN));
   	}
         int localIp002102FirstDefaultPtrCounter = -1;
         public boolean isIp002102FirstDefaultPtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102FirstDefaultPtrCounter != sharedCounter;
            localIp002102FirstDefaultPtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_FIRST_DEFAULT_PTR_LEN = 4;
  	/**
	 * serializeIp002102FirstDefaultPtr
	 */
	protected void serializeIp002102FirstDefaultPtr(int ip002102FirstDefaultPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102FirstDefaultPtr,IP_002102_FIRST_DEFAULT_PTR_LEN)
                  ,beginIp002102FirstDefaultPtr
                  ,IP_002102_FIRST_DEFAULT_PTR_LEN
                 );
            localIp002102FirstDefaultPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp002102FirstDefaultPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp002102FirstDefaultPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002102FirstDefaultPtr() {	 
			return (getInt(beginIp002102FirstDefaultPtr));
   	}
     int localIp002102FirstDefaultPtrRedefinedCounter = -1;
     public boolean isIp002102FirstDefaultPtrRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp002102FirstDefaultPtrRedefinedCounter != sharedCounter;
         localIp002102FirstDefaultPtrRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_002102_FIRST_DEFAULT_PTR_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip002102FirstDefaultPtrRedefined
	 */
   protected void serializeIp002102FirstDefaultPtrRedefined(char[] ip002102FirstDefaultPtrRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip002102FirstDefaultPtrRedefined,0,getStringValue(),beginIp002102FirstDefaultPtrRedefined,IP_002102_FIRST_DEFAULT_PTR_REDEFINED_LEN);
       localIp002102FirstDefaultPtrRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp002102FirstDefaultPtrRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp002102FirstDefaultPtrRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp002102FirstDefaultPtrRedefined() {	 
   		return (substring(getStringValue(),beginIp002102FirstDefaultPtrRedefined,beginIp002102FirstDefaultPtrRedefined + IP_002102_FIRST_DEFAULT_PTR_REDEFINED_LEN));
   	}
         int localIp002102LastDefaultPtrCounter = -1;
         public boolean isIp002102LastDefaultPtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102LastDefaultPtrCounter != sharedCounter;
            localIp002102LastDefaultPtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_LAST_DEFAULT_PTR_LEN = 4;
  	/**
	 * serializeIp002102LastDefaultPtr
	 */
	protected void serializeIp002102LastDefaultPtr(int ip002102LastDefaultPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102LastDefaultPtr,IP_002102_LAST_DEFAULT_PTR_LEN)
                  ,beginIp002102LastDefaultPtr
                  ,IP_002102_LAST_DEFAULT_PTR_LEN
                 );
            localIp002102LastDefaultPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp002102LastDefaultPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp002102LastDefaultPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002102LastDefaultPtr() {	 
			return (getInt(beginIp002102LastDefaultPtr));
   	}




}
  
