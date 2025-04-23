package com.cloudframe.app.ar640010.dto;

/**
*  The class CharacterLiterals320 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class CharacterLiterals320 extends CharacterLiterals320Serialized {
   

						private char[] charA320 = new char[1];

						private char[] charD320 = new char[1];

						private char[] charE320 = new char[1];

						private char[] charPound320 = new char[1];

						private char[] charF320 = new char[1];

						private char[] charN320 = new char[1];

						private char[] charR320 = new char[1];

						private char[] charY320 = new char[1];

						private char[] char3320 = new char[1];

						private char[] period320 = new char[1];

						private char[] commaSpace320 = new char[2];

						private char[] tilde320 = new char[1];

						private char[] pipe320 = new char[1];

						private char[] semicolon320 = new char[1];

						private char[] parenLeft320 = new char[1];

						private char[] parenRight320 = new char[1];

						private char[] null320 = new char[7];

						private char[] litNa320 = new char[3];

						private char[] pgmAr630010300 = new char[8];

						private char[] pgmAr631010300 = new char[8];

						private char[] pgmAr630020300 = new char[8];

						private char[] addErrPara320 = new char[30];

						private char[] bulkErrPara320 = new char[30];

						private char[] listErrPara320 = new char[30];

						private char[] sendErrPara320 = new char[30];

						private char[] reloadErrPara320 = new char[30];

						private char[] installErrPara320 = new char[30];

						private char[] retrvErrPara320 = new char[30];

						private char[] unldCompPara320 = new char[30];

						private char[] unldErrPara320 = new char[30];

						private char[] restageErrPara320 = new char[30];

						private char[] preExitErrPara320 = new char[30];

						private char[] capturePara320 = new char[30];

						private char[] parmErrPara320 = new char[30];
				private EndpointFileProfile320 endpointFileProfile320 = new EndpointFileProfile320();

						private char[] applicationFile320 = new char[17];

						private char[] gftFile320 = new char[9];

						private char[] recordFormat320 = new char[15];

						private char[] blockSize320 = new char[12];

						private char[] recordLength320 = new char[15];

						private char[] systemIdentifier320 = new char[19];

						private char[] exitDsn320 = new char[22];

						private char[] allocationType320 = new char[22];

						private char[] broadcastEndptQual320 = new char[8];

						private char[] broadcastStatusCounts320 = new char[45];

						private char[] broadcastStatusDashes320 = new char[45];

						private char[] broadcastTargetRecords320 = new char[28];

						private char[] broadcastTargetBytes320 = new char[28];

						private char[] broadcastEndptsValid320 = new char[28];

						private char[] broadcastEndptsErrors320 = new char[28];
	
	/**
	* Constructor for CharacterLiterals320
	**/
    public CharacterLiterals320() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			endpointFileProfile320.setParent(this,getStartOffset() + 441);
	   	/*  end of offset */
								setCharA320(("A").toCharArray());
								setCharD320(("D").toCharArray());
								setCharE320(("E").toCharArray());
								setCharPound320(("#").toCharArray());
								setCharF320(("F").toCharArray());
								setCharN320(("N").toCharArray());
								setCharR320(("R").toCharArray());
								setCharY320(("Y").toCharArray());
								setChar3320(("3").toCharArray());
								setPeriod320((".").toCharArray());
								setCommaSpace320((", ").toCharArray());
								setTilde320(("~").toCharArray());
								setPipe320(("|").toCharArray());
								setSemicolon320((";").toCharArray());
								setParenLeft320(("(").toCharArray());
								setParenRight320((")").toCharArray());
								setNull320(("<NULL> ").toCharArray());
								setLitNa320(("N/A").toCharArray());
								setPgmAr630010300(("AR630010").toCharArray());
								setPgmAr631010300(("AR631010").toCharArray());
								setPgmAr630020300(("AR630020").toCharArray());
								setAddErrPara320(("4120-POST-ADD-TARAFXS         ").toCharArray());
								setBulkErrPara320(("4222-POST-BULK-TARAFXS        ").toCharArray());
								setListErrPara320(("4423-POST-LIST-TARAFXS        ").toCharArray());
								setSendErrPara320(("4620-POST-SEND-TARAFXS        ").toCharArray());
								setReloadErrPara320(("4760-RELOAD-TARAFXA-ROW       ").toCharArray());
								setInstallErrPara320(("4823-INSERT-POST-EXIT-TARAFXS ").toCharArray());
								setRetrvErrPara320(("2542-UPDATE-RETRIEVE          ").toCharArray());
								setUnldCompPara320(("4510-SET-TARAFXS-COMPLETE     ").toCharArray());
								setUnldErrPara320(("4520-SET-TARAFXS-ERROR        ").toCharArray());
								setRestageErrPara320(("4721-UPDATE-TARAFXS-ROW       ").toCharArray());
								setPreExitErrPara320(("4824-UPDATE-PRE-EXIT-TARAFXS  ").toCharArray());
								setCapturePara320(("8610-CAPTURE-RESULT           ").toCharArray());
								setParmErrPara320(("9900-REPORT-ERROR             ").toCharArray());
								setApplicationFile320(("APPLICATION FILE ").toCharArray());
								setGftFile320(("GFT FILE ").toCharArray());
								setRecordFormat320(("RECORD FORMAT: ").toCharArray());
								setBlockSize320(("BLOCK SIZE: ").toCharArray());
								setRecordLength320(("RECORD LENGTH: ").toCharArray());
								setSystemIdentifier320(("SYSTEM IDENTIFIER: ").toCharArray());
								setExitDsn320(("APPLICATION EXIT DSN: ").toCharArray());
								setAllocationType320(("ALLOCATION UNIT TYPE: ").toCharArray());
								setBroadcastEndptQual320(("E0000000").toCharArray());
								setBroadcastStatusCounts320(("B R O A D C A S T   S T A T U S   C O U N T S").toCharArray());
								setBroadcastStatusDashes320(String.join("", java.util.Collections.nCopies(45, "-")).toCharArray());
								setBroadcastTargetRecords320(("BROADCAST TARGET RECORDS    ").toCharArray());
								setBroadcastTargetBytes320(("BROADCAST TARGET BYTES      ").toCharArray());
								setBroadcastEndptsValid320(("BROADCAST ENDPOINTS - VALID ").toCharArray());
								setBroadcastEndptsErrors320(("BROADCAST ENDPOINTS - ERRORS").toCharArray());
    }


 

	/**
	 *	Returns the value of charA320
	 *	@return charA320
	 */
   public char[] getCharA320() throws CFException{
     if (isCharA320Modified()) { 
        charA320 = refreshCharA320();
     }
   		return charA320;
   }

  
	/**
	*  set variable charA320
	*  Corresponding COBOL Variable is 320-CHAR-A
	*  @param value
	**/
   public void setCharA320(char[] value) {
      charA320 = checkCharA320Constraints(value);
      serializeCharA320(charA320);
   } 

     /**
	 * 	Update CharA320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharA320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharA320,charA320.length);
   	
   }
   
   public void setCharA320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharA320,charA320.length);
   	
   }
   
     /**
	 * 	Update CharA320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharA320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharA320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharA320 with another Field
	 *	@param value
	 */
   public void setCharA320(Field source) {
       replace(source,0,source.length(),beginCharA320,CHAR_A_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharA320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharA320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharA320,CHAR_A_320_LEN);
   	
   }
   
     /**
	 * 	Update CharA320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharA320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharA320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charD320
	 *	@return charD320
	 */
   public char[] getCharD320() throws CFException{
     if (isCharD320Modified()) { 
        charD320 = refreshCharD320();
     }
   		return charD320;
   }

  
	/**
	*  set variable charD320
	*  Corresponding COBOL Variable is 320-CHAR-D
	*  @param value
	**/
   public void setCharD320(char[] value) {
      charD320 = checkCharD320Constraints(value);
      serializeCharD320(charD320);
   } 

     /**
	 * 	Update CharD320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharD320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharD320,charD320.length);
   	
   }
   
   public void setCharD320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharD320,charD320.length);
   	
   }
   
     /**
	 * 	Update CharD320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharD320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharD320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharD320 with another Field
	 *	@param value
	 */
   public void setCharD320(Field source) {
       replace(source,0,source.length(),beginCharD320,CHAR_D_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharD320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharD320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharD320,CHAR_D_320_LEN);
   	
   }
   
     /**
	 * 	Update CharD320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharD320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharD320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charE320
	 *	@return charE320
	 */
   public char[] getCharE320() throws CFException{
     if (isCharE320Modified()) { 
        charE320 = refreshCharE320();
     }
   		return charE320;
   }

  
	/**
	*  set variable charE320
	*  Corresponding COBOL Variable is 320-CHAR-E
	*  @param value
	**/
   public void setCharE320(char[] value) {
      charE320 = checkCharE320Constraints(value);
      serializeCharE320(charE320);
   } 

     /**
	 * 	Update CharE320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharE320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharE320,charE320.length);
   	
   }
   
   public void setCharE320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharE320,charE320.length);
   	
   }
   
     /**
	 * 	Update CharE320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharE320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharE320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharE320 with another Field
	 *	@param value
	 */
   public void setCharE320(Field source) {
       replace(source,0,source.length(),beginCharE320,CHAR_E_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharE320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharE320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharE320,CHAR_E_320_LEN);
   	
   }
   
     /**
	 * 	Update CharE320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharE320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharE320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charPound320
	 *	@return charPound320
	 */
   public char[] getCharPound320() throws CFException{
     if (isCharPound320Modified()) { 
        charPound320 = refreshCharPound320();
     }
   		return charPound320;
   }

  
	/**
	*  set variable charPound320
	*  Corresponding COBOL Variable is 320-CHAR-POUND
	*  @param value
	**/
   public void setCharPound320(char[] value) {
      charPound320 = checkCharPound320Constraints(value);
      serializeCharPound320(charPound320);
   } 

     /**
	 * 	Update CharPound320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharPound320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharPound320,charPound320.length);
   	
   }
   
   public void setCharPound320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharPound320,charPound320.length);
   	
   }
   
     /**
	 * 	Update CharPound320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharPound320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharPound320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharPound320 with another Field
	 *	@param value
	 */
   public void setCharPound320(Field source) {
       replace(source,0,source.length(),beginCharPound320,CHAR_POUND_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharPound320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharPound320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharPound320,CHAR_POUND_320_LEN);
   	
   }
   
     /**
	 * 	Update CharPound320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharPound320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharPound320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charF320
	 *	@return charF320
	 */
   public char[] getCharF320() throws CFException{
     if (isCharF320Modified()) { 
        charF320 = refreshCharF320();
     }
   		return charF320;
   }

  
	/**
	*  set variable charF320
	*  Corresponding COBOL Variable is 320-CHAR-F
	*  @param value
	**/
   public void setCharF320(char[] value) {
      charF320 = checkCharF320Constraints(value);
      serializeCharF320(charF320);
   } 

     /**
	 * 	Update CharF320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharF320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharF320,charF320.length);
   	
   }
   
   public void setCharF320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharF320,charF320.length);
   	
   }
   
     /**
	 * 	Update CharF320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharF320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharF320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharF320 with another Field
	 *	@param value
	 */
   public void setCharF320(Field source) {
       replace(source,0,source.length(),beginCharF320,CHAR_F_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharF320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharF320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharF320,CHAR_F_320_LEN);
   	
   }
   
     /**
	 * 	Update CharF320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharF320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharF320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charN320
	 *	@return charN320
	 */
   public char[] getCharN320() throws CFException{
     if (isCharN320Modified()) { 
        charN320 = refreshCharN320();
     }
   		return charN320;
   }

  
	/**
	*  set variable charN320
	*  Corresponding COBOL Variable is 320-CHAR-N
	*  @param value
	**/
   public void setCharN320(char[] value) {
      charN320 = checkCharN320Constraints(value);
      serializeCharN320(charN320);
   } 

     /**
	 * 	Update CharN320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharN320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharN320,charN320.length);
   	
   }
   
   public void setCharN320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharN320,charN320.length);
   	
   }
   
     /**
	 * 	Update CharN320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharN320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharN320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharN320 with another Field
	 *	@param value
	 */
   public void setCharN320(Field source) {
       replace(source,0,source.length(),beginCharN320,CHAR_N_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharN320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharN320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharN320,CHAR_N_320_LEN);
   	
   }
   
     /**
	 * 	Update CharN320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharN320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharN320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charR320
	 *	@return charR320
	 */
   public char[] getCharR320() throws CFException{
     if (isCharR320Modified()) { 
        charR320 = refreshCharR320();
     }
   		return charR320;
   }

  
	/**
	*  set variable charR320
	*  Corresponding COBOL Variable is 320-CHAR-R
	*  @param value
	**/
   public void setCharR320(char[] value) {
      charR320 = checkCharR320Constraints(value);
      serializeCharR320(charR320);
   } 

     /**
	 * 	Update CharR320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharR320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharR320,charR320.length);
   	
   }
   
   public void setCharR320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharR320,charR320.length);
   	
   }
   
     /**
	 * 	Update CharR320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharR320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharR320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharR320 with another Field
	 *	@param value
	 */
   public void setCharR320(Field source) {
       replace(source,0,source.length(),beginCharR320,CHAR_R_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharR320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharR320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharR320,CHAR_R_320_LEN);
   	
   }
   
     /**
	 * 	Update CharR320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharR320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharR320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of charY320
	 *	@return charY320
	 */
   public char[] getCharY320() throws CFException{
     if (isCharY320Modified()) { 
        charY320 = refreshCharY320();
     }
   		return charY320;
   }

  
	/**
	*  set variable charY320
	*  Corresponding COBOL Variable is 320-CHAR-Y
	*  @param value
	**/
   public void setCharY320(char[] value) {
      charY320 = checkCharY320Constraints(value);
      serializeCharY320(charY320);
   } 

     /**
	 * 	Update CharY320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCharY320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCharY320,charY320.length);
   	
   }
   
   public void setCharY320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCharY320,charY320.length);
   	
   }
   
     /**
	 * 	Update CharY320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCharY320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharY320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CharY320 with another Field
	 *	@param value
	 */
   public void setCharY320(Field source) {
       replace(source,0,source.length(),beginCharY320,CHAR_Y_320_LEN);
   	
   }  
   
     /**
	 * 	Update CharY320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCharY320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCharY320,CHAR_Y_320_LEN);
   	
   }
   
     /**
	 * 	Update CharY320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCharY320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCharY320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of char3320
	 *	@return char3320
	 */
   public char[] getChar3320() throws CFException{
     if (isChar3320Modified()) { 
        char3320 = refreshChar3320();
     }
   		return char3320;
   }

  
	/**
	*  set variable char3320
	*  Corresponding COBOL Variable is 320-CHAR-3
	*  @param value
	**/
   public void setChar3320(char[] value) {
      char3320 = checkChar3320Constraints(value);
      serializeChar3320(char3320);
   } 

     /**
	 * 	Update Char3320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setChar3320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginChar3320,char3320.length);
   	
   }
   
   public void setChar3320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginChar3320,char3320.length);
   	
   }
   
     /**
	 * 	Update Char3320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setChar3320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar3320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Char3320 with another Field
	 *	@param value
	 */
   public void setChar3320(Field source) {
       replace(source,0,source.length(),beginChar3320,CHAR_3320_LEN);
   	
   }  
   
     /**
	 * 	Update Char3320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setChar3320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginChar3320,CHAR_3320_LEN);
   	
   }
   
     /**
	 * 	Update Char3320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setChar3320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginChar3320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of period320
	 *	@return period320
	 */
   public char[] getPeriod320() throws CFException{
     if (isPeriod320Modified()) { 
        period320 = refreshPeriod320();
     }
   		return period320;
   }

  
	/**
	*  set variable period320
	*  Corresponding COBOL Variable is 320-PERIOD
	*  @param value
	**/
   public void setPeriod320(char[] value) {
      period320 = checkPeriod320Constraints(value);
      serializePeriod320(period320);
   } 

     /**
	 * 	Update Period320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPeriod320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPeriod320,period320.length);
   	
   }
   
   public void setPeriod320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPeriod320,period320.length);
   	
   }
   
     /**
	 * 	Update Period320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPeriod320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeriod320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Period320 with another Field
	 *	@param value
	 */
   public void setPeriod320(Field source) {
       replace(source,0,source.length(),beginPeriod320,PERIOD_320_LEN);
   	
   }  
   
     /**
	 * 	Update Period320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPeriod320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPeriod320,PERIOD_320_LEN);
   	
   }
   
     /**
	 * 	Update Period320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPeriod320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPeriod320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of commaSpace320
	 *	@return commaSpace320
	 */
   public char[] getCommaSpace320() throws CFException{
     if (isCommaSpace320Modified()) { 
        commaSpace320 = refreshCommaSpace320();
     }
   		return commaSpace320;
   }

  
	/**
	*  set variable commaSpace320
	*  Corresponding COBOL Variable is 320-COMMA-SPACE
	*  @param value
	**/
   public void setCommaSpace320(char[] value) {
      commaSpace320 = checkCommaSpace320Constraints(value);
      serializeCommaSpace320(commaSpace320);
   } 

     /**
	 * 	Update CommaSpace320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCommaSpace320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCommaSpace320,commaSpace320.length);
   	
   }
   
   public void setCommaSpace320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCommaSpace320,commaSpace320.length);
   	
   }
   
     /**
	 * 	Update CommaSpace320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCommaSpace320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCommaSpace320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CommaSpace320 with another Field
	 *	@param value
	 */
   public void setCommaSpace320(Field source) {
       replace(source,0,source.length(),beginCommaSpace320,COMMA_SPACE_320_LEN);
   	
   }  
   
     /**
	 * 	Update CommaSpace320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCommaSpace320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCommaSpace320,COMMA_SPACE_320_LEN);
   	
   }
   
     /**
	 * 	Update CommaSpace320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCommaSpace320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCommaSpace320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tilde320
	 *	@return tilde320
	 */
   public char[] getTilde320() throws CFException{
     if (isTilde320Modified()) { 
        tilde320 = refreshTilde320();
     }
   		return tilde320;
   }

  
	/**
	*  set variable tilde320
	*  Corresponding COBOL Variable is 320-TILDE
	*  @param value
	**/
   public void setTilde320(char[] value) {
      tilde320 = checkTilde320Constraints(value);
      serializeTilde320(tilde320);
   } 

     /**
	 * 	Update Tilde320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTilde320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTilde320,tilde320.length);
   	
   }
   
   public void setTilde320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTilde320,tilde320.length);
   	
   }
   
     /**
	 * 	Update Tilde320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTilde320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTilde320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Tilde320 with another Field
	 *	@param value
	 */
   public void setTilde320(Field source) {
       replace(source,0,source.length(),beginTilde320,TILDE_320_LEN);
   	
   }  
   
     /**
	 * 	Update Tilde320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTilde320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTilde320,TILDE_320_LEN);
   	
   }
   
     /**
	 * 	Update Tilde320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTilde320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTilde320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pipe320
	 *	@return pipe320
	 */
   public char[] getPipe320() throws CFException{
     if (isPipe320Modified()) { 
        pipe320 = refreshPipe320();
     }
   		return pipe320;
   }

  
	/**
	*  set variable pipe320
	*  Corresponding COBOL Variable is 320-PIPE
	*  @param value
	**/
   public void setPipe320(char[] value) {
      pipe320 = checkPipe320Constraints(value);
      serializePipe320(pipe320);
   } 

     /**
	 * 	Update Pipe320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPipe320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPipe320,pipe320.length);
   	
   }
   
   public void setPipe320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPipe320,pipe320.length);
   	
   }
   
     /**
	 * 	Update Pipe320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPipe320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPipe320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Pipe320 with another Field
	 *	@param value
	 */
   public void setPipe320(Field source) {
       replace(source,0,source.length(),beginPipe320,PIPE_320_LEN);
   	
   }  
   
     /**
	 * 	Update Pipe320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPipe320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPipe320,PIPE_320_LEN);
   	
   }
   
     /**
	 * 	Update Pipe320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPipe320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPipe320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of semicolon320
	 *	@return semicolon320
	 */
   public char[] getSemicolon320() throws CFException{
     if (isSemicolon320Modified()) { 
        semicolon320 = refreshSemicolon320();
     }
   		return semicolon320;
   }

  
	/**
	*  set variable semicolon320
	*  Corresponding COBOL Variable is 320-SEMICOLON
	*  @param value
	**/
   public void setSemicolon320(char[] value) {
      semicolon320 = checkSemicolon320Constraints(value);
      serializeSemicolon320(semicolon320);
   } 

     /**
	 * 	Update Semicolon320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSemicolon320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSemicolon320,semicolon320.length);
   	
   }
   
   public void setSemicolon320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSemicolon320,semicolon320.length);
   	
   }
   
     /**
	 * 	Update Semicolon320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSemicolon320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSemicolon320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Semicolon320 with another Field
	 *	@param value
	 */
   public void setSemicolon320(Field source) {
       replace(source,0,source.length(),beginSemicolon320,SEMICOLON_320_LEN);
   	
   }  
   
     /**
	 * 	Update Semicolon320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSemicolon320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSemicolon320,SEMICOLON_320_LEN);
   	
   }
   
     /**
	 * 	Update Semicolon320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSemicolon320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSemicolon320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parenLeft320
	 *	@return parenLeft320
	 */
   public char[] getParenLeft320() throws CFException{
     if (isParenLeft320Modified()) { 
        parenLeft320 = refreshParenLeft320();
     }
   		return parenLeft320;
   }

  
	/**
	*  set variable parenLeft320
	*  Corresponding COBOL Variable is 320-PAREN-LEFT
	*  @param value
	**/
   public void setParenLeft320(char[] value) {
      parenLeft320 = checkParenLeft320Constraints(value);
      serializeParenLeft320(parenLeft320);
   } 

     /**
	 * 	Update ParenLeft320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParenLeft320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParenLeft320,parenLeft320.length);
   	
   }
   
   public void setParenLeft320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParenLeft320,parenLeft320.length);
   	
   }
   
     /**
	 * 	Update ParenLeft320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParenLeft320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParenLeft320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParenLeft320 with another Field
	 *	@param value
	 */
   public void setParenLeft320(Field source) {
       replace(source,0,source.length(),beginParenLeft320,PAREN_LEFT_320_LEN);
   	
   }  
   
     /**
	 * 	Update ParenLeft320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParenLeft320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParenLeft320,PAREN_LEFT_320_LEN);
   	
   }
   
     /**
	 * 	Update ParenLeft320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParenLeft320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParenLeft320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parenRight320
	 *	@return parenRight320
	 */
   public char[] getParenRight320() throws CFException{
     if (isParenRight320Modified()) { 
        parenRight320 = refreshParenRight320();
     }
   		return parenRight320;
   }

  
	/**
	*  set variable parenRight320
	*  Corresponding COBOL Variable is 320-PAREN-RIGHT
	*  @param value
	**/
   public void setParenRight320(char[] value) {
      parenRight320 = checkParenRight320Constraints(value);
      serializeParenRight320(parenRight320);
   } 

     /**
	 * 	Update ParenRight320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParenRight320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParenRight320,parenRight320.length);
   	
   }
   
   public void setParenRight320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParenRight320,parenRight320.length);
   	
   }
   
     /**
	 * 	Update ParenRight320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParenRight320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParenRight320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParenRight320 with another Field
	 *	@param value
	 */
   public void setParenRight320(Field source) {
       replace(source,0,source.length(),beginParenRight320,PAREN_RIGHT_320_LEN);
   	
   }  
   
     /**
	 * 	Update ParenRight320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParenRight320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParenRight320,PAREN_RIGHT_320_LEN);
   	
   }
   
     /**
	 * 	Update ParenRight320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParenRight320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParenRight320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of null320
	 *	@return null320
	 */
   public char[] getNull320() throws CFException{
     if (isNull320Modified()) { 
        null320 = refreshNull320();
     }
   		return null320;
   }

  
	/**
	*  set variable null320
	*  Corresponding COBOL Variable is 320-NULL
	*  @param value
	**/
   public void setNull320(char[] value) {
      null320 = checkNull320Constraints(value);
      serializeNull320(null320);
   } 

     /**
	 * 	Update Null320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setNull320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginNull320,null320.length);
   	
   }
   
   public void setNull320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginNull320,null320.length);
   	
   }
   
     /**
	 * 	Update Null320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setNull320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNull320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Null320 with another Field
	 *	@param value
	 */
   public void setNull320(Field source) {
       replace(source,0,source.length(),beginNull320,NULL_320_LEN);
   	
   }  
   
     /**
	 * 	Update Null320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setNull320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginNull320,NULL_320_LEN);
   	
   }
   
     /**
	 * 	Update Null320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setNull320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginNull320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of litNa320
	 *	@return litNa320
	 */
   public char[] getLitNa320() throws CFException{
     if (isLitNa320Modified()) { 
        litNa320 = refreshLitNa320();
     }
   		return litNa320;
   }

  
	/**
	*  set variable litNa320
	*  Corresponding COBOL Variable is 320-LIT-NA
	*  @param value
	**/
   public void setLitNa320(char[] value) {
      litNa320 = checkLitNa320Constraints(value);
      serializeLitNa320(litNa320);
   } 

     /**
	 * 	Update LitNa320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLitNa320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLitNa320,litNa320.length);
   	
   }
   
   public void setLitNa320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLitNa320,litNa320.length);
   	
   }
   
     /**
	 * 	Update LitNa320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLitNa320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLitNa320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LitNa320 with another Field
	 *	@param value
	 */
   public void setLitNa320(Field source) {
       replace(source,0,source.length(),beginLitNa320,LIT_NA_320_LEN);
   	
   }  
   
     /**
	 * 	Update LitNa320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLitNa320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLitNa320,LIT_NA_320_LEN);
   	
   }
   
     /**
	 * 	Update LitNa320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLitNa320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLitNa320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmAr630010300
	 *	@return pgmAr630010300
	 */
   public char[] getPgmAr630010300() throws CFException{
     if (isPgmAr630010300Modified()) { 
        pgmAr630010300 = refreshPgmAr630010300();
     }
   		return pgmAr630010300;
   }

  
	/**
	*  set variable pgmAr630010300
	*  Corresponding COBOL Variable is 300-PGM-AR630010
	*  @param value
	**/
   public void setPgmAr630010300(char[] value) {
      pgmAr630010300 = checkPgmAr630010300Constraints(value);
      serializePgmAr630010300(pgmAr630010300);
   } 

     /**
	 * 	Update PgmAr630010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmAr630010300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmAr630010300,pgmAr630010300.length);
   	
   }
   
   public void setPgmAr630010300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr630010300,pgmAr630010300.length);
   	
   }
   
     /**
	 * 	Update PgmAr630010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmAr630010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr630010300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmAr630010300 with another Field
	 *	@param value
	 */
   public void setPgmAr630010300(Field source) {
       replace(source,0,source.length(),beginPgmAr630010300,PGM_AR_630010300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmAr630010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmAr630010300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmAr630010300,PGM_AR_630010300_LEN);
   	
   }
   
     /**
	 * 	Update PgmAr630010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmAr630010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr630010300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmAr631010300
	 *	@return pgmAr631010300
	 */
   public char[] getPgmAr631010300() throws CFException{
     if (isPgmAr631010300Modified()) { 
        pgmAr631010300 = refreshPgmAr631010300();
     }
   		return pgmAr631010300;
   }

  
	/**
	*  set variable pgmAr631010300
	*  Corresponding COBOL Variable is 300-PGM-AR631010
	*  @param value
	**/
   public void setPgmAr631010300(char[] value) {
      pgmAr631010300 = checkPgmAr631010300Constraints(value);
      serializePgmAr631010300(pgmAr631010300);
   } 

     /**
	 * 	Update PgmAr631010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmAr631010300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmAr631010300,pgmAr631010300.length);
   	
   }
   
   public void setPgmAr631010300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr631010300,pgmAr631010300.length);
   	
   }
   
     /**
	 * 	Update PgmAr631010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmAr631010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr631010300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmAr631010300 with another Field
	 *	@param value
	 */
   public void setPgmAr631010300(Field source) {
       replace(source,0,source.length(),beginPgmAr631010300,PGM_AR_631010300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmAr631010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmAr631010300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmAr631010300,PGM_AR_631010300_LEN);
   	
   }
   
     /**
	 * 	Update PgmAr631010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmAr631010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr631010300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmAr630020300
	 *	@return pgmAr630020300
	 */
   public char[] getPgmAr630020300() throws CFException{
     if (isPgmAr630020300Modified()) { 
        pgmAr630020300 = refreshPgmAr630020300();
     }
   		return pgmAr630020300;
   }

  
	/**
	*  set variable pgmAr630020300
	*  Corresponding COBOL Variable is 300-PGM-AR630020
	*  @param value
	**/
   public void setPgmAr630020300(char[] value) {
      pgmAr630020300 = checkPgmAr630020300Constraints(value);
      serializePgmAr630020300(pgmAr630020300);
   } 

     /**
	 * 	Update PgmAr630020300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmAr630020300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmAr630020300,pgmAr630020300.length);
   	
   }
   
   public void setPgmAr630020300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr630020300,pgmAr630020300.length);
   	
   }
   
     /**
	 * 	Update PgmAr630020300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmAr630020300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr630020300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmAr630020300 with another Field
	 *	@param value
	 */
   public void setPgmAr630020300(Field source) {
       replace(source,0,source.length(),beginPgmAr630020300,PGM_AR_630020300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmAr630020300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmAr630020300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmAr630020300,PGM_AR_630020300_LEN);
   	
   }
   
     /**
	 * 	Update PgmAr630020300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmAr630020300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmAr630020300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of addErrPara320
	 *	@return addErrPara320
	 */
   public char[] getAddErrPara320() throws CFException{
     if (isAddErrPara320Modified()) { 
        addErrPara320 = refreshAddErrPara320();
     }
   		return addErrPara320;
   }

  
	/**
	*  set variable addErrPara320
	*  Corresponding COBOL Variable is 320-ADD-ERR-PARA
	*  @param value
	**/
   public void setAddErrPara320(char[] value) {
      addErrPara320 = checkAddErrPara320Constraints(value);
      serializeAddErrPara320(addErrPara320);
   } 

     /**
	 * 	Update AddErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAddErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAddErrPara320,addErrPara320.length);
   	
   }
   
   public void setAddErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAddErrPara320,addErrPara320.length);
   	
   }
   
     /**
	 * 	Update AddErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAddErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAddErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AddErrPara320 with another Field
	 *	@param value
	 */
   public void setAddErrPara320(Field source) {
       replace(source,0,source.length(),beginAddErrPara320,ADD_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update AddErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAddErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAddErrPara320,ADD_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update AddErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAddErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAddErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of bulkErrPara320
	 *	@return bulkErrPara320
	 */
   public char[] getBulkErrPara320() throws CFException{
     if (isBulkErrPara320Modified()) { 
        bulkErrPara320 = refreshBulkErrPara320();
     }
   		return bulkErrPara320;
   }

  
	/**
	*  set variable bulkErrPara320
	*  Corresponding COBOL Variable is 320-BULK-ERR-PARA
	*  @param value
	**/
   public void setBulkErrPara320(char[] value) {
      bulkErrPara320 = checkBulkErrPara320Constraints(value);
      serializeBulkErrPara320(bulkErrPara320);
   } 

     /**
	 * 	Update BulkErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBulkErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBulkErrPara320,bulkErrPara320.length);
   	
   }
   
   public void setBulkErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBulkErrPara320,bulkErrPara320.length);
   	
   }
   
     /**
	 * 	Update BulkErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBulkErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BulkErrPara320 with another Field
	 *	@param value
	 */
   public void setBulkErrPara320(Field source) {
       replace(source,0,source.length(),beginBulkErrPara320,BULK_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update BulkErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBulkErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBulkErrPara320,BULK_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update BulkErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBulkErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBulkErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of listErrPara320
	 *	@return listErrPara320
	 */
   public char[] getListErrPara320() throws CFException{
     if (isListErrPara320Modified()) { 
        listErrPara320 = refreshListErrPara320();
     }
   		return listErrPara320;
   }

  
	/**
	*  set variable listErrPara320
	*  Corresponding COBOL Variable is 320-LIST-ERR-PARA
	*  @param value
	**/
   public void setListErrPara320(char[] value) {
      listErrPara320 = checkListErrPara320Constraints(value);
      serializeListErrPara320(listErrPara320);
   } 

     /**
	 * 	Update ListErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setListErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginListErrPara320,listErrPara320.length);
   	
   }
   
   public void setListErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginListErrPara320,listErrPara320.length);
   	
   }
   
     /**
	 * 	Update ListErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setListErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ListErrPara320 with another Field
	 *	@param value
	 */
   public void setListErrPara320(Field source) {
       replace(source,0,source.length(),beginListErrPara320,LIST_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update ListErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setListErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginListErrPara320,LIST_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update ListErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setListErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginListErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sendErrPara320
	 *	@return sendErrPara320
	 */
   public char[] getSendErrPara320() throws CFException{
     if (isSendErrPara320Modified()) { 
        sendErrPara320 = refreshSendErrPara320();
     }
   		return sendErrPara320;
   }

  
	/**
	*  set variable sendErrPara320
	*  Corresponding COBOL Variable is 320-SEND-ERR-PARA
	*  @param value
	**/
   public void setSendErrPara320(char[] value) {
      sendErrPara320 = checkSendErrPara320Constraints(value);
      serializeSendErrPara320(sendErrPara320);
   } 

     /**
	 * 	Update SendErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSendErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSendErrPara320,sendErrPara320.length);
   	
   }
   
   public void setSendErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSendErrPara320,sendErrPara320.length);
   	
   }
   
     /**
	 * 	Update SendErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSendErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSendErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SendErrPara320 with another Field
	 *	@param value
	 */
   public void setSendErrPara320(Field source) {
       replace(source,0,source.length(),beginSendErrPara320,SEND_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update SendErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSendErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSendErrPara320,SEND_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update SendErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSendErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSendErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of reloadErrPara320
	 *	@return reloadErrPara320
	 */
   public char[] getReloadErrPara320() throws CFException{
     if (isReloadErrPara320Modified()) { 
        reloadErrPara320 = refreshReloadErrPara320();
     }
   		return reloadErrPara320;
   }

  
	/**
	*  set variable reloadErrPara320
	*  Corresponding COBOL Variable is 320-RELOAD-ERR-PARA
	*  @param value
	**/
   public void setReloadErrPara320(char[] value) {
      reloadErrPara320 = checkReloadErrPara320Constraints(value);
      serializeReloadErrPara320(reloadErrPara320);
   } 

     /**
	 * 	Update ReloadErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReloadErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReloadErrPara320,reloadErrPara320.length);
   	
   }
   
   public void setReloadErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReloadErrPara320,reloadErrPara320.length);
   	
   }
   
     /**
	 * 	Update ReloadErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReloadErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReloadErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReloadErrPara320 with another Field
	 *	@param value
	 */
   public void setReloadErrPara320(Field source) {
       replace(source,0,source.length(),beginReloadErrPara320,RELOAD_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update ReloadErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReloadErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReloadErrPara320,RELOAD_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update ReloadErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReloadErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReloadErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of installErrPara320
	 *	@return installErrPara320
	 */
   public char[] getInstallErrPara320() throws CFException{
     if (isInstallErrPara320Modified()) { 
        installErrPara320 = refreshInstallErrPara320();
     }
   		return installErrPara320;
   }

  
	/**
	*  set variable installErrPara320
	*  Corresponding COBOL Variable is 320-INSTALL-ERR-PARA
	*  @param value
	**/
   public void setInstallErrPara320(char[] value) {
      installErrPara320 = checkInstallErrPara320Constraints(value);
      serializeInstallErrPara320(installErrPara320);
   } 

     /**
	 * 	Update InstallErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setInstallErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginInstallErrPara320,installErrPara320.length);
   	
   }
   
   public void setInstallErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginInstallErrPara320,installErrPara320.length);
   	
   }
   
     /**
	 * 	Update InstallErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setInstallErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInstallErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update InstallErrPara320 with another Field
	 *	@param value
	 */
   public void setInstallErrPara320(Field source) {
       replace(source,0,source.length(),beginInstallErrPara320,INSTALL_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update InstallErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setInstallErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginInstallErrPara320,INSTALL_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update InstallErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setInstallErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginInstallErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of retrvErrPara320
	 *	@return retrvErrPara320
	 */
   public char[] getRetrvErrPara320() throws CFException{
     if (isRetrvErrPara320Modified()) { 
        retrvErrPara320 = refreshRetrvErrPara320();
     }
   		return retrvErrPara320;
   }

  
	/**
	*  set variable retrvErrPara320
	*  Corresponding COBOL Variable is 320-RETRV-ERR-PARA
	*  @param value
	**/
   public void setRetrvErrPara320(char[] value) {
      retrvErrPara320 = checkRetrvErrPara320Constraints(value);
      serializeRetrvErrPara320(retrvErrPara320);
   } 

     /**
	 * 	Update RetrvErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRetrvErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRetrvErrPara320,retrvErrPara320.length);
   	
   }
   
   public void setRetrvErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRetrvErrPara320,retrvErrPara320.length);
   	
   }
   
     /**
	 * 	Update RetrvErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRetrvErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetrvErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RetrvErrPara320 with another Field
	 *	@param value
	 */
   public void setRetrvErrPara320(Field source) {
       replace(source,0,source.length(),beginRetrvErrPara320,RETRV_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update RetrvErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRetrvErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRetrvErrPara320,RETRV_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update RetrvErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRetrvErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRetrvErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of unldCompPara320
	 *	@return unldCompPara320
	 */
   public char[] getUnldCompPara320() throws CFException{
     if (isUnldCompPara320Modified()) { 
        unldCompPara320 = refreshUnldCompPara320();
     }
   		return unldCompPara320;
   }

  
	/**
	*  set variable unldCompPara320
	*  Corresponding COBOL Variable is 320-UNLD-COMP-PARA
	*  @param value
	**/
   public void setUnldCompPara320(char[] value) {
      unldCompPara320 = checkUnldCompPara320Constraints(value);
      serializeUnldCompPara320(unldCompPara320);
   } 

     /**
	 * 	Update UnldCompPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUnldCompPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUnldCompPara320,unldCompPara320.length);
   	
   }
   
   public void setUnldCompPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUnldCompPara320,unldCompPara320.length);
   	
   }
   
     /**
	 * 	Update UnldCompPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUnldCompPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUnldCompPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UnldCompPara320 with another Field
	 *	@param value
	 */
   public void setUnldCompPara320(Field source) {
       replace(source,0,source.length(),beginUnldCompPara320,UNLD_COMP_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update UnldCompPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUnldCompPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUnldCompPara320,UNLD_COMP_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update UnldCompPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUnldCompPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUnldCompPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of unldErrPara320
	 *	@return unldErrPara320
	 */
   public char[] getUnldErrPara320() throws CFException{
     if (isUnldErrPara320Modified()) { 
        unldErrPara320 = refreshUnldErrPara320();
     }
   		return unldErrPara320;
   }

  
	/**
	*  set variable unldErrPara320
	*  Corresponding COBOL Variable is 320-UNLD-ERR-PARA
	*  @param value
	**/
   public void setUnldErrPara320(char[] value) {
      unldErrPara320 = checkUnldErrPara320Constraints(value);
      serializeUnldErrPara320(unldErrPara320);
   } 

     /**
	 * 	Update UnldErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setUnldErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginUnldErrPara320,unldErrPara320.length);
   	
   }
   
   public void setUnldErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginUnldErrPara320,unldErrPara320.length);
   	
   }
   
     /**
	 * 	Update UnldErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setUnldErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUnldErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update UnldErrPara320 with another Field
	 *	@param value
	 */
   public void setUnldErrPara320(Field source) {
       replace(source,0,source.length(),beginUnldErrPara320,UNLD_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update UnldErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setUnldErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginUnldErrPara320,UNLD_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update UnldErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setUnldErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginUnldErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of restageErrPara320
	 *	@return restageErrPara320
	 */
   public char[] getRestageErrPara320() throws CFException{
     if (isRestageErrPara320Modified()) { 
        restageErrPara320 = refreshRestageErrPara320();
     }
   		return restageErrPara320;
   }

  
	/**
	*  set variable restageErrPara320
	*  Corresponding COBOL Variable is 320-RESTAGE-ERR-PARA
	*  @param value
	**/
   public void setRestageErrPara320(char[] value) {
      restageErrPara320 = checkRestageErrPara320Constraints(value);
      serializeRestageErrPara320(restageErrPara320);
   } 

     /**
	 * 	Update RestageErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRestageErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRestageErrPara320,restageErrPara320.length);
   	
   }
   
   public void setRestageErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRestageErrPara320,restageErrPara320.length);
   	
   }
   
     /**
	 * 	Update RestageErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRestageErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRestageErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RestageErrPara320 with another Field
	 *	@param value
	 */
   public void setRestageErrPara320(Field source) {
       replace(source,0,source.length(),beginRestageErrPara320,RESTAGE_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update RestageErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRestageErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRestageErrPara320,RESTAGE_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update RestageErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRestageErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRestageErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of preExitErrPara320
	 *	@return preExitErrPara320
	 */
   public char[] getPreExitErrPara320() throws CFException{
     if (isPreExitErrPara320Modified()) { 
        preExitErrPara320 = refreshPreExitErrPara320();
     }
   		return preExitErrPara320;
   }

  
	/**
	*  set variable preExitErrPara320
	*  Corresponding COBOL Variable is 320-PRE-EXIT-ERR-PARA
	*  @param value
	**/
   public void setPreExitErrPara320(char[] value) {
      preExitErrPara320 = checkPreExitErrPara320Constraints(value);
      serializePreExitErrPara320(preExitErrPara320);
   } 

     /**
	 * 	Update PreExitErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPreExitErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPreExitErrPara320,preExitErrPara320.length);
   	
   }
   
   public void setPreExitErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPreExitErrPara320,preExitErrPara320.length);
   	
   }
   
     /**
	 * 	Update PreExitErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPreExitErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPreExitErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PreExitErrPara320 with another Field
	 *	@param value
	 */
   public void setPreExitErrPara320(Field source) {
       replace(source,0,source.length(),beginPreExitErrPara320,PRE_EXIT_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update PreExitErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPreExitErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPreExitErrPara320,PRE_EXIT_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update PreExitErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPreExitErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPreExitErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of capturePara320
	 *	@return capturePara320
	 */
   public char[] getCapturePara320() throws CFException{
     if (isCapturePara320Modified()) { 
        capturePara320 = refreshCapturePara320();
     }
   		return capturePara320;
   }

  
	/**
	*  set variable capturePara320
	*  Corresponding COBOL Variable is 320-CAPTURE-PARA
	*  @param value
	**/
   public void setCapturePara320(char[] value) {
      capturePara320 = checkCapturePara320Constraints(value);
      serializeCapturePara320(capturePara320);
   } 

     /**
	 * 	Update CapturePara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCapturePara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCapturePara320,capturePara320.length);
   	
   }
   
   public void setCapturePara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCapturePara320,capturePara320.length);
   	
   }
   
     /**
	 * 	Update CapturePara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCapturePara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCapturePara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CapturePara320 with another Field
	 *	@param value
	 */
   public void setCapturePara320(Field source) {
       replace(source,0,source.length(),beginCapturePara320,CAPTURE_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update CapturePara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCapturePara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCapturePara320,CAPTURE_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update CapturePara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCapturePara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCapturePara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of parmErrPara320
	 *	@return parmErrPara320
	 */
   public char[] getParmErrPara320() throws CFException{
     if (isParmErrPara320Modified()) { 
        parmErrPara320 = refreshParmErrPara320();
     }
   		return parmErrPara320;
   }

  
	/**
	*  set variable parmErrPara320
	*  Corresponding COBOL Variable is 320-PARM-ERR-PARA
	*  @param value
	**/
   public void setParmErrPara320(char[] value) {
      parmErrPara320 = checkParmErrPara320Constraints(value);
      serializeParmErrPara320(parmErrPara320);
   } 

     /**
	 * 	Update ParmErrPara320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setParmErrPara320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginParmErrPara320,parmErrPara320.length);
   	
   }
   
   public void setParmErrPara320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginParmErrPara320,parmErrPara320.length);
   	
   }
   
     /**
	 * 	Update ParmErrPara320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setParmErrPara320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmErrPara320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ParmErrPara320 with another Field
	 *	@param value
	 */
   public void setParmErrPara320(Field source) {
       replace(source,0,source.length(),beginParmErrPara320,PARM_ERR_PARA_320_LEN);
   	
   }  
   
     /**
	 * 	Update ParmErrPara320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setParmErrPara320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginParmErrPara320,PARM_ERR_PARA_320_LEN);
   	
   }
   
     /**
	 * 	Update ParmErrPara320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setParmErrPara320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginParmErrPara320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of endpointFileProfile320
	 *	@return endpointFileProfile320
	 */   
	 public EndpointFileProfile320 getEndpointFileProfile320() {
   	return endpointFileProfile320;
   }
   /**
	* 	Update EndpointFileProfile320 with the passed value
	*   Corresponding COBOL Variable is 320-ENDPOINT-FILE-PROFILE
	*	@param value
	*/
   public void setEndpointFileProfile320(char[] value) {
      endpointFileProfile320.setString(value); 
   }   
    
     /**
	 * 	Update EndpointFileProfile320 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setEndpointFileProfile320(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,endpointFileProfile320.begin,endpointFileProfile320.length());
   }
   
     /**
	 * 	Update EndpointFileProfile320 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setEndpointFileProfile320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,endpointFileProfile320.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update EndpointFileProfile320 with another Field
	 *	@param value
	 */
   public void setEndpointFileProfile320(Field source) {
   	replace(source,0,source.length(),endpointFileProfile320.begin,endpointFileProfile320.length());
   }  
   
     /**
	 * 	Update EndpointFileProfile320 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setEndpointFileProfile320(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,endpointFileProfile320.begin,endpointFileProfile320.length());
   }
   
     /**
	 * 	Update EndpointFileProfile320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setEndpointFileProfile320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,endpointFileProfile320.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of applicationFile320
	 *	@return applicationFile320
	 */
   public char[] getApplicationFile320() throws CFException{
     if (isApplicationFile320Modified()) { 
        applicationFile320 = refreshApplicationFile320();
     }
   		return applicationFile320;
   }

  
	/**
	*  set variable applicationFile320
	*  Corresponding COBOL Variable is 320-APPLICATION-FILE
	*  @param value
	**/
   public void setApplicationFile320(char[] value) {
      applicationFile320 = checkApplicationFile320Constraints(value);
      serializeApplicationFile320(applicationFile320);
   } 

     /**
	 * 	Update ApplicationFile320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setApplicationFile320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginApplicationFile320,applicationFile320.length);
   	
   }
   
   public void setApplicationFile320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationFile320,applicationFile320.length);
   	
   }
   
     /**
	 * 	Update ApplicationFile320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setApplicationFile320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationFile320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ApplicationFile320 with another Field
	 *	@param value
	 */
   public void setApplicationFile320(Field source) {
       replace(source,0,source.length(),beginApplicationFile320,APPLICATION_FILE_320_LEN);
   	
   }  
   
     /**
	 * 	Update ApplicationFile320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setApplicationFile320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginApplicationFile320,APPLICATION_FILE_320_LEN);
   	
   }
   
     /**
	 * 	Update ApplicationFile320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setApplicationFile320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginApplicationFile320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of gftFile320
	 *	@return gftFile320
	 */
   public char[] getGftFile320() throws CFException{
     if (isGftFile320Modified()) { 
        gftFile320 = refreshGftFile320();
     }
   		return gftFile320;
   }

  
	/**
	*  set variable gftFile320
	*  Corresponding COBOL Variable is 320-GFT-FILE
	*  @param value
	**/
   public void setGftFile320(char[] value) {
      gftFile320 = checkGftFile320Constraints(value);
      serializeGftFile320(gftFile320);
   } 

     /**
	 * 	Update GftFile320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setGftFile320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginGftFile320,gftFile320.length);
   	
   }
   
   public void setGftFile320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginGftFile320,gftFile320.length);
   	
   }
   
     /**
	 * 	Update GftFile320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setGftFile320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftFile320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update GftFile320 with another Field
	 *	@param value
	 */
   public void setGftFile320(Field source) {
       replace(source,0,source.length(),beginGftFile320,GFT_FILE_320_LEN);
   	
   }  
   
     /**
	 * 	Update GftFile320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setGftFile320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginGftFile320,GFT_FILE_320_LEN);
   	
   }
   
     /**
	 * 	Update GftFile320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setGftFile320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginGftFile320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recordFormat320
	 *	@return recordFormat320
	 */
   public char[] getRecordFormat320() throws CFException{
     if (isRecordFormat320Modified()) { 
        recordFormat320 = refreshRecordFormat320();
     }
   		return recordFormat320;
   }

  
	/**
	*  set variable recordFormat320
	*  Corresponding COBOL Variable is 320-RECORD-FORMAT
	*  @param value
	**/
   public void setRecordFormat320(char[] value) {
      recordFormat320 = checkRecordFormat320Constraints(value);
      serializeRecordFormat320(recordFormat320);
   } 

     /**
	 * 	Update RecordFormat320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecordFormat320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecordFormat320,recordFormat320.length);
   	
   }
   
   public void setRecordFormat320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecordFormat320,recordFormat320.length);
   	
   }
   
     /**
	 * 	Update RecordFormat320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecordFormat320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecordFormat320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecordFormat320 with another Field
	 *	@param value
	 */
   public void setRecordFormat320(Field source) {
       replace(source,0,source.length(),beginRecordFormat320,RECORD_FORMAT_320_LEN);
   	
   }  
   
     /**
	 * 	Update RecordFormat320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecordFormat320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecordFormat320,RECORD_FORMAT_320_LEN);
   	
   }
   
     /**
	 * 	Update RecordFormat320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecordFormat320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecordFormat320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of blockSize320
	 *	@return blockSize320
	 */
   public char[] getBlockSize320() throws CFException{
     if (isBlockSize320Modified()) { 
        blockSize320 = refreshBlockSize320();
     }
   		return blockSize320;
   }

  
	/**
	*  set variable blockSize320
	*  Corresponding COBOL Variable is 320-BLOCK-SIZE
	*  @param value
	**/
   public void setBlockSize320(char[] value) {
      blockSize320 = checkBlockSize320Constraints(value);
      serializeBlockSize320(blockSize320);
   } 

     /**
	 * 	Update BlockSize320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBlockSize320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBlockSize320,blockSize320.length);
   	
   }
   
   public void setBlockSize320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBlockSize320,blockSize320.length);
   	
   }
   
     /**
	 * 	Update BlockSize320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBlockSize320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBlockSize320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BlockSize320 with another Field
	 *	@param value
	 */
   public void setBlockSize320(Field source) {
       replace(source,0,source.length(),beginBlockSize320,BLOCK_SIZE_320_LEN);
   	
   }  
   
     /**
	 * 	Update BlockSize320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBlockSize320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBlockSize320,BLOCK_SIZE_320_LEN);
   	
   }
   
     /**
	 * 	Update BlockSize320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBlockSize320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBlockSize320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of recordLength320
	 *	@return recordLength320
	 */
   public char[] getRecordLength320() throws CFException{
     if (isRecordLength320Modified()) { 
        recordLength320 = refreshRecordLength320();
     }
   		return recordLength320;
   }

  
	/**
	*  set variable recordLength320
	*  Corresponding COBOL Variable is 320-RECORD-LENGTH
	*  @param value
	**/
   public void setRecordLength320(char[] value) {
      recordLength320 = checkRecordLength320Constraints(value);
      serializeRecordLength320(recordLength320);
   } 

     /**
	 * 	Update RecordLength320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setRecordLength320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginRecordLength320,recordLength320.length);
   	
   }
   
   public void setRecordLength320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginRecordLength320,recordLength320.length);
   	
   }
   
     /**
	 * 	Update RecordLength320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRecordLength320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecordLength320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update RecordLength320 with another Field
	 *	@param value
	 */
   public void setRecordLength320(Field source) {
       replace(source,0,source.length(),beginRecordLength320,RECORD_LENGTH_320_LEN);
   	
   }  
   
     /**
	 * 	Update RecordLength320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setRecordLength320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginRecordLength320,RECORD_LENGTH_320_LEN);
   	
   }
   
     /**
	 * 	Update RecordLength320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRecordLength320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginRecordLength320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of systemIdentifier320
	 *	@return systemIdentifier320
	 */
   public char[] getSystemIdentifier320() throws CFException{
     if (isSystemIdentifier320Modified()) { 
        systemIdentifier320 = refreshSystemIdentifier320();
     }
   		return systemIdentifier320;
   }

  
	/**
	*  set variable systemIdentifier320
	*  Corresponding COBOL Variable is 320-SYSTEM-IDENTIFIER
	*  @param value
	**/
   public void setSystemIdentifier320(char[] value) {
      systemIdentifier320 = checkSystemIdentifier320Constraints(value);
      serializeSystemIdentifier320(systemIdentifier320);
   } 

     /**
	 * 	Update SystemIdentifier320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSystemIdentifier320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSystemIdentifier320,systemIdentifier320.length);
   	
   }
   
   public void setSystemIdentifier320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSystemIdentifier320,systemIdentifier320.length);
   	
   }
   
     /**
	 * 	Update SystemIdentifier320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSystemIdentifier320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSystemIdentifier320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update SystemIdentifier320 with another Field
	 *	@param value
	 */
   public void setSystemIdentifier320(Field source) {
       replace(source,0,source.length(),beginSystemIdentifier320,SYSTEM_IDENTIFIER_320_LEN);
   	
   }  
   
     /**
	 * 	Update SystemIdentifier320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSystemIdentifier320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSystemIdentifier320,SYSTEM_IDENTIFIER_320_LEN);
   	
   }
   
     /**
	 * 	Update SystemIdentifier320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSystemIdentifier320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSystemIdentifier320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of exitDsn320
	 *	@return exitDsn320
	 */
   public char[] getExitDsn320() throws CFException{
     if (isExitDsn320Modified()) { 
        exitDsn320 = refreshExitDsn320();
     }
   		return exitDsn320;
   }

  
	/**
	*  set variable exitDsn320
	*  Corresponding COBOL Variable is 320-EXIT-DSN
	*  @param value
	**/
   public void setExitDsn320(char[] value) {
      exitDsn320 = checkExitDsn320Constraints(value);
      serializeExitDsn320(exitDsn320);
   } 

     /**
	 * 	Update ExitDsn320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setExitDsn320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginExitDsn320,exitDsn320.length);
   	
   }
   
   public void setExitDsn320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginExitDsn320,exitDsn320.length);
   	
   }
   
     /**
	 * 	Update ExitDsn320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setExitDsn320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExitDsn320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ExitDsn320 with another Field
	 *	@param value
	 */
   public void setExitDsn320(Field source) {
       replace(source,0,source.length(),beginExitDsn320,EXIT_DSN_320_LEN);
   	
   }  
   
     /**
	 * 	Update ExitDsn320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setExitDsn320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginExitDsn320,EXIT_DSN_320_LEN);
   	
   }
   
     /**
	 * 	Update ExitDsn320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setExitDsn320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginExitDsn320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of allocationType320
	 *	@return allocationType320
	 */
   public char[] getAllocationType320() throws CFException{
     if (isAllocationType320Modified()) { 
        allocationType320 = refreshAllocationType320();
     }
   		return allocationType320;
   }

  
	/**
	*  set variable allocationType320
	*  Corresponding COBOL Variable is 320-ALLOCATION-TYPE
	*  @param value
	**/
   public void setAllocationType320(char[] value) {
      allocationType320 = checkAllocationType320Constraints(value);
      serializeAllocationType320(allocationType320);
   } 

     /**
	 * 	Update AllocationType320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAllocationType320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAllocationType320,allocationType320.length);
   	
   }
   
   public void setAllocationType320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAllocationType320,allocationType320.length);
   	
   }
   
     /**
	 * 	Update AllocationType320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAllocationType320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocationType320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AllocationType320 with another Field
	 *	@param value
	 */
   public void setAllocationType320(Field source) {
       replace(source,0,source.length(),beginAllocationType320,ALLOCATION_TYPE_320_LEN);
   	
   }  
   
     /**
	 * 	Update AllocationType320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAllocationType320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAllocationType320,ALLOCATION_TYPE_320_LEN);
   	
   }
   
     /**
	 * 	Update AllocationType320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAllocationType320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAllocationType320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastEndptQual320
	 *	@return broadcastEndptQual320
	 */
   public char[] getBroadcastEndptQual320() throws CFException{
     if (isBroadcastEndptQual320Modified()) { 
        broadcastEndptQual320 = refreshBroadcastEndptQual320();
     }
   		return broadcastEndptQual320;
   }

  
	/**
	*  set variable broadcastEndptQual320
	*  Corresponding COBOL Variable is 320-BROADCAST-ENDPT-QUAL
	*  @param value
	**/
   public void setBroadcastEndptQual320(char[] value) {
      broadcastEndptQual320 = checkBroadcastEndptQual320Constraints(value);
      serializeBroadcastEndptQual320(broadcastEndptQual320);
   } 

     /**
	 * 	Update BroadcastEndptQual320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastEndptQual320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastEndptQual320,broadcastEndptQual320.length);
   	
   }
   
   public void setBroadcastEndptQual320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptQual320,broadcastEndptQual320.length);
   	
   }
   
     /**
	 * 	Update BroadcastEndptQual320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastEndptQual320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptQual320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastEndptQual320 with another Field
	 *	@param value
	 */
   public void setBroadcastEndptQual320(Field source) {
       replace(source,0,source.length(),beginBroadcastEndptQual320,BROADCAST_ENDPT_QUAL_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastEndptQual320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastEndptQual320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastEndptQual320,BROADCAST_ENDPT_QUAL_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastEndptQual320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastEndptQual320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptQual320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastStatusCounts320
	 *	@return broadcastStatusCounts320
	 */
   public char[] getBroadcastStatusCounts320() throws CFException{
     if (isBroadcastStatusCounts320Modified()) { 
        broadcastStatusCounts320 = refreshBroadcastStatusCounts320();
     }
   		return broadcastStatusCounts320;
   }

  
	/**
	*  set variable broadcastStatusCounts320
	*  Corresponding COBOL Variable is 320-BROADCAST-STATUS-COUNTS
	*  @param value
	**/
   public void setBroadcastStatusCounts320(char[] value) {
      broadcastStatusCounts320 = checkBroadcastStatusCounts320Constraints(value);
      serializeBroadcastStatusCounts320(broadcastStatusCounts320);
   } 

     /**
	 * 	Update BroadcastStatusCounts320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastStatusCounts320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastStatusCounts320,broadcastStatusCounts320.length);
   	
   }
   
   public void setBroadcastStatusCounts320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastStatusCounts320,broadcastStatusCounts320.length);
   	
   }
   
     /**
	 * 	Update BroadcastStatusCounts320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastStatusCounts320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastStatusCounts320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastStatusCounts320 with another Field
	 *	@param value
	 */
   public void setBroadcastStatusCounts320(Field source) {
       replace(source,0,source.length(),beginBroadcastStatusCounts320,BROADCAST_STATUS_COUNTS_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastStatusCounts320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastStatusCounts320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastStatusCounts320,BROADCAST_STATUS_COUNTS_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastStatusCounts320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastStatusCounts320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastStatusCounts320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastStatusDashes320
	 *	@return broadcastStatusDashes320
	 */
   public char[] getBroadcastStatusDashes320() throws CFException{
     if (isBroadcastStatusDashes320Modified()) { 
        broadcastStatusDashes320 = refreshBroadcastStatusDashes320();
     }
   		return broadcastStatusDashes320;
   }

  
	/**
	*  set variable broadcastStatusDashes320
	*  Corresponding COBOL Variable is 320-BROADCAST-STATUS-DASHES
	*  @param value
	**/
   public void setBroadcastStatusDashes320(char[] value) {
      broadcastStatusDashes320 = checkBroadcastStatusDashes320Constraints(value);
      serializeBroadcastStatusDashes320(broadcastStatusDashes320);
   } 

     /**
	 * 	Update BroadcastStatusDashes320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastStatusDashes320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastStatusDashes320,broadcastStatusDashes320.length);
   	
   }
   
   public void setBroadcastStatusDashes320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastStatusDashes320,broadcastStatusDashes320.length);
   	
   }
   
     /**
	 * 	Update BroadcastStatusDashes320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastStatusDashes320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastStatusDashes320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastStatusDashes320 with another Field
	 *	@param value
	 */
   public void setBroadcastStatusDashes320(Field source) {
       replace(source,0,source.length(),beginBroadcastStatusDashes320,BROADCAST_STATUS_DASHES_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastStatusDashes320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastStatusDashes320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastStatusDashes320,BROADCAST_STATUS_DASHES_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastStatusDashes320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastStatusDashes320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastStatusDashes320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastTargetRecords320
	 *	@return broadcastTargetRecords320
	 */
   public char[] getBroadcastTargetRecords320() throws CFException{
     if (isBroadcastTargetRecords320Modified()) { 
        broadcastTargetRecords320 = refreshBroadcastTargetRecords320();
     }
   		return broadcastTargetRecords320;
   }

  
	/**
	*  set variable broadcastTargetRecords320
	*  Corresponding COBOL Variable is 320-BROADCAST-TARGET-RECORDS
	*  @param value
	**/
   public void setBroadcastTargetRecords320(char[] value) {
      broadcastTargetRecords320 = checkBroadcastTargetRecords320Constraints(value);
      serializeBroadcastTargetRecords320(broadcastTargetRecords320);
   } 

     /**
	 * 	Update BroadcastTargetRecords320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastTargetRecords320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastTargetRecords320,broadcastTargetRecords320.length);
   	
   }
   
   public void setBroadcastTargetRecords320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastTargetRecords320,broadcastTargetRecords320.length);
   	
   }
   
     /**
	 * 	Update BroadcastTargetRecords320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastTargetRecords320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastTargetRecords320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastTargetRecords320 with another Field
	 *	@param value
	 */
   public void setBroadcastTargetRecords320(Field source) {
       replace(source,0,source.length(),beginBroadcastTargetRecords320,BROADCAST_TARGET_RECORDS_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastTargetRecords320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastTargetRecords320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastTargetRecords320,BROADCAST_TARGET_RECORDS_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastTargetRecords320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastTargetRecords320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastTargetRecords320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastTargetBytes320
	 *	@return broadcastTargetBytes320
	 */
   public char[] getBroadcastTargetBytes320() throws CFException{
     if (isBroadcastTargetBytes320Modified()) { 
        broadcastTargetBytes320 = refreshBroadcastTargetBytes320();
     }
   		return broadcastTargetBytes320;
   }

  
	/**
	*  set variable broadcastTargetBytes320
	*  Corresponding COBOL Variable is 320-BROADCAST-TARGET-BYTES
	*  @param value
	**/
   public void setBroadcastTargetBytes320(char[] value) {
      broadcastTargetBytes320 = checkBroadcastTargetBytes320Constraints(value);
      serializeBroadcastTargetBytes320(broadcastTargetBytes320);
   } 

     /**
	 * 	Update BroadcastTargetBytes320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastTargetBytes320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastTargetBytes320,broadcastTargetBytes320.length);
   	
   }
   
   public void setBroadcastTargetBytes320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastTargetBytes320,broadcastTargetBytes320.length);
   	
   }
   
     /**
	 * 	Update BroadcastTargetBytes320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastTargetBytes320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastTargetBytes320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastTargetBytes320 with another Field
	 *	@param value
	 */
   public void setBroadcastTargetBytes320(Field source) {
       replace(source,0,source.length(),beginBroadcastTargetBytes320,BROADCAST_TARGET_BYTES_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastTargetBytes320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastTargetBytes320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastTargetBytes320,BROADCAST_TARGET_BYTES_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastTargetBytes320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastTargetBytes320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastTargetBytes320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastEndptsValid320
	 *	@return broadcastEndptsValid320
	 */
   public char[] getBroadcastEndptsValid320() throws CFException{
     if (isBroadcastEndptsValid320Modified()) { 
        broadcastEndptsValid320 = refreshBroadcastEndptsValid320();
     }
   		return broadcastEndptsValid320;
   }

  
	/**
	*  set variable broadcastEndptsValid320
	*  Corresponding COBOL Variable is 320-BROADCAST-ENDPTS-VALID
	*  @param value
	**/
   public void setBroadcastEndptsValid320(char[] value) {
      broadcastEndptsValid320 = checkBroadcastEndptsValid320Constraints(value);
      serializeBroadcastEndptsValid320(broadcastEndptsValid320);
   } 

     /**
	 * 	Update BroadcastEndptsValid320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastEndptsValid320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastEndptsValid320,broadcastEndptsValid320.length);
   	
   }
   
   public void setBroadcastEndptsValid320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptsValid320,broadcastEndptsValid320.length);
   	
   }
   
     /**
	 * 	Update BroadcastEndptsValid320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastEndptsValid320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptsValid320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastEndptsValid320 with another Field
	 *	@param value
	 */
   public void setBroadcastEndptsValid320(Field source) {
       replace(source,0,source.length(),beginBroadcastEndptsValid320,BROADCAST_ENDPTS_VALID_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastEndptsValid320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastEndptsValid320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastEndptsValid320,BROADCAST_ENDPTS_VALID_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastEndptsValid320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastEndptsValid320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptsValid320+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of broadcastEndptsErrors320
	 *	@return broadcastEndptsErrors320
	 */
   public char[] getBroadcastEndptsErrors320() throws CFException{
     if (isBroadcastEndptsErrors320Modified()) { 
        broadcastEndptsErrors320 = refreshBroadcastEndptsErrors320();
     }
   		return broadcastEndptsErrors320;
   }

  
	/**
	*  set variable broadcastEndptsErrors320
	*  Corresponding COBOL Variable is 320-BROADCAST-ENDPTS-ERRORS
	*  @param value
	**/
   public void setBroadcastEndptsErrors320(char[] value) {
      broadcastEndptsErrors320 = checkBroadcastEndptsErrors320Constraints(value);
      serializeBroadcastEndptsErrors320(broadcastEndptsErrors320);
   } 

     /**
	 * 	Update BroadcastEndptsErrors320 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setBroadcastEndptsErrors320(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginBroadcastEndptsErrors320,broadcastEndptsErrors320.length);
   	
   }
   
   public void setBroadcastEndptsErrors320(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptsErrors320,broadcastEndptsErrors320.length);
   	
   }
   
     /**
	 * 	Update BroadcastEndptsErrors320 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastEndptsErrors320(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptsErrors320+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update BroadcastEndptsErrors320 with another Field
	 *	@param value
	 */
   public void setBroadcastEndptsErrors320(Field source) {
       replace(source,0,source.length(),beginBroadcastEndptsErrors320,BROADCAST_ENDPTS_ERRORS_320_LEN);
   	
   }  
   
     /**
	 * 	Update BroadcastEndptsErrors320 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setBroadcastEndptsErrors320(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginBroadcastEndptsErrors320,BROADCAST_ENDPTS_ERRORS_320_LEN);
   	
   }
   
     /**
	 * 	Update BroadcastEndptsErrors320 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setBroadcastEndptsErrors320(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginBroadcastEndptsErrors320+targetIndex,targetLen);
    
   }

	
	
	

		public static int getCharacterLiterals320FieldLength() {
			return CHARACTER_LITERALS_320_LENGTH;
		}

}
  
