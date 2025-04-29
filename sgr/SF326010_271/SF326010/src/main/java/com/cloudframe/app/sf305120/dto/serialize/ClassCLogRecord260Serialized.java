package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ClassCLogRecord260Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:21. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClassCLogRecord260Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClassCLogRecord260Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLASS_CLOG_RECORD_260_LENGTH = 8273;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLogcMiplogLength260;
            protected  int beginLogcClassType260;
            protected  int beginLogcMiplogRefNum260;
            protected  int beginLogcMiplogBoxId260;
            protected  int beginLogcMiplogTime260;
            protected  int beginLogcMiplogDate260;
            protected  int beginLogcServiceType260;
            protected  int beginLogcApplRefNo260;
            protected  int beginAccountNo260;
            protected  int beginLogcAcqMipId260;
            protected  int beginLogcIssMipId260;
            protected  int beginLogcIsoMessage260;
	
	/**
	* Constructor for ClassCLogRecord260Serialized
	**/
    public ClassCLogRecord260Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ClassCLogRecord260Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLASS_CLOG_RECORD_260_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginLogcMiplogLength260 = getStartOffset() + 13;	// set offset for serialization
  
             beginLogcClassType260 = getStartOffset() + 15;	// set offset for serialization
  
             beginLogcMiplogRefNum260 = getStartOffset() + 17;	// set offset for serialization
  
             beginLogcMiplogBoxId260 = getStartOffset() + 23;	// set offset for serialization
  
             beginLogcMiplogTime260 = getStartOffset() + 26;	// set offset for serialization
  
             beginLogcMiplogDate260 = getStartOffset() + 29;	// set offset for serialization
  
  
  
             beginLogcServiceType260 = getStartOffset() + 113;	// set offset for serialization
  
             beginLogcApplRefNo260 = getStartOffset() + 117;	// set offset for serialization
  
  
             beginAccountNo260 = getStartOffset() + 130;	// set offset for serialization
  
  
             beginLogcAcqMipId260 = getStartOffset() + 244;	// set offset for serialization
  
             beginLogcIssMipId260 = getStartOffset() + 247;	// set offset for serialization
  
  
             beginLogcIsoMessage260 = getStartOffset() + 273;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localLogcMiplogLength260Counter = -1;
         public boolean isLogcMiplogLength260Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLogcMiplogLength260Counter != sharedCounter;
            localLogcMiplogLength260Counter = sharedCounter; return hasModified; 
         }
   protected static final int LOGC_MIPLOG_LENGTH_260_LEN = 2;
  	/**
	 * serializeLogcMiplogLength260
	 */
	protected void serializeLogcMiplogLength260(short logcMiplogLength260) {
           replaceValue( //  save the value as string
                   getBinaryString( logcMiplogLength260,LOGC_MIPLOG_LENGTH_260_LEN)
                  ,beginLogcMiplogLength260
                  ,LOGC_MIPLOG_LENGTH_260_LEN
                 );
            localLogcMiplogLength260Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLogcMiplogLength260MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLogcMiplogLength260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLogcMiplogLength260() {	 
			return (getShort(beginLogcMiplogLength260));
   	}
     int localLogcClassType260Counter = -1;
     public boolean isLogcClassType260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcClassType260Counter != sharedCounter;
         localLogcClassType260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_CLASS_TYPE_260_LEN = 2;
	/**
	 * 	serialize this LogcClassType260
	 */
   protected void serializeLogcClassType260(char[] logcClassType260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcClassType260,0,getStringValue(),beginLogcClassType260,LOGC_CLASS_TYPE_260_LEN);
       localLogcClassType260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcClassType260Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshLogcClassType260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcClassType260() {	 
   		return (substring(getStringValue(),beginLogcClassType260,beginLogcClassType260 + LOGC_CLASS_TYPE_260_LEN));
   	}
     int localLogcMiplogRefNum260Counter = -1;
     public boolean isLogcMiplogRefNum260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcMiplogRefNum260Counter != sharedCounter;
         localLogcMiplogRefNum260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_MIPLOG_REF_NUM_260_LEN = 6;
	/**
	 * 	serialize this LogcMiplogRefNum260
	 */
   protected void serializeLogcMiplogRefNum260(char[] logcMiplogRefNum260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcMiplogRefNum260,0,getStringValue(),beginLogcMiplogRefNum260,LOGC_MIPLOG_REF_NUM_260_LEN);
       localLogcMiplogRefNum260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcMiplogRefNum260Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshLogcMiplogRefNum260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcMiplogRefNum260() {	 
   		return (substring(getStringValue(),beginLogcMiplogRefNum260,beginLogcMiplogRefNum260 + LOGC_MIPLOG_REF_NUM_260_LEN));
   	}
     int localLogcMiplogBoxId260Counter = -1;
     public boolean isLogcMiplogBoxId260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcMiplogBoxId260Counter != sharedCounter;
         localLogcMiplogBoxId260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_MIPLOG_BOX_ID_260_LEN = 3;
	/**
	 * 	serialize this LogcMiplogBoxId260
	 */
   protected void serializeLogcMiplogBoxId260(char[] logcMiplogBoxId260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcMiplogBoxId260,0,getStringValue(),beginLogcMiplogBoxId260,LOGC_MIPLOG_BOX_ID_260_LEN);
       localLogcMiplogBoxId260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcMiplogBoxId260Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLogcMiplogBoxId260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcMiplogBoxId260() {	 
   		return (substring(getStringValue(),beginLogcMiplogBoxId260,beginLogcMiplogBoxId260 + LOGC_MIPLOG_BOX_ID_260_LEN));
   	}
     int localLogcMiplogTime260Counter = -1;
     public boolean isLogcMiplogTime260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcMiplogTime260Counter != sharedCounter;
         localLogcMiplogTime260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_MIPLOG_TIME_260_LEN = 3;
	/**
	 * 	serialize this LogcMiplogTime260
	 */
   protected void serializeLogcMiplogTime260(char[] logcMiplogTime260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcMiplogTime260,0,getStringValue(),beginLogcMiplogTime260,LOGC_MIPLOG_TIME_260_LEN);
       localLogcMiplogTime260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcMiplogTime260Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLogcMiplogTime260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcMiplogTime260() {	 
   		return (substring(getStringValue(),beginLogcMiplogTime260,beginLogcMiplogTime260 + LOGC_MIPLOG_TIME_260_LEN));
   	}
     int localLogcMiplogDate260Counter = -1;
     public boolean isLogcMiplogDate260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcMiplogDate260Counter != sharedCounter;
         localLogcMiplogDate260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_MIPLOG_DATE_260_LEN = 3;
	/**
	 * 	serialize this LogcMiplogDate260
	 */
   protected void serializeLogcMiplogDate260(char[] logcMiplogDate260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcMiplogDate260,0,getStringValue(),beginLogcMiplogDate260,LOGC_MIPLOG_DATE_260_LEN);
       localLogcMiplogDate260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcMiplogDate260Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLogcMiplogDate260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcMiplogDate260() {	 
   		return (substring(getStringValue(),beginLogcMiplogDate260,beginLogcMiplogDate260 + LOGC_MIPLOG_DATE_260_LEN));
   	}
     int localLogcServiceType260Counter = -1;
     public boolean isLogcServiceType260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcServiceType260Counter != sharedCounter;
         localLogcServiceType260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_SERVICE_TYPE_260_LEN = 4;
	/**
	 * 	serialize this LogcServiceType260
	 */
   protected void serializeLogcServiceType260(char[] logcServiceType260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcServiceType260,0,getStringValue(),beginLogcServiceType260,LOGC_SERVICE_TYPE_260_LEN);
       localLogcServiceType260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcServiceType260Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshLogcServiceType260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcServiceType260() {	 
   		return (substring(getStringValue(),beginLogcServiceType260,beginLogcServiceType260 + LOGC_SERVICE_TYPE_260_LEN));
   	}
     int localLogcApplRefNo260Counter = -1;
     public boolean isLogcApplRefNo260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcApplRefNo260Counter != sharedCounter;
         localLogcApplRefNo260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_APPL_REF_NO_260_LEN = 6;
	/**
	 * 	serialize this LogcApplRefNo260
	 */
   protected void serializeLogcApplRefNo260(char[] logcApplRefNo260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcApplRefNo260,0,getStringValue(),beginLogcApplRefNo260,LOGC_APPL_REF_NO_260_LEN);
       localLogcApplRefNo260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcApplRefNo260Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshLogcApplRefNo260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcApplRefNo260() {	 
   		return (substring(getStringValue(),beginLogcApplRefNo260,beginLogcApplRefNo260 + LOGC_APPL_REF_NO_260_LEN));
   	}
     int localAccountNo260Counter = -1;
     public boolean isAccountNo260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAccountNo260Counter != sharedCounter;
         localAccountNo260Counter = sharedCounter; return hasModified;
     }
	protected static final int ACCOUNT_NO_260_LEN = 16;
	/**
	 * 	serialize this AccountNo260
	 */
   protected void serializeAccountNo260(char[] accountNo260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(accountNo260,0,getStringValue(),beginAccountNo260,ACCOUNT_NO_260_LEN);
       localAccountNo260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAccountNo260Constraints(char[] value) {
   			return super.checkConstraints(value , 16 ,false, false);
   }
    /**
	 *	refreshAccountNo260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAccountNo260() {	 
   		return (substring(getStringValue(),beginAccountNo260,beginAccountNo260 + ACCOUNT_NO_260_LEN));
   	}
     int localLogcAcqMipId260Counter = -1;
     public boolean isLogcAcqMipId260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcAcqMipId260Counter != sharedCounter;
         localLogcAcqMipId260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_ACQ_MIP_ID_260_LEN = 3;
	/**
	 * 	serialize this LogcAcqMipId260
	 */
   protected void serializeLogcAcqMipId260(char[] logcAcqMipId260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcAcqMipId260,0,getStringValue(),beginLogcAcqMipId260,LOGC_ACQ_MIP_ID_260_LEN);
       localLogcAcqMipId260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcAcqMipId260Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLogcAcqMipId260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcAcqMipId260() {	 
   		return (substring(getStringValue(),beginLogcAcqMipId260,beginLogcAcqMipId260 + LOGC_ACQ_MIP_ID_260_LEN));
   	}
     int localLogcIssMipId260Counter = -1;
     public boolean isLogcIssMipId260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcIssMipId260Counter != sharedCounter;
         localLogcIssMipId260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_ISS_MIP_ID_260_LEN = 3;
	/**
	 * 	serialize this LogcIssMipId260
	 */
   protected void serializeLogcIssMipId260(char[] logcIssMipId260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcIssMipId260,0,getStringValue(),beginLogcIssMipId260,LOGC_ISS_MIP_ID_260_LEN);
       localLogcIssMipId260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcIssMipId260Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLogcIssMipId260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcIssMipId260() {	 
   		return (substring(getStringValue(),beginLogcIssMipId260,beginLogcIssMipId260 + LOGC_ISS_MIP_ID_260_LEN));
   	}
     int localLogcIsoMessage260Counter = -1;
     public boolean isLogcIsoMessage260Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLogcIsoMessage260Counter != sharedCounter;
         localLogcIsoMessage260Counter = sharedCounter; return hasModified;
     }
	protected static final int LOGC_ISO_MESSAGE_260_LEN = 8000;
	/**
	 * 	serialize this LogcIsoMessage260
	 */
   protected void serializeLogcIsoMessage260(char[] logcIsoMessage260) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(logcIsoMessage260,0,getStringValue(),beginLogcIsoMessage260,LOGC_ISO_MESSAGE_260_LEN);
       localLogcIsoMessage260Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLogcIsoMessage260Constraints(char[] value) {
   			return super.checkConstraints(value , 8000 ,false, false);
   }
    /**
	 *	refreshLogcIsoMessage260 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLogcIsoMessage260() {	 
   		return (substring(getStringValue(),beginLogcIsoMessage260,beginLogcIsoMessage260 + LOGC_ISO_MESSAGE_260_LEN));
   	}




}
  
