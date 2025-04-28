package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class Ip00901TableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00901TableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00901TableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00901_TABLE_DATA_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00901BsAccRngL;
            protected  int beginIp00901BsArBusSrvLvl;
            protected  int beginIp00901BsArBusSrvId;
            protected  int beginIp00901BsArAccBrand;
            protected  int beginIp00901BsAccRngH;
            protected  int beginIp00901BsArBsPriority;
            protected  int beginIp00901BsArAbPriority;
            protected  int beginIp00901BsArLifecylInd;
            protected  int beginIp00901BsArBsseCd;
            protected  int beginIp00901Filler;
	
	/**
	* Constructor for Ip00901TableDataSerialized
	**/
    public Ip00901TableDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00901TableDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00901TableDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00901TableDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,19); // serialize this field at offset 19 by default 
    }
    
	/**
	* sets parent for this Ip00901TableDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 19 by default
    }    
	/**
	* initializes the field in Ip00901TableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00901_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00901BsAccRngL = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00901BsArBusSrvLvl = getStartOffset() + 19;	// set offset for serialization
  
             beginIp00901BsArBusSrvId = getStartOffset() + 20;	// set offset for serialization
  
             beginIp00901BsArAccBrand = getStartOffset() + 26;	// set offset for serialization
  
             beginIp00901BsAccRngH = getStartOffset() + 29;	// set offset for serialization
  
             beginIp00901BsArBsPriority = getStartOffset() + 48;	// set offset for serialization
  
             beginIp00901BsArAbPriority = getStartOffset() + 50;	// set offset for serialization
  
             beginIp00901BsArLifecylInd = getStartOffset() + 52;	// set offset for serialization
  
             beginIp00901BsArBsseCd = getStartOffset() + 53;	// set offset for serialization
  
             beginIp00901Filler = getStartOffset() + 54;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00901BsAccRngLCounter = -1;
     public boolean isIp00901BsAccRngLModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsAccRngLCounter != sharedCounter;
         localIp00901BsAccRngLCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_ACC_RNG_L_LEN = 19;
	/**
	 * 	serialize this Ip00901BsAccRngL
	 */
   protected void serializeIp00901BsAccRngL(char[] ip00901BsAccRngL) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsAccRngL,0,getStringValue(),beginIp00901BsAccRngL,IP_00901_BS_ACC_RNG_L_LEN);
       localIp00901BsAccRngLCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsAccRngLConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp00901BsAccRngL is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsAccRngL() {	 
   		return (substring(getStringValue(),beginIp00901BsAccRngL,beginIp00901BsAccRngL + IP_00901_BS_ACC_RNG_L_LEN));
   	}
     int localIp00901BsArBusSrvLvlCounter = -1;
     public boolean isIp00901BsArBusSrvLvlModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArBusSrvLvlCounter != sharedCounter;
         localIp00901BsArBusSrvLvlCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_AR_BUS_SRV_LVL_LEN = 1;
	/**
	 * 	serialize this Ip00901BsArBusSrvLvl
	 */
   protected void serializeIp00901BsArBusSrvLvl(char[] ip00901BsArBusSrvLvl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsArBusSrvLvl,0,getStringValue(),beginIp00901BsArBusSrvLvl,IP_00901_BS_AR_BUS_SRV_LVL_LEN);
       localIp00901BsArBusSrvLvlCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsArBusSrvLvlConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00901BsArBusSrvLvl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsArBusSrvLvl() {	 
   		return (substring(getStringValue(),beginIp00901BsArBusSrvLvl,beginIp00901BsArBusSrvLvl + IP_00901_BS_AR_BUS_SRV_LVL_LEN));
   	}
     int localIp00901BsArBusSrvIdCounter = -1;
     public boolean isIp00901BsArBusSrvIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArBusSrvIdCounter != sharedCounter;
         localIp00901BsArBusSrvIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_AR_BUS_SRV_ID_LEN = 6;
	/**
	 * 	serialize this Ip00901BsArBusSrvId
	 */
   protected void serializeIp00901BsArBusSrvId(char[] ip00901BsArBusSrvId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsArBusSrvId,0,getStringValue(),beginIp00901BsArBusSrvId,IP_00901_BS_AR_BUS_SRV_ID_LEN);
       localIp00901BsArBusSrvIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsArBusSrvIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp00901BsArBusSrvId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsArBusSrvId() {	 
   		return (substring(getStringValue(),beginIp00901BsArBusSrvId,beginIp00901BsArBusSrvId + IP_00901_BS_AR_BUS_SRV_ID_LEN));
   	}
     int localIp00901BsArAccBrandCounter = -1;
     public boolean isIp00901BsArAccBrandModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArAccBrandCounter != sharedCounter;
         localIp00901BsArAccBrandCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_AR_ACC_BRAND_LEN = 3;
	/**
	 * 	serialize this Ip00901BsArAccBrand
	 */
   protected void serializeIp00901BsArAccBrand(char[] ip00901BsArAccBrand) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsArAccBrand,0,getStringValue(),beginIp00901BsArAccBrand,IP_00901_BS_AR_ACC_BRAND_LEN);
       localIp00901BsArAccBrandCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsArAccBrandConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00901BsArAccBrand is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsArAccBrand() {	 
   		return (substring(getStringValue(),beginIp00901BsArAccBrand,beginIp00901BsArAccBrand + IP_00901_BS_AR_ACC_BRAND_LEN));
   	}
     int localIp00901BsAccRngHCounter = -1;
     public boolean isIp00901BsAccRngHModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsAccRngHCounter != sharedCounter;
         localIp00901BsAccRngHCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_ACC_RNG_H_LEN = 19;
	/**
	 * 	serialize this Ip00901BsAccRngH
	 */
   protected void serializeIp00901BsAccRngH(char[] ip00901BsAccRngH) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsAccRngH,0,getStringValue(),beginIp00901BsAccRngH,IP_00901_BS_ACC_RNG_H_LEN);
       localIp00901BsAccRngHCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsAccRngHConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp00901BsAccRngH is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsAccRngH() {	 
   		return (substring(getStringValue(),beginIp00901BsAccRngH,beginIp00901BsAccRngH + IP_00901_BS_ACC_RNG_H_LEN));
   	}
     int localIp00901BsArBsPriorityCounter = -1;
     public boolean isIp00901BsArBsPriorityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArBsPriorityCounter != sharedCounter;
         localIp00901BsArBsPriorityCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00901BsArBsPriority
	 *	@return ip00901BsArBsPriority
	 */
	public char[]  getIp00901BsArBsPriorityString() {
	     return getCharArray(beginIp00901BsArBsPriority,IP_00901_BS_AR_BS_PRIORITY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00901BsArBsPriorityIsNumeric() {
	    return isNumeric(beginIp00901BsArBsPriority
	                    ,beginIp00901BsArBsPriority + IP_00901_BS_AR_BS_PRIORITY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00901_BS_AR_BS_PRIORITY_LEN = 2;
  	/**
	 * serializeIp00901BsArBsPriority
	 */
	protected void serializeIp00901BsArBsPriority(int ip00901BsArBsPriority) {
		 putNumber(beginIp00901BsArBsPriority,ip00901BsArBsPriority,IP_00901_BS_AR_BS_PRIORITY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00901BsArBsPriorityCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00901BsArBsPriority
	 */
   	protected  int serializeIp00901BsArBsPriority(char[] value) {
	    int  ip00901BsArBsPriority;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00901BsArBsPriority = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp00901BsArBsPriority
		       ,2
		      );
		 localIp00901BsArBsPriorityCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00901BsArBsPriority;
    }

   protected int checkIp00901BsArBsPriorityMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00901BsArBsPriority is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00901BsArBsPriority() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00901BsArBsPriority
			                 ,IP_00901_BS_AR_BS_PRIORITY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00901BsArBsPriority", beginIp00901BsArBsPriority,IP_00901_BS_AR_BS_PRIORITY_LEN);
    }
   	}
     int localIp00901BsArAbPriorityCounter = -1;
     public boolean isIp00901BsArAbPriorityModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArAbPriorityCounter != sharedCounter;
         localIp00901BsArAbPriorityCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00901BsArAbPriority
	 *	@return ip00901BsArAbPriority
	 */
	public char[]  getIp00901BsArAbPriorityString() {
	     return getCharArray(beginIp00901BsArAbPriority,IP_00901_BS_AR_AB_PRIORITY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00901BsArAbPriorityIsNumeric() {
	    return isNumeric(beginIp00901BsArAbPriority
	                    ,beginIp00901BsArAbPriority + IP_00901_BS_AR_AB_PRIORITY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00901_BS_AR_AB_PRIORITY_LEN = 2;
  	/**
	 * serializeIp00901BsArAbPriority
	 */
	protected void serializeIp00901BsArAbPriority(int ip00901BsArAbPriority) {
		 putNumber(beginIp00901BsArAbPriority,ip00901BsArAbPriority,IP_00901_BS_AR_AB_PRIORITY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00901BsArAbPriorityCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00901BsArAbPriority
	 */
   	protected  int serializeIp00901BsArAbPriority(char[] value) {
	    int  ip00901BsArAbPriority;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00901BsArAbPriority = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIp00901BsArAbPriority
		       ,2
		      );
		 localIp00901BsArAbPriorityCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00901BsArAbPriority;
    }

   protected int checkIp00901BsArAbPriorityMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00901BsArAbPriority is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00901BsArAbPriority() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00901BsArAbPriority
			                 ,IP_00901_BS_AR_AB_PRIORITY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00901BsArAbPriority", beginIp00901BsArAbPriority,IP_00901_BS_AR_AB_PRIORITY_LEN);
    }
   	}
     int localIp00901BsArLifecylIndCounter = -1;
     public boolean isIp00901BsArLifecylIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArLifecylIndCounter != sharedCounter;
         localIp00901BsArLifecylIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_AR_LIFECYL_IND_LEN = 1;
	/**
	 * 	serialize this Ip00901BsArLifecylInd
	 */
   protected void serializeIp00901BsArLifecylInd(char[] ip00901BsArLifecylInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsArLifecylInd,0,getStringValue(),beginIp00901BsArLifecylInd,IP_00901_BS_AR_LIFECYL_IND_LEN);
       localIp00901BsArLifecylIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsArLifecylIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00901BsArLifecylInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsArLifecylInd() {	 
   		return (substring(getStringValue(),beginIp00901BsArLifecylInd,beginIp00901BsArLifecylInd + IP_00901_BS_AR_LIFECYL_IND_LEN));
   	}
     int localIp00901BsArBsseCdCounter = -1;
     public boolean isIp00901BsArBsseCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901BsArBsseCdCounter != sharedCounter;
         localIp00901BsArBsseCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_BS_AR_BSSE_CD_LEN = 1;
	/**
	 * 	serialize this Ip00901BsArBsseCd
	 */
   protected void serializeIp00901BsArBsseCd(char[] ip00901BsArBsseCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901BsArBsseCd,0,getStringValue(),beginIp00901BsArBsseCd,IP_00901_BS_AR_BSSE_CD_LEN);
       localIp00901BsArBsseCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901BsArBsseCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00901BsArBsseCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901BsArBsseCd() {	 
   		return (substring(getStringValue(),beginIp00901BsArBsseCd,beginIp00901BsArBsseCd + IP_00901_BS_AR_BSSE_CD_LEN));
   	}
     int localIp00901FillerCounter = -1;
     public boolean isIp00901FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00901FillerCounter != sharedCounter;
         localIp00901FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00901_FILLER_LEN = 7;
	/**
	 * 	serialize this Ip00901Filler
	 */
   protected void serializeIp00901Filler(char[] ip00901Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00901Filler,0,getStringValue(),beginIp00901Filler,IP_00901_FILLER_LEN);
       localIp00901FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00901FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshIp00901Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00901Filler() {	 
   		return (substring(getStringValue(),beginIp00901Filler,beginIp00901Filler + IP_00901_FILLER_LEN));
   	}




}
  
