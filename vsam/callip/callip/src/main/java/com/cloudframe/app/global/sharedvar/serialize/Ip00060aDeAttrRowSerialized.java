package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00060aDeAttrRowSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00060aDeAttrRowSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00060aDeAttrRowSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00060A_DE_ATTR_ROW_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00060aDeAb;
            protected  int beginIp00060aDeNo;
            protected  int beginIp00060aDeName;
            protected  int beginIp00060aDeFormat;
            protected  int beginIp00060aDeMinLngth;
            protected  int beginIp00060aDeMcMaxLngth;
            protected  int beginIp00060aDeIsoMaxLngth;
            protected  int beginIp00060aDeLllSize;
            protected  int beginIp00060aDeSubflds;
            protected  int beginIp00060aDeFirstSubfld;
            protected  int beginIp00060aDeFirstSubfldRedefined;
	
	/**
	* Constructor for Ip00060aDeAttrRowSerialized
	**/
    public Ip00060aDeAttrRowSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00060aDeAttrRowSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00060aDeAttrRowSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00060aDeAttrRowSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Ip00060aDeAttrRowSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Ip00060aDeAttrRowSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00060A_DE_ATTR_ROW_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00060aDeAb = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00060aDeNo = getStartOffset() + 3;	// set offset for serialization
  
             beginIp00060aDeName = getStartOffset() + 6;	// set offset for serialization
  
             beginIp00060aDeFormat = getStartOffset() + 63;	// set offset for serialization
  
             beginIp00060aDeMinLngth = getStartOffset() + 66;	// set offset for serialization
  
             beginIp00060aDeMcMaxLngth = getStartOffset() + 68;	// set offset for serialization
  
             beginIp00060aDeIsoMaxLngth = getStartOffset() + 70;	// set offset for serialization
  
             beginIp00060aDeLllSize = getStartOffset() + 72;	// set offset for serialization
  
             beginIp00060aDeSubflds = getStartOffset() + 74;	// set offset for serialization
  
             beginIp00060aDeFirstSubfld = getStartOffset() + 76;	// set offset for serialization
  
             beginIp00060aDeFirstSubfldRedefined = getStartOffset() + 76;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00060aDeAbCounter = -1;
     public boolean isIp00060aDeAbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00060aDeAbCounter != sharedCounter;
         localIp00060aDeAbCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00060A_DE_AB_LEN = 3;
	/**
	 * 	serialize this Ip00060aDeAb
	 */
   protected void serializeIp00060aDeAb(char[] ip00060aDeAb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00060aDeAb,0,getStringValue(),beginIp00060aDeAb,IP_00060A_DE_AB_LEN);
       localIp00060aDeAbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00060aDeAbConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00060aDeAb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00060aDeAb() {	 
   		return (substring(getStringValue(),beginIp00060aDeAb,beginIp00060aDeAb + IP_00060A_DE_AB_LEN));
   	}
     int localIp00060aDeNoCounter = -1;
     public boolean isIp00060aDeNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00060aDeNoCounter != sharedCounter;
         localIp00060aDeNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip00060aDeNo
	 *	@return ip00060aDeNo
	 */
	public char[]  getIp00060aDeNoString() {
	     return getCharArray(beginIp00060aDeNo,IP_00060A_DE_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip00060aDeNoIsNumeric() {
	    return isNumeric(beginIp00060aDeNo
	                    ,beginIp00060aDeNo + IP_00060A_DE_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_00060A_DE_NO_LEN = 3;
  	/**
	 * serializeIp00060aDeNo
	 */
	protected void serializeIp00060aDeNo(int ip00060aDeNo) {
		 putNumber(beginIp00060aDeNo,ip00060aDeNo,IP_00060A_DE_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp00060aDeNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp00060aDeNo
	 */
   	protected  int serializeIp00060aDeNo(char[] value) {
	    int  ip00060aDeNo;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip00060aDeNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginIp00060aDeNo
		       ,3
		      );
		 localIp00060aDeNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip00060aDeNo;
    }

   protected int checkIp00060aDeNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp00060aDeNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00060aDeNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIp00060aDeNo
			                 ,IP_00060A_DE_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip00060aDeNo", beginIp00060aDeNo,IP_00060A_DE_NO_LEN);
    }
   	}
     int localIp00060aDeNameCounter = -1;
     public boolean isIp00060aDeNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00060aDeNameCounter != sharedCounter;
         localIp00060aDeNameCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00060A_DE_NAME_LEN = 57;
	/**
	 * 	serialize this Ip00060aDeName
	 */
   protected void serializeIp00060aDeName(char[] ip00060aDeName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00060aDeName,0,getStringValue(),beginIp00060aDeName,IP_00060A_DE_NAME_LEN);
       localIp00060aDeNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00060aDeNameConstraints(char[] value) {
   			return super.checkConstraints(value , 57 ,false, false);
   }
    /**
	 *	refreshIp00060aDeName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00060aDeName() {	 
   		return (substring(getStringValue(),beginIp00060aDeName,beginIp00060aDeName + IP_00060A_DE_NAME_LEN));
   	}
     int localIp00060aDeFormatCounter = -1;
     public boolean isIp00060aDeFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00060aDeFormatCounter != sharedCounter;
         localIp00060aDeFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00060A_DE_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ip00060aDeFormat
	 */
   protected void serializeIp00060aDeFormat(char[] ip00060aDeFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00060aDeFormat,0,getStringValue(),beginIp00060aDeFormat,IP_00060A_DE_FORMAT_LEN);
       localIp00060aDeFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00060aDeFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp00060aDeFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00060aDeFormat() {	 
   		return (substring(getStringValue(),beginIp00060aDeFormat,beginIp00060aDeFormat + IP_00060A_DE_FORMAT_LEN));
   	}
         int localIp00060aDeMinLngthCounter = -1;
         public boolean isIp00060aDeMinLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00060aDeMinLngthCounter != sharedCounter;
            localIp00060aDeMinLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00060A_DE_MIN_LNGTH_LEN = 2;
  	/**
	 * serializeIp00060aDeMinLngth
	 */
	protected void serializeIp00060aDeMinLngth(short ip00060aDeMinLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00060aDeMinLngth,IP_00060A_DE_MIN_LNGTH_LEN)
                  ,beginIp00060aDeMinLngth
                  ,IP_00060A_DE_MIN_LNGTH_LEN
                 );
            localIp00060aDeMinLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00060aDeMinLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00060aDeMinLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00060aDeMinLngth() {	 
			return (getShort(beginIp00060aDeMinLngth));
   	}
         int localIp00060aDeMcMaxLngthCounter = -1;
         public boolean isIp00060aDeMcMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00060aDeMcMaxLngthCounter != sharedCounter;
            localIp00060aDeMcMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00060A_DE_MC_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp00060aDeMcMaxLngth
	 */
	protected void serializeIp00060aDeMcMaxLngth(short ip00060aDeMcMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00060aDeMcMaxLngth,IP_00060A_DE_MC_MAX_LNGTH_LEN)
                  ,beginIp00060aDeMcMaxLngth
                  ,IP_00060A_DE_MC_MAX_LNGTH_LEN
                 );
            localIp00060aDeMcMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00060aDeMcMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00060aDeMcMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00060aDeMcMaxLngth() {	 
			return (getShort(beginIp00060aDeMcMaxLngth));
   	}
         int localIp00060aDeIsoMaxLngthCounter = -1;
         public boolean isIp00060aDeIsoMaxLngthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00060aDeIsoMaxLngthCounter != sharedCounter;
            localIp00060aDeIsoMaxLngthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00060A_DE_ISO_MAX_LNGTH_LEN = 2;
  	/**
	 * serializeIp00060aDeIsoMaxLngth
	 */
	protected void serializeIp00060aDeIsoMaxLngth(short ip00060aDeIsoMaxLngth) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00060aDeIsoMaxLngth,IP_00060A_DE_ISO_MAX_LNGTH_LEN)
                  ,beginIp00060aDeIsoMaxLngth
                  ,IP_00060A_DE_ISO_MAX_LNGTH_LEN
                 );
            localIp00060aDeIsoMaxLngthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00060aDeIsoMaxLngthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00060aDeIsoMaxLngth is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00060aDeIsoMaxLngth() {	 
			return (getShort(beginIp00060aDeIsoMaxLngth));
   	}
         int localIp00060aDeLllSizeCounter = -1;
         public boolean isIp00060aDeLllSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00060aDeLllSizeCounter != sharedCounter;
            localIp00060aDeLllSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00060A_DE_LLL_SIZE_LEN = 2;
  	/**
	 * serializeIp00060aDeLllSize
	 */
	protected void serializeIp00060aDeLllSize(short ip00060aDeLllSize) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00060aDeLllSize,IP_00060A_DE_LLL_SIZE_LEN)
                  ,beginIp00060aDeLllSize
                  ,IP_00060A_DE_LLL_SIZE_LEN
                 );
            localIp00060aDeLllSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00060aDeLllSizeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00060aDeLllSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00060aDeLllSize() {	 
			return (getShort(beginIp00060aDeLllSize));
   	}
         int localIp00060aDeSubfldsCounter = -1;
         public boolean isIp00060aDeSubfldsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00060aDeSubfldsCounter != sharedCounter;
            localIp00060aDeSubfldsCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00060A_DE_SUBFLDS_LEN = 2;
  	/**
	 * serializeIp00060aDeSubflds
	 */
	protected void serializeIp00060aDeSubflds(short ip00060aDeSubflds) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00060aDeSubflds,IP_00060A_DE_SUBFLDS_LEN)
                  ,beginIp00060aDeSubflds
                  ,IP_00060A_DE_SUBFLDS_LEN
                 );
            localIp00060aDeSubfldsCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp00060aDeSubfldsMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp00060aDeSubflds is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp00060aDeSubflds() {	 
			return (getShort(beginIp00060aDeSubflds));
   	}
         int localIp00060aDeFirstSubfldCounter = -1;
         public boolean isIp00060aDeFirstSubfldModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp00060aDeFirstSubfldCounter != sharedCounter;
            localIp00060aDeFirstSubfldCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_00060A_DE_FIRST_SUBFLD_LEN = 4;
  	/**
	 * serializeIp00060aDeFirstSubfld
	 */
	protected void serializeIp00060aDeFirstSubfld(int ip00060aDeFirstSubfld) {
           replaceValue( //  save the value as string
                   getBinaryString( ip00060aDeFirstSubfld,IP_00060A_DE_FIRST_SUBFLD_LEN)
                  ,beginIp00060aDeFirstSubfld
                  ,IP_00060A_DE_FIRST_SUBFLD_LEN
                 );
            localIp00060aDeFirstSubfldCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp00060aDeFirstSubfldMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp00060aDeFirstSubfld is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp00060aDeFirstSubfld() {	 
			return (getInt(beginIp00060aDeFirstSubfld));
   	}
     int localIp00060aDeFirstSubfldRedefinedCounter = -1;
     public boolean isIp00060aDeFirstSubfldRedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00060aDeFirstSubfldRedefinedCounter != sharedCounter;
         localIp00060aDeFirstSubfldRedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00060A_DE_FIRST_SUBFLD_REDEFINED_LEN = 4;
	/**
	 * 	serialize this Ip00060aDeFirstSubfldRedefined
	 */
   protected void serializeIp00060aDeFirstSubfldRedefined(char[] ip00060aDeFirstSubfldRedefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00060aDeFirstSubfldRedefined,0,getStringValue(),beginIp00060aDeFirstSubfldRedefined,IP_00060A_DE_FIRST_SUBFLD_REDEFINED_LEN);
       localIp00060aDeFirstSubfldRedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00060aDeFirstSubfldRedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp00060aDeFirstSubfldRedefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00060aDeFirstSubfldRedefined() {	 
   		return (substring(getStringValue(),beginIp00060aDeFirstSubfldRedefined,beginIp00060aDeFirstSubfldRedefined + IP_00060A_DE_FIRST_SUBFLD_REDEFINED_LEN));
   	}




}
  
