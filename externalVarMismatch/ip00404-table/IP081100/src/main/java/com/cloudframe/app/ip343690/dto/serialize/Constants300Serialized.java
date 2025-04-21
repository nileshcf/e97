package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class Constants300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Constants300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Constants300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CONSTANTS_300_LENGTH = 130;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReturnCode300;
            protected  int beginPgmVersion300;
            protected  int beginPgmIp081110300;
            protected  int beginPgmIp599810300;
            protected  int beginPgmIp280010300;
            protected  int beginPgmIp610010300;
            protected  int beginPgmMcwait300;
            protected  int beginPgmIp996010300;
            protected  int beginThisPgmDb2CollIdBase300;
            protected  int beginValueZero300;
            protected  int beginValue01300;
            protected  int beginValue100300;
            protected  int beginSql100300;
            protected  int beginSql904300;
            protected  int beginSql911300;
            protected  int beginCond0000300;
            protected  int beginValue1300;
            protected  int beginNullValue300;
            protected  int beginValue14300;
            protected  int beginValue19300;
            protected  int beginValue99300;
            protected  int beginErrorValue300;
            protected  int beginValueRetry300;
            protected  int beginSys001OpAbendCode300;
            protected  int beginSys001RdAbendCode300;
            protected  int beginSys001ClAbendCode300;
            protected  int beginFetchPmaAbendCode300;
            protected  int beginOpenTipapmaCursor300;
            protected  int beginCloseTipapmaCursor300;
	
	/**
	* Constructor for Constants300Serialized
	**/
    public Constants300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Constants300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CONSTANTS_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReturnCode300 = getStartOffset() + 0;	// set offset for serialization
  
             beginPgmVersion300 = getStartOffset() + 4;	// set offset for serialization
  
  
             beginPgmIp081110300 = getStartOffset() + 19;	// set offset for serialization
  
             beginPgmIp599810300 = getStartOffset() + 27;	// set offset for serialization
  
             beginPgmIp280010300 = getStartOffset() + 35;	// set offset for serialization
  
             beginPgmIp610010300 = getStartOffset() + 43;	// set offset for serialization
  
             beginPgmMcwait300 = getStartOffset() + 51;	// set offset for serialization
  
             beginPgmIp996010300 = getStartOffset() + 57;	// set offset for serialization
  
             beginThisPgmDb2CollIdBase300 = getStartOffset() + 65;	// set offset for serialization
  
             beginValueZero300 = getStartOffset() + 72;	// set offset for serialization
  
             beginValue01300 = getStartOffset() + 74;	// set offset for serialization
  
             beginValue100300 = getStartOffset() + 76;	// set offset for serialization
  
             beginSql100300 = getStartOffset() + 78;	// set offset for serialization
  
             beginSql904300 = getStartOffset() + 82;	// set offset for serialization
  
             beginSql911300 = getStartOffset() + 86;	// set offset for serialization
  
             beginCond0000300 = getStartOffset() + 90;	// set offset for serialization
  
             beginValue1300 = getStartOffset() + 94;	// set offset for serialization
  
             beginNullValue300 = getStartOffset() + 95;	// set offset for serialization
  
             beginValue14300 = getStartOffset() + 97;	// set offset for serialization
  
             beginValue19300 = getStartOffset() + 99;	// set offset for serialization
  
             beginValue99300 = getStartOffset() + 101;	// set offset for serialization
  
             beginErrorValue300 = getStartOffset() + 103;	// set offset for serialization
  
             beginValueRetry300 = getStartOffset() + 104;	// set offset for serialization
  
             beginSys001OpAbendCode300 = getStartOffset() + 106;	// set offset for serialization
  
             beginSys001RdAbendCode300 = getStartOffset() + 110;	// set offset for serialization
  
             beginSys001ClAbendCode300 = getStartOffset() + 114;	// set offset for serialization
  
             beginFetchPmaAbendCode300 = getStartOffset() + 118;	// set offset for serialization
  
             beginOpenTipapmaCursor300 = getStartOffset() + 122;	// set offset for serialization
  
             beginCloseTipapmaCursor300 = getStartOffset() + 126;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReturnCode300Counter = -1;
     public boolean isReturnCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReturnCode300Counter != sharedCounter;
         localReturnCode300Counter = sharedCounter; return hasModified;
     }
	protected static final int RETURN_CODE_300_LEN = 4;
	/**
	 * 	serialize this ReturnCode300
	 */
   protected void serializeReturnCode300(char[] returnCode300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(returnCode300,0,getStringValue(),beginReturnCode300,RETURN_CODE_300_LEN);
       localReturnCode300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReturnCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshReturnCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReturnCode300() {	 
   		return (substring(getStringValue(),beginReturnCode300,beginReturnCode300 + RETURN_CODE_300_LEN));
   	}
     int localPgmVersion300Counter = -1;
     public boolean isPgmVersion300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmVersion300Counter != sharedCounter;
         localPgmVersion300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_VERSION_300_LEN = 7;
	/**
	 * 	serialize this PgmVersion300
	 */
   protected void serializePgmVersion300(char[] pgmVersion300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmVersion300,0,getStringValue(),beginPgmVersion300,PGM_VERSION_300_LEN);
       localPgmVersion300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmVersion300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshPgmVersion300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmVersion300() {	 
   		return (substring(getStringValue(),beginPgmVersion300,beginPgmVersion300 + PGM_VERSION_300_LEN));
   	}
     int localPgmIp081110300Counter = -1;
     public boolean isPgmIp081110300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp081110300Counter != sharedCounter;
         localPgmIp081110300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_IP_081110300_LEN = 8;
	/**
	 * 	serialize this PgmIp081110300
	 */
   protected void serializePgmIp081110300(char[] pgmIp081110300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmIp081110300,0,getStringValue(),beginPgmIp081110300,PGM_IP_081110300_LEN);
       localPgmIp081110300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmIp081110300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmIp081110300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmIp081110300() {	 
   		return (substring(getStringValue(),beginPgmIp081110300,beginPgmIp081110300 + PGM_IP_081110300_LEN));
   	}
     int localPgmIp599810300Counter = -1;
     public boolean isPgmIp599810300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp599810300Counter != sharedCounter;
         localPgmIp599810300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_IP_599810300_LEN = 8;
	/**
	 * 	serialize this PgmIp599810300
	 */
   protected void serializePgmIp599810300(char[] pgmIp599810300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmIp599810300,0,getStringValue(),beginPgmIp599810300,PGM_IP_599810300_LEN);
       localPgmIp599810300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmIp599810300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmIp599810300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmIp599810300() {	 
   		return (substring(getStringValue(),beginPgmIp599810300,beginPgmIp599810300 + PGM_IP_599810300_LEN));
   	}
     int localPgmIp280010300Counter = -1;
     public boolean isPgmIp280010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp280010300Counter != sharedCounter;
         localPgmIp280010300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_IP_280010300_LEN = 8;
	/**
	 * 	serialize this PgmIp280010300
	 */
   protected void serializePgmIp280010300(char[] pgmIp280010300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmIp280010300,0,getStringValue(),beginPgmIp280010300,PGM_IP_280010300_LEN);
       localPgmIp280010300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmIp280010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmIp280010300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmIp280010300() {	 
   		return (substring(getStringValue(),beginPgmIp280010300,beginPgmIp280010300 + PGM_IP_280010300_LEN));
   	}
     int localPgmIp610010300Counter = -1;
     public boolean isPgmIp610010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp610010300Counter != sharedCounter;
         localPgmIp610010300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_IP_610010300_LEN = 8;
	/**
	 * 	serialize this PgmIp610010300
	 */
   protected void serializePgmIp610010300(char[] pgmIp610010300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmIp610010300,0,getStringValue(),beginPgmIp610010300,PGM_IP_610010300_LEN);
       localPgmIp610010300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmIp610010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmIp610010300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmIp610010300() {	 
   		return (substring(getStringValue(),beginPgmIp610010300,beginPgmIp610010300 + PGM_IP_610010300_LEN));
   	}
     int localPgmMcwait300Counter = -1;
     public boolean isPgmMcwait300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmMcwait300Counter != sharedCounter;
         localPgmMcwait300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_MCWAIT_300_LEN = 6;
	/**
	 * 	serialize this PgmMcwait300
	 */
   protected void serializePgmMcwait300(char[] pgmMcwait300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmMcwait300,0,getStringValue(),beginPgmMcwait300,PGM_MCWAIT_300_LEN);
       localPgmMcwait300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmMcwait300Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshPgmMcwait300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmMcwait300() {	 
   		return (substring(getStringValue(),beginPgmMcwait300,beginPgmMcwait300 + PGM_MCWAIT_300_LEN));
   	}
     int localPgmIp996010300Counter = -1;
     public boolean isPgmIp996010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmIp996010300Counter != sharedCounter;
         localPgmIp996010300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_IP_996010300_LEN = 8;
	/**
	 * 	serialize this PgmIp996010300
	 */
   protected void serializePgmIp996010300(char[] pgmIp996010300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmIp996010300,0,getStringValue(),beginPgmIp996010300,PGM_IP_996010300_LEN);
       localPgmIp996010300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmIp996010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmIp996010300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmIp996010300() {	 
   		return (substring(getStringValue(),beginPgmIp996010300,beginPgmIp996010300 + PGM_IP_996010300_LEN));
   	}
     int localThisPgmDb2CollIdBase300Counter = -1;
     public boolean isThisPgmDb2CollIdBase300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localThisPgmDb2CollIdBase300Counter != sharedCounter;
         localThisPgmDb2CollIdBase300Counter = sharedCounter; return hasModified;
     }
	protected static final int THIS_PGM_DB_2_COLL_ID_BASE_300_LEN = 7;
	/**
	 * 	serialize this ThisPgmDb2CollIdBase300
	 */
   protected void serializeThisPgmDb2CollIdBase300(char[] thisPgmDb2CollIdBase300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(thisPgmDb2CollIdBase300,0,getStringValue(),beginThisPgmDb2CollIdBase300,THIS_PGM_DB_2_COLL_ID_BASE_300_LEN);
       localThisPgmDb2CollIdBase300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkThisPgmDb2CollIdBase300Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshThisPgmDb2CollIdBase300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshThisPgmDb2CollIdBase300() {	 
   		return (substring(getStringValue(),beginThisPgmDb2CollIdBase300,beginThisPgmDb2CollIdBase300 + THIS_PGM_DB_2_COLL_ID_BASE_300_LEN));
   	}
         int localValueZero300Counter = -1;
         public boolean isValueZero300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValueZero300Counter != sharedCounter;
            localValueZero300Counter = sharedCounter; return hasModified; 
         }
   protected static final int VALUE_ZERO_300_LEN = 2;
  	/**
	 * serializeValueZero300
	 */
	protected void serializeValueZero300(short valueZero300) {
           replaceValue( //  save the value as string
                   getBinaryString( valueZero300,VALUE_ZERO_300_LEN)
                  ,beginValueZero300
                  ,VALUE_ZERO_300_LEN
                 );
            localValueZero300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkValueZero300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshValueZero300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValueZero300() {	 
			return (getShort(beginValueZero300));
   	}
         int localValue01300Counter = -1;
         public boolean isValue01300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue01300Counter != sharedCounter;
            localValue01300Counter = sharedCounter; return hasModified; 
         }
   protected static final int VALUE_01300_LEN = 2;
  	/**
	 * serializeValue01300
	 */
	protected void serializeValue01300(short value01300) {
           replaceValue( //  save the value as string
                   getBinaryString( value01300,VALUE_01300_LEN)
                  ,beginValue01300
                  ,VALUE_01300_LEN
                 );
            localValue01300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkValue01300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshValue01300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue01300() {	 
			return (getShort(beginValue01300));
   	}
         int localValue100300Counter = -1;
         public boolean isValue100300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue100300Counter != sharedCounter;
            localValue100300Counter = sharedCounter; return hasModified; 
         }
   protected static final int VALUE_100300_LEN = 2;
  	/**
	 * serializeValue100300
	 */
	protected void serializeValue100300(short value100300) {
           replaceValue( //  save the value as string
                   getBinaryString( value100300,VALUE_100300_LEN)
                  ,beginValue100300
                  ,VALUE_100300_LEN
                 );
            localValue100300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkValue100300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshValue100300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshValue100300() {	 
			return (getShort(beginValue100300));
   	}
         int localSql100300Counter = -1;
         public boolean isSql100300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSql100300Counter != sharedCounter;
            localSql100300Counter = sharedCounter; return hasModified; 
         }
   protected static final int SQL_100300_LEN = 4;
  	/**
	 * serializeSql100300
	 */
	protected void serializeSql100300(int sql100300) {
           replaceValue( //  save the value as string
                   getBinaryString( sql100300,SQL_100300_LEN)
                  ,beginSql100300
                  ,SQL_100300_LEN
                 );
            localSql100300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSql100300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSql100300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSql100300() {	 
			return (getInt(beginSql100300));
   	}
         int localSql904300Counter = -1;
         public boolean isSql904300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSql904300Counter != sharedCounter;
            localSql904300Counter = sharedCounter; return hasModified; 
         }
   protected static final int SQL_904300_LEN = 4;
  	/**
	 * serializeSql904300
	 */
	protected void serializeSql904300(int sql904300) {
           replaceValue( //  save the value as string
                   getBinaryString( sql904300,SQL_904300_LEN)
                  ,beginSql904300
                  ,SQL_904300_LEN
                 );
            localSql904300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSql904300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSql904300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSql904300() {	 
			return (getInt(beginSql904300));
   	}
         int localSql911300Counter = -1;
         public boolean isSql911300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSql911300Counter != sharedCounter;
            localSql911300Counter = sharedCounter; return hasModified; 
         }
   protected static final int SQL_911300_LEN = 4;
  	/**
	 * serializeSql911300
	 */
	protected void serializeSql911300(int sql911300) {
           replaceValue( //  save the value as string
                   getBinaryString( sql911300,SQL_911300_LEN)
                  ,beginSql911300
                  ,SQL_911300_LEN
                 );
            localSql911300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSql911300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSql911300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSql911300() {	 
			return (getInt(beginSql911300));
   	}
     int localCond0000300Counter = -1;
     public boolean isCond0000300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCond0000300Counter != sharedCounter;
         localCond0000300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cond0000300
	 *	@return cond0000300
	 */
	public char[]  getCond0000300String() {
	     return getCharArray(beginCond0000300,COND_0000300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cond0000300IsNumeric() {
	    return isNumeric(beginCond0000300
	                    ,beginCond0000300 + COND_0000300_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COND_0000300_LEN = 4;
  	/**
	 * serializeCond0000300
	 */
	protected void serializeCond0000300(short cond0000300) {
		 putNumber(beginCond0000300,cond0000300,COND_0000300_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCond0000300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCond0000300
	 */
   	protected  short serializeCond0000300(char[] value) {
	    short  cond0000300;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cond0000300 = (short) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,true/*isSigned?*/)
		       ,beginCond0000300
		       ,4
		      );
		 localCond0000300Counter = shareString.getSerializedField().getModifiedCounter();
		return  cond0000300;
    }

   protected short checkCond0000300MaxLimit(long number) {

	   return (short)checkMaxLimit(number , MAX_10K/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshCond0000300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCond0000300() throws CFException {
   	try {	 
			return (
			          getShortNumber(
			                  beginCond0000300
			                 ,COND_0000300_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cond0000300", beginCond0000300,COND_0000300_LEN);
    }
   	}
     int localValue1300Counter = -1;
     public boolean isValue1300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue1300Counter != sharedCounter;
         localValue1300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value1300
	 *	@return value1300
	 */
	public char[]  getValue1300String() {
	     return getCharArray(beginValue1300,VALUE_1300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value1300IsNumeric() {
	    return isNumeric(beginValue1300
	                    ,beginValue1300 + VALUE_1300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_1300_LEN = 1;
  	/**
	 * serializeValue1300
	 */
	protected void serializeValue1300(int value1300) {
		 putNumber(beginValue1300,value1300,VALUE_1300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue1300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue1300
	 */
   	protected  int serializeValue1300(char[] value) {
	    int  value1300;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value1300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginValue1300
		       ,1
		      );
		 localValue1300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value1300;
    }

   protected int checkValue1300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue1300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue1300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue1300
			                 ,VALUE_1300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value1300", beginValue1300,VALUE_1300_LEN);
    }
   	}
         int localNullValue300Counter = -1;
         public boolean isNullValue300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNullValue300Counter != sharedCounter;
            localNullValue300Counter = sharedCounter; return hasModified; 
         }
   protected static final int NULL_VALUE_300_LEN = 2;
  	/**
	 * serializeNullValue300
	 */
	protected void serializeNullValue300(short nullValue300) {
           replaceValue( //  save the value as string
                   getBinaryString( nullValue300,NULL_VALUE_300_LEN)
                  ,beginNullValue300
                  ,NULL_VALUE_300_LEN
                 );
            localNullValue300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNullValue300MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNullValue300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNullValue300() {	 
			return (getShort(beginNullValue300));
   	}
     int localValue14300Counter = -1;
     public boolean isValue14300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue14300Counter != sharedCounter;
         localValue14300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value14300
	 *	@return value14300
	 */
	public char[]  getValue14300String() {
	     return getCharArray(beginValue14300,VALUE_14300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value14300IsNumeric() {
	    return isNumeric(beginValue14300
	                    ,beginValue14300 + VALUE_14300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_14300_LEN = 2;
  	/**
	 * serializeValue14300
	 */
	protected void serializeValue14300(int value14300) {
		 putNumber(beginValue14300,value14300,VALUE_14300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue14300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue14300
	 */
   	protected  int serializeValue14300(char[] value) {
	    int  value14300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value14300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue14300
		       ,2
		      );
		 localValue14300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value14300;
    }

   protected int checkValue14300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue14300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue14300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue14300
			                 ,VALUE_14300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value14300", beginValue14300,VALUE_14300_LEN);
    }
   	}
     int localValue19300Counter = -1;
     public boolean isValue19300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localValue19300Counter != sharedCounter;
         localValue19300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of value19300
	 *	@return value19300
	 */
	public char[]  getValue19300String() {
	     return getCharArray(beginValue19300,VALUE_19300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean value19300IsNumeric() {
	    return isNumeric(beginValue19300
	                    ,beginValue19300 + VALUE_19300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int VALUE_19300_LEN = 2;
  	/**
	 * serializeValue19300
	 */
	protected void serializeValue19300(int value19300) {
		 putNumber(beginValue19300,value19300,VALUE_19300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localValue19300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeValue19300
	 */
   	protected  int serializeValue19300(char[] value) {
	    int  value19300;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    value19300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginValue19300
		       ,2
		      );
		 localValue19300Counter = shareString.getSerializedField().getModifiedCounter();
		return  value19300;
    }

   protected int checkValue19300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshValue19300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue19300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginValue19300
			                 ,VALUE_19300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("value19300", beginValue19300,VALUE_19300_LEN);
    }
   	}
         int localValue99300Counter = -1;
         public boolean isValue99300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValue99300Counter != sharedCounter;
            localValue99300Counter = sharedCounter; return hasModified; 
         }
   protected static final int VALUE_99300_LEN = 2;
  	/**
	 * serializeValue99300
	 */
	protected void serializeValue99300(int value99300) {
           replaceValue( //  save the value as string
                   getBinaryString( value99300,VALUE_99300_LEN)
                  ,beginValue99300
                  ,VALUE_99300_LEN
                 );
            localValue99300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkValue99300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshValue99300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValue99300() {	 
			return (getUnsignedShort(beginValue99300));
   	}
     int localErrorValue300Counter = -1;
     public boolean isErrorValue300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorValue300Counter != sharedCounter;
         localErrorValue300Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_VALUE_300_LEN = 1;
	/**
	 * 	serialize this ErrorValue300
	 */
   protected void serializeErrorValue300(char[] errorValue300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorValue300,0,getStringValue(),beginErrorValue300,ERROR_VALUE_300_LEN);
       localErrorValue300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorValue300Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshErrorValue300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorValue300() {	 
   		return (substring(getStringValue(),beginErrorValue300,beginErrorValue300 + ERROR_VALUE_300_LEN));
   	}
         int localValueRetry300Counter = -1;
         public boolean isValueRetry300Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localValueRetry300Counter != sharedCounter;
            localValueRetry300Counter = sharedCounter; return hasModified; 
         }
   protected static final int VALUE_RETRY_300_LEN = 2;
  	/**
	 * serializeValueRetry300
	 */
	protected void serializeValueRetry300(int valueRetry300) {
           replaceValue( //  save the value as string
                   getBinaryString( valueRetry300,VALUE_RETRY_300_LEN)
                  ,beginValueRetry300
                  ,VALUE_RETRY_300_LEN
                 );
            localValueRetry300Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkValueRetry300MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshValueRetry300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshValueRetry300() {	 
			return (getUnsignedShort(beginValueRetry300));
   	}
     int localSys001OpAbendCode300Counter = -1;
     public boolean isSys001OpAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001OpAbendCode300Counter != sharedCounter;
         localSys001OpAbendCode300Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_OP_ABEND_CODE_300_LEN = 4;
	/**
	 * 	serialize this Sys001OpAbendCode300
	 */
   protected void serializeSys001OpAbendCode300(char[] sys001OpAbendCode300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001OpAbendCode300,0,getStringValue(),beginSys001OpAbendCode300,SYS_001_OP_ABEND_CODE_300_LEN);
       localSys001OpAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001OpAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSys001OpAbendCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001OpAbendCode300() {	 
   		return (substring(getStringValue(),beginSys001OpAbendCode300,beginSys001OpAbendCode300 + SYS_001_OP_ABEND_CODE_300_LEN));
   	}
     int localSys001RdAbendCode300Counter = -1;
     public boolean isSys001RdAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001RdAbendCode300Counter != sharedCounter;
         localSys001RdAbendCode300Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_RD_ABEND_CODE_300_LEN = 4;
	/**
	 * 	serialize this Sys001RdAbendCode300
	 */
   protected void serializeSys001RdAbendCode300(char[] sys001RdAbendCode300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001RdAbendCode300,0,getStringValue(),beginSys001RdAbendCode300,SYS_001_RD_ABEND_CODE_300_LEN);
       localSys001RdAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001RdAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSys001RdAbendCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001RdAbendCode300() {	 
   		return (substring(getStringValue(),beginSys001RdAbendCode300,beginSys001RdAbendCode300 + SYS_001_RD_ABEND_CODE_300_LEN));
   	}
     int localSys001ClAbendCode300Counter = -1;
     public boolean isSys001ClAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys001ClAbendCode300Counter != sharedCounter;
         localSys001ClAbendCode300Counter = sharedCounter; return hasModified;
     }
	protected static final int SYS_001_CL_ABEND_CODE_300_LEN = 4;
	/**
	 * 	serialize this Sys001ClAbendCode300
	 */
   protected void serializeSys001ClAbendCode300(char[] sys001ClAbendCode300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys001ClAbendCode300,0,getStringValue(),beginSys001ClAbendCode300,SYS_001_CL_ABEND_CODE_300_LEN);
       localSys001ClAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys001ClAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSys001ClAbendCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys001ClAbendCode300() {	 
   		return (substring(getStringValue(),beginSys001ClAbendCode300,beginSys001ClAbendCode300 + SYS_001_CL_ABEND_CODE_300_LEN));
   	}
     int localFetchPmaAbendCode300Counter = -1;
     public boolean isFetchPmaAbendCode300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFetchPmaAbendCode300Counter != sharedCounter;
         localFetchPmaAbendCode300Counter = sharedCounter; return hasModified;
     }
	protected static final int FETCH_PMA_ABEND_CODE_300_LEN = 4;
	/**
	 * 	serialize this FetchPmaAbendCode300
	 */
   protected void serializeFetchPmaAbendCode300(char[] fetchPmaAbendCode300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fetchPmaAbendCode300,0,getStringValue(),beginFetchPmaAbendCode300,FETCH_PMA_ABEND_CODE_300_LEN);
       localFetchPmaAbendCode300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFetchPmaAbendCode300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshFetchPmaAbendCode300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFetchPmaAbendCode300() {	 
   		return (substring(getStringValue(),beginFetchPmaAbendCode300,beginFetchPmaAbendCode300 + FETCH_PMA_ABEND_CODE_300_LEN));
   	}
     int localOpenTipapmaCursor300Counter = -1;
     public boolean isOpenTipapmaCursor300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOpenTipapmaCursor300Counter != sharedCounter;
         localOpenTipapmaCursor300Counter = sharedCounter; return hasModified;
     }
	protected static final int OPEN_TIPAPMA_CURSOR_300_LEN = 4;
	/**
	 * 	serialize this OpenTipapmaCursor300
	 */
   protected void serializeOpenTipapmaCursor300(char[] openTipapmaCursor300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(openTipapmaCursor300,0,getStringValue(),beginOpenTipapmaCursor300,OPEN_TIPAPMA_CURSOR_300_LEN);
       localOpenTipapmaCursor300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOpenTipapmaCursor300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshOpenTipapmaCursor300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOpenTipapmaCursor300() {	 
   		return (substring(getStringValue(),beginOpenTipapmaCursor300,beginOpenTipapmaCursor300 + OPEN_TIPAPMA_CURSOR_300_LEN));
   	}
     int localCloseTipapmaCursor300Counter = -1;
     public boolean isCloseTipapmaCursor300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCloseTipapmaCursor300Counter != sharedCounter;
         localCloseTipapmaCursor300Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOSE_TIPAPMA_CURSOR_300_LEN = 4;
	/**
	 * 	serialize this CloseTipapmaCursor300
	 */
   protected void serializeCloseTipapmaCursor300(char[] closeTipapmaCursor300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(closeTipapmaCursor300,0,getStringValue(),beginCloseTipapmaCursor300,CLOSE_TIPAPMA_CURSOR_300_LEN);
       localCloseTipapmaCursor300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCloseTipapmaCursor300Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCloseTipapmaCursor300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCloseTipapmaCursor300() {	 
   		return (substring(getStringValue(),beginCloseTipapmaCursor300,beginCloseTipapmaCursor300 + CLOSE_TIPAPMA_CURSOR_300_LEN));
   	}




}
  
