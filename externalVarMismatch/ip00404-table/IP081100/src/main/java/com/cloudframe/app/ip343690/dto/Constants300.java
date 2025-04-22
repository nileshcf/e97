package com.cloudframe.app.ip343690.dto;

/**
*  The class Constants300 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:17. using version 5.0.0.254
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Constants300 extends Constants300Serialized {
   

						private char[] returnCode300 = new char[4];

						private char[] pgmVersion300 = new char[7];
				private PgmIp343690Group300 pgmIp343690Group300 = new PgmIp343690Group300();

						private char[] pgmIp081110300 = new char[8];

						private char[] pgmIp599810300 = new char[8];

						private char[] pgmIp280010300 = new char[8];

						private char[] pgmIp610010300 = new char[8];

						private char[] pgmMcwait300 = new char[6];

						private char[] pgmIp996010300 = new char[8];

						private char[] thisPgmDb2CollIdBase300 = new char[7];

								private short valueZero300;

								private short value01300;

								private short value100300;

								private int sql100300;

								private int sql904300;

								private int sql911300;

								private short cond0000300;

								private int value1300;

								private short nullValue300;

								private int value14300;

								private int value19300;

								private int value99300;

						private char[] errorValue300 = new char[1];

								private int valueRetry300;

						private char[] sys001OpAbendCode300 = new char[4];

						private char[] sys001RdAbendCode300 = new char[4];

						private char[] sys001ClAbendCode300 = new char[4];

						private char[] fetchPmaAbendCode300 = new char[4];

						private char[] openTipapmaCursor300 = new char[4];

						private char[] closeTipapmaCursor300 = new char[4];
	
	/**
	* Constructor for Constants300
	**/
    public Constants300() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			pgmIp343690Group300.setParent(this,getStartOffset() + 11);
	   	/*  end of offset */
								setReturnCode300(("9999").toCharArray());
								setPgmVersion300(getString(new byte[] {(byte)0x01,(byte)0x3D,(byte)0xA8,(byte)0x00,(byte)0x8B,(byte)0x2A,(byte)0x00}).toCharArray());
								setPgmIp081110300(("IP081110").toCharArray());
								setPgmIp599810300(("IP599810").toCharArray());
								setPgmIp280010300(("IP280010").toCharArray());
								setPgmIp610010300(("IP610010").toCharArray());
								setPgmMcwait300(("MCWAIT").toCharArray());
								setPgmIp996010300(("IP996010").toCharArray());
								setThisPgmDb2CollIdBase300(("COLLIPA").toCharArray());
								setValueZero300((short)0);
								setValue01300((short)1);
								setValue100300((short)100);
								setSql100300(100);
								setSql904300(-904);
								setSql911300(-911);
								setCond0000300((short)0);
								setValue1300(1);
								setNullValue300((short)-1);
								setValue14300(14);
								setValue19300(19);
								setValue99300(99);
								setErrorValue300(("1").toCharArray());
								setValueRetry300(5);
								setSys001OpAbendCode300(("3002").toCharArray());
								setSys001RdAbendCode300(("3003").toCharArray());
								setSys001ClAbendCode300(("3004").toCharArray());
								setFetchPmaAbendCode300(("3006").toCharArray());
								setOpenTipapmaCursor300(("3007").toCharArray());
								setCloseTipapmaCursor300(("3008").toCharArray());
    }


 

	/**
	 *	Returns the value of returnCode300
	 *	@return returnCode300
	 */
   public char[] getReturnCode300() throws CFException{
     if (isReturnCode300Modified()) { 
        returnCode300 = refreshReturnCode300();
     }
   		return returnCode300;
   }

  
	/**
	*  set variable returnCode300
	*  Corresponding COBOL Variable is 300-RETURN-CODE
	*  @param value
	**/
   public void setReturnCode300(char[] value) {
      returnCode300 = checkReturnCode300Constraints(value);
      serializeReturnCode300(returnCode300);
   } 

     /**
	 * 	Update ReturnCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setReturnCode300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginReturnCode300,returnCode300.length);
   	
   }
   
   public void setReturnCode300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginReturnCode300,returnCode300.length);
   	
   }
   
     /**
	 * 	Update ReturnCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setReturnCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReturnCode300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ReturnCode300 with another Field
	 *	@param value
	 */
   public void setReturnCode300(Field source) {
       replace(source,0,source.length(),beginReturnCode300,RETURN_CODE_300_LEN);
   	
   }  
   
     /**
	 * 	Update ReturnCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setReturnCode300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginReturnCode300,RETURN_CODE_300_LEN);
   	
   }
   
     /**
	 * 	Update ReturnCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setReturnCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginReturnCode300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmVersion300
	 *	@return pgmVersion300
	 */
   public char[] getPgmVersion300() throws CFException{
     if (isPgmVersion300Modified()) { 
        pgmVersion300 = refreshPgmVersion300();
     }
   		return pgmVersion300;
   }

  
	/**
	*  set variable pgmVersion300
	*  Corresponding COBOL Variable is 300-PGM-VERSION
	*  @param value
	**/
   public void setPgmVersion300(char[] value) {
      pgmVersion300 = checkPgmVersion300Constraints(value);
      serializePgmVersion300(pgmVersion300);
   } 

     /**
	 * 	Update PgmVersion300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmVersion300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmVersion300,pgmVersion300.length);
   	
   }
   
   public void setPgmVersion300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmVersion300,pgmVersion300.length);
   	
   }
   
     /**
	 * 	Update PgmVersion300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmVersion300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmVersion300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmVersion300 with another Field
	 *	@param value
	 */
   public void setPgmVersion300(Field source) {
       replace(source,0,source.length(),beginPgmVersion300,PGM_VERSION_300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmVersion300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmVersion300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmVersion300,PGM_VERSION_300_LEN);
   	
   }
   
     /**
	 * 	Update PgmVersion300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmVersion300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmVersion300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmIp343690Group300
	 *	@return pgmIp343690Group300
	 */   
	 public PgmIp343690Group300 getPgmIp343690Group300() {
   	return pgmIp343690Group300;
   }
   /**
	* 	Update PgmIp343690Group300 with the passed value
	*   Corresponding COBOL Variable is 300-PGM-IP343690-GROUP
	*	@param value
	*/
   public void setPgmIp343690Group300(char[] value) {
      pgmIp343690Group300.setString(value); 
   }   
    
     /**
	 * 	Update PgmIp343690Group300 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690Group300(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmIp343690Group300.begin,pgmIp343690Group300.length());
   }
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690Group300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmIp343690Group300.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update PgmIp343690Group300 with another Field
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source) {
   	replace(source,0,source.length(),pgmIp343690Group300.begin,pgmIp343690Group300.length());
   }  
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pgmIp343690Group300.begin,pgmIp343690Group300.length());
   }
   
     /**
	 * 	Update PgmIp343690Group300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp343690Group300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pgmIp343690Group300.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of pgmIp081110300
	 *	@return pgmIp081110300
	 */
   public char[] getPgmIp081110300() throws CFException{
     if (isPgmIp081110300Modified()) { 
        pgmIp081110300 = refreshPgmIp081110300();
     }
   		return pgmIp081110300;
   }

  
	/**
	*  set variable pgmIp081110300
	*  Corresponding COBOL Variable is 300-PGM-IP081110
	*  @param value
	**/
   public void setPgmIp081110300(char[] value) {
      pgmIp081110300 = checkPgmIp081110300Constraints(value);
      serializePgmIp081110300(pgmIp081110300);
   } 

     /**
	 * 	Update PgmIp081110300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp081110300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmIp081110300,pgmIp081110300.length);
   	
   }
   
   public void setPgmIp081110300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp081110300,pgmIp081110300.length);
   	
   }
   
     /**
	 * 	Update PgmIp081110300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp081110300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp081110300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmIp081110300 with another Field
	 *	@param value
	 */
   public void setPgmIp081110300(Field source) {
       replace(source,0,source.length(),beginPgmIp081110300,PGM_IP_081110300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmIp081110300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp081110300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmIp081110300,PGM_IP_081110300_LEN);
   	
   }
   
     /**
	 * 	Update PgmIp081110300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp081110300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp081110300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmIp599810300
	 *	@return pgmIp599810300
	 */
   public char[] getPgmIp599810300() throws CFException{
     if (isPgmIp599810300Modified()) { 
        pgmIp599810300 = refreshPgmIp599810300();
     }
   		return pgmIp599810300;
   }

  
	/**
	*  set variable pgmIp599810300
	*  Corresponding COBOL Variable is 300-PGM-IP599810
	*  @param value
	**/
   public void setPgmIp599810300(char[] value) {
      pgmIp599810300 = checkPgmIp599810300Constraints(value);
      serializePgmIp599810300(pgmIp599810300);
   } 

     /**
	 * 	Update PgmIp599810300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp599810300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmIp599810300,pgmIp599810300.length);
   	
   }
   
   public void setPgmIp599810300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp599810300,pgmIp599810300.length);
   	
   }
   
     /**
	 * 	Update PgmIp599810300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp599810300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp599810300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmIp599810300 with another Field
	 *	@param value
	 */
   public void setPgmIp599810300(Field source) {
       replace(source,0,source.length(),beginPgmIp599810300,PGM_IP_599810300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmIp599810300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp599810300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmIp599810300,PGM_IP_599810300_LEN);
   	
   }
   
     /**
	 * 	Update PgmIp599810300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp599810300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp599810300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmIp280010300
	 *	@return pgmIp280010300
	 */
   public char[] getPgmIp280010300() throws CFException{
     if (isPgmIp280010300Modified()) { 
        pgmIp280010300 = refreshPgmIp280010300();
     }
   		return pgmIp280010300;
   }

  
	/**
	*  set variable pgmIp280010300
	*  Corresponding COBOL Variable is 300-PGM-IP280010
	*  @param value
	**/
   public void setPgmIp280010300(char[] value) {
      pgmIp280010300 = checkPgmIp280010300Constraints(value);
      serializePgmIp280010300(pgmIp280010300);
   } 

     /**
	 * 	Update PgmIp280010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp280010300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmIp280010300,pgmIp280010300.length);
   	
   }
   
   public void setPgmIp280010300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp280010300,pgmIp280010300.length);
   	
   }
   
     /**
	 * 	Update PgmIp280010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp280010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp280010300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmIp280010300 with another Field
	 *	@param value
	 */
   public void setPgmIp280010300(Field source) {
       replace(source,0,source.length(),beginPgmIp280010300,PGM_IP_280010300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmIp280010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp280010300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmIp280010300,PGM_IP_280010300_LEN);
   	
   }
   
     /**
	 * 	Update PgmIp280010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp280010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp280010300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmIp610010300
	 *	@return pgmIp610010300
	 */
   public char[] getPgmIp610010300() throws CFException{
     if (isPgmIp610010300Modified()) { 
        pgmIp610010300 = refreshPgmIp610010300();
     }
   		return pgmIp610010300;
   }

  
	/**
	*  set variable pgmIp610010300
	*  Corresponding COBOL Variable is 300-PGM-IP610010
	*  @param value
	**/
   public void setPgmIp610010300(char[] value) {
      pgmIp610010300 = checkPgmIp610010300Constraints(value);
      serializePgmIp610010300(pgmIp610010300);
   } 

     /**
	 * 	Update PgmIp610010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp610010300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmIp610010300,pgmIp610010300.length);
   	
   }
   
   public void setPgmIp610010300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp610010300,pgmIp610010300.length);
   	
   }
   
     /**
	 * 	Update PgmIp610010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp610010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp610010300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmIp610010300 with another Field
	 *	@param value
	 */
   public void setPgmIp610010300(Field source) {
       replace(source,0,source.length(),beginPgmIp610010300,PGM_IP_610010300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmIp610010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp610010300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmIp610010300,PGM_IP_610010300_LEN);
   	
   }
   
     /**
	 * 	Update PgmIp610010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp610010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp610010300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmMcwait300
	 *	@return pgmMcwait300
	 */
   public char[] getPgmMcwait300() throws CFException{
     if (isPgmMcwait300Modified()) { 
        pgmMcwait300 = refreshPgmMcwait300();
     }
   		return pgmMcwait300;
   }

  
	/**
	*  set variable pgmMcwait300
	*  Corresponding COBOL Variable is 300-PGM-MCWAIT
	*  @param value
	**/
   public void setPgmMcwait300(char[] value) {
      pgmMcwait300 = checkPgmMcwait300Constraints(value);
      serializePgmMcwait300(pgmMcwait300);
   } 

     /**
	 * 	Update PgmMcwait300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmMcwait300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmMcwait300,pgmMcwait300.length);
   	
   }
   
   public void setPgmMcwait300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmMcwait300,pgmMcwait300.length);
   	
   }
   
     /**
	 * 	Update PgmMcwait300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmMcwait300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmMcwait300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmMcwait300 with another Field
	 *	@param value
	 */
   public void setPgmMcwait300(Field source) {
       replace(source,0,source.length(),beginPgmMcwait300,PGM_MCWAIT_300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmMcwait300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmMcwait300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmMcwait300,PGM_MCWAIT_300_LEN);
   	
   }
   
     /**
	 * 	Update PgmMcwait300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmMcwait300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmMcwait300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of pgmIp996010300
	 *	@return pgmIp996010300
	 */
   public char[] getPgmIp996010300() throws CFException{
     if (isPgmIp996010300Modified()) { 
        pgmIp996010300 = refreshPgmIp996010300();
     }
   		return pgmIp996010300;
   }

  
	/**
	*  set variable pgmIp996010300
	*  Corresponding COBOL Variable is 300-PGM-IP996010
	*  @param value
	**/
   public void setPgmIp996010300(char[] value) {
      pgmIp996010300 = checkPgmIp996010300Constraints(value);
      serializePgmIp996010300(pgmIp996010300);
   } 

     /**
	 * 	Update PgmIp996010300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPgmIp996010300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPgmIp996010300,pgmIp996010300.length);
   	
   }
   
   public void setPgmIp996010300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp996010300,pgmIp996010300.length);
   	
   }
   
     /**
	 * 	Update PgmIp996010300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp996010300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp996010300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PgmIp996010300 with another Field
	 *	@param value
	 */
   public void setPgmIp996010300(Field source) {
       replace(source,0,source.length(),beginPgmIp996010300,PGM_IP_996010300_LEN);
   	
   }  
   
     /**
	 * 	Update PgmIp996010300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPgmIp996010300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPgmIp996010300,PGM_IP_996010300_LEN);
   	
   }
   
     /**
	 * 	Update PgmIp996010300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPgmIp996010300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPgmIp996010300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of thisPgmDb2CollIdBase300
	 *	@return thisPgmDb2CollIdBase300
	 */
   public char[] getThisPgmDb2CollIdBase300() throws CFException{
     if (isThisPgmDb2CollIdBase300Modified()) { 
        thisPgmDb2CollIdBase300 = refreshThisPgmDb2CollIdBase300();
     }
   		return thisPgmDb2CollIdBase300;
   }

  
	/**
	*  set variable thisPgmDb2CollIdBase300
	*  Corresponding COBOL Variable is 300-THIS-PGM-DB2-COLL-ID-BASE
	*  @param value
	**/
   public void setThisPgmDb2CollIdBase300(char[] value) {
      thisPgmDb2CollIdBase300 = checkThisPgmDb2CollIdBase300Constraints(value);
      serializeThisPgmDb2CollIdBase300(thisPgmDb2CollIdBase300);
   } 

     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginThisPgmDb2CollIdBase300,thisPgmDb2CollIdBase300.length);
   	
   }
   
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginThisPgmDb2CollIdBase300,thisPgmDb2CollIdBase300.length);
   	
   }
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginThisPgmDb2CollIdBase300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ThisPgmDb2CollIdBase300 with another Field
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source) {
       replace(source,0,source.length(),beginThisPgmDb2CollIdBase300,THIS_PGM_DB_2_COLL_ID_BASE_300_LEN);
   	
   }  
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginThisPgmDb2CollIdBase300,THIS_PGM_DB_2_COLL_ID_BASE_300_LEN);
   	
   }
   
     /**
	 * 	Update ThisPgmDb2CollIdBase300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setThisPgmDb2CollIdBase300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginThisPgmDb2CollIdBase300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of valueZero300
	 *	@return valueZero300
	 */
	public short getValueZero300() throws CFException {
        if (isValueZero300Modified()) { 
           valueZero300 = refreshValueZero300();
        }
   		return valueZero300;
	}
	
	/**
	 * 	Update ValueZero300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-ZERO
	 *	@param number
	 */
	public void setValueZero300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    valueZero300 = checkValueZero300MaxLimit(number); 
		serializeValueZero300(valueZero300);
	}

	public void setValueZero300(int number) {
	    number = checkValueZero300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValueZero300((short)number);
	}
	public void setValueZero300(long number) {
	    number = checkValueZero300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValueZero300((short)number);
	}
	

	/**
	 *	Returns the value of value01300
	 *	@return value01300
	 */
	public short getValue01300() throws CFException {
        if (isValue01300Modified()) { 
           value01300 = refreshValue01300();
        }
   		return value01300;
	}
	
	/**
	 * 	Update Value01300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-01
	 *	@param number
	 */
	public void setValue01300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    value01300 = checkValue01300MaxLimit(number); 
		serializeValue01300(value01300);
	}

	public void setValue01300(int number) {
	    number = checkValue01300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue01300((short)number);
	}
	public void setValue01300(long number) {
	    number = checkValue01300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue01300((short)number);
	}
	

	/**
	 *	Returns the value of value100300
	 *	@return value100300
	 */
	public short getValue100300() throws CFException {
        if (isValue100300Modified()) { 
           value100300 = refreshValue100300();
        }
   		return value100300;
	}
	
	/**
	 * 	Update Value100300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-100
	 *	@param number
	 */
	public void setValue100300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    value100300 = checkValue100300MaxLimit(number); 
		serializeValue100300(value100300);
	}

	public void setValue100300(int number) {
	    number = checkValue100300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue100300((short)number);
	}
	public void setValue100300(long number) {
	    number = checkValue100300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setValue100300((short)number);
	}
	

	/**
	 *	Returns the value of sql100300
	 *	@return sql100300
	 */
	public int getSql100300() throws CFException {
        if (isSql100300Modified()) { 
           sql100300 = refreshSql100300();
        }
   		return sql100300;
	}
	
	/**
	 * 	Update Sql100300 with the passed value
	 *  Corresponding COBOL Variable is 300-SQL-100
	 *	@param number
	 */
	public void setSql100300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sql100300 = checkSql100300MaxLimit(number); 
		serializeSql100300(sql100300);
	}


	public void setSql100300(long number) {
	    number = checkSql100300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSql100300((int)number);
	}
	
	/**
	 *	Returns the value of sql904300
	 *	@return sql904300
	 */
	public int getSql904300() throws CFException {
        if (isSql904300Modified()) { 
           sql904300 = refreshSql904300();
        }
   		return sql904300;
	}
	
	/**
	 * 	Update Sql904300 with the passed value
	 *  Corresponding COBOL Variable is 300-SQL-904
	 *	@param number
	 */
	public void setSql904300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sql904300 = checkSql904300MaxLimit(number); 
		serializeSql904300(sql904300);
	}


	public void setSql904300(long number) {
	    number = checkSql904300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSql904300((int)number);
	}
	
	/**
	 *	Returns the value of sql911300
	 *	@return sql911300
	 */
	public int getSql911300() throws CFException {
        if (isSql911300Modified()) { 
           sql911300 = refreshSql911300();
        }
   		return sql911300;
	}
	
	/**
	 * 	Update Sql911300 with the passed value
	 *  Corresponding COBOL Variable is 300-SQL-911
	 *	@param number
	 */
	public void setSql911300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    sql911300 = checkSql911300MaxLimit(number); 
		serializeSql911300(sql911300);
	}


	public void setSql911300(long number) {
	    number = checkSql911300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setSql911300((int)number);
	}
	
	/**
	 *	Returns the value of cond0000300
	 *	@return cond0000300
	 */
	public short getCond0000300() throws CFException {
       if (isCond0000300Modified()) { 
           cond0000300 = refreshCond0000300();
        }
   		return cond0000300;
	}
	

    /**
	 *	Returns the String value of cond0000300
	 *	@return cond0000300
	 */
	public char[]  getCond0000300ActualString() {
	    String value = String.valueOf(cond0000300).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update Cond0000300 with the passed value
	 *  Corresponding COBOL Variable is 300-COND-0000
	 *	@param number
	 */
	public void setCond0000300(short number) {
	     // Truncate if the number is beyond +/- Max range	
	    cond0000300 = checkCond0000300MaxLimit(number); 
		serializeCond0000300(cond0000300);
	}
	
	public void setCond0000300(int number) {
	    number = checkCond0000300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCond0000300((short)number);
	}
	public void setCond0000300(long number) {
	    number = checkCond0000300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setCond0000300((short)number);
	}
	

	/**
	 * 	Update Cond0000300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setCond0000300(char[] value) throws CFException {
		 cond0000300 = serializeCond0000300(value);
	}
	/**
	 * 	Update Cond0000300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setCond0000300String(char[] value) throws CFException {
		 setCond0000300(value);
	}
	/**
	 *	Returns the value of value1300
	 *	@return value1300
	 */
	public int getValue1300() throws CFException {
       if (isValue1300Modified()) { 
           value1300 = refreshValue1300();
        }
   		return value1300;
	}
	

	
	   
	/**
	 * 	Update Value1300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-1
	 *	@param number
	 */
	public void setValue1300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value1300 = checkValue1300MaxLimit(number); 
		serializeValue1300(value1300);
	}
	

	public void setValue1300(long number) {
	    number = checkValue1300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue1300((int)number);
	}
	
	/**
	 * 	Update Value1300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue1300(char[] value) throws CFException {
		 value1300 = serializeValue1300(value);
	}
	/**
	 * 	Update Value1300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue1300String(char[] value) throws CFException {
		 setValue1300(value);
	}
	/**
	 *	Returns the value of nullValue300
	 *	@return nullValue300
	 */
	public short getNullValue300() throws CFException {
        if (isNullValue300Modified()) { 
           nullValue300 = refreshNullValue300();
        }
   		return nullValue300;
	}
	
	/**
	 * 	Update NullValue300 with the passed value
	 *  Corresponding COBOL Variable is 300-NULL-VALUE
	 *	@param number
	 */
	public void setNullValue300(short number) {
	     // Truncate if the number is beyond +/- Max range
	    nullValue300 = checkNullValue300MaxLimit(number); 
		serializeNullValue300(nullValue300);
	}

	public void setNullValue300(int number) {
	    number = checkNullValue300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNullValue300((short)number);
	}
	public void setNullValue300(long number) {
	    number = checkNullValue300MaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setNullValue300((short)number);
	}
	

	/**
	 *	Returns the value of value14300
	 *	@return value14300
	 */
	public int getValue14300() throws CFException {
       if (isValue14300Modified()) { 
           value14300 = refreshValue14300();
        }
   		return value14300;
	}
	

	
	   
	/**
	 * 	Update Value14300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-14
	 *	@param number
	 */
	public void setValue14300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value14300 = checkValue14300MaxLimit(number); 
		serializeValue14300(value14300);
	}
	

	public void setValue14300(long number) {
	    number = checkValue14300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue14300((int)number);
	}
	
	/**
	 * 	Update Value14300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue14300(char[] value) throws CFException {
		 value14300 = serializeValue14300(value);
	}
	/**
	 * 	Update Value14300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue14300String(char[] value) throws CFException {
		 setValue14300(value);
	}
	/**
	 *	Returns the value of value19300
	 *	@return value19300
	 */
	public int getValue19300() throws CFException {
       if (isValue19300Modified()) { 
           value19300 = refreshValue19300();
        }
   		return value19300;
	}
	

	
	   
	/**
	 * 	Update Value19300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-19
	 *	@param number
	 */
	public void setValue19300(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    value19300 = checkValue19300MaxLimit(number); 
		serializeValue19300(value19300);
	}
	

	public void setValue19300(long number) {
	    number = checkValue19300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue19300((int)number);
	}
	
	/**
	 * 	Update Value19300 with the passed value
	 *	@param value (String or char[])
	 */
	public void setValue19300(char[] value) throws CFException {
		 value19300 = serializeValue19300(value);
	}
	/**
	 * 	Update Value19300 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setValue19300String(char[] value) throws CFException {
		 setValue19300(value);
	}
	/**
	 *	Returns the value of value99300
	 *	@return value99300
	 */
	public int getValue99300() throws CFException {
        if (isValue99300Modified()) { 
           value99300 = refreshValue99300();
        }
   		return value99300;
	}
	
	/**
	 * 	Update Value99300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-99
	 *	@param number
	 */
	public void setValue99300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    value99300 = checkValue99300MaxLimit(number); 
		serializeValue99300(value99300);
	}


	public void setValue99300(long number) {
	    number = checkValue99300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValue99300((int)number);
	}
	
	/**
	 *	Returns the value of errorValue300
	 *	@return errorValue300
	 */
   public char[] getErrorValue300() throws CFException{
     if (isErrorValue300Modified()) { 
        errorValue300 = refreshErrorValue300();
     }
   		return errorValue300;
   }

  
	/**
	*  set variable errorValue300
	*  Corresponding COBOL Variable is 300-ERROR-VALUE
	*  @param value
	**/
   public void setErrorValue300(char[] value) {
      errorValue300 = checkErrorValue300Constraints(value);
      serializeErrorValue300(errorValue300);
   } 

     /**
	 * 	Update ErrorValue300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setErrorValue300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginErrorValue300,errorValue300.length);
   	
   }
   
   public void setErrorValue300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginErrorValue300,errorValue300.length);
   	
   }
   
     /**
	 * 	Update ErrorValue300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setErrorValue300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorValue300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ErrorValue300 with another Field
	 *	@param value
	 */
   public void setErrorValue300(Field source) {
       replace(source,0,source.length(),beginErrorValue300,ERROR_VALUE_300_LEN);
   	
   }  
   
     /**
	 * 	Update ErrorValue300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setErrorValue300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginErrorValue300,ERROR_VALUE_300_LEN);
   	
   }
   
     /**
	 * 	Update ErrorValue300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setErrorValue300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginErrorValue300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of valueRetry300
	 *	@return valueRetry300
	 */
	public int getValueRetry300() throws CFException {
        if (isValueRetry300Modified()) { 
           valueRetry300 = refreshValueRetry300();
        }
   		return valueRetry300;
	}
	
	/**
	 * 	Update ValueRetry300 with the passed value
	 *  Corresponding COBOL Variable is 300-VALUE-RETRY
	 *	@param number
	 */
	public void setValueRetry300(int number) {
	     // Truncate if the number is beyond +/- Max range
	    valueRetry300 = checkValueRetry300MaxLimit(number); 
		serializeValueRetry300(valueRetry300);
	}


	public void setValueRetry300(long number) {
	    number = checkValueRetry300MaxLimit(number); // Truncate if value is beyond +/- Max range
		setValueRetry300((int)number);
	}
	
	/**
	 *	Returns the value of sys001OpAbendCode300
	 *	@return sys001OpAbendCode300
	 */
   public char[] getSys001OpAbendCode300() throws CFException{
     if (isSys001OpAbendCode300Modified()) { 
        sys001OpAbendCode300 = refreshSys001OpAbendCode300();
     }
   		return sys001OpAbendCode300;
   }

  
	/**
	*  set variable sys001OpAbendCode300
	*  Corresponding COBOL Variable is 300-SYS001-OP-ABEND-CODE
	*  @param value
	**/
   public void setSys001OpAbendCode300(char[] value) {
      sys001OpAbendCode300 = checkSys001OpAbendCode300Constraints(value);
      serializeSys001OpAbendCode300(sys001OpAbendCode300);
   } 

     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001OpAbendCode300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001OpAbendCode300,sys001OpAbendCode300.length);
   	
   }
   
   public void setSys001OpAbendCode300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001OpAbendCode300,sys001OpAbendCode300.length);
   	
   }
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001OpAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001OpAbendCode300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001OpAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source) {
       replace(source,0,source.length(),beginSys001OpAbendCode300,SYS_001_OP_ABEND_CODE_300_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001OpAbendCode300,SYS_001_OP_ABEND_CODE_300_LEN);
   	
   }
   
     /**
	 * 	Update Sys001OpAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001OpAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001OpAbendCode300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001RdAbendCode300
	 *	@return sys001RdAbendCode300
	 */
   public char[] getSys001RdAbendCode300() throws CFException{
     if (isSys001RdAbendCode300Modified()) { 
        sys001RdAbendCode300 = refreshSys001RdAbendCode300();
     }
   		return sys001RdAbendCode300;
   }

  
	/**
	*  set variable sys001RdAbendCode300
	*  Corresponding COBOL Variable is 300-SYS001-RD-ABEND-CODE
	*  @param value
	**/
   public void setSys001RdAbendCode300(char[] value) {
      sys001RdAbendCode300 = checkSys001RdAbendCode300Constraints(value);
      serializeSys001RdAbendCode300(sys001RdAbendCode300);
   } 

     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001RdAbendCode300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001RdAbendCode300,sys001RdAbendCode300.length);
   	
   }
   
   public void setSys001RdAbendCode300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001RdAbendCode300,sys001RdAbendCode300.length);
   	
   }
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001RdAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001RdAbendCode300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001RdAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source) {
       replace(source,0,source.length(),beginSys001RdAbendCode300,SYS_001_RD_ABEND_CODE_300_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001RdAbendCode300,SYS_001_RD_ABEND_CODE_300_LEN);
   	
   }
   
     /**
	 * 	Update Sys001RdAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001RdAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001RdAbendCode300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sys001ClAbendCode300
	 *	@return sys001ClAbendCode300
	 */
   public char[] getSys001ClAbendCode300() throws CFException{
     if (isSys001ClAbendCode300Modified()) { 
        sys001ClAbendCode300 = refreshSys001ClAbendCode300();
     }
   		return sys001ClAbendCode300;
   }

  
	/**
	*  set variable sys001ClAbendCode300
	*  Corresponding COBOL Variable is 300-SYS001-CL-ABEND-CODE
	*  @param value
	**/
   public void setSys001ClAbendCode300(char[] value) {
      sys001ClAbendCode300 = checkSys001ClAbendCode300Constraints(value);
      serializeSys001ClAbendCode300(sys001ClAbendCode300);
   } 

     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSys001ClAbendCode300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSys001ClAbendCode300,sys001ClAbendCode300.length);
   	
   }
   
   public void setSys001ClAbendCode300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSys001ClAbendCode300,sys001ClAbendCode300.length);
   	
   }
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSys001ClAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001ClAbendCode300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sys001ClAbendCode300 with another Field
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source) {
       replace(source,0,source.length(),beginSys001ClAbendCode300,SYS_001_CL_ABEND_CODE_300_LEN);
   	
   }  
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSys001ClAbendCode300,SYS_001_CL_ABEND_CODE_300_LEN);
   	
   }
   
     /**
	 * 	Update Sys001ClAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSys001ClAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSys001ClAbendCode300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fetchPmaAbendCode300
	 *	@return fetchPmaAbendCode300
	 */
   public char[] getFetchPmaAbendCode300() throws CFException{
     if (isFetchPmaAbendCode300Modified()) { 
        fetchPmaAbendCode300 = refreshFetchPmaAbendCode300();
     }
   		return fetchPmaAbendCode300;
   }

  
	/**
	*  set variable fetchPmaAbendCode300
	*  Corresponding COBOL Variable is 300-FETCH-PMA-ABEND-CODE
	*  @param value
	**/
   public void setFetchPmaAbendCode300(char[] value) {
      fetchPmaAbendCode300 = checkFetchPmaAbendCode300Constraints(value);
      serializeFetchPmaAbendCode300(fetchPmaAbendCode300);
   } 

     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFetchPmaAbendCode300,fetchPmaAbendCode300.length);
   	
   }
   
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFetchPmaAbendCode300,fetchPmaAbendCode300.length);
   	
   }
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFetchPmaAbendCode300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FetchPmaAbendCode300 with another Field
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source) {
       replace(source,0,source.length(),beginFetchPmaAbendCode300,FETCH_PMA_ABEND_CODE_300_LEN);
   	
   }  
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFetchPmaAbendCode300,FETCH_PMA_ABEND_CODE_300_LEN);
   	
   }
   
     /**
	 * 	Update FetchPmaAbendCode300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFetchPmaAbendCode300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFetchPmaAbendCode300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of openTipapmaCursor300
	 *	@return openTipapmaCursor300
	 */
   public char[] getOpenTipapmaCursor300() throws CFException{
     if (isOpenTipapmaCursor300Modified()) { 
        openTipapmaCursor300 = refreshOpenTipapmaCursor300();
     }
   		return openTipapmaCursor300;
   }

  
	/**
	*  set variable openTipapmaCursor300
	*  Corresponding COBOL Variable is 300-OPEN-TIPAPMA-CURSOR
	*  @param value
	**/
   public void setOpenTipapmaCursor300(char[] value) {
      openTipapmaCursor300 = checkOpenTipapmaCursor300Constraints(value);
      serializeOpenTipapmaCursor300(openTipapmaCursor300);
   } 

     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginOpenTipapmaCursor300,openTipapmaCursor300.length);
   	
   }
   
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginOpenTipapmaCursor300,openTipapmaCursor300.length);
   	
   }
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpenTipapmaCursor300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update OpenTipapmaCursor300 with another Field
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source) {
       replace(source,0,source.length(),beginOpenTipapmaCursor300,OPEN_TIPAPMA_CURSOR_300_LEN);
   	
   }  
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginOpenTipapmaCursor300,OPEN_TIPAPMA_CURSOR_300_LEN);
   	
   }
   
     /**
	 * 	Update OpenTipapmaCursor300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setOpenTipapmaCursor300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginOpenTipapmaCursor300+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of closeTipapmaCursor300
	 *	@return closeTipapmaCursor300
	 */
   public char[] getCloseTipapmaCursor300() throws CFException{
     if (isCloseTipapmaCursor300Modified()) { 
        closeTipapmaCursor300 = refreshCloseTipapmaCursor300();
     }
   		return closeTipapmaCursor300;
   }

  
	/**
	*  set variable closeTipapmaCursor300
	*  Corresponding COBOL Variable is 300-CLOSE-TIPAPMA-CURSOR
	*  @param value
	**/
   public void setCloseTipapmaCursor300(char[] value) {
      closeTipapmaCursor300 = checkCloseTipapmaCursor300Constraints(value);
      serializeCloseTipapmaCursor300(closeTipapmaCursor300);
   } 

     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginCloseTipapmaCursor300,closeTipapmaCursor300.length);
   	
   }
   
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginCloseTipapmaCursor300,closeTipapmaCursor300.length);
   	
   }
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCloseTipapmaCursor300+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update CloseTipapmaCursor300 with another Field
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source) {
       replace(source,0,source.length(),beginCloseTipapmaCursor300,CLOSE_TIPAPMA_CURSOR_300_LEN);
   	
   }  
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginCloseTipapmaCursor300,CLOSE_TIPAPMA_CURSOR_300_LEN);
   	
   }
   
     /**
	 * 	Update CloseTipapmaCursor300 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setCloseTipapmaCursor300(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginCloseTipapmaCursor300+targetIndex,targetLen);
    
   }

	
	
	

		public static int getConstants300FieldLength() {
			return CONSTANTS_300_LENGTH;
		}

}
  
