package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00911TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00911TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00911TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00911_TABLE_DATA_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00911BsBin;
            protected  int beginIp00911BsBinBusSrvLvl;
            protected  int beginIp00911BsBinBusSrvId;
            protected  int beginIp00911BsBinAccBrand;
            protected  int beginIp00911BsBinBsPriority;
            protected  int beginIp00911BsBinLifecylInd;
            protected  int beginIp00911MemberFiller;
	
	/**
	* Constructor for Ip00911TableDataSerialized
	**/
    public Ip00911TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00911TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00911TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00911TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip00911TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip00911TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00911_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00911BsBin = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00911BsBinBusSrvLvl = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00911BsBinBusSrvId = getStartOffset() + 7;	// set offset for serialization
  
             beginIp00911BsBinAccBrand = getStartOffset() + 13;	// set offset for serialization
  
             beginIp00911BsBinBsPriority = getStartOffset() + 16;	// set offset for serialization
  
             beginIp00911BsBinLifecylInd = getStartOffset() + 18;	// set offset for serialization
  
             beginIp00911MemberFiller = getStartOffset() + 19;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIp00911BsBinCounter = -1;
     public boolean isIp00911BsBinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911BsBinCounter != sharedCounter;
         localIp00911BsBinCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00911BsBin
	 *	@return ip00911BsBin
	 */
	public char[]  getIp00911BsBinString() {
	     return getCharArray(beginIp00911BsBin,IP_00911_BS_BIN_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00911BsBinIsNumeric() {
	    return isNumeric(beginIp00911BsBin
	                    ,beginIp00911BsBin + IP_00911_BS_BIN_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00911_BS_BIN_LEN = 6;
  	/**
	 * serializeIp00911BsBin
	 */
	protected void serializeIp00911BsBin(long ip00911BsBin) {
		 putNumber(beginIp00911BsBin,ip00911BsBin,IP_00911_BS_BIN_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00911BsBinCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00911BsBin
	 */
   	protected  long serializeIp00911BsBin(char[] value) {
	    long  ip00911BsBin;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00911BsBin = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp00911BsBin
		       ,6
		      );
		 localIp00911BsBinCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00911BsBin;
    }

   protected long checkIp00911BsBinMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00911BsBin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp00911BsBin() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp00911BsBin
			                 ,IP_00911_BS_BIN_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00911BsBin", beginIp00911BsBin,IP_00911_BS_BIN_LEN);
    }
   	}
     int localIp00911BsBinBusSrvLvlCounter = -1;
     public boolean isIp00911BsBinBusSrvLvlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911BsBinBusSrvLvlCounter != sharedCounter;
         localIp00911BsBinBusSrvLvlCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_BS_BIN_BUS_SRV_LVL_LEN = 1;
	/**
	 * 	serialize this Ip00911BsBinBusSrvLvl
	 */
   protected void serializeIp00911BsBinBusSrvLvl(char[] ip00911BsBinBusSrvLvl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911BsBinBusSrvLvl,0,getStringValue(),beginIp00911BsBinBusSrvLvl,IP_00911_BS_BIN_BUS_SRV_LVL_LEN);
       localIp00911BsBinBusSrvLvlCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911BsBinBusSrvLvlConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00911BsBinBusSrvLvl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911BsBinBusSrvLvl() {	 
   		return (substring(getStringValue(),beginIp00911BsBinBusSrvLvl,beginIp00911BsBinBusSrvLvl + IP_00911_BS_BIN_BUS_SRV_LVL_LEN));
   	}
     int localIp00911BsBinBusSrvIdCounter = -1;
     public boolean isIp00911BsBinBusSrvIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911BsBinBusSrvIdCounter != sharedCounter;
         localIp00911BsBinBusSrvIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_BS_BIN_BUS_SRV_ID_LEN = 6;
	/**
	 * 	serialize this Ip00911BsBinBusSrvId
	 */
   protected void serializeIp00911BsBinBusSrvId(char[] ip00911BsBinBusSrvId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911BsBinBusSrvId,0,getStringValue(),beginIp00911BsBinBusSrvId,IP_00911_BS_BIN_BUS_SRV_ID_LEN);
       localIp00911BsBinBusSrvIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911BsBinBusSrvIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp00911BsBinBusSrvId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911BsBinBusSrvId() {	 
   		return (substring(getStringValue(),beginIp00911BsBinBusSrvId,beginIp00911BsBinBusSrvId + IP_00911_BS_BIN_BUS_SRV_ID_LEN));
   	}
     int localIp00911BsBinAccBrandCounter = -1;
     public boolean isIp00911BsBinAccBrandModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911BsBinAccBrandCounter != sharedCounter;
         localIp00911BsBinAccBrandCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_BS_BIN_ACC_BRAND_LEN = 3;
	/**
	 * 	serialize this Ip00911BsBinAccBrand
	 */
   protected void serializeIp00911BsBinAccBrand(char[] ip00911BsBinAccBrand) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911BsBinAccBrand,0,getStringValue(),beginIp00911BsBinAccBrand,IP_00911_BS_BIN_ACC_BRAND_LEN);
       localIp00911BsBinAccBrandCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911BsBinAccBrandConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00911BsBinAccBrand is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911BsBinAccBrand() {	 
   		return (substring(getStringValue(),beginIp00911BsBinAccBrand,beginIp00911BsBinAccBrand + IP_00911_BS_BIN_ACC_BRAND_LEN));
   	}
     int localIp00911BsBinBsPriorityCounter = -1;
     public boolean isIp00911BsBinBsPriorityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911BsBinBsPriorityCounter != sharedCounter;
         localIp00911BsBinBsPriorityCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00911BsBinBsPriority
	 *	@return ip00911BsBinBsPriority
	 */
	public char[]  getIp00911BsBinBsPriorityString() {
	     return getCharArray(beginIp00911BsBinBsPriority,IP_00911_BS_BIN_BS_PRIORITY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00911BsBinBsPriorityIsNumeric() {
	    return isNumeric(beginIp00911BsBinBsPriority
	                    ,beginIp00911BsBinBsPriority + IP_00911_BS_BIN_BS_PRIORITY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00911_BS_BIN_BS_PRIORITY_LEN = 2;
  	/**
	 * serializeIp00911BsBinBsPriority
	 */
	protected void serializeIp00911BsBinBsPriority(int ip00911BsBinBsPriority) {
		 putNumber(beginIp00911BsBinBsPriority,ip00911BsBinBsPriority,IP_00911_BS_BIN_BS_PRIORITY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00911BsBinBsPriorityCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00911BsBinBsPriority
	 */
   	protected  int serializeIp00911BsBinBsPriority(char[] value) {
	    int  ip00911BsBinBsPriority;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00911BsBinBsPriority = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp00911BsBinBsPriority
		       ,2
		      );
		 localIp00911BsBinBsPriorityCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00911BsBinBsPriority;
    }

   protected int checkIp00911BsBinBsPriorityMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00911BsBinBsPriority is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00911BsBinBsPriority() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00911BsBinBsPriority
			                 ,IP_00911_BS_BIN_BS_PRIORITY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00911BsBinBsPriority", beginIp00911BsBinBsPriority,IP_00911_BS_BIN_BS_PRIORITY_LEN);
    }
   	}
     int localIp00911BsBinLifecylIndCounter = -1;
     public boolean isIp00911BsBinLifecylIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911BsBinLifecylIndCounter != sharedCounter;
         localIp00911BsBinLifecylIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00911_BS_BIN_LIFECYL_IND_LEN = 1;
	/**
	 * 	serialize this Ip00911BsBinLifecylInd
	 */
   protected void serializeIp00911BsBinLifecylInd(char[] ip00911BsBinLifecylInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00911BsBinLifecylInd,0,getStringValue(),beginIp00911BsBinLifecylInd,IP_00911_BS_BIN_LIFECYL_IND_LEN);
       localIp00911BsBinLifecylIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00911BsBinLifecylIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00911BsBinLifecylInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00911BsBinLifecylInd() {	 
   		return (substring(getStringValue(),beginIp00911BsBinLifecylInd,beginIp00911BsBinLifecylInd + IP_00911_BS_BIN_LIFECYL_IND_LEN));
   	}
     int localIp00911MemberFillerCounter = -1;
     public boolean isIp00911MemberFillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00911MemberFillerCounter != sharedCounter;
         localIp00911MemberFillerCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00911MemberFiller
	 *	@return ip00911MemberFiller
	 */
	public char[]  getIp00911MemberFillerString() {
	     return getCharArray(beginIp00911MemberFiller,IP_00911_MEMBER_FILLER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00911MemberFillerIsNumeric() {
	    return isNumeric(beginIp00911MemberFiller
	                    ,beginIp00911MemberFiller + IP_00911_MEMBER_FILLER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00911_MEMBER_FILLER_LEN = 3;
  	/**
	 * serializeIp00911MemberFiller
	 */
	protected void serializeIp00911MemberFiller(int ip00911MemberFiller) {
		 putNumber(beginIp00911MemberFiller,ip00911MemberFiller,IP_00911_MEMBER_FILLER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00911MemberFillerCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00911MemberFiller
	 */
   	protected  int serializeIp00911MemberFiller(char[] value) {
	    int  ip00911MemberFiller;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00911MemberFiller = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00911MemberFiller
		       ,3
		      );
		 localIp00911MemberFillerCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00911MemberFiller;
    }

   protected int checkIp00911MemberFillerMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00911MemberFiller is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00911MemberFiller() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00911MemberFiller
			                 ,IP_00911_MEMBER_FILLER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00911MemberFiller", beginIp00911MemberFiller,IP_00911_MEMBER_FILLER_LEN);
    }
   	}




}
  
