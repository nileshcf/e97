package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CharacterLiterals320Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CharacterLiterals320Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CharacterLiterals320Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHARACTER_LITERALS_320_LENGTH = 804;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCharA320;
            protected  int beginCharD320;
            protected  int beginCharE320;
            protected  int beginCharPound320;
            protected  int beginCharF320;
            protected  int beginCharN320;
            protected  int beginCharR320;
            protected  int beginCharY320;
            protected  int beginChar3320;
            protected  int beginPeriod320;
            protected  int beginCommaSpace320;
            protected  int beginTilde320;
            protected  int beginPipe320;
            protected  int beginSemicolon320;
            protected  int beginParenLeft320;
            protected  int beginParenRight320;
            protected  int beginNull320;
            protected  int beginLitNa320;
            protected  int beginPgmAr630010300;
            protected  int beginPgmAr631010300;
            protected  int beginPgmAr630020300;
            protected  int beginAddErrPara320;
            protected  int beginBulkErrPara320;
            protected  int beginListErrPara320;
            protected  int beginSendErrPara320;
            protected  int beginReloadErrPara320;
            protected  int beginInstallErrPara320;
            protected  int beginRetrvErrPara320;
            protected  int beginUnldCompPara320;
            protected  int beginUnldErrPara320;
            protected  int beginRestageErrPara320;
            protected  int beginPreExitErrPara320;
            protected  int beginCapturePara320;
            protected  int beginParmErrPara320;
            protected  int beginApplicationFile320;
            protected  int beginGftFile320;
            protected  int beginRecordFormat320;
            protected  int beginBlockSize320;
            protected  int beginRecordLength320;
            protected  int beginSystemIdentifier320;
            protected  int beginExitDsn320;
            protected  int beginAllocationType320;
            protected  int beginBroadcastEndptQual320;
            protected  int beginBroadcastStatusCounts320;
            protected  int beginBroadcastStatusDashes320;
            protected  int beginBroadcastTargetRecords320;
            protected  int beginBroadcastTargetBytes320;
            protected  int beginBroadcastEndptsValid320;
            protected  int beginBroadcastEndptsErrors320;
	
	/**
	* Constructor for CharacterLiterals320Serialized
	**/
    public CharacterLiterals320Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CharacterLiterals320Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHARACTER_LITERALS_320_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCharA320 = getStartOffset() + 0;	// set offset for serialization
  
             beginCharD320 = getStartOffset() + 1;	// set offset for serialization
  
             beginCharE320 = getStartOffset() + 2;	// set offset for serialization
  
             beginCharPound320 = getStartOffset() + 3;	// set offset for serialization
  
             beginCharF320 = getStartOffset() + 4;	// set offset for serialization
  
             beginCharN320 = getStartOffset() + 5;	// set offset for serialization
  
             beginCharR320 = getStartOffset() + 6;	// set offset for serialization
  
             beginCharY320 = getStartOffset() + 7;	// set offset for serialization
  
             beginChar3320 = getStartOffset() + 8;	// set offset for serialization
  
             beginPeriod320 = getStartOffset() + 9;	// set offset for serialization
  
             beginCommaSpace320 = getStartOffset() + 10;	// set offset for serialization
  
             beginTilde320 = getStartOffset() + 12;	// set offset for serialization
  
             beginPipe320 = getStartOffset() + 13;	// set offset for serialization
  
             beginSemicolon320 = getStartOffset() + 14;	// set offset for serialization
  
             beginParenLeft320 = getStartOffset() + 15;	// set offset for serialization
  
             beginParenRight320 = getStartOffset() + 16;	// set offset for serialization
  
             beginNull320 = getStartOffset() + 17;	// set offset for serialization
  
             beginLitNa320 = getStartOffset() + 24;	// set offset for serialization
  
             beginPgmAr630010300 = getStartOffset() + 27;	// set offset for serialization
  
             beginPgmAr631010300 = getStartOffset() + 35;	// set offset for serialization
  
             beginPgmAr630020300 = getStartOffset() + 43;	// set offset for serialization
  
             beginAddErrPara320 = getStartOffset() + 51;	// set offset for serialization
  
             beginBulkErrPara320 = getStartOffset() + 81;	// set offset for serialization
  
             beginListErrPara320 = getStartOffset() + 111;	// set offset for serialization
  
             beginSendErrPara320 = getStartOffset() + 141;	// set offset for serialization
  
             beginReloadErrPara320 = getStartOffset() + 171;	// set offset for serialization
  
             beginInstallErrPara320 = getStartOffset() + 201;	// set offset for serialization
  
             beginRetrvErrPara320 = getStartOffset() + 231;	// set offset for serialization
  
             beginUnldCompPara320 = getStartOffset() + 261;	// set offset for serialization
  
             beginUnldErrPara320 = getStartOffset() + 291;	// set offset for serialization
  
             beginRestageErrPara320 = getStartOffset() + 321;	// set offset for serialization
  
             beginPreExitErrPara320 = getStartOffset() + 351;	// set offset for serialization
  
             beginCapturePara320 = getStartOffset() + 381;	// set offset for serialization
  
             beginParmErrPara320 = getStartOffset() + 411;	// set offset for serialization
  
  
             beginApplicationFile320 = getStartOffset() + 463;	// set offset for serialization
  
             beginGftFile320 = getStartOffset() + 480;	// set offset for serialization
  
             beginRecordFormat320 = getStartOffset() + 489;	// set offset for serialization
  
             beginBlockSize320 = getStartOffset() + 504;	// set offset for serialization
  
             beginRecordLength320 = getStartOffset() + 516;	// set offset for serialization
  
             beginSystemIdentifier320 = getStartOffset() + 531;	// set offset for serialization
  
             beginExitDsn320 = getStartOffset() + 550;	// set offset for serialization
  
             beginAllocationType320 = getStartOffset() + 572;	// set offset for serialization
  
             beginBroadcastEndptQual320 = getStartOffset() + 594;	// set offset for serialization
  
             beginBroadcastStatusCounts320 = getStartOffset() + 602;	// set offset for serialization
  
             beginBroadcastStatusDashes320 = getStartOffset() + 647;	// set offset for serialization
  
             beginBroadcastTargetRecords320 = getStartOffset() + 692;	// set offset for serialization
  
             beginBroadcastTargetBytes320 = getStartOffset() + 720;	// set offset for serialization
  
             beginBroadcastEndptsValid320 = getStartOffset() + 748;	// set offset for serialization
  
             beginBroadcastEndptsErrors320 = getStartOffset() + 776;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCharA320Counter = -1;
     public boolean isCharA320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharA320Counter != sharedCounter;
         localCharA320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_A_320_LEN = 1;
	/**
	 * 	serialize this CharA320
	 */
   protected void serializeCharA320(char[] charA320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charA320,0,getStringValue(),beginCharA320,CHAR_A_320_LEN);
       localCharA320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharA320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharA320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharA320() {	 
   		return (substring(getStringValue(),beginCharA320,beginCharA320 + CHAR_A_320_LEN));
   	}
     int localCharD320Counter = -1;
     public boolean isCharD320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharD320Counter != sharedCounter;
         localCharD320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_D_320_LEN = 1;
	/**
	 * 	serialize this CharD320
	 */
   protected void serializeCharD320(char[] charD320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charD320,0,getStringValue(),beginCharD320,CHAR_D_320_LEN);
       localCharD320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharD320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharD320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharD320() {	 
   		return (substring(getStringValue(),beginCharD320,beginCharD320 + CHAR_D_320_LEN));
   	}
     int localCharE320Counter = -1;
     public boolean isCharE320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharE320Counter != sharedCounter;
         localCharE320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_E_320_LEN = 1;
	/**
	 * 	serialize this CharE320
	 */
   protected void serializeCharE320(char[] charE320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charE320,0,getStringValue(),beginCharE320,CHAR_E_320_LEN);
       localCharE320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharE320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharE320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharE320() {	 
   		return (substring(getStringValue(),beginCharE320,beginCharE320 + CHAR_E_320_LEN));
   	}
     int localCharPound320Counter = -1;
     public boolean isCharPound320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharPound320Counter != sharedCounter;
         localCharPound320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_POUND_320_LEN = 1;
	/**
	 * 	serialize this CharPound320
	 */
   protected void serializeCharPound320(char[] charPound320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charPound320,0,getStringValue(),beginCharPound320,CHAR_POUND_320_LEN);
       localCharPound320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharPound320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharPound320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharPound320() {	 
   		return (substring(getStringValue(),beginCharPound320,beginCharPound320 + CHAR_POUND_320_LEN));
   	}
     int localCharF320Counter = -1;
     public boolean isCharF320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharF320Counter != sharedCounter;
         localCharF320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_F_320_LEN = 1;
	/**
	 * 	serialize this CharF320
	 */
   protected void serializeCharF320(char[] charF320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charF320,0,getStringValue(),beginCharF320,CHAR_F_320_LEN);
       localCharF320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharF320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharF320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharF320() {	 
   		return (substring(getStringValue(),beginCharF320,beginCharF320 + CHAR_F_320_LEN));
   	}
     int localCharN320Counter = -1;
     public boolean isCharN320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharN320Counter != sharedCounter;
         localCharN320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_N_320_LEN = 1;
	/**
	 * 	serialize this CharN320
	 */
   protected void serializeCharN320(char[] charN320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charN320,0,getStringValue(),beginCharN320,CHAR_N_320_LEN);
       localCharN320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharN320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharN320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharN320() {	 
   		return (substring(getStringValue(),beginCharN320,beginCharN320 + CHAR_N_320_LEN));
   	}
     int localCharR320Counter = -1;
     public boolean isCharR320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharR320Counter != sharedCounter;
         localCharR320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_R_320_LEN = 1;
	/**
	 * 	serialize this CharR320
	 */
   protected void serializeCharR320(char[] charR320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charR320,0,getStringValue(),beginCharR320,CHAR_R_320_LEN);
       localCharR320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharR320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharR320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharR320() {	 
   		return (substring(getStringValue(),beginCharR320,beginCharR320 + CHAR_R_320_LEN));
   	}
     int localCharY320Counter = -1;
     public boolean isCharY320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCharY320Counter != sharedCounter;
         localCharY320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_Y_320_LEN = 1;
	/**
	 * 	serialize this CharY320
	 */
   protected void serializeCharY320(char[] charY320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(charY320,0,getStringValue(),beginCharY320,CHAR_Y_320_LEN);
       localCharY320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCharY320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCharY320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCharY320() {	 
   		return (substring(getStringValue(),beginCharY320,beginCharY320 + CHAR_Y_320_LEN));
   	}
     int localChar3320Counter = -1;
     public boolean isChar3320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localChar3320Counter != sharedCounter;
         localChar3320Counter = sharedCounter; return hasModified;
     }
	protected static final int CHAR_3320_LEN = 1;
	/**
	 * 	serialize this Char3320
	 */
   protected void serializeChar3320(char[] char3320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(char3320,0,getStringValue(),beginChar3320,CHAR_3320_LEN);
       localChar3320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkChar3320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshChar3320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshChar3320() {	 
   		return (substring(getStringValue(),beginChar3320,beginChar3320 + CHAR_3320_LEN));
   	}
     int localPeriod320Counter = -1;
     public boolean isPeriod320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPeriod320Counter != sharedCounter;
         localPeriod320Counter = sharedCounter; return hasModified;
     }
	protected static final int PERIOD_320_LEN = 1;
	/**
	 * 	serialize this Period320
	 */
   protected void serializePeriod320(char[] period320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(period320,0,getStringValue(),beginPeriod320,PERIOD_320_LEN);
       localPeriod320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPeriod320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPeriod320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPeriod320() {	 
   		return (substring(getStringValue(),beginPeriod320,beginPeriod320 + PERIOD_320_LEN));
   	}
     int localCommaSpace320Counter = -1;
     public boolean isCommaSpace320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCommaSpace320Counter != sharedCounter;
         localCommaSpace320Counter = sharedCounter; return hasModified;
     }
	protected static final int COMMA_SPACE_320_LEN = 2;
	/**
	 * 	serialize this CommaSpace320
	 */
   protected void serializeCommaSpace320(char[] commaSpace320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(commaSpace320,0,getStringValue(),beginCommaSpace320,COMMA_SPACE_320_LEN);
       localCommaSpace320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCommaSpace320Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCommaSpace320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCommaSpace320() {	 
   		return (substring(getStringValue(),beginCommaSpace320,beginCommaSpace320 + COMMA_SPACE_320_LEN));
   	}
     int localTilde320Counter = -1;
     public boolean isTilde320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTilde320Counter != sharedCounter;
         localTilde320Counter = sharedCounter; return hasModified;
     }
	protected static final int TILDE_320_LEN = 1;
	/**
	 * 	serialize this Tilde320
	 */
   protected void serializeTilde320(char[] tilde320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tilde320,0,getStringValue(),beginTilde320,TILDE_320_LEN);
       localTilde320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTilde320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshTilde320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTilde320() {	 
   		return (substring(getStringValue(),beginTilde320,beginTilde320 + TILDE_320_LEN));
   	}
     int localPipe320Counter = -1;
     public boolean isPipe320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPipe320Counter != sharedCounter;
         localPipe320Counter = sharedCounter; return hasModified;
     }
	protected static final int PIPE_320_LEN = 1;
	/**
	 * 	serialize this Pipe320
	 */
   protected void serializePipe320(char[] pipe320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pipe320,0,getStringValue(),beginPipe320,PIPE_320_LEN);
       localPipe320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPipe320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshPipe320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPipe320() {	 
   		return (substring(getStringValue(),beginPipe320,beginPipe320 + PIPE_320_LEN));
   	}
     int localSemicolon320Counter = -1;
     public boolean isSemicolon320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSemicolon320Counter != sharedCounter;
         localSemicolon320Counter = sharedCounter; return hasModified;
     }
	protected static final int SEMICOLON_320_LEN = 1;
	/**
	 * 	serialize this Semicolon320
	 */
   protected void serializeSemicolon320(char[] semicolon320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(semicolon320,0,getStringValue(),beginSemicolon320,SEMICOLON_320_LEN);
       localSemicolon320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSemicolon320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSemicolon320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSemicolon320() {	 
   		return (substring(getStringValue(),beginSemicolon320,beginSemicolon320 + SEMICOLON_320_LEN));
   	}
     int localParenLeft320Counter = -1;
     public boolean isParenLeft320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParenLeft320Counter != sharedCounter;
         localParenLeft320Counter = sharedCounter; return hasModified;
     }
	protected static final int PAREN_LEFT_320_LEN = 1;
	/**
	 * 	serialize this ParenLeft320
	 */
   protected void serializeParenLeft320(char[] parenLeft320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parenLeft320,0,getStringValue(),beginParenLeft320,PAREN_LEFT_320_LEN);
       localParenLeft320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParenLeft320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshParenLeft320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParenLeft320() {	 
   		return (substring(getStringValue(),beginParenLeft320,beginParenLeft320 + PAREN_LEFT_320_LEN));
   	}
     int localParenRight320Counter = -1;
     public boolean isParenRight320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParenRight320Counter != sharedCounter;
         localParenRight320Counter = sharedCounter; return hasModified;
     }
	protected static final int PAREN_RIGHT_320_LEN = 1;
	/**
	 * 	serialize this ParenRight320
	 */
   protected void serializeParenRight320(char[] parenRight320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parenRight320,0,getStringValue(),beginParenRight320,PAREN_RIGHT_320_LEN);
       localParenRight320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParenRight320Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshParenRight320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParenRight320() {	 
   		return (substring(getStringValue(),beginParenRight320,beginParenRight320 + PAREN_RIGHT_320_LEN));
   	}
     int localNull320Counter = -1;
     public boolean isNull320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNull320Counter != sharedCounter;
         localNull320Counter = sharedCounter; return hasModified;
     }
	protected static final int NULL_320_LEN = 7;
	/**
	 * 	serialize this Null320
	 */
   protected void serializeNull320(char[] null320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(null320,0,getStringValue(),beginNull320,NULL_320_LEN);
       localNull320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNull320Constraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshNull320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNull320() {	 
   		return (substring(getStringValue(),beginNull320,beginNull320 + NULL_320_LEN));
   	}
     int localLitNa320Counter = -1;
     public boolean isLitNa320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitNa320Counter != sharedCounter;
         localLitNa320Counter = sharedCounter; return hasModified;
     }
	protected static final int LIT_NA_320_LEN = 3;
	/**
	 * 	serialize this LitNa320
	 */
   protected void serializeLitNa320(char[] litNa320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(litNa320,0,getStringValue(),beginLitNa320,LIT_NA_320_LEN);
       localLitNa320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLitNa320Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshLitNa320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLitNa320() {	 
   		return (substring(getStringValue(),beginLitNa320,beginLitNa320 + LIT_NA_320_LEN));
   	}
     int localPgmAr630010300Counter = -1;
     public boolean isPgmAr630010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmAr630010300Counter != sharedCounter;
         localPgmAr630010300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_AR_630010300_LEN = 8;
	/**
	 * 	serialize this PgmAr630010300
	 */
   protected void serializePgmAr630010300(char[] pgmAr630010300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmAr630010300,0,getStringValue(),beginPgmAr630010300,PGM_AR_630010300_LEN);
       localPgmAr630010300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmAr630010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmAr630010300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmAr630010300() {	 
   		return (substring(getStringValue(),beginPgmAr630010300,beginPgmAr630010300 + PGM_AR_630010300_LEN));
   	}
     int localPgmAr631010300Counter = -1;
     public boolean isPgmAr631010300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmAr631010300Counter != sharedCounter;
         localPgmAr631010300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_AR_631010300_LEN = 8;
	/**
	 * 	serialize this PgmAr631010300
	 */
   protected void serializePgmAr631010300(char[] pgmAr631010300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmAr631010300,0,getStringValue(),beginPgmAr631010300,PGM_AR_631010300_LEN);
       localPgmAr631010300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmAr631010300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmAr631010300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmAr631010300() {	 
   		return (substring(getStringValue(),beginPgmAr631010300,beginPgmAr631010300 + PGM_AR_631010300_LEN));
   	}
     int localPgmAr630020300Counter = -1;
     public boolean isPgmAr630020300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgmAr630020300Counter != sharedCounter;
         localPgmAr630020300Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_AR_630020300_LEN = 8;
	/**
	 * 	serialize this PgmAr630020300
	 */
   protected void serializePgmAr630020300(char[] pgmAr630020300) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgmAr630020300,0,getStringValue(),beginPgmAr630020300,PGM_AR_630020300_LEN);
       localPgmAr630020300Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgmAr630020300Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgmAr630020300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgmAr630020300() {	 
   		return (substring(getStringValue(),beginPgmAr630020300,beginPgmAr630020300 + PGM_AR_630020300_LEN));
   	}
     int localAddErrPara320Counter = -1;
     public boolean isAddErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAddErrPara320Counter != sharedCounter;
         localAddErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int ADD_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this AddErrPara320
	 */
   protected void serializeAddErrPara320(char[] addErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(addErrPara320,0,getStringValue(),beginAddErrPara320,ADD_ERR_PARA_320_LEN);
       localAddErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAddErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshAddErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAddErrPara320() {	 
   		return (substring(getStringValue(),beginAddErrPara320,beginAddErrPara320 + ADD_ERR_PARA_320_LEN));
   	}
     int localBulkErrPara320Counter = -1;
     public boolean isBulkErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBulkErrPara320Counter != sharedCounter;
         localBulkErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int BULK_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this BulkErrPara320
	 */
   protected void serializeBulkErrPara320(char[] bulkErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bulkErrPara320,0,getStringValue(),beginBulkErrPara320,BULK_ERR_PARA_320_LEN);
       localBulkErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBulkErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshBulkErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBulkErrPara320() {	 
   		return (substring(getStringValue(),beginBulkErrPara320,beginBulkErrPara320 + BULK_ERR_PARA_320_LEN));
   	}
     int localListErrPara320Counter = -1;
     public boolean isListErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localListErrPara320Counter != sharedCounter;
         localListErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int LIST_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this ListErrPara320
	 */
   protected void serializeListErrPara320(char[] listErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(listErrPara320,0,getStringValue(),beginListErrPara320,LIST_ERR_PARA_320_LEN);
       localListErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkListErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshListErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshListErrPara320() {	 
   		return (substring(getStringValue(),beginListErrPara320,beginListErrPara320 + LIST_ERR_PARA_320_LEN));
   	}
     int localSendErrPara320Counter = -1;
     public boolean isSendErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSendErrPara320Counter != sharedCounter;
         localSendErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int SEND_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this SendErrPara320
	 */
   protected void serializeSendErrPara320(char[] sendErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sendErrPara320,0,getStringValue(),beginSendErrPara320,SEND_ERR_PARA_320_LEN);
       localSendErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSendErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshSendErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSendErrPara320() {	 
   		return (substring(getStringValue(),beginSendErrPara320,beginSendErrPara320 + SEND_ERR_PARA_320_LEN));
   	}
     int localReloadErrPara320Counter = -1;
     public boolean isReloadErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReloadErrPara320Counter != sharedCounter;
         localReloadErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int RELOAD_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this ReloadErrPara320
	 */
   protected void serializeReloadErrPara320(char[] reloadErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reloadErrPara320,0,getStringValue(),beginReloadErrPara320,RELOAD_ERR_PARA_320_LEN);
       localReloadErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReloadErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshReloadErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReloadErrPara320() {	 
   		return (substring(getStringValue(),beginReloadErrPara320,beginReloadErrPara320 + RELOAD_ERR_PARA_320_LEN));
   	}
     int localInstallErrPara320Counter = -1;
     public boolean isInstallErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInstallErrPara320Counter != sharedCounter;
         localInstallErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int INSTALL_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this InstallErrPara320
	 */
   protected void serializeInstallErrPara320(char[] installErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(installErrPara320,0,getStringValue(),beginInstallErrPara320,INSTALL_ERR_PARA_320_LEN);
       localInstallErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInstallErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshInstallErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInstallErrPara320() {	 
   		return (substring(getStringValue(),beginInstallErrPara320,beginInstallErrPara320 + INSTALL_ERR_PARA_320_LEN));
   	}
     int localRetrvErrPara320Counter = -1;
     public boolean isRetrvErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRetrvErrPara320Counter != sharedCounter;
         localRetrvErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int RETRV_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this RetrvErrPara320
	 */
   protected void serializeRetrvErrPara320(char[] retrvErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(retrvErrPara320,0,getStringValue(),beginRetrvErrPara320,RETRV_ERR_PARA_320_LEN);
       localRetrvErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRetrvErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshRetrvErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRetrvErrPara320() {	 
   		return (substring(getStringValue(),beginRetrvErrPara320,beginRetrvErrPara320 + RETRV_ERR_PARA_320_LEN));
   	}
     int localUnldCompPara320Counter = -1;
     public boolean isUnldCompPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUnldCompPara320Counter != sharedCounter;
         localUnldCompPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int UNLD_COMP_PARA_320_LEN = 30;
	/**
	 * 	serialize this UnldCompPara320
	 */
   protected void serializeUnldCompPara320(char[] unldCompPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(unldCompPara320,0,getStringValue(),beginUnldCompPara320,UNLD_COMP_PARA_320_LEN);
       localUnldCompPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUnldCompPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshUnldCompPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUnldCompPara320() {	 
   		return (substring(getStringValue(),beginUnldCompPara320,beginUnldCompPara320 + UNLD_COMP_PARA_320_LEN));
   	}
     int localUnldErrPara320Counter = -1;
     public boolean isUnldErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUnldErrPara320Counter != sharedCounter;
         localUnldErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int UNLD_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this UnldErrPara320
	 */
   protected void serializeUnldErrPara320(char[] unldErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(unldErrPara320,0,getStringValue(),beginUnldErrPara320,UNLD_ERR_PARA_320_LEN);
       localUnldErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUnldErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshUnldErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUnldErrPara320() {	 
   		return (substring(getStringValue(),beginUnldErrPara320,beginUnldErrPara320 + UNLD_ERR_PARA_320_LEN));
   	}
     int localRestageErrPara320Counter = -1;
     public boolean isRestageErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRestageErrPara320Counter != sharedCounter;
         localRestageErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int RESTAGE_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this RestageErrPara320
	 */
   protected void serializeRestageErrPara320(char[] restageErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(restageErrPara320,0,getStringValue(),beginRestageErrPara320,RESTAGE_ERR_PARA_320_LEN);
       localRestageErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRestageErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshRestageErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRestageErrPara320() {	 
   		return (substring(getStringValue(),beginRestageErrPara320,beginRestageErrPara320 + RESTAGE_ERR_PARA_320_LEN));
   	}
     int localPreExitErrPara320Counter = -1;
     public boolean isPreExitErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPreExitErrPara320Counter != sharedCounter;
         localPreExitErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int PRE_EXIT_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this PreExitErrPara320
	 */
   protected void serializePreExitErrPara320(char[] preExitErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(preExitErrPara320,0,getStringValue(),beginPreExitErrPara320,PRE_EXIT_ERR_PARA_320_LEN);
       localPreExitErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPreExitErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshPreExitErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPreExitErrPara320() {	 
   		return (substring(getStringValue(),beginPreExitErrPara320,beginPreExitErrPara320 + PRE_EXIT_ERR_PARA_320_LEN));
   	}
     int localCapturePara320Counter = -1;
     public boolean isCapturePara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCapturePara320Counter != sharedCounter;
         localCapturePara320Counter = sharedCounter; return hasModified;
     }
	protected static final int CAPTURE_PARA_320_LEN = 30;
	/**
	 * 	serialize this CapturePara320
	 */
   protected void serializeCapturePara320(char[] capturePara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(capturePara320,0,getStringValue(),beginCapturePara320,CAPTURE_PARA_320_LEN);
       localCapturePara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCapturePara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshCapturePara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCapturePara320() {	 
   		return (substring(getStringValue(),beginCapturePara320,beginCapturePara320 + CAPTURE_PARA_320_LEN));
   	}
     int localParmErrPara320Counter = -1;
     public boolean isParmErrPara320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmErrPara320Counter != sharedCounter;
         localParmErrPara320Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_ERR_PARA_320_LEN = 30;
	/**
	 * 	serialize this ParmErrPara320
	 */
   protected void serializeParmErrPara320(char[] parmErrPara320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmErrPara320,0,getStringValue(),beginParmErrPara320,PARM_ERR_PARA_320_LEN);
       localParmErrPara320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmErrPara320Constraints(char[] value) {
   			return super.checkConstraints(value , 30 ,false, false);
   }
    /**
	 *	refreshParmErrPara320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmErrPara320() {	 
   		return (substring(getStringValue(),beginParmErrPara320,beginParmErrPara320 + PARM_ERR_PARA_320_LEN));
   	}
     int localApplicationFile320Counter = -1;
     public boolean isApplicationFile320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplicationFile320Counter != sharedCounter;
         localApplicationFile320Counter = sharedCounter; return hasModified;
     }
	protected static final int APPLICATION_FILE_320_LEN = 17;
	/**
	 * 	serialize this ApplicationFile320
	 */
   protected void serializeApplicationFile320(char[] applicationFile320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applicationFile320,0,getStringValue(),beginApplicationFile320,APPLICATION_FILE_320_LEN);
       localApplicationFile320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplicationFile320Constraints(char[] value) {
   			return super.checkConstraints(value , 17 ,false, false);
   }
    /**
	 *	refreshApplicationFile320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplicationFile320() {	 
   		return (substring(getStringValue(),beginApplicationFile320,beginApplicationFile320 + APPLICATION_FILE_320_LEN));
   	}
     int localGftFile320Counter = -1;
     public boolean isGftFile320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGftFile320Counter != sharedCounter;
         localGftFile320Counter = sharedCounter; return hasModified;
     }
	protected static final int GFT_FILE_320_LEN = 9;
	/**
	 * 	serialize this GftFile320
	 */
   protected void serializeGftFile320(char[] gftFile320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(gftFile320,0,getStringValue(),beginGftFile320,GFT_FILE_320_LEN);
       localGftFile320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkGftFile320Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshGftFile320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshGftFile320() {	 
   		return (substring(getStringValue(),beginGftFile320,beginGftFile320 + GFT_FILE_320_LEN));
   	}
     int localRecordFormat320Counter = -1;
     public boolean isRecordFormat320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecordFormat320Counter != sharedCounter;
         localRecordFormat320Counter = sharedCounter; return hasModified;
     }
	protected static final int RECORD_FORMAT_320_LEN = 15;
	/**
	 * 	serialize this RecordFormat320
	 */
   protected void serializeRecordFormat320(char[] recordFormat320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recordFormat320,0,getStringValue(),beginRecordFormat320,RECORD_FORMAT_320_LEN);
       localRecordFormat320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecordFormat320Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshRecordFormat320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecordFormat320() {	 
   		return (substring(getStringValue(),beginRecordFormat320,beginRecordFormat320 + RECORD_FORMAT_320_LEN));
   	}
     int localBlockSize320Counter = -1;
     public boolean isBlockSize320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBlockSize320Counter != sharedCounter;
         localBlockSize320Counter = sharedCounter; return hasModified;
     }
	protected static final int BLOCK_SIZE_320_LEN = 12;
	/**
	 * 	serialize this BlockSize320
	 */
   protected void serializeBlockSize320(char[] blockSize320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(blockSize320,0,getStringValue(),beginBlockSize320,BLOCK_SIZE_320_LEN);
       localBlockSize320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBlockSize320Constraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBlockSize320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBlockSize320() {	 
   		return (substring(getStringValue(),beginBlockSize320,beginBlockSize320 + BLOCK_SIZE_320_LEN));
   	}
     int localRecordLength320Counter = -1;
     public boolean isRecordLength320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRecordLength320Counter != sharedCounter;
         localRecordLength320Counter = sharedCounter; return hasModified;
     }
	protected static final int RECORD_LENGTH_320_LEN = 15;
	/**
	 * 	serialize this RecordLength320
	 */
   protected void serializeRecordLength320(char[] recordLength320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(recordLength320,0,getStringValue(),beginRecordLength320,RECORD_LENGTH_320_LEN);
       localRecordLength320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRecordLength320Constraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshRecordLength320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRecordLength320() {	 
   		return (substring(getStringValue(),beginRecordLength320,beginRecordLength320 + RECORD_LENGTH_320_LEN));
   	}
     int localSystemIdentifier320Counter = -1;
     public boolean isSystemIdentifier320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSystemIdentifier320Counter != sharedCounter;
         localSystemIdentifier320Counter = sharedCounter; return hasModified;
     }
	protected static final int SYSTEM_IDENTIFIER_320_LEN = 19;
	/**
	 * 	serialize this SystemIdentifier320
	 */
   protected void serializeSystemIdentifier320(char[] systemIdentifier320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(systemIdentifier320,0,getStringValue(),beginSystemIdentifier320,SYSTEM_IDENTIFIER_320_LEN);
       localSystemIdentifier320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSystemIdentifier320Constraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshSystemIdentifier320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSystemIdentifier320() {	 
   		return (substring(getStringValue(),beginSystemIdentifier320,beginSystemIdentifier320 + SYSTEM_IDENTIFIER_320_LEN));
   	}
     int localExitDsn320Counter = -1;
     public boolean isExitDsn320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localExitDsn320Counter != sharedCounter;
         localExitDsn320Counter = sharedCounter; return hasModified;
     }
	protected static final int EXIT_DSN_320_LEN = 22;
	/**
	 * 	serialize this ExitDsn320
	 */
   protected void serializeExitDsn320(char[] exitDsn320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(exitDsn320,0,getStringValue(),beginExitDsn320,EXIT_DSN_320_LEN);
       localExitDsn320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkExitDsn320Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshExitDsn320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshExitDsn320() {	 
   		return (substring(getStringValue(),beginExitDsn320,beginExitDsn320 + EXIT_DSN_320_LEN));
   	}
     int localAllocationType320Counter = -1;
     public boolean isAllocationType320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAllocationType320Counter != sharedCounter;
         localAllocationType320Counter = sharedCounter; return hasModified;
     }
	protected static final int ALLOCATION_TYPE_320_LEN = 22;
	/**
	 * 	serialize this AllocationType320
	 */
   protected void serializeAllocationType320(char[] allocationType320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(allocationType320,0,getStringValue(),beginAllocationType320,ALLOCATION_TYPE_320_LEN);
       localAllocationType320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAllocationType320Constraints(char[] value) {
   			return super.checkConstraints(value , 22 ,false, false);
   }
    /**
	 *	refreshAllocationType320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAllocationType320() {	 
   		return (substring(getStringValue(),beginAllocationType320,beginAllocationType320 + ALLOCATION_TYPE_320_LEN));
   	}
     int localBroadcastEndptQual320Counter = -1;
     public boolean isBroadcastEndptQual320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastEndptQual320Counter != sharedCounter;
         localBroadcastEndptQual320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_ENDPT_QUAL_320_LEN = 8;
	/**
	 * 	serialize this BroadcastEndptQual320
	 */
   protected void serializeBroadcastEndptQual320(char[] broadcastEndptQual320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastEndptQual320,0,getStringValue(),beginBroadcastEndptQual320,BROADCAST_ENDPT_QUAL_320_LEN);
       localBroadcastEndptQual320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastEndptQual320Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshBroadcastEndptQual320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastEndptQual320() {	 
   		return (substring(getStringValue(),beginBroadcastEndptQual320,beginBroadcastEndptQual320 + BROADCAST_ENDPT_QUAL_320_LEN));
   	}
     int localBroadcastStatusCounts320Counter = -1;
     public boolean isBroadcastStatusCounts320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastStatusCounts320Counter != sharedCounter;
         localBroadcastStatusCounts320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_STATUS_COUNTS_320_LEN = 45;
	/**
	 * 	serialize this BroadcastStatusCounts320
	 */
   protected void serializeBroadcastStatusCounts320(char[] broadcastStatusCounts320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastStatusCounts320,0,getStringValue(),beginBroadcastStatusCounts320,BROADCAST_STATUS_COUNTS_320_LEN);
       localBroadcastStatusCounts320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastStatusCounts320Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
    /**
	 *	refreshBroadcastStatusCounts320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastStatusCounts320() {	 
   		return (substring(getStringValue(),beginBroadcastStatusCounts320,beginBroadcastStatusCounts320 + BROADCAST_STATUS_COUNTS_320_LEN));
   	}
     int localBroadcastStatusDashes320Counter = -1;
     public boolean isBroadcastStatusDashes320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastStatusDashes320Counter != sharedCounter;
         localBroadcastStatusDashes320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_STATUS_DASHES_320_LEN = 45;
	/**
	 * 	serialize this BroadcastStatusDashes320
	 */
   protected void serializeBroadcastStatusDashes320(char[] broadcastStatusDashes320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastStatusDashes320,0,getStringValue(),beginBroadcastStatusDashes320,BROADCAST_STATUS_DASHES_320_LEN);
       localBroadcastStatusDashes320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastStatusDashes320Constraints(char[] value) {
   			return super.checkConstraints(value , 45 ,false, false);
   }
    /**
	 *	refreshBroadcastStatusDashes320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastStatusDashes320() {	 
   		return (substring(getStringValue(),beginBroadcastStatusDashes320,beginBroadcastStatusDashes320 + BROADCAST_STATUS_DASHES_320_LEN));
   	}
     int localBroadcastTargetRecords320Counter = -1;
     public boolean isBroadcastTargetRecords320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastTargetRecords320Counter != sharedCounter;
         localBroadcastTargetRecords320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_TARGET_RECORDS_320_LEN = 28;
	/**
	 * 	serialize this BroadcastTargetRecords320
	 */
   protected void serializeBroadcastTargetRecords320(char[] broadcastTargetRecords320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastTargetRecords320,0,getStringValue(),beginBroadcastTargetRecords320,BROADCAST_TARGET_RECORDS_320_LEN);
       localBroadcastTargetRecords320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastTargetRecords320Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshBroadcastTargetRecords320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastTargetRecords320() {	 
   		return (substring(getStringValue(),beginBroadcastTargetRecords320,beginBroadcastTargetRecords320 + BROADCAST_TARGET_RECORDS_320_LEN));
   	}
     int localBroadcastTargetBytes320Counter = -1;
     public boolean isBroadcastTargetBytes320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastTargetBytes320Counter != sharedCounter;
         localBroadcastTargetBytes320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_TARGET_BYTES_320_LEN = 28;
	/**
	 * 	serialize this BroadcastTargetBytes320
	 */
   protected void serializeBroadcastTargetBytes320(char[] broadcastTargetBytes320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastTargetBytes320,0,getStringValue(),beginBroadcastTargetBytes320,BROADCAST_TARGET_BYTES_320_LEN);
       localBroadcastTargetBytes320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastTargetBytes320Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshBroadcastTargetBytes320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastTargetBytes320() {	 
   		return (substring(getStringValue(),beginBroadcastTargetBytes320,beginBroadcastTargetBytes320 + BROADCAST_TARGET_BYTES_320_LEN));
   	}
     int localBroadcastEndptsValid320Counter = -1;
     public boolean isBroadcastEndptsValid320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastEndptsValid320Counter != sharedCounter;
         localBroadcastEndptsValid320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_ENDPTS_VALID_320_LEN = 28;
	/**
	 * 	serialize this BroadcastEndptsValid320
	 */
   protected void serializeBroadcastEndptsValid320(char[] broadcastEndptsValid320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastEndptsValid320,0,getStringValue(),beginBroadcastEndptsValid320,BROADCAST_ENDPTS_VALID_320_LEN);
       localBroadcastEndptsValid320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastEndptsValid320Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshBroadcastEndptsValid320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastEndptsValid320() {	 
   		return (substring(getStringValue(),beginBroadcastEndptsValid320,beginBroadcastEndptsValid320 + BROADCAST_ENDPTS_VALID_320_LEN));
   	}
     int localBroadcastEndptsErrors320Counter = -1;
     public boolean isBroadcastEndptsErrors320Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBroadcastEndptsErrors320Counter != sharedCounter;
         localBroadcastEndptsErrors320Counter = sharedCounter; return hasModified;
     }
	protected static final int BROADCAST_ENDPTS_ERRORS_320_LEN = 28;
	/**
	 * 	serialize this BroadcastEndptsErrors320
	 */
   protected void serializeBroadcastEndptsErrors320(char[] broadcastEndptsErrors320) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(broadcastEndptsErrors320,0,getStringValue(),beginBroadcastEndptsErrors320,BROADCAST_ENDPTS_ERRORS_320_LEN);
       localBroadcastEndptsErrors320Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBroadcastEndptsErrors320Constraints(char[] value) {
   			return super.checkConstraints(value , 28 ,false, false);
   }
    /**
	 *	refreshBroadcastEndptsErrors320 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBroadcastEndptsErrors320() {	 
   		return (substring(getStringValue(),beginBroadcastEndptsErrors320,beginBroadcastEndptsErrors320 + BROADCAST_ENDPTS_ERRORS_320_LEN));
   	}




}
  
