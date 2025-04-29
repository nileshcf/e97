package com.cloudframe.app.codemove.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 158;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAaW1Edit94;
            protected  int beginAaW1Edit94Nb;
            protected  int beginAaW1Disp94;
            protected  int beginAaW1DispS94;
            protected  int beginAaW1Disp98;
            protected  int beginAaW1DispS98;
            protected  int beginAaW1Disp912;
            protected  int beginAaW1DispS912;
            protected  int beginAaW1Comp394;
            protected  int beginAaW1Comp3S94;
            protected  int beginAaW1Comp398;
            protected  int beginAaW1Comp3S98;
            protected  int beginAaW1Comp3912;
            protected  int beginAaW1Comp3S912;
            protected  int beginAaW1Comp3944;
            protected  int beginAaW1Comp3S944;
            protected  int beginAaW1Comp3984;
            protected  int beginAaW1Comp3S984;
            protected  int beginAaW1Comp39124;
            protected  int beginAaW1Comp3S9124;
            protected  int beginAaW1Disp944;
            protected  int beginAaW1DispS944;
            protected  int beginAaW1Disp984;
            protected  int beginAaW1DispS984;
            protected  int beginAaW1Disp9124;
            protected  int beginAaW1DispS9124;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
             beginAaW1Edit94 = getStartOffset() + 0;	// set offset for serialization
  
             beginAaW1Edit94Nb = getStartOffset() + 4;	// set offset for serialization
  
             beginAaW1Disp94 = getStartOffset() + 8;	// set offset for serialization
  
             beginAaW1DispS94 = getStartOffset() + 12;	// set offset for serialization
  
             beginAaW1Disp98 = getStartOffset() + 16;	// set offset for serialization
  
             beginAaW1DispS98 = getStartOffset() + 24;	// set offset for serialization
  
             beginAaW1Disp912 = getStartOffset() + 32;	// set offset for serialization
  
             beginAaW1DispS912 = getStartOffset() + 44;	// set offset for serialization
  
             beginAaW1Comp394 = getStartOffset() + 56;	// set offset for serialization
  
             beginAaW1Comp3S94 = getStartOffset() + 59;	// set offset for serialization
  
             beginAaW1Comp398 = getStartOffset() + 62;	// set offset for serialization
  
             beginAaW1Comp3S98 = getStartOffset() + 67;	// set offset for serialization
  
             beginAaW1Comp3912 = getStartOffset() + 72;	// set offset for serialization
  
             beginAaW1Comp3S912 = getStartOffset() + 79;	// set offset for serialization
  
             beginAaW1Comp3944 = getStartOffset() + 86;	// set offset for serialization
  
             beginAaW1Comp3S944 = getStartOffset() + 89;	// set offset for serialization
  
             beginAaW1Comp3984 = getStartOffset() + 92;	// set offset for serialization
  
             beginAaW1Comp3S984 = getStartOffset() + 96;	// set offset for serialization
  
             beginAaW1Comp39124 = getStartOffset() + 100;	// set offset for serialization
  
             beginAaW1Comp3S9124 = getStartOffset() + 107;	// set offset for serialization
  
  
  
  
  
  
  
             beginAaW1Disp944 = getStartOffset() + 114;	// set offset for serialization
  
             beginAaW1DispS944 = getStartOffset() + 118;	// set offset for serialization
  
             beginAaW1Disp984 = getStartOffset() + 122;	// set offset for serialization
  
             beginAaW1DispS984 = getStartOffset() + 128;	// set offset for serialization
  
             beginAaW1Disp9124 = getStartOffset() + 134;	// set offset for serialization
  
             beginAaW1DispS9124 = getStartOffset() + 146;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
         int localAaW1Comp94Counter = -1;
         public boolean isAaW1Comp94Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1Comp94Counter != sharedCounter;
            localAaW1Comp94Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkAaW1Comp94MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localAaW1CompS94Counter = -1;
         public boolean isAaW1CompS94Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1CompS94Counter != sharedCounter;
            localAaW1CompS94Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAaW1CompS94MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localAaW1Comp98Counter = -1;
         public boolean isAaW1Comp98Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1Comp98Counter != sharedCounter;
            localAaW1Comp98Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAaW1Comp98MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localAaW1CompS98Counter = -1;
         public boolean isAaW1CompS98Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1CompS98Counter != sharedCounter;
            localAaW1CompS98Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkAaW1CompS98MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localAaW1Comp912Counter = -1;
         public boolean isAaW1Comp912Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1Comp912Counter != sharedCounter;
            localAaW1Comp912Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAaW1Comp912MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localAaW1CompS912Counter = -1;
         public boolean isAaW1CompS912Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1CompS912Counter != sharedCounter;
            localAaW1CompS912Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAaW1CompS912MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
         int localAaW1Bin94Counter = -1;
         public boolean isAaW1Bin94Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1Bin94Counter != sharedCounter;
            localAaW1Bin94Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkAaW1Bin94MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
         int localAaW1BinS94Counter = -1;
         public boolean isAaW1BinS94Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1BinS94Counter != sharedCounter;
            localAaW1BinS94Counter = sharedCounter; return hasModified; 
         }
       
      
   protected short checkAaW1BinS94MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
         int localAaW1Bin98Counter = -1;
         public boolean isAaW1Bin98Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1Bin98Counter != sharedCounter;
            localAaW1Bin98Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAaW1Bin98MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
         int localAaW1BinS98Counter = -1;
         public boolean isAaW1BinS98Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1BinS98Counter != sharedCounter;
            localAaW1BinS98Counter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkAaW1BinS98MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localAaW1Bin912Counter = -1;
         public boolean isAaW1Bin912Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1Bin912Counter != sharedCounter;
            localAaW1Bin912Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAaW1Bin912MaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,8/*dataLen*/);
   }
         int localAaW1BinS912Counter = -1;
         public boolean isAaW1BinS912Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAaW1BinS912Counter != sharedCounter;
            localAaW1BinS912Counter = sharedCounter; return hasModified; 
         }
       
      
   protected long checkAaW1BinS912MaxLimit(long number) {
        return checkMaxLimit(number, true/*isSigned*/,8/*dataLen*/);
   }
     int localAaW1Edit94Counter = -1;
     public boolean isAaW1Edit94Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Edit94Counter != sharedCounter;
         localAaW1Edit94Counter = sharedCounter; return hasModified;
     }
	protected static final int AA_W_1_EDIT_94_LEN = 4;
	/**
	 * 	serialize this AaW1Edit94
	 */
   protected void serializeAaW1Edit94(char[] aaW1Edit94) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aaW1Edit94,0,getStringValue(),beginAaW1Edit94,AA_W_1_EDIT_94_LEN);
       localAaW1Edit94Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAaW1Edit94Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAaW1Edit94 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAaW1Edit94() {	 
   		return (substring(getStringValue(),beginAaW1Edit94,beginAaW1Edit94 + AA_W_1_EDIT_94_LEN));
   	}
     int localAaW1Edit94NbCounter = -1;
     public boolean isAaW1Edit94NbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Edit94NbCounter != sharedCounter;
         localAaW1Edit94NbCounter = sharedCounter; return hasModified;
     }
	protected static final int AA_W_1_EDIT_94_NB_LEN = 4;
	/**
	 * 	serialize this AaW1Edit94Nb
	 */
   protected void serializeAaW1Edit94Nb(char[] aaW1Edit94Nb) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(aaW1Edit94Nb,0,getStringValue(),beginAaW1Edit94Nb,AA_W_1_EDIT_94_NB_LEN);
       localAaW1Edit94NbCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAaW1Edit94NbConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, true);
   }
    /**
	 *	refreshAaW1Edit94Nb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAaW1Edit94Nb() {	 
   		return (substring(getStringValue(),beginAaW1Edit94Nb,beginAaW1Edit94Nb + AA_W_1_EDIT_94_NB_LEN));
   	}
     int localAaW1Disp94Counter = -1;
     public boolean isAaW1Disp94Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Disp94Counter != sharedCounter;
         localAaW1Disp94Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aaW1Disp94
	 *	@return aaW1Disp94
	 */
	public char[]  getAaW1Disp94String() {
	     return getCharArray(beginAaW1Disp94,AA_W_1_DISP_94_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1Disp94IsNumeric() {
	    return isNumeric(beginAaW1Disp94
	                    ,beginAaW1Disp94 + AA_W_1_DISP_94_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AA_W_1_DISP_94_LEN = 4;
  	/**
	 * serializeAaW1Disp94
	 */
	protected void serializeAaW1Disp94(int aaW1Disp94) {
		 putNumber(beginAaW1Disp94,aaW1Disp94,AA_W_1_DISP_94_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1Disp94Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAaW1Disp94
	 */
   	protected  int serializeAaW1Disp94(char[] value) {
	    int  aaW1Disp94;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aaW1Disp94 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAaW1Disp94
		       ,4
		      );
		 localAaW1Disp94Counter = shareString.getSerializedField().getModifiedCounter();
		return  aaW1Disp94;
    }

   protected int checkAaW1Disp94MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAaW1Disp94 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAaW1Disp94() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAaW1Disp94
			                 ,AA_W_1_DISP_94_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1Disp94", beginAaW1Disp94,AA_W_1_DISP_94_LEN);
    }
   	}
     int localAaW1DispS94Counter = -1;
     public boolean isAaW1DispS94Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1DispS94Counter != sharedCounter;
         localAaW1DispS94Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aaW1DispS94
	 *	@return aaW1DispS94
	 */
	public char[]  getAaW1DispS94String() {
	     return getCharArray(beginAaW1DispS94,AA_W_1_DISP_S_94_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1DispS94IsNumeric() {
	    return isNumeric(beginAaW1DispS94
	                    ,beginAaW1DispS94 + AA_W_1_DISP_S_94_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AA_W_1_DISP_S_94_LEN = 4;
  	/**
	 * serializeAaW1DispS94
	 */
	protected void serializeAaW1DispS94(short aaW1DispS94) {
		 putNumber(beginAaW1DispS94,aaW1DispS94,AA_W_1_DISP_S_94_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1DispS94Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAaW1DispS94
	 */
   	protected  short serializeAaW1DispS94(char[] value) {
	    short  aaW1DispS94;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aaW1DispS94 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginAaW1DispS94
		       ,4
		      );
		 localAaW1DispS94Counter = shareString.getSerializedField().getModifiedCounter();
		return  aaW1DispS94;
    }

   protected short checkAaW1DispS94MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAaW1DispS94 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAaW1DispS94() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginAaW1DispS94
			                 ,AA_W_1_DISP_S_94_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1DispS94", beginAaW1DispS94,AA_W_1_DISP_S_94_LEN);
    }
   	}
     int localAaW1Disp98Counter = -1;
     public boolean isAaW1Disp98Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Disp98Counter != sharedCounter;
         localAaW1Disp98Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aaW1Disp98
	 *	@return aaW1Disp98
	 */
	public char[]  getAaW1Disp98String() {
	     return getCharArray(beginAaW1Disp98,AA_W_1_DISP_98_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1Disp98IsNumeric() {
	    return isNumeric(beginAaW1Disp98
	                    ,beginAaW1Disp98 + AA_W_1_DISP_98_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AA_W_1_DISP_98_LEN = 8;
  	/**
	 * serializeAaW1Disp98
	 */
	protected void serializeAaW1Disp98(long aaW1Disp98) {
		 putNumber(beginAaW1Disp98,aaW1Disp98,AA_W_1_DISP_98_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1Disp98Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAaW1Disp98
	 */
   	protected  long serializeAaW1Disp98(char[] value) {
	    long  aaW1Disp98;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aaW1Disp98 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginAaW1Disp98
		       ,8
		      );
		 localAaW1Disp98Counter = shareString.getSerializedField().getModifiedCounter();
		return  aaW1Disp98;
    }

   protected long checkAaW1Disp98MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAaW1Disp98 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAaW1Disp98() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAaW1Disp98
			                 ,AA_W_1_DISP_98_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1Disp98", beginAaW1Disp98,AA_W_1_DISP_98_LEN);
    }
   	}
     int localAaW1DispS98Counter = -1;
     public boolean isAaW1DispS98Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1DispS98Counter != sharedCounter;
         localAaW1DispS98Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aaW1DispS98
	 *	@return aaW1DispS98
	 */
	public char[]  getAaW1DispS98String() {
	     return getCharArray(beginAaW1DispS98,AA_W_1_DISP_S_98_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1DispS98IsNumeric() {
	    return isNumeric(beginAaW1DispS98
	                    ,beginAaW1DispS98 + AA_W_1_DISP_S_98_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AA_W_1_DISP_S_98_LEN = 8;
  	/**
	 * serializeAaW1DispS98
	 */
	protected void serializeAaW1DispS98(int aaW1DispS98) {
		 putNumber(beginAaW1DispS98,aaW1DispS98,AA_W_1_DISP_S_98_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1DispS98Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAaW1DispS98
	 */
   	protected  int serializeAaW1DispS98(char[] value) {
	    int  aaW1DispS98;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aaW1DispS98 = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,true/*isSigned?*/)
		       ,beginAaW1DispS98
		       ,8
		      );
		 localAaW1DispS98Counter = shareString.getSerializedField().getModifiedCounter();
		return  aaW1DispS98;
    }

   protected int checkAaW1DispS98MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAaW1DispS98 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAaW1DispS98() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAaW1DispS98
			                 ,AA_W_1_DISP_S_98_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1DispS98", beginAaW1DispS98,AA_W_1_DISP_S_98_LEN);
    }
   	}
     int localAaW1Disp912Counter = -1;
     public boolean isAaW1Disp912Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Disp912Counter != sharedCounter;
         localAaW1Disp912Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aaW1Disp912
	 *	@return aaW1Disp912
	 */
	public char[]  getAaW1Disp912String() {
	     return getCharArray(beginAaW1Disp912,AA_W_1_DISP_912_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1Disp912IsNumeric() {
	    return isNumeric(beginAaW1Disp912
	                    ,beginAaW1Disp912 + AA_W_1_DISP_912_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AA_W_1_DISP_912_LEN = 12;
  	/**
	 * serializeAaW1Disp912
	 */
	protected void serializeAaW1Disp912(long aaW1Disp912) {
		 putNumber(beginAaW1Disp912,aaW1Disp912,AA_W_1_DISP_912_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1Disp912Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAaW1Disp912
	 */
   	protected  long serializeAaW1Disp912(char[] value) {
	    long  aaW1Disp912;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aaW1Disp912 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAaW1Disp912
		       ,12
		      );
		 localAaW1Disp912Counter = shareString.getSerializedField().getModifiedCounter();
		return  aaW1Disp912;
    }

   protected long checkAaW1Disp912MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAaW1Disp912 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAaW1Disp912() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAaW1Disp912
			                 ,AA_W_1_DISP_912_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1Disp912", beginAaW1Disp912,AA_W_1_DISP_912_LEN);
    }
   	}
     int localAaW1DispS912Counter = -1;
     public boolean isAaW1DispS912Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1DispS912Counter != sharedCounter;
         localAaW1DispS912Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aaW1DispS912
	 *	@return aaW1DispS912
	 */
	public char[]  getAaW1DispS912String() {
	     return getCharArray(beginAaW1DispS912,AA_W_1_DISP_S_912_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1DispS912IsNumeric() {
	    return isNumeric(beginAaW1DispS912
	                    ,beginAaW1DispS912 + AA_W_1_DISP_S_912_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AA_W_1_DISP_S_912_LEN = 12;
  	/**
	 * serializeAaW1DispS912
	 */
	protected void serializeAaW1DispS912(long aaW1DispS912) {
		 putNumber(beginAaW1DispS912,aaW1DispS912,AA_W_1_DISP_S_912_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1DispS912Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAaW1DispS912
	 */
   	protected  long serializeAaW1DispS912(char[] value) {
	    long  aaW1DispS912;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aaW1DispS912 = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,true/*isSigned?*/)
		       ,beginAaW1DispS912
		       ,12
		      );
		 localAaW1DispS912Counter = shareString.getSerializedField().getModifiedCounter();
		return  aaW1DispS912;
    }

   protected long checkAaW1DispS912MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshAaW1DispS912 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAaW1DispS912() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAaW1DispS912
			                 ,AA_W_1_DISP_S_912_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1DispS912", beginAaW1DispS912,AA_W_1_DISP_S_912_LEN);
    }
   	}
        int localAaW1Comp394Counter = -1;
        public boolean isAaW1Comp394Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp394Counter != sharedCounter;
           localAaW1Comp394Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp394IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp394,AA_W_1_COMP_394_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int AA_W_1_COMP_394_LEN = 3;
  	/**
	 * 	serializeAaW1Comp394
	 */
	protected void serializeAaW1Comp394(int aaW1Comp394) {
		   putDecimal(beginAaW1Comp394,aaW1Comp394,AA_W_1_COMP_394_LEN,false);
   }
   

   protected int checkAaW1Comp394MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_10K /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshAaW1Comp394 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAaW1Comp394() throws CFException {	
   	try { 
		 return (getIntDecimal(beginAaW1Comp394,AA_W_1_COMP_394_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp394", beginAaW1Comp394,AA_W_1_COMP_394_LEN);
     }
   	}
        int localAaW1Comp3S94Counter = -1;
        public boolean isAaW1Comp3S94Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3S94Counter != sharedCounter;
           localAaW1Comp3S94Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3S94IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3S94,AA_W_1_COMP_3_S_94_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int AA_W_1_COMP_3_S_94_LEN = 3;
  	/**
	 * 	serializeAaW1Comp3S94
	 */
	protected void serializeAaW1Comp3S94(short aaW1Comp3S94) {
		   putDecimal(beginAaW1Comp3S94,aaW1Comp3S94,AA_W_1_COMP_3_S_94_LEN,true);
   }
   

   protected short checkAaW1Comp3S94MaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshAaW1Comp3S94 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAaW1Comp3S94() throws CFException {	
   	try { 
		 return (getShortDecimal(beginAaW1Comp3S94,AA_W_1_COMP_3_S_94_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3S94", beginAaW1Comp3S94,AA_W_1_COMP_3_S_94_LEN);
     }
   	}
        int localAaW1Comp398Counter = -1;
        public boolean isAaW1Comp398Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp398Counter != sharedCounter;
           localAaW1Comp398Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp398IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp398,AA_W_1_COMP_398_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int AA_W_1_COMP_398_LEN = 5;
  	/**
	 * 	serializeAaW1Comp398
	 */
	protected void serializeAaW1Comp398(long aaW1Comp398) {
		   putDecimal(beginAaW1Comp398,aaW1Comp398,AA_W_1_COMP_398_LEN,false);
   }
   

   protected long checkAaW1Comp398MaxLimit(long number) {
        return checkMaxLimit(number , MAX_100M /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshAaW1Comp398 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAaW1Comp398() throws CFException {	
   	try { 
		 return (getLongDecimal(beginAaW1Comp398,AA_W_1_COMP_398_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp398", beginAaW1Comp398,AA_W_1_COMP_398_LEN);
     }
   	}
        int localAaW1Comp3S98Counter = -1;
        public boolean isAaW1Comp3S98Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3S98Counter != sharedCounter;
           localAaW1Comp3S98Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3S98IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3S98,AA_W_1_COMP_3_S_98_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int AA_W_1_COMP_3_S_98_LEN = 5;
  	/**
	 * 	serializeAaW1Comp3S98
	 */
	protected void serializeAaW1Comp3S98(int aaW1Comp3S98) {
		   putDecimal(beginAaW1Comp3S98,aaW1Comp3S98,AA_W_1_COMP_3_S_98_LEN,true);
   }
   

   protected int checkAaW1Comp3S98MaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshAaW1Comp3S98 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAaW1Comp3S98() throws CFException {	
   	try { 
		 return (getIntDecimal(beginAaW1Comp3S98,AA_W_1_COMP_3_S_98_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3S98", beginAaW1Comp3S98,AA_W_1_COMP_3_S_98_LEN);
     }
   	}
        int localAaW1Comp3912Counter = -1;
        public boolean isAaW1Comp3912Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3912Counter != sharedCounter;
           localAaW1Comp3912Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3912IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3912,AA_W_1_COMP_3912_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int AA_W_1_COMP_3912_LEN = 7;
  	/**
	 * 	serializeAaW1Comp3912
	 */
	protected void serializeAaW1Comp3912(long aaW1Comp3912) {
		   putDecimal(beginAaW1Comp3912,aaW1Comp3912,AA_W_1_COMP_3912_LEN,false);
   }
   

   protected long checkAaW1Comp3912MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1T /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshAaW1Comp3912 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAaW1Comp3912() throws CFException {	
   	try { 
		 return (getLongDecimal(beginAaW1Comp3912,AA_W_1_COMP_3912_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3912", beginAaW1Comp3912,AA_W_1_COMP_3912_LEN);
     }
   	}
        int localAaW1Comp3S912Counter = -1;
        public boolean isAaW1Comp3S912Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3S912Counter != sharedCounter;
           localAaW1Comp3S912Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3S912IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3S912,AA_W_1_COMP_3_S_912_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int AA_W_1_COMP_3_S_912_LEN = 7;
  	/**
	 * 	serializeAaW1Comp3S912
	 */
	protected void serializeAaW1Comp3S912(long aaW1Comp3S912) {
		   putDecimal(beginAaW1Comp3S912,aaW1Comp3S912,AA_W_1_COMP_3_S_912_LEN,true);
   }
   

   protected long checkAaW1Comp3S912MaxLimit(long number) {
        return checkMaxLimit(number , MAX_1T /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshAaW1Comp3S912 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAaW1Comp3S912() throws CFException {	
   	try { 
		 return (getLongDecimal(beginAaW1Comp3S912,AA_W_1_COMP_3_S_912_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3S912", beginAaW1Comp3S912,AA_W_1_COMP_3_S_912_LEN);
     }
   	}
        int localAaW1Comp3944Counter = -1;
        public boolean isAaW1Comp3944Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3944Counter != sharedCounter;
           localAaW1Comp3944Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3944IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3944,AA_W_1_COMP_3944_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] aaW1Comp3944String() {
            return getPackedString(beginAaW1Comp3944,AA_W_1_COMP_3944_LEN);
         }
   protected static final int AA_W_1_COMP_3944_LEN = 3;
   protected static final int AA_W_1_COMP_3944_SCALE = 2;
  	/**
	 * 	serializeAaW1Comp3944
	 */
	protected void serializeAaW1Comp3944(BigDecimal aaW1Comp3944) {
		   putDecimal(beginAaW1Comp3944,aaW1Comp3944,AA_W_1_COMP_3944_LEN,AA_W_1_COMP_3944_SCALE,false);
		 localAaW1Comp3944Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAaW1Comp3944MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshAaW1Comp3944 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Comp3944() throws CFException {	
   	try { 
		 return (getDecimal(beginAaW1Comp3944,AA_W_1_COMP_3944_LEN,AA_W_1_COMP_3944_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3944", beginAaW1Comp3944,AA_W_1_COMP_3944_LEN);
     }
   	}
        int localAaW1Comp3S944Counter = -1;
        public boolean isAaW1Comp3S944Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3S944Counter != sharedCounter;
           localAaW1Comp3S944Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3S944IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3S944,AA_W_1_COMP_3_S_944_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] aaW1Comp3S944String() {
            return getPackedString(beginAaW1Comp3S944,AA_W_1_COMP_3_S_944_LEN);
         }
   protected static final int AA_W_1_COMP_3_S_944_LEN = 3;
   protected static final int AA_W_1_COMP_3_S_944_SCALE = 2;
  	/**
	 * 	serializeAaW1Comp3S944
	 */
	protected void serializeAaW1Comp3S944(BigDecimal aaW1Comp3S944) {
		   putDecimal(beginAaW1Comp3S944,aaW1Comp3S944,AA_W_1_COMP_3_S_944_LEN,AA_W_1_COMP_3_S_944_SCALE,true);
		 localAaW1Comp3S944Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAaW1Comp3S944MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }
     /**
	 *	refreshAaW1Comp3S944 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Comp3S944() throws CFException {	
   	try { 
		 return (getDecimal(beginAaW1Comp3S944,AA_W_1_COMP_3_S_944_LEN,AA_W_1_COMP_3_S_944_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3S944", beginAaW1Comp3S944,AA_W_1_COMP_3_S_944_LEN);
     }
   	}
        int localAaW1Comp3984Counter = -1;
        public boolean isAaW1Comp3984Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3984Counter != sharedCounter;
           localAaW1Comp3984Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3984IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3984,AA_W_1_COMP_3984_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] aaW1Comp3984String() {
            return getPackedString(beginAaW1Comp3984,AA_W_1_COMP_3984_LEN);
         }
   protected static final int AA_W_1_COMP_3984_LEN = 4;
   protected static final int AA_W_1_COMP_3984_SCALE = 2;
  	/**
	 * 	serializeAaW1Comp3984
	 */
	protected void serializeAaW1Comp3984(BigDecimal aaW1Comp3984) {
		   putDecimal(beginAaW1Comp3984,aaW1Comp3984,AA_W_1_COMP_3984_LEN,AA_W_1_COMP_3984_SCALE,false);
		 localAaW1Comp3984Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAaW1Comp3984MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }
     /**
	 *	refreshAaW1Comp3984 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Comp3984() throws CFException {	
   	try { 
		 return (getDecimal(beginAaW1Comp3984,AA_W_1_COMP_3984_LEN,AA_W_1_COMP_3984_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3984", beginAaW1Comp3984,AA_W_1_COMP_3984_LEN);
     }
   	}
        int localAaW1Comp3S984Counter = -1;
        public boolean isAaW1Comp3S984Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3S984Counter != sharedCounter;
           localAaW1Comp3S984Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3S984IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3S984,AA_W_1_COMP_3_S_984_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] aaW1Comp3S984String() {
            return getPackedString(beginAaW1Comp3S984,AA_W_1_COMP_3_S_984_LEN);
         }
   protected static final int AA_W_1_COMP_3_S_984_LEN = 4;
   protected static final int AA_W_1_COMP_3_S_984_SCALE = 2;
  	/**
	 * 	serializeAaW1Comp3S984
	 */
	protected void serializeAaW1Comp3S984(BigDecimal aaW1Comp3S984) {
		   putDecimal(beginAaW1Comp3S984,aaW1Comp3S984,AA_W_1_COMP_3_S_984_LEN,AA_W_1_COMP_3_S_984_SCALE,true);
		 localAaW1Comp3S984Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAaW1Comp3S984MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }
     /**
	 *	refreshAaW1Comp3S984 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Comp3S984() throws CFException {	
   	try { 
		 return (getDecimal(beginAaW1Comp3S984,AA_W_1_COMP_3_S_984_LEN,AA_W_1_COMP_3_S_984_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3S984", beginAaW1Comp3S984,AA_W_1_COMP_3_S_984_LEN);
     }
   	}
        int localAaW1Comp39124Counter = -1;
        public boolean isAaW1Comp39124Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp39124Counter != sharedCounter;
           localAaW1Comp39124Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp39124IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp39124,AA_W_1_COMP_39124_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] aaW1Comp39124String() {
            return getPackedString(beginAaW1Comp39124,AA_W_1_COMP_39124_LEN);
         }
   protected static final int AA_W_1_COMP_39124_LEN = 7;
   protected static final int AA_W_1_COMP_39124_SCALE = 2;
  	/**
	 * 	serializeAaW1Comp39124
	 */
	protected void serializeAaW1Comp39124(BigDecimal aaW1Comp39124) {
		   putDecimal(beginAaW1Comp39124,aaW1Comp39124,AA_W_1_COMP_39124_LEN,AA_W_1_COMP_39124_SCALE,false);
		 localAaW1Comp39124Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAaW1Comp39124MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshAaW1Comp39124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Comp39124() throws CFException {	
   	try { 
		 return (getDecimal(beginAaW1Comp39124,AA_W_1_COMP_39124_LEN,AA_W_1_COMP_39124_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp39124", beginAaW1Comp39124,AA_W_1_COMP_39124_LEN);
     }
   	}
        int localAaW1Comp3S9124Counter = -1;
        public boolean isAaW1Comp3S9124Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localAaW1Comp3S9124Counter != sharedCounter;
           localAaW1Comp3S9124Counter = sharedCounter; return hasModified; 
        }
	    public boolean aaW1Comp3S9124IsNumeric() {
	      return decimalIsNumeric(beginAaW1Comp3S9124,AA_W_1_COMP_3_S_9124_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] aaW1Comp3S9124String() {
            return getPackedString(beginAaW1Comp3S9124,AA_W_1_COMP_3_S_9124_LEN);
         }
   protected static final int AA_W_1_COMP_3_S_9124_LEN = 7;
   protected static final int AA_W_1_COMP_3_S_9124_SCALE = 2;
  	/**
	 * 	serializeAaW1Comp3S9124
	 */
	protected void serializeAaW1Comp3S9124(BigDecimal aaW1Comp3S9124) {
		   putDecimal(beginAaW1Comp3S9124,aaW1Comp3S9124,AA_W_1_COMP_3_S_9124_LEN,AA_W_1_COMP_3_S_9124_SCALE,true);
		 localAaW1Comp3S9124Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkAaW1Comp3S9124MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }
     /**
	 *	refreshAaW1Comp3S9124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Comp3S9124() throws CFException {	
   	try { 
		 return (getDecimal(beginAaW1Comp3S9124,AA_W_1_COMP_3_S_9124_LEN,AA_W_1_COMP_3_S_9124_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("aaW1Comp3S9124", beginAaW1Comp3S9124,AA_W_1_COMP_3_S_9124_LEN);
     }
   	}
         int localAaW1Comp944Counter = -1;
         public boolean isAaW1Comp944Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1Comp944Counter != sharedCounter;
             localAaW1Comp944Counter = sharedCounter; return hasModified;
         }
         int localAaW1CompS944Counter = -1;
         public boolean isAaW1CompS944Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1CompS944Counter != sharedCounter;
             localAaW1CompS944Counter = sharedCounter; return hasModified;
         }
         int localAaW1Comp984Counter = -1;
         public boolean isAaW1Comp984Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1Comp984Counter != sharedCounter;
             localAaW1Comp984Counter = sharedCounter; return hasModified;
         }
         int localAaW1CompS984Counter = -1;
         public boolean isAaW1CompS984Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1CompS984Counter != sharedCounter;
             localAaW1CompS984Counter = sharedCounter; return hasModified;
         }
         int localAaW1Comp9124Counter = -1;
         public boolean isAaW1Comp9124Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1Comp9124Counter != sharedCounter;
             localAaW1Comp9124Counter = sharedCounter; return hasModified;
         }
         int localAaW1CompS9124Counter = -1;
         public boolean isAaW1CompS9124Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1CompS9124Counter != sharedCounter;
             localAaW1CompS9124Counter = sharedCounter; return hasModified;
         }
     int localAaW1Disp944Counter = -1;
     
     public boolean isAaW1Disp944Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Disp944Counter != sharedCounter;
         localAaW1Disp944Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of aaW1Disp944
	 *	@return aaW1Disp944
	 */
	public char[]  getAaW1Disp944String() {
	    return getCharArray(beginAaW1Disp944,AA_W_1_DISP_944_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1Disp944IsNumeric() {
		    return isNumeric(beginAaW1Disp944
	                    ,beginAaW1Disp944 + AA_W_1_DISP_944_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AA_W_1_DISP_944_LEN = 4;
  protected  static final int AA_W_1_DISP_944_SCALE = 2;

   protected BigDecimal checkAaW1Disp944MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }

  	/**
	 * serializeAaW1Disp944
	 */
	protected void serializeAaW1Disp944(BigDecimal aaW1Disp944) {
	       putNumber(beginAaW1Disp944,aaW1Disp944,AA_W_1_DISP_944_LEN,AA_W_1_DISP_944_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1Disp944Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAaW1Disp944
	 */
   	protected  BigDecimal serializeAaW1Disp944(char[] value) throws CFException {
        if (value.length < 4) value = pad(4, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginAaW1Disp944
		       ,4
		      );		 localAaW1Disp944Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AA_W_1_DISP_944_LEN,AA_W_1_DISP_944_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("aaW1Disp944", beginAaW1Disp944,AA_W_1_DISP_944_LEN);
    	}
    }
    /**
	 *	refreshAaW1Disp944 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Disp944() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAaW1Disp944
			            ,AA_W_1_DISP_944_LEN
			            ,AA_W_1_DISP_944_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1Disp944", beginAaW1Disp944,AA_W_1_DISP_944_LEN);
    }
   	}
     int localAaW1DispS944Counter = -1;
     
     public boolean isAaW1DispS944Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1DispS944Counter != sharedCounter;
         localAaW1DispS944Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of aaW1DispS944
	 *	@return aaW1DispS944
	 */
	public char[]  getAaW1DispS944String() {
	    return getCharArray(beginAaW1DispS944,AA_W_1_DISP_S_944_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1DispS944IsNumeric() {
		    return isNumeric(beginAaW1DispS944
	                    ,beginAaW1DispS944 + AA_W_1_DISP_S_944_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AA_W_1_DISP_S_944_LEN = 4;
  protected  static final int AA_W_1_DISP_S_944_SCALE = 2;

   protected BigDecimal checkAaW1DispS944MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,4/*precision*/);
   }

  	/**
	 * serializeAaW1DispS944
	 */
	protected void serializeAaW1DispS944(BigDecimal aaW1DispS944) {
	       putNumber(beginAaW1DispS944,aaW1DispS944,AA_W_1_DISP_S_944_LEN,AA_W_1_DISP_S_944_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1DispS944Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAaW1DispS944
	 */
   	protected  BigDecimal serializeAaW1DispS944(char[] value) throws CFException {
        if (value.length < 4) value = pad(4, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginAaW1DispS944
		       ,4
		      );		 localAaW1DispS944Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AA_W_1_DISP_S_944_LEN,AA_W_1_DISP_S_944_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("aaW1DispS944", beginAaW1DispS944,AA_W_1_DISP_S_944_LEN);
    	}
    }
    /**
	 *	refreshAaW1DispS944 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1DispS944() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAaW1DispS944
			            ,AA_W_1_DISP_S_944_LEN
			            ,AA_W_1_DISP_S_944_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1DispS944", beginAaW1DispS944,AA_W_1_DISP_S_944_LEN);
    }
   	}
     int localAaW1Disp984Counter = -1;
     
     public boolean isAaW1Disp984Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Disp984Counter != sharedCounter;
         localAaW1Disp984Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of aaW1Disp984
	 *	@return aaW1Disp984
	 */
	public char[]  getAaW1Disp984String() {
	    return getCharArray(beginAaW1Disp984,AA_W_1_DISP_984_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1Disp984IsNumeric() {
		    return isNumeric(beginAaW1Disp984
	                    ,beginAaW1Disp984 + AA_W_1_DISP_984_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AA_W_1_DISP_984_LEN = 6;
  protected  static final int AA_W_1_DISP_984_SCALE = 2;

   protected BigDecimal checkAaW1Disp984MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeAaW1Disp984
	 */
	protected void serializeAaW1Disp984(BigDecimal aaW1Disp984) {
	       putNumber(beginAaW1Disp984,aaW1Disp984,AA_W_1_DISP_984_LEN,AA_W_1_DISP_984_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1Disp984Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAaW1Disp984
	 */
   	protected  BigDecimal serializeAaW1Disp984(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginAaW1Disp984
		       ,6
		      );		 localAaW1Disp984Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AA_W_1_DISP_984_LEN,AA_W_1_DISP_984_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("aaW1Disp984", beginAaW1Disp984,AA_W_1_DISP_984_LEN);
    	}
    }
    /**
	 *	refreshAaW1Disp984 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Disp984() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAaW1Disp984
			            ,AA_W_1_DISP_984_LEN
			            ,AA_W_1_DISP_984_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1Disp984", beginAaW1Disp984,AA_W_1_DISP_984_LEN);
    }
   	}
     int localAaW1DispS984Counter = -1;
     
     public boolean isAaW1DispS984Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1DispS984Counter != sharedCounter;
         localAaW1DispS984Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of aaW1DispS984
	 *	@return aaW1DispS984
	 */
	public char[]  getAaW1DispS984String() {
	    return getCharArray(beginAaW1DispS984,AA_W_1_DISP_S_984_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1DispS984IsNumeric() {
		    return isNumeric(beginAaW1DispS984
	                    ,beginAaW1DispS984 + AA_W_1_DISP_S_984_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AA_W_1_DISP_S_984_LEN = 6;
  protected  static final int AA_W_1_DISP_S_984_SCALE = 2;

   protected BigDecimal checkAaW1DispS984MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeAaW1DispS984
	 */
	protected void serializeAaW1DispS984(BigDecimal aaW1DispS984) {
	       putNumber(beginAaW1DispS984,aaW1DispS984,AA_W_1_DISP_S_984_LEN,AA_W_1_DISP_S_984_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1DispS984Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAaW1DispS984
	 */
   	protected  BigDecimal serializeAaW1DispS984(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginAaW1DispS984
		       ,6
		      );		 localAaW1DispS984Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AA_W_1_DISP_S_984_LEN,AA_W_1_DISP_S_984_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("aaW1DispS984", beginAaW1DispS984,AA_W_1_DISP_S_984_LEN);
    	}
    }
    /**
	 *	refreshAaW1DispS984 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1DispS984() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAaW1DispS984
			            ,AA_W_1_DISP_S_984_LEN
			            ,AA_W_1_DISP_S_984_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1DispS984", beginAaW1DispS984,AA_W_1_DISP_S_984_LEN);
    }
   	}
     int localAaW1Disp9124Counter = -1;
     
     public boolean isAaW1Disp9124Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1Disp9124Counter != sharedCounter;
         localAaW1Disp9124Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of aaW1Disp9124
	 *	@return aaW1Disp9124
	 */
	public char[]  getAaW1Disp9124String() {
	    return getCharArray(beginAaW1Disp9124,AA_W_1_DISP_9124_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1Disp9124IsNumeric() {
		    return isNumeric(beginAaW1Disp9124
	                    ,beginAaW1Disp9124 + AA_W_1_DISP_9124_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AA_W_1_DISP_9124_LEN = 12;
  protected  static final int AA_W_1_DISP_9124_SCALE = 2;

   protected BigDecimal checkAaW1Disp9124MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeAaW1Disp9124
	 */
	protected void serializeAaW1Disp9124(BigDecimal aaW1Disp9124) {
	       putNumber(beginAaW1Disp9124,aaW1Disp9124,AA_W_1_DISP_9124_LEN,AA_W_1_DISP_9124_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1Disp9124Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAaW1Disp9124
	 */
   	protected  BigDecimal serializeAaW1Disp9124(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAaW1Disp9124
		       ,12
		      );		 localAaW1Disp9124Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AA_W_1_DISP_9124_LEN,AA_W_1_DISP_9124_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("aaW1Disp9124", beginAaW1Disp9124,AA_W_1_DISP_9124_LEN);
    	}
    }
    /**
	 *	refreshAaW1Disp9124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1Disp9124() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAaW1Disp9124
			            ,AA_W_1_DISP_9124_LEN
			            ,AA_W_1_DISP_9124_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1Disp9124", beginAaW1Disp9124,AA_W_1_DISP_9124_LEN);
    }
   	}
     int localAaW1DispS9124Counter = -1;
     
     public boolean isAaW1DispS9124Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1DispS9124Counter != sharedCounter;
         localAaW1DispS9124Counter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of aaW1DispS9124
	 *	@return aaW1DispS9124
	 */
	public char[]  getAaW1DispS9124String() {
	    return getCharArray(beginAaW1DispS9124,AA_W_1_DISP_S_9124_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aaW1DispS9124IsNumeric() {
		    return isNumeric(beginAaW1DispS9124
	                    ,beginAaW1DispS9124 + AA_W_1_DISP_S_9124_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int AA_W_1_DISP_S_9124_LEN = 12;
  protected  static final int AA_W_1_DISP_S_9124_SCALE = 2;

   protected BigDecimal checkAaW1DispS9124MaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeAaW1DispS9124
	 */
	protected void serializeAaW1DispS9124(BigDecimal aaW1DispS9124) {
	       putNumber(beginAaW1DispS9124,aaW1DispS9124,AA_W_1_DISP_S_9124_LEN,AA_W_1_DISP_S_9124_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAaW1DispS9124Counter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeAaW1DispS9124
	 */
   	protected  BigDecimal serializeAaW1DispS9124(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,true/*isSigned?*/)
		       ,beginAaW1DispS9124
		       ,12
		      );		 localAaW1DispS9124Counter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,AA_W_1_DISP_S_9124_LEN,AA_W_1_DISP_S_9124_SCALE,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("aaW1DispS9124", beginAaW1DispS9124,AA_W_1_DISP_S_9124_LEN);
    	}
    }
    /**
	 *	refreshAaW1DispS9124 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshAaW1DispS9124() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginAaW1DispS9124
			            ,AA_W_1_DISP_S_9124_LEN
			            ,AA_W_1_DISP_S_9124_SCALE
			            ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("aaW1DispS9124", beginAaW1DispS9124,AA_W_1_DISP_S_9124_LEN);
    }
   	}
         int localAaW1Bin944Counter = -1;
         public boolean isAaW1Bin944Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1Bin944Counter != sharedCounter;
             localAaW1Bin944Counter = sharedCounter; return hasModified;
         }
         int localAaW1BinS944Counter = -1;
         public boolean isAaW1BinS944Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1BinS944Counter != sharedCounter;
             localAaW1BinS944Counter = sharedCounter; return hasModified;
         }
         int localAaW1Bin984Counter = -1;
         public boolean isAaW1Bin984Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1Bin984Counter != sharedCounter;
             localAaW1Bin984Counter = sharedCounter; return hasModified;
         }
         int localAaW1BinS984Counter = -1;
         public boolean isAaW1BinS984Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1BinS984Counter != sharedCounter;
             localAaW1BinS984Counter = sharedCounter; return hasModified;
         }
         int localAaW1Bin9124Counter = -1;
         public boolean isAaW1Bin9124Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1Bin9124Counter != sharedCounter;
             localAaW1Bin9124Counter = sharedCounter; return hasModified;
         }
         int localAaW1BinS9124Counter = -1;
         public boolean isAaW1BinS9124Modified() {
             int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
             boolean hasModified = localAaW1BinS9124Counter != sharedCounter;
             localAaW1BinS9124Counter = sharedCounter; return hasModified;
         }
     int localAaW1X1Counter = -1;
     public boolean isAaW1X1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1X1Counter != sharedCounter;
         localAaW1X1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAaW1X1Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
     int localAaW1X2Counter = -1;
     public boolean isAaW1X2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1X2Counter != sharedCounter;
         localAaW1X2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAaW1X2Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,true, false);
   }
     int localAaW1X3Counter = -1;
     public boolean isAaW1X3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1X3Counter != sharedCounter;
         localAaW1X3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAaW1X3Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,true, false);
   }
     int localAaW1X4Counter = -1;
     public boolean isAaW1X4Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1X4Counter != sharedCounter;
         localAaW1X4Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAaW1X4Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
     int localAaW1X5Counter = -1;
     public boolean isAaW1X5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAaW1X5Counter != sharedCounter;
         localAaW1X5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAaW1X5Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }




}
  
