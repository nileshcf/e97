package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip0006o4DeAttrUserRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip0006o4DeAttrUserRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip0006o4DeAttrUserRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_0006O_4_DE_ATTR_USER_ROW_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp0006o4DeAb;
            protected  int beginIp0006o4DeNo;
            protected  int beginIp0006o4DeName;
            protected  int beginIp0006o4DeFormat;
            protected  int beginIp0006o4DeMinLngth;
            protected  int beginIp0006o4DeMcMaxLngth;
            protected  int beginIp0006o4DeIsoMaxLngth;
            protected  int beginIp0006o4DeLllSize;
            protected  int beginIp0006o4DeSubflds;
            protected  int beginIp0006o4DeFirstSubfld;
            protected  int beginIp0006o4DeFirstSubfldRedefined;
	
	/**
	* Constructor for Ip0006o4DeAttrUserRowSerialized
	**/
    public Ip0006o4DeAttrUserRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip0006o4DeAttrUserRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip0006o4DeAttrUserRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip0006o4DeAttrUserRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this Ip0006o4DeAttrUserRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in Ip0006o4DeAttrUserRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_0006O_4_DE_ATTR_USER_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp0006o4DeAb = getStartOffset() + 0;	// set offset for serialization
  
             beginIp0006o4DeNo = getStartOffset() + 3;	// set offset for serialization
  
             beginIp0006o4DeName = getStartOffset() + 6;	// set offset for serialization
  
             beginIp0006o4DeFormat = getStartOffset() + 63;	// set offset for serialization
  
             beginIp0006o4DeMinLngth = getStartOffset() + 66;	// set offset for serialization
  
             beginIp0006o4DeMcMaxLngth = getStartOffset() + 68;	// set offset for serialization
  
             beginIp0006o4DeIsoMaxLngth = getStartOffset() + 70;	// set offset for serialization
  
             beginIp0006o4DeLllSize = getStartOffset() + 72;	// set offset for serialization
  
             beginIp0006o4DeSubflds = getStartOffset() + 74;	// set offset for serialization
  
             beginIp0006o4DeFirstSubfld = getStartOffset() + 76;	// set offset for serialization
  
             beginIp0006o4DeFirstSubfldRedefined = getStartOffset() + 76;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp0006o4DeAbCounter = -1;
     public boolean isIp0006o4DeAbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0006o4DeAbCounter != sharedCounter;
         localIp0006o4DeAbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0006O_4_DE_AB_LEN = 3;
	/**
	 * 	serialize this Ip0006o4DeAb
	 */
   protected void serializeIp0006o4DeAb(char[] ip0006o4DeAb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0006o4DeAb,0,getStringValue(),beginIp0006o4DeAb,IP_0006O_4_DE_AB_LEN);
       localIp0006o4DeAbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0006o4DeAbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0006o4DeAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0006o4DeAb() {	 
   		return (substring(getStringValue(),beginIp0006o4DeAb,beginIp0006o4DeAb + IP_0006O_4_DE_AB_LEN));
   	}
     int localIp0006o4DeNoCounter = -1;
     public boolean isIp0006o4DeNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0006o4DeNoCounter != sharedCounter;
         localIp0006o4DeNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip0006o4DeNo
	 *	@return ip0006o4DeNo
	 */
	public char[]  getIp0006o4DeNoString() {
	     return getCharArray(beginIp0006o4DeNo,IP_0006O_4_DE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip0006o4DeNoIsNumeric() {
	    return isNumeric(beginIp0006o4DeNo
	                    ,beginIp0006o4DeNo + IP_0006O_4_DE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_0006O_4_DE_NO_LEN = 3;
  	/**
	 * serializeIp0006o4DeNo
	 */
	protected void serializeIp0006o4DeNo(int ip0006o4DeNo) {
		 putNumber(beginIp0006o4DeNo,ip0006o4DeNo,IP_0006O_4_DE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp0006o4DeNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp0006o4DeNo
	 */
   	protected  int serializeIp0006o4DeNo(char[] value) {
	    int  ip0006o4DeNo;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip0006o4DeNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp0006o4DeNo
		       ,3
		      );
		 localIp0006o4DeNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip0006o4DeNo;
    }

   protected int checkIp0006o4DeNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp0006o4DeNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0006o4DeNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp0006o4DeNo
			                 ,IP_0006O_4_DE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip0006o4DeNo", beginIp0006o4DeNo,IP_0006O_4_DE_NO_LEN);
    }
   	}
     int localIp0006o4DeNameCounter = -1;
     public boolean isIp0006o4DeNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0006o4DeNameCounter != sharedCounter;
         localIp0006o4DeNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0006O_4_DE_NAME_LEN = 57;
	/**
	 * 	serialize this Ip0006o4DeName
	 */
   protected void serializeIp0006o4DeName(char[] ip0006o4DeName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0006o4DeName,0,getStringValue(),beginIp0006o4DeName,IP_0006O_4_DE_NAME_LEN);
       localIp0006o4DeNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0006o4DeNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp0006o4DeName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0006o4DeName() {	 
   		return (substring(getStringValue(),beginIp0006o4DeName,beginIp0006o4DeName + IP_0006O_4_DE_NAME_LEN));
   	}
     int localIp0006o4DeFormatCounter = -1;
     public boolean isIp0006o4DeFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0006o4DeFormatCounter != sharedCounter;
         localIp0006o4DeFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0006O_4_DE_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip0006o4DeFormat
	 */
   protected void serializeIp0006o4DeFormat(char[] ip0006o4DeFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0006o4DeFormat,0,getStringValue(),beginIp0006o4DeFormat,IP_0006O_4_DE_FORMAT_LEN);
       localIp0006o4DeFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0006o4DeFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp0006o4DeFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0006o4DeFormat() {	 
   		return (substring(getStringValue(),beginIp0006o4DeFormat,beginIp0006o4DeFormat + IP_0006O_4_DE_FORMAT_LEN));
   	}
         int localIp0006o4DeMinLngthCounter = -1;
         public boolean isIp0006o4DeMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeMinLngthCounter != sharedCounter;
            localIp0006o4DeMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp0006o4DeMinLngth
	 */
	protected void serializeIp0006o4DeMinLngth(short ip0006o4DeMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeMinLngth,IP_0006O_4_DE_MIN_LNGTH_LEN)
                  ,beginIp0006o4DeMinLngth
                  ,IP_0006O_4_DE_MIN_LNGTH_LEN
                 );
            localIp0006o4DeMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0006o4DeMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0006o4DeMinLngth() {	 
			return (getShort(beginIp0006o4DeMinLngth));
   	}
         int localIp0006o4DeMcMaxLngthCounter = -1;
         public boolean isIp0006o4DeMcMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeMcMaxLngthCounter != sharedCounter;
            localIp0006o4DeMcMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_MC_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp0006o4DeMcMaxLngth
	 */
	protected void serializeIp0006o4DeMcMaxLngth(short ip0006o4DeMcMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeMcMaxLngth,IP_0006O_4_DE_MC_MAX_LNGTH_LEN)
                  ,beginIp0006o4DeMcMaxLngth
                  ,IP_0006O_4_DE_MC_MAX_LNGTH_LEN
                 );
            localIp0006o4DeMcMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0006o4DeMcMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeMcMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0006o4DeMcMaxLngth() {	 
			return (getShort(beginIp0006o4DeMcMaxLngth));
   	}
         int localIp0006o4DeIsoMaxLngthCounter = -1;
         public boolean isIp0006o4DeIsoMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeIsoMaxLngthCounter != sharedCounter;
            localIp0006o4DeIsoMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_ISO_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp0006o4DeIsoMaxLngth
	 */
	protected void serializeIp0006o4DeIsoMaxLngth(short ip0006o4DeIsoMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeIsoMaxLngth,IP_0006O_4_DE_ISO_MAX_LNGTH_LEN)
                  ,beginIp0006o4DeIsoMaxLngth
                  ,IP_0006O_4_DE_ISO_MAX_LNGTH_LEN
                 );
            localIp0006o4DeIsoMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0006o4DeIsoMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeIsoMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0006o4DeIsoMaxLngth() {	 
			return (getShort(beginIp0006o4DeIsoMaxLngth));
   	}
         int localIp0006o4DeLllSizeCounter = -1;
         public boolean isIp0006o4DeLllSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeLllSizeCounter != sharedCounter;
            localIp0006o4DeLllSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_LLL_SIZE_LEN = 2;
  	/**
	 * serializeIp0006o4DeLllSize
	 */
	protected void serializeIp0006o4DeLllSize(short ip0006o4DeLllSize) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeLllSize,IP_0006O_4_DE_LLL_SIZE_LEN)
                  ,beginIp0006o4DeLllSize
                  ,IP_0006O_4_DE_LLL_SIZE_LEN
                 );
            localIp0006o4DeLllSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0006o4DeLllSizeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeLllSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0006o4DeLllSize() {	 
			return (getShort(beginIp0006o4DeLllSize));
   	}
         int localIp0006o4DeSubfldsCounter = -1;
         public boolean isIp0006o4DeSubfldsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeSubfldsCounter != sharedCounter;
            localIp0006o4DeSubfldsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_SUBFLDS_LEN = 2;
  	/**
	 * serializeIp0006o4DeSubflds
	 */
	protected void serializeIp0006o4DeSubflds(short ip0006o4DeSubflds) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeSubflds,IP_0006O_4_DE_SUBFLDS_LEN)
                  ,beginIp0006o4DeSubflds
                  ,IP_0006O_4_DE_SUBFLDS_LEN
                 );
            localIp0006o4DeSubfldsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp0006o4DeSubfldsMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeSubflds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp0006o4DeSubflds() {	 
			return (getShort(beginIp0006o4DeSubflds));
   	}
         int localIp0006o4DeFirstSubfldCounter = -1;
         public boolean isIp0006o4DeFirstSubfldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp0006o4DeFirstSubfldCounter != sharedCounter;
            localIp0006o4DeFirstSubfldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_0006O_4_DE_FIRST_SUBFLD_LEN = 4;
  	/**
	 * serializeIp0006o4DeFirstSubfld
	 */
	protected void serializeIp0006o4DeFirstSubfld(int ip0006o4DeFirstSubfld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip0006o4DeFirstSubfld,IP_0006O_4_DE_FIRST_SUBFLD_LEN)
                  ,beginIp0006o4DeFirstSubfld
                  ,IP_0006O_4_DE_FIRST_SUBFLD_LEN
                 );
            localIp0006o4DeFirstSubfldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp0006o4DeFirstSubfldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp0006o4DeFirstSubfld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp0006o4DeFirstSubfld() {	 
			return (getInt(beginIp0006o4DeFirstSubfld));
   	}
     int localIp0006o4DeFirstSubfldRedefinedCounter = -1;
     public boolean isIp0006o4DeFirstSubfldRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp0006o4DeFirstSubfldRedefinedCounter != sharedCounter;
         localIp0006o4DeFirstSubfldRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_0006O_4_DE_FIRST_SUBFLD_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip0006o4DeFirstSubfldRedefined
	 */
   protected void serializeIp0006o4DeFirstSubfldRedefined(char[] ip0006o4DeFirstSubfldRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip0006o4DeFirstSubfldRedefined,0,getStringValue(),beginIp0006o4DeFirstSubfldRedefined,IP_0006O_4_DE_FIRST_SUBFLD_REDEFINED_LEN);
       localIp0006o4DeFirstSubfldRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp0006o4DeFirstSubfldRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp0006o4DeFirstSubfldRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp0006o4DeFirstSubfldRedefined() {	 
   		return (substring(getStringValue(),beginIp0006o4DeFirstSubfldRedefined,beginIp0006o4DeFirstSubfldRedefined + IP_0006O_4_DE_FIRST_SUBFLD_REDEFINED_LEN));
   	}




}
  
