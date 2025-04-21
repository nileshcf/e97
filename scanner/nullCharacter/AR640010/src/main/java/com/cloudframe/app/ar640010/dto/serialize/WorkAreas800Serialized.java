package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class WorkAreas800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkAreas800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkAreas800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_AREAS_800_LENGTH = 1448;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIdx800;
            protected  int beginSpaceCnt800;
            protected  int beginWrdLength800;
            protected  int beginTempTxt800;
            protected  int beginSub1800;
            protected  int beginSub2800;
            protected  int beginSub3800;
            protected  int beginSub4800;
            protected  int beginSub5800;
            protected  int beginParmCnt1800;
            protected  int beginParmCnt2800;
            protected  int beginParmText800;
            protected  int beginParmText1800;
            protected  int beginParmText2800;
            protected  int beginParmNum800;
            protected  int beginParmNum1800;
            protected  int beginParmNum2800;
            protected  int beginSub800;
            protected  int beginJan1stDate800;
            protected  int beginFileDsnFull800;
            protected  int beginPgmJulDay800;
            protected  int beginListDsn800;
            protected  int beginNumericWrk1800;
            protected  int beginNumericPos1800;
            protected  int beginNumericWrk2800;
            protected  int beginNumericPos2800;
            protected  int beginSqlcodeDisplay800;
	
	/**
	* Constructor for WorkAreas800Serialized
	**/
    public WorkAreas800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkAreas800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_AREAS_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIdx800 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginSpaceCnt800 = getStartOffset() + 6;	// set offset for serialization
  
             beginWrdLength800 = getStartOffset() + 8;	// set offset for serialization
  
             beginTempTxt800 = getStartOffset() + 10;	// set offset for serialization
  
             beginSub1800 = getStartOffset() + 138;	// set offset for serialization
  
             beginSub2800 = getStartOffset() + 140;	// set offset for serialization
  
             beginSub3800 = getStartOffset() + 142;	// set offset for serialization
  
             beginSub4800 = getStartOffset() + 144;	// set offset for serialization
  
             beginSub5800 = getStartOffset() + 146;	// set offset for serialization
  
             beginParmCnt1800 = getStartOffset() + 148;	// set offset for serialization
  
             beginParmCnt2800 = getStartOffset() + 150;	// set offset for serialization
  
             beginParmText800 = getStartOffset() + 152;	// set offset for serialization
  
             beginParmText1800 = getStartOffset() + 1176;	// set offset for serialization
  
             beginParmText2800 = getStartOffset() + 1191;	// set offset for serialization
  
             beginParmNum800 = getStartOffset() + 1201;	// set offset for serialization
  
             beginParmNum1800 = getStartOffset() + 1211;	// set offset for serialization
  
             beginParmNum2800 = getStartOffset() + 1221;	// set offset for serialization
  
             beginSub800 = getStartOffset() + 1231;	// set offset for serialization
  
  
             beginJan1stDate800 = getStartOffset() + 1256;	// set offset for serialization
  
             beginFileDsnFull800 = getStartOffset() + 1264;	// set offset for serialization
  
  
             beginPgmJulDay800 = getStartOffset() + 1344;	// set offset for serialization
  
             beginListDsn800 = getStartOffset() + 1347;	// set offset for serialization
  
  
             beginNumericWrk1800 = getStartOffset() + 1409;	// set offset for serialization
  
             beginNumericPos1800 = getStartOffset() + 1422;	// set offset for serialization
  
             beginNumericWrk2800 = getStartOffset() + 1424;	// set offset for serialization
  
             beginNumericPos2800 = getStartOffset() + 1437;	// set offset for serialization
  
             beginSqlcodeDisplay800 = getStartOffset() + 1439;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIdx800Counter = -1;
         public boolean isIdx800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIdx800Counter != sharedCounter;
            localIdx800Counter = sharedCounter; return hasModified; 
         }
   protected static final int IDX_800_LEN = 2;
  	/**
	 * serializeIdx800
	 */
	protected void serializeIdx800(short idx800) {
           replaceValue( //  save the value as string
                   getBinaryString( idx800,IDX_800_LEN)
                  ,beginIdx800
                  ,IDX_800_LEN
                 );
            localIdx800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIdx800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIdx800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIdx800() {	 
			return (getShort(beginIdx800));
   	}
         int localSpaceCnt800Counter = -1;
         public boolean isSpaceCnt800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSpaceCnt800Counter != sharedCounter;
            localSpaceCnt800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SPACE_CNT_800_LEN = 2;
  	/**
	 * serializeSpaceCnt800
	 */
	protected void serializeSpaceCnt800(short spaceCnt800) {
           replaceValue( //  save the value as string
                   getBinaryString( spaceCnt800,SPACE_CNT_800_LEN)
                  ,beginSpaceCnt800
                  ,SPACE_CNT_800_LEN
                 );
            localSpaceCnt800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSpaceCnt800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSpaceCnt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSpaceCnt800() {	 
			return (getShort(beginSpaceCnt800));
   	}
         int localWrdLength800Counter = -1;
         public boolean isWrdLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localWrdLength800Counter != sharedCounter;
            localWrdLength800Counter = sharedCounter; return hasModified; 
         }
   protected static final int WRD_LENGTH_800_LEN = 2;
  	/**
	 * serializeWrdLength800
	 */
	protected void serializeWrdLength800(short wrdLength800) {
           replaceValue( //  save the value as string
                   getBinaryString( wrdLength800,WRD_LENGTH_800_LEN)
                  ,beginWrdLength800
                  ,WRD_LENGTH_800_LEN
                 );
            localWrdLength800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkWrdLength800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshWrdLength800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshWrdLength800() {	 
			return (getShort(beginWrdLength800));
   	}
     int localTempTxt800Counter = -1;
     public boolean isTempTxt800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTempTxt800Counter != sharedCounter;
         localTempTxt800Counter = sharedCounter; return hasModified;
     }
	protected static final int TEMP_TXT_800_LEN = 128;
	/**
	 * 	serialize this TempTxt800
	 */
   protected void serializeTempTxt800(char[] tempTxt800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tempTxt800,0,getStringValue(),beginTempTxt800,TEMP_TXT_800_LEN);
       localTempTxt800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTempTxt800Constraints(char[] value) {
   			return super.checkConstraints(value , 128 ,false, false);
   }
    /**
	 *	refreshTempTxt800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTempTxt800() {	 
   		return (substring(getStringValue(),beginTempTxt800,beginTempTxt800 + TEMP_TXT_800_LEN));
   	}
         int localSub1800Counter = -1;
         public boolean isSub1800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub1800Counter != sharedCounter;
            localSub1800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_1800_LEN = 2;
  	/**
	 * serializeSub1800
	 */
	protected void serializeSub1800(short sub1800) {
           replaceValue( //  save the value as string
                   getBinaryString( sub1800,SUB_1800_LEN)
                  ,beginSub1800
                  ,SUB_1800_LEN
                 );
            localSub1800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSub1800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSub1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSub1800() {	 
			return (getShort(beginSub1800));
   	}
         int localSub2800Counter = -1;
         public boolean isSub2800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub2800Counter != sharedCounter;
            localSub2800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_2800_LEN = 2;
  	/**
	 * serializeSub2800
	 */
	protected void serializeSub2800(short sub2800) {
           replaceValue( //  save the value as string
                   getBinaryString( sub2800,SUB_2800_LEN)
                  ,beginSub2800
                  ,SUB_2800_LEN
                 );
            localSub2800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSub2800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSub2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSub2800() {	 
			return (getShort(beginSub2800));
   	}
         int localSub3800Counter = -1;
         public boolean isSub3800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub3800Counter != sharedCounter;
            localSub3800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_3800_LEN = 2;
  	/**
	 * serializeSub3800
	 */
	protected void serializeSub3800(short sub3800) {
           replaceValue( //  save the value as string
                   getBinaryString( sub3800,SUB_3800_LEN)
                  ,beginSub3800
                  ,SUB_3800_LEN
                 );
            localSub3800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSub3800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSub3800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSub3800() {	 
			return (getShort(beginSub3800));
   	}
         int localSub4800Counter = -1;
         public boolean isSub4800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub4800Counter != sharedCounter;
            localSub4800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_4800_LEN = 2;
  	/**
	 * serializeSub4800
	 */
	protected void serializeSub4800(short sub4800) {
           replaceValue( //  save the value as string
                   getBinaryString( sub4800,SUB_4800_LEN)
                  ,beginSub4800
                  ,SUB_4800_LEN
                 );
            localSub4800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSub4800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSub4800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSub4800() {	 
			return (getShort(beginSub4800));
   	}
         int localSub5800Counter = -1;
         public boolean isSub5800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub5800Counter != sharedCounter;
            localSub5800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_5800_LEN = 2;
  	/**
	 * serializeSub5800
	 */
	protected void serializeSub5800(short sub5800) {
           replaceValue( //  save the value as string
                   getBinaryString( sub5800,SUB_5800_LEN)
                  ,beginSub5800
                  ,SUB_5800_LEN
                 );
            localSub5800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSub5800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSub5800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSub5800() {	 
			return (getShort(beginSub5800));
   	}
         int localParmCnt1800Counter = -1;
         public boolean isParmCnt1800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmCnt1800Counter != sharedCounter;
            localParmCnt1800Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_CNT_1800_LEN = 2;
  	/**
	 * serializeParmCnt1800
	 */
	protected void serializeParmCnt1800(short parmCnt1800) {
           replaceValue( //  save the value as string
                   getBinaryString( parmCnt1800,PARM_CNT_1800_LEN)
                  ,beginParmCnt1800
                  ,PARM_CNT_1800_LEN
                 );
            localParmCnt1800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmCnt1800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmCnt1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmCnt1800() {	 
			return (getShort(beginParmCnt1800));
   	}
         int localParmCnt2800Counter = -1;
         public boolean isParmCnt2800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmCnt2800Counter != sharedCounter;
            localParmCnt2800Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_CNT_2800_LEN = 2;
  	/**
	 * serializeParmCnt2800
	 */
	protected void serializeParmCnt2800(short parmCnt2800) {
           replaceValue( //  save the value as string
                   getBinaryString( parmCnt2800,PARM_CNT_2800_LEN)
                  ,beginParmCnt2800
                  ,PARM_CNT_2800_LEN
                 );
            localParmCnt2800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmCnt2800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmCnt2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmCnt2800() {	 
			return (getShort(beginParmCnt2800));
   	}
     int localParmText800Counter = -1;
     public boolean isParmText800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmText800Counter != sharedCounter;
         localParmText800Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_TEXT_800_LEN = 1024;
	/**
	 * 	serialize this ParmText800
	 */
   protected void serializeParmText800(char[] parmText800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmText800,0,getStringValue(),beginParmText800,PARM_TEXT_800_LEN);
       localParmText800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmText800Constraints(char[] value) {
   			return super.checkConstraints(value , 1024 ,false, false);
   }
    /**
	 *	refreshParmText800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmText800() {	 
   		return (substring(getStringValue(),beginParmText800,beginParmText800 + PARM_TEXT_800_LEN));
   	}
     int localParmText1800Counter = -1;
     public boolean isParmText1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmText1800Counter != sharedCounter;
         localParmText1800Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_TEXT_1800_LEN = 15;
	/**
	 * 	serialize this ParmText1800
	 */
   protected void serializeParmText1800(char[] parmText1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmText1800,0,getStringValue(),beginParmText1800,PARM_TEXT_1800_LEN);
       localParmText1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmText1800Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshParmText1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmText1800() {	 
   		return (substring(getStringValue(),beginParmText1800,beginParmText1800 + PARM_TEXT_1800_LEN));
   	}
     int localParmText2800Counter = -1;
     public boolean isParmText2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmText2800Counter != sharedCounter;
         localParmText2800Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_TEXT_2800_LEN = 10;
	/**
	 * 	serialize this ParmText2800
	 */
   protected void serializeParmText2800(char[] parmText2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmText2800,0,getStringValue(),beginParmText2800,PARM_TEXT_2800_LEN);
       localParmText2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmText2800Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshParmText2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmText2800() {	 
   		return (substring(getStringValue(),beginParmText2800,beginParmText2800 + PARM_TEXT_2800_LEN));
   	}
     int localParmNum800Counter = -1;
     public boolean isParmNum800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmNum800Counter != sharedCounter;
         localParmNum800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of parmNum800
	 *	@return parmNum800
	 */
	public char[]  getParmNum800String() {
	     return getCharArray(beginParmNum800,PARM_NUM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmNum800IsNumeric() {
	    return isNumeric(beginParmNum800
	                    ,beginParmNum800 + PARM_NUM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PARM_NUM_800_LEN = 10;
  	/**
	 * serializeParmNum800
	 */
	protected void serializeParmNum800(long parmNum800) {
		 putNumber(beginParmNum800,parmNum800,PARM_NUM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localParmNum800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeParmNum800
	 */
   	protected  long serializeParmNum800(char[] value) {
	    long  parmNum800;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    parmNum800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginParmNum800
		       ,10
		      );
		 localParmNum800Counter = shareString.getSerializedField().getModifiedCounter();
		return  parmNum800;
    }

   protected long checkParmNum800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshParmNum800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshParmNum800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginParmNum800
			                 ,PARM_NUM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("parmNum800", beginParmNum800,PARM_NUM_800_LEN);
    }
   	}
     int localParmNum1800Counter = -1;
     public boolean isParmNum1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmNum1800Counter != sharedCounter;
         localParmNum1800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of parmNum1800
	 *	@return parmNum1800
	 */
	public char[]  getParmNum1800String() {
	     return getCharArray(beginParmNum1800,PARM_NUM_1800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmNum1800IsNumeric() {
	    return isNumeric(beginParmNum1800
	                    ,beginParmNum1800 + PARM_NUM_1800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PARM_NUM_1800_LEN = 10;
  	/**
	 * serializeParmNum1800
	 */
	protected void serializeParmNum1800(long parmNum1800) {
		 putNumber(beginParmNum1800,parmNum1800,PARM_NUM_1800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localParmNum1800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeParmNum1800
	 */
   	protected  long serializeParmNum1800(char[] value) {
	    long  parmNum1800;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    parmNum1800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginParmNum1800
		       ,10
		      );
		 localParmNum1800Counter = shareString.getSerializedField().getModifiedCounter();
		return  parmNum1800;
    }

   protected long checkParmNum1800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshParmNum1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshParmNum1800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginParmNum1800
			                 ,PARM_NUM_1800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("parmNum1800", beginParmNum1800,PARM_NUM_1800_LEN);
    }
   	}
     int localParmNum2800Counter = -1;
     public boolean isParmNum2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmNum2800Counter != sharedCounter;
         localParmNum2800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of parmNum2800
	 *	@return parmNum2800
	 */
	public char[]  getParmNum2800String() {
	     return getCharArray(beginParmNum2800,PARM_NUM_2800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean parmNum2800IsNumeric() {
	    return isNumeric(beginParmNum2800
	                    ,beginParmNum2800 + PARM_NUM_2800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PARM_NUM_2800_LEN = 10;
  	/**
	 * serializeParmNum2800
	 */
	protected void serializeParmNum2800(long parmNum2800) {
		 putNumber(beginParmNum2800,parmNum2800,PARM_NUM_2800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localParmNum2800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeParmNum2800
	 */
   	protected  long serializeParmNum2800(char[] value) {
	    long  parmNum2800;
	    if(value.length >0 && value.length!= 10)
            value = new String(value).trim().toCharArray();
	    if (value.length < 10) value = pad(10, value, ' ', LEFT_PAD);
	    else if (value.length > 10) value = substring(value,0,10);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    parmNum2800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginParmNum2800
		       ,10
		      );
		 localParmNum2800Counter = shareString.getSerializedField().getModifiedCounter();
		return  parmNum2800;
    }

   protected long checkParmNum2800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_10G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshParmNum2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshParmNum2800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginParmNum2800
			                 ,PARM_NUM_2800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("parmNum2800", beginParmNum2800,PARM_NUM_2800_LEN);
    }
   	}
         int localSub800Counter = -1;
         public boolean isSub800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSub800Counter != sharedCounter;
            localSub800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUB_800_LEN = 4;
  	/**
	 * serializeSub800
	 */
	protected void serializeSub800(int sub800) {
           replaceValue( //  save the value as string
                   getBinaryString( sub800,SUB_800_LEN)
                  ,beginSub800
                  ,SUB_800_LEN
                 );
            localSub800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSub800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSub800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSub800() {	 
			return (getInt(beginSub800));
   	}
     int localJan1stDate800Counter = -1;
     public boolean isJan1stDate800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localJan1stDate800Counter != sharedCounter;
         localJan1stDate800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of jan1stDate800
	 *	@return jan1stDate800
	 */
	public char[]  getJan1stDate800String() {
	     return getCharArray(beginJan1stDate800,JAN_1ST_DATE_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean jan1stDate800IsNumeric() {
	    return isNumeric(beginJan1stDate800
	                    ,beginJan1stDate800 + JAN_1ST_DATE_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int JAN_1ST_DATE_800_LEN = 8;
  	/**
	 * serializeJan1stDate800
	 */
	protected void serializeJan1stDate800(long jan1stDate800) {
		 putNumber(beginJan1stDate800,jan1stDate800,JAN_1ST_DATE_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localJan1stDate800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeJan1stDate800
	 */
   	protected  long serializeJan1stDate800(char[] value) {
	    long  jan1stDate800;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    jan1stDate800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginJan1stDate800
		       ,8
		      );
		 localJan1stDate800Counter = shareString.getSerializedField().getModifiedCounter();
		return  jan1stDate800;
    }

   protected long checkJan1stDate800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshJan1stDate800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshJan1stDate800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginJan1stDate800
			                 ,JAN_1ST_DATE_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("jan1stDate800", beginJan1stDate800,JAN_1ST_DATE_800_LEN);
    }
   	}
     int localFileDsnFull800Counter = -1;
     public boolean isFileDsnFull800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileDsnFull800Counter != sharedCounter;
         localFileDsnFull800Counter = sharedCounter; return hasModified;
     }
	protected static final int FILE_DSN_FULL_800_LEN = 54;
	/**
	 * 	serialize this FileDsnFull800
	 */
   protected void serializeFileDsnFull800(char[] fileDsnFull800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fileDsnFull800,0,getStringValue(),beginFileDsnFull800,FILE_DSN_FULL_800_LEN);
       localFileDsnFull800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFileDsnFull800Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshFileDsnFull800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFileDsnFull800() {	 
   		return (substring(getStringValue(),beginFileDsnFull800,beginFileDsnFull800 + FILE_DSN_FULL_800_LEN));
   	}
     int localPgmJulDay800Counter = -1;
     public boolean isPgmJulDay800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmJulDay800Counter != sharedCounter;
         localPgmJulDay800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pgmJulDay800
	 *	@return pgmJulDay800
	 */
	public char[]  getPgmJulDay800String() {
	     return getCharArray(beginPgmJulDay800,PGM_JUL_DAY_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pgmJulDay800IsNumeric() {
	    return isNumeric(beginPgmJulDay800
	                    ,beginPgmJulDay800 + PGM_JUL_DAY_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PGM_JUL_DAY_800_LEN = 3;
  	/**
	 * serializePgmJulDay800
	 */
	protected void serializePgmJulDay800(int pgmJulDay800) {
		 putNumber(beginPgmJulDay800,pgmJulDay800,PGM_JUL_DAY_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPgmJulDay800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePgmJulDay800
	 */
   	protected  int serializePgmJulDay800(char[] value) {
	    int  pgmJulDay800;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pgmJulDay800 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginPgmJulDay800
		       ,3
		      );
		 localPgmJulDay800Counter = shareString.getSerializedField().getModifiedCounter();
		return  pgmJulDay800;
    }

   protected int checkPgmJulDay800MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPgmJulDay800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPgmJulDay800() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPgmJulDay800
			                 ,PGM_JUL_DAY_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pgmJulDay800", beginPgmJulDay800,PGM_JUL_DAY_800_LEN);
    }
   	}
     int localListDsn800Counter = -1;
     public boolean isListDsn800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localListDsn800Counter != sharedCounter;
         localListDsn800Counter = sharedCounter; return hasModified;
     }
	protected static final int LIST_DSN_800_LEN = 54;
	/**
	 * 	serialize this ListDsn800
	 */
   protected void serializeListDsn800(char[] listDsn800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(listDsn800,0,getStringValue(),beginListDsn800,LIST_DSN_800_LEN);
       localListDsn800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkListDsn800Constraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshListDsn800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshListDsn800() {	 
   		return (substring(getStringValue(),beginListDsn800,beginListDsn800 + LIST_DSN_800_LEN));
   	}
     int localNumericWrk1800Counter = -1;
     public boolean isNumericWrk1800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumericWrk1800Counter != sharedCounter;
         localNumericWrk1800Counter = sharedCounter; return hasModified;
     }
	protected static final int NUMERIC_WRK_1800_LEN = 13;
	/**
	 * 	serialize this NumericWrk1800
	 */
   protected void serializeNumericWrk1800(char[] numericWrk1800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(numericWrk1800,0,getStringValue(),beginNumericWrk1800,NUMERIC_WRK_1800_LEN);
       localNumericWrk1800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNumericWrk1800Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshNumericWrk1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNumericWrk1800() {	 
   		return (substring(getStringValue(),beginNumericWrk1800,beginNumericWrk1800 + NUMERIC_WRK_1800_LEN));
   	}
         int localNumericPos1800Counter = -1;
         public boolean isNumericPos1800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNumericPos1800Counter != sharedCounter;
            localNumericPos1800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NUMERIC_POS_1800_LEN = 2;
  	/**
	 * serializeNumericPos1800
	 */
	protected void serializeNumericPos1800(short numericPos1800) {
           replaceValue( //  save the value as string
                   getBinaryString( numericPos1800,NUMERIC_POS_1800_LEN)
                  ,beginNumericPos1800
                  ,NUMERIC_POS_1800_LEN
                 );
            localNumericPos1800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNumericPos1800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNumericPos1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNumericPos1800() {	 
			return (getShort(beginNumericPos1800));
   	}
     int localNumericWrk2800Counter = -1;
     public boolean isNumericWrk2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumericWrk2800Counter != sharedCounter;
         localNumericWrk2800Counter = sharedCounter; return hasModified;
     }
	protected static final int NUMERIC_WRK_2800_LEN = 13;
	/**
	 * 	serialize this NumericWrk2800
	 */
   protected void serializeNumericWrk2800(char[] numericWrk2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(numericWrk2800,0,getStringValue(),beginNumericWrk2800,NUMERIC_WRK_2800_LEN);
       localNumericWrk2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNumericWrk2800Constraints(char[] value) {
   			return super.checkConstraints(value , 13 ,false, false);
   }
    /**
	 *	refreshNumericWrk2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNumericWrk2800() {	 
   		return (substring(getStringValue(),beginNumericWrk2800,beginNumericWrk2800 + NUMERIC_WRK_2800_LEN));
   	}
         int localNumericPos2800Counter = -1;
         public boolean isNumericPos2800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNumericPos2800Counter != sharedCounter;
            localNumericPos2800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NUMERIC_POS_2800_LEN = 2;
  	/**
	 * serializeNumericPos2800
	 */
	protected void serializeNumericPos2800(short numericPos2800) {
           replaceValue( //  save the value as string
                   getBinaryString( numericPos2800,NUMERIC_POS_2800_LEN)
                  ,beginNumericPos2800
                  ,NUMERIC_POS_2800_LEN
                 );
            localNumericPos2800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNumericPos2800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNumericPos2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNumericPos2800() {	 
			return (getShort(beginNumericPos2800));
   	}
     int localSqlcodeDisplay800Counter = -1;
     public boolean isSqlcodeDisplay800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSqlcodeDisplay800Counter != sharedCounter;
         localSqlcodeDisplay800Counter = sharedCounter; return hasModified;
     }
	protected static final int SQLCODE_DISPLAY_800_LEN = 9;
	/**
	 * 	serialize this SqlcodeDisplay800
	 */
   protected void serializeSqlcodeDisplay800(char[] sqlcodeDisplay800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sqlcodeDisplay800,0,getStringValue(),beginSqlcodeDisplay800,SQLCODE_DISPLAY_800_LEN);
       localSqlcodeDisplay800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSqlcodeDisplay800Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshSqlcodeDisplay800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSqlcodeDisplay800() {	 
   		return (substring(getStringValue(),beginSqlcodeDisplay800,beginSqlcodeDisplay800 + SQLCODE_DISPLAY_800_LEN));
   	}




}
  
