package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip000604DeAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip000604DeAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip000604DeAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_000604_DE_ATTR_ROW_LENGTH = 84;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp000604DeFirstAb;
            protected  int beginIp000604DeFirstAbRedefined;
            protected  int beginIp000604DeAb;
            protected  int beginIp000604DeNo;
            protected  int beginIp000604DeName;
            protected  int beginIp000604DeFormat;
            protected  int beginIp000604DeMinLngth;
            protected  int beginIp000604DeMcMaxLngth;
            protected  int beginIp000604DeIsoMaxLngth;
            protected  int beginIp000604DeLllSize;
            protected  int beginIp000604DeSubflds;
            protected  int beginIp000604DeFirstSubfld;
            protected  int beginIp000604DeFirstSubfldRedefined;
	
	/**
	* Constructor for Ip000604DeAttrRowSerialized
	**/
    public Ip000604DeAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip000604DeAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip000604DeAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip000604DeAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip000604DeAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip000604DeAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_000604_DE_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp000604DeFirstAb = getStartOffset() + 0;	// set offset for serialization
  
             beginIp000604DeFirstAbRedefined = getStartOffset() + 0;	// set offset for serialization
  
             beginIp000604DeAb = getStartOffset() + 4;	// set offset for serialization
  
             beginIp000604DeNo = getStartOffset() + 7;	// set offset for serialization
  
             beginIp000604DeName = getStartOffset() + 10;	// set offset for serialization
  
             beginIp000604DeFormat = getStartOffset() + 67;	// set offset for serialization
  
             beginIp000604DeMinLngth = getStartOffset() + 70;	// set offset for serialization
  
             beginIp000604DeMcMaxLngth = getStartOffset() + 72;	// set offset for serialization
  
             beginIp000604DeIsoMaxLngth = getStartOffset() + 74;	// set offset for serialization
  
             beginIp000604DeLllSize = getStartOffset() + 76;	// set offset for serialization
  
             beginIp000604DeSubflds = getStartOffset() + 78;	// set offset for serialization
  
             beginIp000604DeFirstSubfld = getStartOffset() + 80;	// set offset for serialization
  
             beginIp000604DeFirstSubfldRedefined = getStartOffset() + 80;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp000604DeFirstAbCounter = -1;
         public boolean isIp000604DeFirstAbModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeFirstAbCounter != sharedCounter;
            localIp000604DeFirstAbCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_FIRST_AB_LEN = 4;
  	/**
	 * serializeIp000604DeFirstAb
	 */
	protected void serializeIp000604DeFirstAb(int ip000604DeFirstAb) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeFirstAb,IP_000604_DE_FIRST_AB_LEN)
                  ,beginIp000604DeFirstAb
                  ,IP_000604_DE_FIRST_AB_LEN
                 );
            localIp000604DeFirstAbCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp000604DeFirstAbMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeFirstAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp000604DeFirstAb() {	 
			return (getInt(beginIp000604DeFirstAb));
   	}
     int localIp000604DeFirstAbRedefinedCounter = -1;
     public boolean isIp000604DeFirstAbRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeFirstAbRedefinedCounter != sharedCounter;
         localIp000604DeFirstAbRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000604_DE_FIRST_AB_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip000604DeFirstAbRedefined
	 */
   protected void serializeIp000604DeFirstAbRedefined(char[] ip000604DeFirstAbRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000604DeFirstAbRedefined,0,getStringValue(),beginIp000604DeFirstAbRedefined,IP_000604_DE_FIRST_AB_REDEFINED_LEN);
       localIp000604DeFirstAbRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000604DeFirstAbRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp000604DeFirstAbRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000604DeFirstAbRedefined() {	 
   		return (substring(getStringValue(),beginIp000604DeFirstAbRedefined,beginIp000604DeFirstAbRedefined + IP_000604_DE_FIRST_AB_REDEFINED_LEN));
   	}
     int localIp000604DeAbCounter = -1;
     public boolean isIp000604DeAbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeAbCounter != sharedCounter;
         localIp000604DeAbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000604_DE_AB_LEN = 3;
	/**
	 * 	serialize this Ip000604DeAb
	 */
   protected void serializeIp000604DeAb(char[] ip000604DeAb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000604DeAb,0,getStringValue(),beginIp000604DeAb,IP_000604_DE_AB_LEN);
       localIp000604DeAbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000604DeAbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp000604DeAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000604DeAb() {	 
   		return (substring(getStringValue(),beginIp000604DeAb,beginIp000604DeAb + IP_000604_DE_AB_LEN));
   	}
     int localIp000604DeNoCounter = -1;
     public boolean isIp000604DeNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeNoCounter != sharedCounter;
         localIp000604DeNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip000604DeNo
	 *	@return ip000604DeNo
	 */
	public char[]  getIp000604DeNoString() {
	     return getCharArray(beginIp000604DeNo,IP_000604_DE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip000604DeNoIsNumeric() {
	    return isNumeric(beginIp000604DeNo
	                    ,beginIp000604DeNo + IP_000604_DE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_000604_DE_NO_LEN = 3;
  	/**
	 * serializeIp000604DeNo
	 */
	protected void serializeIp000604DeNo(int ip000604DeNo) {
		 putNumber(beginIp000604DeNo,ip000604DeNo,IP_000604_DE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp000604DeNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp000604DeNo
	 */
   	protected  int serializeIp000604DeNo(char[] value) {
	    int  ip000604DeNo;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip000604DeNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp000604DeNo
		       ,3
		      );
		 localIp000604DeNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip000604DeNo;
    }

   protected int checkIp000604DeNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp000604DeNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp000604DeNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp000604DeNo
			                 ,IP_000604_DE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip000604DeNo", beginIp000604DeNo,IP_000604_DE_NO_LEN);
    }
   	}
     int localIp000604DeNameCounter = -1;
     public boolean isIp000604DeNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeNameCounter != sharedCounter;
         localIp000604DeNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000604_DE_NAME_LEN = 57;
	/**
	 * 	serialize this Ip000604DeName
	 */
   protected void serializeIp000604DeName(char[] ip000604DeName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000604DeName,0,getStringValue(),beginIp000604DeName,IP_000604_DE_NAME_LEN);
       localIp000604DeNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000604DeNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp000604DeName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000604DeName() {	 
   		return (substring(getStringValue(),beginIp000604DeName,beginIp000604DeName + IP_000604_DE_NAME_LEN));
   	}
     int localIp000604DeFormatCounter = -1;
     public boolean isIp000604DeFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeFormatCounter != sharedCounter;
         localIp000604DeFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000604_DE_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip000604DeFormat
	 */
   protected void serializeIp000604DeFormat(char[] ip000604DeFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000604DeFormat,0,getStringValue(),beginIp000604DeFormat,IP_000604_DE_FORMAT_LEN);
       localIp000604DeFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000604DeFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp000604DeFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000604DeFormat() {	 
   		return (substring(getStringValue(),beginIp000604DeFormat,beginIp000604DeFormat + IP_000604_DE_FORMAT_LEN));
   	}
         int localIp000604DeMinLngthCounter = -1;
         public boolean isIp000604DeMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeMinLngthCounter != sharedCounter;
            localIp000604DeMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp000604DeMinLngth
	 */
	protected void serializeIp000604DeMinLngth(short ip000604DeMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeMinLngth,IP_000604_DE_MIN_LNGTH_LEN)
                  ,beginIp000604DeMinLngth
                  ,IP_000604_DE_MIN_LNGTH_LEN
                 );
            localIp000604DeMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000604DeMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000604DeMinLngth() {	 
			return (getShort(beginIp000604DeMinLngth));
   	}
         int localIp000604DeMcMaxLngthCounter = -1;
         public boolean isIp000604DeMcMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeMcMaxLngthCounter != sharedCounter;
            localIp000604DeMcMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_MC_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp000604DeMcMaxLngth
	 */
	protected void serializeIp000604DeMcMaxLngth(short ip000604DeMcMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeMcMaxLngth,IP_000604_DE_MC_MAX_LNGTH_LEN)
                  ,beginIp000604DeMcMaxLngth
                  ,IP_000604_DE_MC_MAX_LNGTH_LEN
                 );
            localIp000604DeMcMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000604DeMcMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeMcMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000604DeMcMaxLngth() {	 
			return (getShort(beginIp000604DeMcMaxLngth));
   	}
         int localIp000604DeIsoMaxLngthCounter = -1;
         public boolean isIp000604DeIsoMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeIsoMaxLngthCounter != sharedCounter;
            localIp000604DeIsoMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_ISO_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp000604DeIsoMaxLngth
	 */
	protected void serializeIp000604DeIsoMaxLngth(short ip000604DeIsoMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeIsoMaxLngth,IP_000604_DE_ISO_MAX_LNGTH_LEN)
                  ,beginIp000604DeIsoMaxLngth
                  ,IP_000604_DE_ISO_MAX_LNGTH_LEN
                 );
            localIp000604DeIsoMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000604DeIsoMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeIsoMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000604DeIsoMaxLngth() {	 
			return (getShort(beginIp000604DeIsoMaxLngth));
   	}
         int localIp000604DeLllSizeCounter = -1;
         public boolean isIp000604DeLllSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeLllSizeCounter != sharedCounter;
            localIp000604DeLllSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_LLL_SIZE_LEN = 2;
  	/**
	 * serializeIp000604DeLllSize
	 */
	protected void serializeIp000604DeLllSize(short ip000604DeLllSize) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeLllSize,IP_000604_DE_LLL_SIZE_LEN)
                  ,beginIp000604DeLllSize
                  ,IP_000604_DE_LLL_SIZE_LEN
                 );
            localIp000604DeLllSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000604DeLllSizeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeLllSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000604DeLllSize() {	 
			return (getShort(beginIp000604DeLllSize));
   	}
         int localIp000604DeSubfldsCounter = -1;
         public boolean isIp000604DeSubfldsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeSubfldsCounter != sharedCounter;
            localIp000604DeSubfldsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_SUBFLDS_LEN = 2;
  	/**
	 * serializeIp000604DeSubflds
	 */
	protected void serializeIp000604DeSubflds(short ip000604DeSubflds) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeSubflds,IP_000604_DE_SUBFLDS_LEN)
                  ,beginIp000604DeSubflds
                  ,IP_000604_DE_SUBFLDS_LEN
                 );
            localIp000604DeSubfldsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp000604DeSubfldsMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeSubflds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp000604DeSubflds() {	 
			return (getShort(beginIp000604DeSubflds));
   	}
         int localIp000604DeFirstSubfldCounter = -1;
         public boolean isIp000604DeFirstSubfldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp000604DeFirstSubfldCounter != sharedCounter;
            localIp000604DeFirstSubfldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_000604_DE_FIRST_SUBFLD_LEN = 4;
  	/**
	 * serializeIp000604DeFirstSubfld
	 */
	protected void serializeIp000604DeFirstSubfld(int ip000604DeFirstSubfld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip000604DeFirstSubfld,IP_000604_DE_FIRST_SUBFLD_LEN)
                  ,beginIp000604DeFirstSubfld
                  ,IP_000604_DE_FIRST_SUBFLD_LEN
                 );
            localIp000604DeFirstSubfldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp000604DeFirstSubfldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp000604DeFirstSubfld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp000604DeFirstSubfld() {	 
			return (getInt(beginIp000604DeFirstSubfld));
   	}
     int localIp000604DeFirstSubfldRedefinedCounter = -1;
     public boolean isIp000604DeFirstSubfldRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp000604DeFirstSubfldRedefinedCounter != sharedCounter;
         localIp000604DeFirstSubfldRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_000604_DE_FIRST_SUBFLD_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip000604DeFirstSubfldRedefined
	 */
   protected void serializeIp000604DeFirstSubfldRedefined(char[] ip000604DeFirstSubfldRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip000604DeFirstSubfldRedefined,0,getStringValue(),beginIp000604DeFirstSubfldRedefined,IP_000604_DE_FIRST_SUBFLD_REDEFINED_LEN);
       localIp000604DeFirstSubfldRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp000604DeFirstSubfldRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp000604DeFirstSubfldRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp000604DeFirstSubfldRedefined() {	 
   		return (substring(getStringValue(),beginIp000604DeFirstSubfldRedefined,beginIp000604DeFirstSubfldRedefined + IP_000604_DE_FIRST_SUBFLD_REDEFINED_LEN));
   	}




}
  
