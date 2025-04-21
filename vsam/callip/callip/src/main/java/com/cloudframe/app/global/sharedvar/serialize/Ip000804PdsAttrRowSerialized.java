package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000804PdsAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000804PdsAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000804PdsAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000804_PDS_ATTR_ROW_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000804PdsName;
            protected  int beginIp000804PdsFormat;
            protected  int beginIp000804PdsMinLngth;
            protected  int beginIp000804PdsMaxLngth;
            protected  int beginIp000804PdsSubflds;
            protected  int beginIp000804PdsFirstSubfld;
            protected  int beginIp000804PdsFirstSubfldRedefined;
	
	/**
	* Constructor for Ip000804PdsAttrRowSerialized
	**/
    public Ip000804PdsAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip000804PdsAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000804PdsAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip000804PdsAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this Ip000804PdsAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in Ip000804PdsAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000804_PDS_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000804PdsName = getStartOffset() + 0;	// set offset for serialization
  
             beginIp000804PdsFormat = getStartOffset() + 57;	// set offset for serialization
  
             beginIp000804PdsMinLngth = getStartOffset() + 60;	// set offset for serialization
  
             beginIp000804PdsMaxLngth = getStartOffset() + 62;	// set offset for serialization
  
             beginIp000804PdsSubflds = getStartOffset() + 64;	// set offset for serialization
  
             beginIp000804PdsFirstSubfld = getStartOffset() + 66;	// set offset for serialization
  
             beginIp000804PdsFirstSubfldRedefined = getStartOffset() + 66;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp000804PdsNameCounter = -1;
     public boolean isIp000804PdsNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000804PdsNameCounter != sharedCounter;
         localIp000804PdsNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000804_PDS_NAME_LEN = 57;
	/**
	 * 	serialize this Ip000804PdsName
	 */
   protected void serializeIp000804PdsName(char[] ip000804PdsName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000804PdsName,0,getStringValue(),beginIp000804PdsName,IP_000804_PDS_NAME_LEN);
       localIp000804PdsNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000804PdsNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp000804PdsName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000804PdsName() {	 
   		return (substring(getStringValue(),beginIp000804PdsName,beginIp000804PdsName + IP_000804_PDS_NAME_LEN));
   	}
     int localIp000804PdsFormatCounter = -1;
     public boolean isIp000804PdsFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000804PdsFormatCounter != sharedCounter;
         localIp000804PdsFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000804_PDS_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip000804PdsFormat
	 */
   protected void serializeIp000804PdsFormat(char[] ip000804PdsFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000804PdsFormat,0,getStringValue(),beginIp000804PdsFormat,IP_000804_PDS_FORMAT_LEN);
       localIp000804PdsFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000804PdsFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp000804PdsFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000804PdsFormat() {	 
   		return (substring(getStringValue(),beginIp000804PdsFormat,beginIp000804PdsFormat + IP_000804_PDS_FORMAT_LEN));
   	}
         int localIp000804PdsMinLngthCounter = -1;
         public boolean isIp000804PdsMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000804PdsMinLngthCounter != sharedCounter;
            localIp000804PdsMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000804_PDS_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp000804PdsMinLngth
	 */
	protected void serializeIp000804PdsMinLngth(short ip000804PdsMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000804PdsMinLngth,IP_000804_PDS_MIN_LNGTH_LEN)
                  ,beginIp000804PdsMinLngth
                  ,IP_000804_PDS_MIN_LNGTH_LEN
                 );
            localIp000804PdsMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000804PdsMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000804PdsMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000804PdsMinLngth() {	 
			return (getShort(beginIp000804PdsMinLngth));
   	}
         int localIp000804PdsMaxLngthCounter = -1;
         public boolean isIp000804PdsMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000804PdsMaxLngthCounter != sharedCounter;
            localIp000804PdsMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000804_PDS_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp000804PdsMaxLngth
	 */
	protected void serializeIp000804PdsMaxLngth(short ip000804PdsMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000804PdsMaxLngth,IP_000804_PDS_MAX_LNGTH_LEN)
                  ,beginIp000804PdsMaxLngth
                  ,IP_000804_PDS_MAX_LNGTH_LEN
                 );
            localIp000804PdsMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000804PdsMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000804PdsMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000804PdsMaxLngth() {	 
			return (getShort(beginIp000804PdsMaxLngth));
   	}
         int localIp000804PdsSubfldsCounter = -1;
         public boolean isIp000804PdsSubfldsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000804PdsSubfldsCounter != sharedCounter;
            localIp000804PdsSubfldsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000804_PDS_SUBFLDS_LEN = 2;
  	/**
	 * serializeIp000804PdsSubflds
	 */
	protected void serializeIp000804PdsSubflds(short ip000804PdsSubflds) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000804PdsSubflds,IP_000804_PDS_SUBFLDS_LEN)
                  ,beginIp000804PdsSubflds
                  ,IP_000804_PDS_SUBFLDS_LEN
                 );
            localIp000804PdsSubfldsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000804PdsSubfldsMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000804PdsSubflds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000804PdsSubflds() {	 
			return (getShort(beginIp000804PdsSubflds));
   	}
         int localIp000804PdsFirstSubfldCounter = -1;
         public boolean isIp000804PdsFirstSubfldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000804PdsFirstSubfldCounter != sharedCounter;
            localIp000804PdsFirstSubfldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000804_PDS_FIRST_SUBFLD_LEN = 4;
  	/**
	 * serializeIp000804PdsFirstSubfld
	 */
	protected void serializeIp000804PdsFirstSubfld(int ip000804PdsFirstSubfld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000804PdsFirstSubfld,IP_000804_PDS_FIRST_SUBFLD_LEN)
                  ,beginIp000804PdsFirstSubfld
                  ,IP_000804_PDS_FIRST_SUBFLD_LEN
                 );
            localIp000804PdsFirstSubfldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp000804PdsFirstSubfldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp000804PdsFirstSubfld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp000804PdsFirstSubfld() {	 
			return (getInt(beginIp000804PdsFirstSubfld));
   	}
     int localIp000804PdsFirstSubfldRedefinedCounter = -1;
     public boolean isIp000804PdsFirstSubfldRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000804PdsFirstSubfldRedefinedCounter != sharedCounter;
         localIp000804PdsFirstSubfldRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000804_PDS_FIRST_SUBFLD_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip000804PdsFirstSubfldRedefined
	 */
   protected void serializeIp000804PdsFirstSubfldRedefined(char[] ip000804PdsFirstSubfldRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000804PdsFirstSubfldRedefined,0,getStringValue(),beginIp000804PdsFirstSubfldRedefined,IP_000804_PDS_FIRST_SUBFLD_REDEFINED_LEN);
       localIp000804PdsFirstSubfldRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000804PdsFirstSubfldRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp000804PdsFirstSubfldRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000804PdsFirstSubfldRedefined() {	 
   		return (substring(getStringValue(),beginIp000804PdsFirstSubfldRedefined,beginIp000804PdsFirstSubfldRedefined + IP_000804_PDS_FIRST_SUBFLD_REDEFINED_LEN));
   	}




}
  
