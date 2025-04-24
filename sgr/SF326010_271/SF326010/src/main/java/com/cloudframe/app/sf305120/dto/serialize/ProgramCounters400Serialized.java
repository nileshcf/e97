package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ProgramCounters400Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProgramCounters400Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProgramCounters400Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROGRAM_COUNTERS_400_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIteration400;
            protected  int beginSub400;
            protected  int beginSrSub400;
            protected  int beginSr1Length400;
            protected  int beginVardataLnth400;
            protected  int beginIsoOffset400;
            protected  int beginX9aOffset400;
            protected  int beginEitOffset400;
            protected  int beginEsHdrLen400;
            protected  int beginSiHdrLen400;
	
	/**
	* Constructor for ProgramCounters400Serialized
	**/
    public ProgramCounters400Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ProgramCounters400Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROGRAM_COUNTERS_400_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIteration400 = getStartOffset() + 0;	// set offset for serialization
  
             beginSub400 = getStartOffset() + 2;	// set offset for serialization
  
             beginSrSub400 = getStartOffset() + 4;	// set offset for serialization
  
             beginSr1Length400 = getStartOffset() + 6;	// set offset for serialization
  
             beginVardataLnth400 = getStartOffset() + 8;	// set offset for serialization
  
             beginIsoOffset400 = getStartOffset() + 10;	// set offset for serialization
  
             beginX9aOffset400 = getStartOffset() + 12;	// set offset for serialization
  
             beginEitOffset400 = getStartOffset() + 14;	// set offset for serialization
  
             beginEsHdrLen400 = getStartOffset() + 16;	// set offset for serialization
  
             beginSiHdrLen400 = getStartOffset() + 20;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIteration400Counter = -1;
         public boolean isIteration400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIteration400Counter != sharedCounter;
            localIteration400Counter = sharedCounter; return hasModified; 
         }
   protected static final int ITERATION_400_LEN = 2;
  	/**
	 * serializeIteration400
	 */
	protected void serializeIteration400(short iteration400) {
           replaceValue( //  save the value as string
                   getBinaryString( iteration400,ITERATION_400_LEN)
                  ,beginIteration400
                  ,ITERATION_400_LEN
                 );
            localIteration400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIteration400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIteration400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIteration400() {	 
			return (getShort(beginIteration400));
   	}
         int localSub400Counter = -1;
         public boolean isSub400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub400Counter != sharedCounter;
            localSub400Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_400_LEN = 2;
  	/**
	 * serializeSub400
	 */
	protected void serializeSub400(short sub400) {
           replaceValue( //  save the value as string
                   getBinaryString( sub400,SUB_400_LEN)
                  ,beginSub400
                  ,SUB_400_LEN
                 );
            localSub400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSub400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSub400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSub400() {	 
			return (getShort(beginSub400));
   	}
         int localSrSub400Counter = -1;
         public boolean isSrSub400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSrSub400Counter != sharedCounter;
            localSrSub400Counter = sharedCounter; return hasModified; 
         }
   protected static final int SR_SUB_400_LEN = 2;
  	/**
	 * serializeSrSub400
	 */
	protected void serializeSrSub400(short srSub400) {
           replaceValue( //  save the value as string
                   getBinaryString( srSub400,SR_SUB_400_LEN)
                  ,beginSrSub400
                  ,SR_SUB_400_LEN
                 );
            localSrSub400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSrSub400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSrSub400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSrSub400() {	 
			return (getShort(beginSrSub400));
   	}
         int localSr1Length400Counter = -1;
         public boolean isSr1Length400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSr1Length400Counter != sharedCounter;
            localSr1Length400Counter = sharedCounter; return hasModified; 
         }
   protected static final int SR_1_LENGTH_400_LEN = 2;
  	/**
	 * serializeSr1Length400
	 */
	protected void serializeSr1Length400(short sr1Length400) {
           replaceValue( //  save the value as string
                   getBinaryString( sr1Length400,SR_1_LENGTH_400_LEN)
                  ,beginSr1Length400
                  ,SR_1_LENGTH_400_LEN
                 );
            localSr1Length400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSr1Length400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSr1Length400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSr1Length400() {	 
			return (getShort(beginSr1Length400));
   	}
         int localVardataLnth400Counter = -1;
         public boolean isVardataLnth400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVardataLnth400Counter != sharedCounter;
            localVardataLnth400Counter = sharedCounter; return hasModified; 
         }
   protected static final int VARDATA_LNTH_400_LEN = 2;
  	/**
	 * serializeVardataLnth400
	 */
	protected void serializeVardataLnth400(short vardataLnth400) {
           replaceValue( //  save the value as string
                   getBinaryString( vardataLnth400,VARDATA_LNTH_400_LEN)
                  ,beginVardataLnth400
                  ,VARDATA_LNTH_400_LEN
                 );
            localVardataLnth400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkVardataLnth400MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshVardataLnth400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshVardataLnth400() {	 
			return (getShort(beginVardataLnth400));
   	}
         int localIsoOffset400Counter = -1;
         public boolean isIsoOffset400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIsoOffset400Counter != sharedCounter;
            localIsoOffset400Counter = sharedCounter; return hasModified; 
         }
   protected static final int ISO_OFFSET_400_LEN = 2;
  	/**
	 * serializeIsoOffset400
	 */
	protected void serializeIsoOffset400(int isoOffset400) {
           replaceValue( //  save the value as string
                   getBinaryString( isoOffset400,ISO_OFFSET_400_LEN)
                  ,beginIsoOffset400
                  ,ISO_OFFSET_400_LEN
                 );
            localIsoOffset400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIsoOffset400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIsoOffset400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIsoOffset400() {	 
			return (getUnsignedShort(beginIsoOffset400));
   	}
         int localX9aOffset400Counter = -1;
         public boolean isX9aOffset400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localX9aOffset400Counter != sharedCounter;
            localX9aOffset400Counter = sharedCounter; return hasModified; 
         }
   protected static final int X_9A_OFFSET_400_LEN = 2;
  	/**
	 * serializeX9aOffset400
	 */
	protected void serializeX9aOffset400(int x9aOffset400) {
           replaceValue( //  save the value as string
                   getBinaryString( x9aOffset400,X_9A_OFFSET_400_LEN)
                  ,beginX9aOffset400
                  ,X_9A_OFFSET_400_LEN
                 );
            localX9aOffset400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkX9aOffset400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshX9aOffset400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX9aOffset400() {	 
			return (getUnsignedShort(beginX9aOffset400));
   	}
         int localEitOffset400Counter = -1;
         public boolean isEitOffset400Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localEitOffset400Counter != sharedCounter;
            localEitOffset400Counter = sharedCounter; return hasModified; 
         }
   protected static final int EIT_OFFSET_400_LEN = 2;
  	/**
	 * serializeEitOffset400
	 */
	protected void serializeEitOffset400(int eitOffset400) {
           replaceValue( //  save the value as string
                   getBinaryString( eitOffset400,EIT_OFFSET_400_LEN)
                  ,beginEitOffset400
                  ,EIT_OFFSET_400_LEN
                 );
            localEitOffset400Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkEitOffset400MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshEitOffset400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEitOffset400() {	 
			return (getUnsignedShort(beginEitOffset400));
   	}
     int localEsHdrLen400Counter = -1;
     public boolean isEsHdrLen400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEsHdrLen400Counter != sharedCounter;
         localEsHdrLen400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of esHdrLen400
	 *	@return esHdrLen400
	 */
	public char[]  getEsHdrLen400String() {
	     return getCharArray(beginEsHdrLen400,ES_HDR_LEN_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean esHdrLen400IsNumeric() {
	    return isNumeric(beginEsHdrLen400
	                    ,beginEsHdrLen400 + ES_HDR_LEN_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ES_HDR_LEN_400_LEN = 4;
  	/**
	 * serializeEsHdrLen400
	 */
	protected void serializeEsHdrLen400(int esHdrLen400) {
		 putNumber(beginEsHdrLen400,esHdrLen400,ES_HDR_LEN_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localEsHdrLen400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeEsHdrLen400
	 */
   	protected  int serializeEsHdrLen400(char[] value) {
	    int  esHdrLen400;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    esHdrLen400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginEsHdrLen400
		       ,4
		      );
		 localEsHdrLen400Counter = shareString.getSerializedField().getModifiedCounter();
		return  esHdrLen400;
    }

   protected int checkEsHdrLen400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshEsHdrLen400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshEsHdrLen400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginEsHdrLen400
			                 ,ES_HDR_LEN_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("esHdrLen400", beginEsHdrLen400,ES_HDR_LEN_400_LEN);
    }
   	}
     int localSiHdrLen400Counter = -1;
     public boolean isSiHdrLen400Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSiHdrLen400Counter != sharedCounter;
         localSiHdrLen400Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of siHdrLen400
	 *	@return siHdrLen400
	 */
	public char[]  getSiHdrLen400String() {
	     return getCharArray(beginSiHdrLen400,SI_HDR_LEN_400_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean siHdrLen400IsNumeric() {
	    return isNumeric(beginSiHdrLen400
	                    ,beginSiHdrLen400 + SI_HDR_LEN_400_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SI_HDR_LEN_400_LEN = 4;
  	/**
	 * serializeSiHdrLen400
	 */
	protected void serializeSiHdrLen400(int siHdrLen400) {
		 putNumber(beginSiHdrLen400,siHdrLen400,SI_HDR_LEN_400_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSiHdrLen400Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSiHdrLen400
	 */
   	protected  int serializeSiHdrLen400(char[] value) {
	    int  siHdrLen400;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    siHdrLen400 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSiHdrLen400
		       ,4
		      );
		 localSiHdrLen400Counter = shareString.getSerializedField().getModifiedCounter();
		return  siHdrLen400;
    }

   protected int checkSiHdrLen400MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSiHdrLen400 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSiHdrLen400() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSiHdrLen400
			                 ,SI_HDR_LEN_400_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("siHdrLen400", beginSiHdrLen400,SI_HDR_LEN_400_LEN);
    }
   	}




}
  
